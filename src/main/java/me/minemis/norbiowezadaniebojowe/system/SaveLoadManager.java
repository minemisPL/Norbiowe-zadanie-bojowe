package me.minemis.norbiowezadaniebojowe.system;

import me.minemis.norbiowezadaniebojowe.NorbioweZadanieBojowe;
import org.json.simple.JSONObject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class SaveLoadManager {

    public static void save(Map<String, PlayerCache> cacheMap) throws Exception {
        JSONObject jsonListPlayer = new JSONObject();

        for (Map.Entry<String, PlayerCache> cacheEntry : cacheMap.entrySet()) {
            JSONObject jsonCachePlayer = new JSONObject();

            jsonCachePlayer.put("lastlogin", cacheEntry.getValue().getLastLogin());
            jsonCachePlayer.put("time", cacheEntry.getValue().getTime());

            jsonListPlayer.put(cacheEntry.getKey(), jsonCachePlayer);
        }

        Path path = NorbioweZadanieBojowe.getInstance().getDataFolder().toPath().resolve("data.json");
        File file = path.toFile();

        System.out.println(path);

        if (!file.exists()) {
            file.getParentFile().mkdir();
            file.createNewFile();
        }

        Files.write(path, jsonListPlayer.toJSONString().getBytes());
    }

    public static Map<String, PlayerCache> load() {
        return new HashMap<>();
    }

}
