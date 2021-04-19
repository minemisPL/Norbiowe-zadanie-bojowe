package me.minemis.norbiowezadaniebojowe.Commands;

import me.minemis.norbiowezadaniebojowe.Listeners.OnLogin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.TimeUnit;

public class MyPluginUwU implements CommandExecutor, Listener {

    public String cmd1 = "showtime";

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args){

        if (!(sender instanceof Player)) return true;

            Player player = (Player) sender;

                if (cmd.getName().equalsIgnoreCase(cmd1)){
                    player.sendMessage("Time played counted: " + getTime());
                }

        return false;
    }

    public String getTime(){
        long currentTime = System.currentTimeMillis() - OnLogin.getLogTime();

        return String.format("%02d min, %02d sec",
                TimeUnit.MILLISECONDS.toMinutes(currentTime),
                TimeUnit.MILLISECONDS.toSeconds(currentTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(currentTime))
        );

        //long minutes = TimeUnit.MILLISECONDS.toMinutes(currentTime);
        //long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTime);
        //int seconds = (int) ((currentTime / 1000) % 60);
        //int minutes = (int) (currentTime / 60000);
    }
}
