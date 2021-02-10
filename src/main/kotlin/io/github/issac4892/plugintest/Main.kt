package io.github.issac4892.plugintest

import io.github.issac4892.plugintest.commands.Start
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit
import org.bukkit.event.Listener

class Main : JavaPlugin(), Listener {
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this)
        logger.info("Testplugin is Enabled!")
        getCommand("startp")?.setExecutor(Start())
        getCommand("startp")?.tabCompleter = Start()
    }



}