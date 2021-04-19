package me.minemis.norbiowezadaniebojowe.commands;

import me.minemis.norbiowezadaniebojowe.listeners.PlayerJoin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.TimeUnit;

public class MyPluginUwU implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args){
        if (!(sender instanceof Player))  {
            return true;
        }

        Player player = (Player) sender;

        player.sendMessage("Time played counted: " + getTime(player));

        return true;
    }

    private String getTime(Player player) {
        long currentTime = System.currentTimeMillis() - PlayerJoin.getLogTime(player);
        long sek = TimeUnit.MILLISECONDS.toSeconds(currentTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(currentTime));

        return String.format("%02d min, %02d sec", TimeUnit.MILLISECONDS.toMinutes(currentTime), sek);
    }
}
