package me.minemis.norbiowezadaniebojowe.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnLogin implements Listener {

    private static long logTime;

    @EventHandler
    public void onLogin(PlayerJoinEvent event){
        logTime = System.currentTimeMillis();
    }

    public static long getLogTime(){
        return logTime;
    }
}
