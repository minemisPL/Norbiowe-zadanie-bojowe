package me.minemis.norbiowezadaniebojowe;

import me.minemis.norbiowezadaniebojowe.Commands.MyPluginUwU;
import me.minemis.norbiowezadaniebojowe.Listeners.OnLogin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class NorbioweZadanieBojowe extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        MyPluginUwU myPluginUwU = new MyPluginUwU();
        OnLogin onLogin = new OnLogin();

        getCommand(myPluginUwU.cmd1).setExecutor(myPluginUwU);
        getServer().getPluginManager().registerEvents(onLogin,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
