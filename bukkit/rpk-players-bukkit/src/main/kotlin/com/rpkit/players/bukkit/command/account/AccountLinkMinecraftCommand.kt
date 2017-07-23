package com.rpkit.players.bukkit.command.account

import com.rpkit.players.bukkit.RPKPlayersBukkit
import com.rpkit.players.bukkit.profile.RPKMinecraftProfileProvider
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player


class AccountLinkMinecraftCommand(private val plugin: RPKPlayersBukkit): CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage(plugin.messages["not-from-console"])
            return true
        }
        if (!sender.hasPermission("rpkit.players.command.account.link.minecraft")) {
            sender.sendMessage(plugin.messages["no-permission-account-link-minecraft"])
            return true
        }
        if (args.size < 2) {
            sender.sendMessage(plugin.messages["account-link-minecraft-usage"])
            return true
        }
        val minecraftUsername = args[0]
        val providedToken = args[1]
        val bukkitPlayer = plugin.server.getPlayer(minecraftUsername)
        if (bukkitPlayer == null) {
            sender.sendMessage(plugin.messages["account-link-minecraft-invalid-player"])
            return true
        }
        val minecraftProfileProvider = plugin.core.serviceManager.getServiceProvider(RPKMinecraftProfileProvider::class)
        val minecraftProfile = minecraftProfileProvider.getMinecraftProfile(bukkitPlayer)
        if (minecraftProfile == null) {
            sender.sendMessage(plugin.messages["account-link-minecraft-invalid-minecraft-profile"])
            return true
        }
        val requiredToken = minecraftProfileProvider.getMinecraftProfileToken(minecraftProfile)
        if (requiredToken == null) {
            sender.sendMessage(plugin.messages["account-link-minecraft-invalid-token"])
            return true
        }
        if (requiredToken.token != providedToken) {
            sender.sendMessage(plugin.messages["account-link-minecraft-invalid-token"])
            return true
        }
        val senderMinecraftProfile = minecraftProfileProvider.getMinecraftProfile(sender)
        if (senderMinecraftProfile == null) {
            sender.sendMessage(plugin.messages["no-minecraft-profile"])
            return true
        }
        val profile = senderMinecraftProfile.profile
        if (profile == null) {
            sender.sendMessage(plugin.messages["no-profile"])
            return true
        }
        minecraftProfile.profile = profile
        minecraftProfileProvider.updateMinecraftProfile(minecraftProfile)
        sender.sendMessage(plugin.messages["account-link-minecraft-valid"])
        return true
    }
}