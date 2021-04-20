package me.minemis.norbiowezadaniebojowe.commands;

import me.minemis.norbiowezadaniebojowe.system.DataManager;
import me.minemis.norbiowezadaniebojowe.system.PlayerCache;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.TimeUnit;

public class MyPluginUwU implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args){
        if (!(sender instanceof Player))  {
            return true;
        }

        Player player = (Player) sender;

        player.sendMessage("Time played: " + getTime(player));

        return true;
    }

    private String getTime(Player player) {
        DataManager dataManager = DataManager.getInstance();
        PlayerCache playerCache = dataManager.getPlayerCache(player);

        long currentTime = System.currentTimeMillis() - playerCache.getLastLogin();
        long sek = TimeUnit.MILLISECONDS.toSeconds(currentTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(currentTime));

        return String.format("%02d min, %02d sec", TimeUnit.MILLISECONDS.toMinutes(currentTime), sek);
    }
}
