package me.minemis.norbiowezadaniebojowe.listeners;

import me.minemis.norbiowezadaniebojowe.system.DataManager;
import me.minemis.norbiowezadaniebojowe.system.PlayerCache;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.Map;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        PlayerCache playerCache = DataManager.getInstance().getPlayerCache(event.getPlayer());

        playerCache.setLastLogin(System.currentTimeMillis());
    }

}
