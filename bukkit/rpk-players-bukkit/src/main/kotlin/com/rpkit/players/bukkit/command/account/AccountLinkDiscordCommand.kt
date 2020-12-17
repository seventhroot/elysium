/*
 * Copyright 2020 Ren Binden
 *
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

package com.rpkit.players.bukkit.command.account

import com.rpkit.chat.bukkit.discord.DiscordReaction
import com.rpkit.chat.bukkit.discord.RPKDiscordService
import com.rpkit.core.service.Services
import com.rpkit.players.bukkit.RPKPlayersBukkit
import com.rpkit.players.bukkit.profile.RPKProfile
import com.rpkit.players.bukkit.profile.discord.RPKDiscordProfileService
import com.rpkit.players.bukkit.profile.minecraft.RPKMinecraftProfileService
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class AccountLinkDiscordCommand(private val plugin: RPKPlayersBukkit) : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage(plugin.messages["not-from-console"])
            return true
        }
        if (!sender.hasPermission("rpkit.players.command.account.link.discord")) {
            sender.sendMessage(plugin.messages["no-permission-account-link-discord"])
            return true
        }
        val discordUserName = args[0]
        val discordService = Services[RPKDiscordService::class.java]
        if (discordService == null) {
            sender.sendMessage(plugin.messages["no-discord-service"])
            return true
        }
        val discordId = try {
            discordService.getUserId(discordUserName)
        } catch (exception: IllegalArgumentException) {
            sender.sendMessage(plugin.messages["account-link-discord-invalid-user-tag"])
            return true
        }
        if (discordId == null) {
            sender.sendMessage(plugin.messages["account-link-discord-invalid-user"])
            return true
        }
        val minecraftProfileService = Services[RPKMinecraftProfileService::class.java]
        if (minecraftProfileService == null) {
            sender.sendMessage(plugin.messages["no-minecraft-profile-service"])
            return true
        }
        val minecraftProfile = minecraftProfileService.getMinecraftProfile(sender)
        if (minecraftProfile == null) {
            sender.sendMessage(plugin.messages["no-minecraft-profile-self"])
            return true
        }
        val profile = minecraftProfile.profile
        if (profile !is RPKProfile) {
            sender.sendMessage(plugin.messages["no-profile-self"])
            return true
        }
        val discordProfileService = Services[RPKDiscordProfileService::class.java]
        if (discordProfileService == null) {
            sender.sendMessage(plugin.messages["no-discord-profile-service"])
            return true
        }
        val discordProfile = discordProfileService.getDiscordProfile(discordId)
        discordService.sendMessage(
                discordProfile,
                "There was a request to link this account to profile ${profile.name}. " +
                        "Press tick to accept this request."
        ) { message ->
            message.addReaction(DiscordReaction.unicode("\u2705"))
            discordService.setMessageAsProfileLinkRequest(message, profile)
        }
        return true
    }
}