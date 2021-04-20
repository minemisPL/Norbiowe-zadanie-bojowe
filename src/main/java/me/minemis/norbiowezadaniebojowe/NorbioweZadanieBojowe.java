package me.minemis.norbiowezadaniebojowe;

import me.minemis.norbiowezadaniebojowe.commands.MyPluginUwU;
import me.minemis.norbiowezadaniebojowe.listeners.PlayerJoin;
import me.minemis.norbiowezadaniebojowe.system.DataManager;
import me.minemis.norbiowezadaniebojowe.system.SaveLoadManager;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class NorbioweZadanieBojowe extends JavaPlugin {

    private static NorbioweZadanieBojowe instance;

    @Override
    public void onEnable() {
        instance = this;

        PluginCommand showtime = this.getCommand("showtime");
        PluginManager pm = this.getServer().getPluginManager();

        if (showtime == null) {
            this.getPluginLoader().disablePlugin(this);
            return;
        }

        showtime.setExecutor(new MyPluginUwU());
        pm.registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        try {
            SaveLoadManager.save(DataManager.getInstance().getPlayerCacheMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static NorbioweZadanieBojowe getInstance() {
        return instance;
    }
}
