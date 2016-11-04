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

package com.seventh_root.elysium.permissions.bukkit.command.group

import com.seventh_root.elysium.permissions.bukkit.ElysiumPermissionsBukkit
import com.seventh_root.elysium.permissions.bukkit.group.ElysiumGroupProvider
import com.seventh_root.elysium.players.bukkit.player.ElysiumPlayerProvider
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender


class GroupRemoveCommand(private val plugin: ElysiumPermissionsBukkit): CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender.hasPermission("elysium.permissions.command.group.remove")) {
            if (args.size > 1) {
                val playerProvider = plugin.core.serviceManager.getServiceProvider(ElysiumPlayerProvider::class)
                val groupProvider = plugin.core.serviceManager.getServiceProvider(ElysiumGroupProvider::class)
                val bukkitPlayer = plugin.server.getPlayer(args[0])
                if (bukkitPlayer != null) {
                    val player = playerProvider.getPlayer(bukkitPlayer)
                    val group = groupProvider.getGroup(args[1])
                    if (group != null) {
                        groupProvider.removeGroup(player, group)
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.group-remove-valid"))
                                .replace("\$group", group.name)
                                .replace("\$player", player.name))
                    } else {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.group-remove-invalid-group")))
                    }
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.group-remove-invalid-player")))
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.group-remove-usage")))
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.config.getString("messages.no-permission-")))
        }
        return true
    }

}