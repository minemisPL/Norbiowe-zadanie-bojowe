package me.minemis.norbiowezadaniebojowe.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.Map;

public class PlayerJoin implements Listener {

    private static Map<String, Long> logTime = new HashMap<>();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        logTime.put(event.getPlayer().getName(), System.currentTimeMillis());
    }

    public static long getLogTime(Player player) {
        return logTime.get(player.getName());
    }
}
