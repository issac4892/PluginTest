package io.github.issac4892.plugintest.commands

import org.bukkit.Bukkit
import org.bukkit.command.*
import org.bukkit.entity.Player
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.chat.BaseComponent as BaseComponent1


class Start : CommandExecutor, TabCompleter{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
            var i: Int
            var time = 5
        var baseComponent: BaseComponent1
            for (i in 1..5) {
                time--
                BaseComponent1 = TextComponent("게임이 $time 초 후에 시작합니다!")
                Bukkit.broadcast(BaseComponent1)
            }
        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): List<String> {
        return emptyList()
    }
}