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

package com.rpkit.payments.bukkit.command.payment

import com.rpkit.characters.bukkit.character.RPKCharacterService
import com.rpkit.core.service.Services
import com.rpkit.payments.bukkit.RPKPaymentsBukkit
import com.rpkit.payments.bukkit.group.RPKPaymentGroupName
import com.rpkit.payments.bukkit.group.RPKPaymentGroupService
import com.rpkit.payments.bukkit.notification.RPKPaymentNotificationImpl
import com.rpkit.payments.bukkit.notification.RPKPaymentNotificationService
import com.rpkit.players.bukkit.profile.minecraft.RPKMinecraftProfileService
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

/**
 * Payment invite command.
 * Invites a character to a payment group.
 */
class PaymentInviteCommand(private val plugin: RPKPaymentsBukkit) : CommandExecutor {
    private val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss zzz")
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (!sender.hasPermission("rpkit.payments.command.payment.invite")) {
            sender.sendMessage(plugin.messages["no-permission-payment-invite"])
            return true
        }
        if (args.size <= 1) {
            sender.sendMessage(plugin.messages["payment-invite-usage"])
            return true
        }
        val paymentGroupService = Services[RPKPaymentGroupService::class.java]
        if (paymentGroupService == null) {
            sender.sendMessage(plugin.messages["no-payment-group-service"])
            return true
        }
        paymentGroupService.getPaymentGroup(RPKPaymentGroupName(args.dropLast(1).joinToString(" "))).thenAccept getPaymentGroup@{ paymentGroup ->
            if (paymentGroup == null) {
                sender.sendMessage(plugin.messages["payment-invite-invalid-group"])
                return@getPaymentGroup
            }
            val minecraftProfileService = Services[RPKMinecraftProfileService::class.java]
            if (minecraftProfileService == null) {
                sender.sendMessage(plugin.messages["no-minecraft-profile-service"])
                return@getPaymentGroup
            }
            val characterService = Services[RPKCharacterService::class.java]
            if (characterService == null) {
                sender.sendMessage(plugin.messages["no-character-service"])
                return@getPaymentGroup
            }
            val bukkitPlayer = plugin.server.getOfflinePlayer(args.last())
            val minecraftProfile = minecraftProfileService.getPreloadedMinecraftProfile(bukkitPlayer)
            if (minecraftProfile == null) {
                sender.sendMessage(plugin.messages["no-minecraft-profile"])
                return@getPaymentGroup
            }
            val character = characterService.getPreloadedActiveCharacter(minecraftProfile)
            if (character == null) {
                sender.sendMessage(plugin.messages["payment-invite-invalid-character"])
                return@getPaymentGroup
            }
            paymentGroup.addInvite(character).thenRun {
                sender.sendMessage(plugin.messages["payment-invite-valid"])
                val paymentNotificationService = Services[RPKPaymentNotificationService::class.java]
                if (paymentNotificationService == null) {
                    sender.sendMessage(plugin.messages["no-payment-notification-service"])
                    return@thenRun
                }
                val now = LocalDateTime.now()
                val notificationMessage = plugin.messages["payment-notification-invite", mapOf(
                    "member" to character.name,
                    "group" to paymentGroup.name.value,
                    "date" to dateFormat.format(now.atZone(ZoneId.systemDefault()))
                )]
                if (minecraftProfile.isOnline) { // If online
                    minecraftProfile.sendMessage(notificationMessage)
                } else { // If offline
                    paymentNotificationService.addPaymentNotification(
                        RPKPaymentNotificationImpl(
                            group = paymentGroup,
                            to = character,
                            character = character,
                            date = now,
                            text = notificationMessage
                        )
                    )
                }
            }
        }
        return true
    }


}