package me.minemis.norbiowezadaniebojowe;

import me.minemis.norbiowezadaniebojowe.commands.MyPluginUwU;
import me.minemis.norbiowezadaniebojowe.listeners.PlayerJoin;
import org.bukkit.command.PluginCommand;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class NorbioweZadanieBojowe extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginCommand showtime = this.getCommand("showtime");
        PluginManager pm = this.getServer().getPluginManager();;

        if (showtime == null) {
            this.getPluginLoader().disablePlugin(this);
            return;
        }

        showtime.setExecutor(new MyPluginUwU());
        pm.registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {}
}
