/*
 * Copyright 2021 Ren Binden
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rpkit.banks.bukkit.listener

import com.rpkit.banks.bukkit.RPKBanksBukkit
import com.rpkit.banks.bukkit.bank.RPKBankService
import com.rpkit.banks.bukkit.event.bank.RPKBukkitBankDepositEvent
import com.rpkit.banks.bukkit.event.bank.RPKBukkitBankWithdrawEvent
import com.rpkit.characters.bukkit.character.RPKCharacterService
import com.rpkit.core.service.Services
import com.rpkit.economy.bukkit.currency.RPKCurrencyName
import com.rpkit.economy.bukkit.currency.RPKCurrencyService
import com.rpkit.economy.bukkit.economy.RPKEconomyService
import com.rpkit.players.bukkit.profile.minecraft.RPKMinecraftProfileService
import org.bukkit.ChatColor.GREEN
import org.bukkit.block.Sign
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK
import org.bukkit.event.player.PlayerInteractEvent

/**
 * Player interact listener for bank signs.
 */
class PlayerInteractListener(private val plugin: RPKBanksBukkit) : Listener {

    @EventHandler
    fun onPlayerInteract(event: PlayerInteractEvent) {
        val clickedBlock = event.clickedBlock ?: return
        if (clickedBlock.state !is Sign) return
        val sign = clickedBlock.state as Sign
        if (!sign.getLine(0).equals("$GREEN[bank]", ignoreCase = true)) return
        event.isCancelled = true
        val minecraftProfileService = Services[RPKMinecraftProfileService::class.java]
        if (minecraftProfileService == null) {
            event.player.sendMessage(plugin.messages["no-minecraft-profile-service"])
            return
        }
        val characterService = Services[RPKCharacterService::class.java]
        if (characterService == null) {
            event.player.sendMessage(plugin.messages["no-character-service"])
            return
        }
        val currencyService = Services[RPKCurrencyService::class.java]
        if (currencyService == null) {
            event.player.sendMessage(plugin.messages["no-currency-service"])
            return
        }
        val economyService = Services[RPKEconomyService::class.java]
        if (economyService == null) {
            event.player.sendMessage(plugin.messages["no-economy-service"])
            return
        }
        val bankService = Services[RPKBankService::class.java]
        if (bankService == null) {
            event.player.sendMessage(plugin.messages["no-bank-service"])
            return
        }
        val minecraftProfile = minecraftProfileService.getPreloadedMinecraftProfile(event.player) ?: return
        val character = characterService.getPreloadedActiveCharacter(minecraftProfile) ?: return
        val currency = currencyService.getCurrency(RPKCurrencyName(sign.getLine(3))) ?: return
        if (event.action != RIGHT_CLICK_BLOCK) {
            if (event.action != Action.LEFT_CLICK_BLOCK) return
            when {
                sign.getLine(1).equals("withdraw", ignoreCase = true) -> {
                    bankService.getBalance(character, currency).thenAcceptAsync { bankBalance ->
                        val walletBalance = economyService.getPreloadedBalance(character, currency)
                        when {
                            walletBalance == null -> event.player.sendMessage(plugin.messages.noPreloadedBalance)
                            walletBalance + sign.getLine(2).toInt() > 1728 -> event.player.sendMessage(plugin.messages["bank-withdraw-invalid-wallet-full"])
                            sign.getLine(2).toInt() > bankBalance -> event.player.sendMessage(plugin.messages["bank-withdraw-invalid-not-enough-money"])
                            else -> {
                                val bankWithdrawEvent = RPKBukkitBankWithdrawEvent(character, currency, sign.getLine(2).toInt(), true)
                                plugin.server.pluginManager.callEvent(bankWithdrawEvent)
                                if (!bankWithdrawEvent.isCancelled) {
                                    bankService.setBalance(
                                        bankWithdrawEvent.character,
                                        bankWithdrawEvent.currency,
                                        bankBalance - bankWithdrawEvent.amount
                                    ).thenRun {
                                        val newWalletBalance = economyService.getPreloadedBalance(
                                            bankWithdrawEvent.character,
                                            bankWithdrawEvent.currency
                                        )
                                        if (newWalletBalance == null) {
                                            event.player.sendMessage(plugin.messages.noPreloadedBalance)
                                            return@thenRun
                                        }
                                        economyService.setBalance(
                                            bankWithdrawEvent.character,
                                            bankWithdrawEvent.currency,
                                            newWalletBalance + bankWithdrawEvent.amount
                                        ).thenRun {
                                            bankService.getBalance(
                                                bankWithdrawEvent.character,
                                                bankWithdrawEvent.currency
                                            ).thenAccept { newBankBalance ->
                                                event.player.sendMessage(
                                                    plugin.messages["bank-withdraw-valid", mapOf(
                                                        "amount" to bankWithdrawEvent.amount.toString(),
                                                        "currency" to if (bankWithdrawEvent.amount == 1) {
                                                            bankWithdrawEvent.currency.nameSingular
                                                        } else {
                                                            bankWithdrawEvent.currency.namePlural
                                                        },
                                                        "wallet_balance" to economyService.getPreloadedBalance(
                                                            bankWithdrawEvent.character,
                                                            bankWithdrawEvent.currency
                                                        ).toString(),
                                                        "bank_balance" to newBankBalance.toString()
                                                    )]
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                sign.getLine(1).equals("deposit", ignoreCase = true) -> {
                    bankService.getBalance(character, currency).thenAcceptAsync { bankBalance ->
                        val walletBalance = economyService.getPreloadedBalance(character, currency)
                        if (walletBalance == null) {
                            event.player.sendMessage(plugin.messages.noPreloadedBalance)
                            return@thenAcceptAsync
                        }
                        if (sign.getLine(2).toInt() > walletBalance) {
                            event.player.sendMessage(plugin.messages["bank-deposit-invalid-not-enough-money"])
                        } else {
                            val bankDepositEvent =
                                RPKBukkitBankDepositEvent(character, currency, sign.getLine(2).toInt(), true)
                            plugin.server.pluginManager.callEvent(bankDepositEvent)
                            if (!bankDepositEvent.isCancelled) {
                                bankService.setBalance(
                                    bankDepositEvent.character,
                                    bankDepositEvent.currency,
                                    bankBalance + bankDepositEvent.amount
                                ).thenRun {
                                    val newWalletBalance = economyService.getPreloadedBalance(character, currency)
                                    if (newWalletBalance == null) {
                                        event.player.sendMessage(plugin.messages.noPreloadedBalance)
                                        return@thenRun
                                    }
                                    economyService.setBalance(
                                        bankDepositEvent.character,
                                        bankDepositEvent.currency,
                                        newWalletBalance - bankDepositEvent.amount
                                    ).thenRun {
                                        bankService.getBalance(
                                            bankDepositEvent.character,
                                            bankDepositEvent.currency
                                        ).thenAccept { newBankBalance ->
                                            event.player.sendMessage(
                                                plugin.messages["bank-deposit-valid", mapOf(
                                                    "amount" to bankDepositEvent.amount.toString(),
                                                    "currency" to if (bankDepositEvent.amount == 1)
                                                        bankDepositEvent.currency.nameSingular
                                                    else
                                                        bankDepositEvent.currency.namePlural,
                                                    "wallet_balance" to economyService.getPreloadedBalance(
                                                        bankDepositEvent.character,
                                                        bankDepositEvent.currency
                                                    ).toString(),
                                                    "bank_balance" to newBankBalance.toString()
                                                )]
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                sign.getLine(1).equals("balance", ignoreCase = true) -> {
                    bankService.getBalance(character, currency).thenAccept { balance ->
                        event.player.sendMessage(plugin.messages["bank-balance-valid", mapOf(
                            "amount" to balance.toString(),
                            "currency" to if (balance == 1) currency.nameSingular else currency.namePlural
                        )])
                    }
                }
            }
        } else {
            when (sign.getLine(2)) {
                "1" -> {
                    sign.setLine(2, "10")
                    sign.update()
                }
                "10" -> {
                    sign.setLine(2, "100")
                    sign.update()
                }
                "100" -> {
                    sign.setLine(2, "1000")
                    sign.update()
                }
                "1000" -> {
                    sign.setLine(2, "1")
                    sign.update()
                }
            }
        }
    }

}