package me.minemis.norbiowezadaniebojowe;

import me.minemis.norbiowezadaniebojowe.Commands.MyPluginUwU;
import org.bukkit.command.Command;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class NorbioweZadanieBojowe extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        MyPluginUwU myPluginUwU = new MyPluginUwU();

        getCommand(myPluginUwU.cmd1).setExecutor(myPluginUwU);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
