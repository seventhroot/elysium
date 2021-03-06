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

package com.rpkit.essentials.bukkit.command

import com.rpkit.essentials.bukkit.RPKEssentialsBukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SudoCommand(private val plugin: RPKEssentialsBukkit) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender.hasPermission("rpkit.essentials.command.sudo")) {
            val previousOpState = sender.isOp
            if (sender is Player) {
                sender.setOp(true)
            }
            val sudoCommand = StringBuilder()
            for (arg in args) {
                sudoCommand.append(arg).append(" ")
            }
            plugin.server.dispatchCommand(sender, sudoCommand.toString())
            if (sender is Player) {
                sender.setOp(previousOpState)
            }
        } else {
            sender.sendMessage(plugin.messages["no-permission-sudo", mapOf(
                "player" to sender.name
            )])
        }
        return true
    }

}
