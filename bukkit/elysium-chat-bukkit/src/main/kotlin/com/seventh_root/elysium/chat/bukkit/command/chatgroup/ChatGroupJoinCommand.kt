/*
 * Copyright 2016 Ross Binden
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

package com.seventh_root.elysium.chat.bukkit.command.chatgroup

import com.seventh_root.elysium.chat.bukkit.ElysiumChatBukkit
import com.seventh_root.elysium.chat.bukkit.chatgroup.ElysiumChatGroupProvider
import com.seventh_root.elysium.players.bukkit.player.ElysiumPlayerProvider
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player


class ChatGroupJoinCommand(private val plugin: ElysiumChatBukkit): CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender.hasPermission("elysium.chat.command.chatgroup.join")) {
            if (args.size >= 1) {
                val playerProvider = plugin.core.serviceManager.getServiceProvider(ElysiumPlayerProvider::class)
                val chatGroupProvider = plugin.core.serviceManager.getServiceProvider(ElysiumChatGroupProvider::class)
                val chatGroup = chatGroupProvider.getChatGroup(args[0])
                if (chatGroup != null) {
                    if (sender is Player) {
                        val player = playerProvider.getPlayer(sender)
                        if (chatGroup.invited.contains(player)) {
                            chatGroup.members.forEach { member -> member.bukkitPlayer?.player?.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.chat-group-join-received")).replace("\$group", chatGroup.name).replace("\$player", player.name)) }
                            chatGroup.addMember(player)
                            chatGroup.uninvite(player)
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.chat-group-join-valid")).replace("\$group", chatGroup.name))
                        } else {
                            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.chat-group-join-invalid-no-invite")))
                        }
                    } else {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.not-from-console")))
                    }
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.chat-group-join-invalid-chat-group")))
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.chat-group-join-usage")))
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.no-permission-chat-group-join")))
        }
        return true
    }

}