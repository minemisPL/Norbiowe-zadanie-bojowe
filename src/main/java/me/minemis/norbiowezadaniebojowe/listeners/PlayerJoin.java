package me.minemis.norbiowezadaniebojowe.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    private static long logTime;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        logTime = System.currentTimeMillis();
    }

    public static long getLogTime(){
        return logTime;
    }
}
