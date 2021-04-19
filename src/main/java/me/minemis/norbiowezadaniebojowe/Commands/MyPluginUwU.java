package me.minemis.norbiowezadaniebojowe.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class MyPluginUwU implements CommandExecutor, Listener {

    public long logTime;
    public String cmd1 = "showtime";
    public String cmd2 = "gitujemy";

    @EventHandler
    public void onLogin(PlayerJoinEvent event){
        logTime = System.currentTimeMillis();
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args){

        if (!(sender instanceof Player)) return true;

            Player player = (Player) sender;

                if (cmd.getName().equalsIgnoreCase(cmd1)){
                    player.sendMessage("Time played: " + getTime());
                }

                if (cmd.getName().equalsIgnoreCase(cmd2)){
                    gitTest(player);
                }
        return false;
    }

    public String getTime(){
        long currentTime = System.currentTimeMillis() - logTime;

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
    public void gitTest(Player player){
        player.sendMessage("Wszystko jest gites ogolnie ziomek");
    }


}
