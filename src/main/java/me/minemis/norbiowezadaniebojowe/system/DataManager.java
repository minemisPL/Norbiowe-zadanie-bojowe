package me.minemis.norbiowezadaniebojowe.system;

import org.bukkit.OfflinePlayer;

import java.util.HashMap;
import java.util.Map;

public class DataManager {

    private final Map<String, PlayerCache> playerCacheMap;

    private static DataManager dataManager;

    public DataManager() {
        dataManager = this;

        playerCacheMap = SaveLoadManager.load();
    }

    public static DataManager getInstance() {
        if (dataManager == null) {
            return new DataManager();
        }

        return dataManager;
    }

    public PlayerCache getPlayerCache(OfflinePlayer player) {
        String playerName = player.getName();

        if (playerCacheMap.containsKey(playerName)) {
            return playerCacheMap.get(playerName);
        }

        PlayerCache playerCache = new PlayerCache(playerName);

        playerCacheMap.put(playerName, playerCache);
        return playerCache;
    }

    public Map<String, PlayerCache> getPlayerCacheMap() {
        return new HashMap<>(playerCacheMap);
    }

}
