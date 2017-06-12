package me.HoverTechV2.ServerBasedFeatures.Commands;


import me.HoverTechV2.ServerBasedFeatures.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YongManCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("youngman")) {

            if (!(sender instanceof Player)) {

                sender.sendMessage("You need to be a player logged on the server to execute this command.");
                Bukkit.broadcastMessage(Main.color("&4Non Player Entity attempted an invalid command."));

                return false;
            }
        Bukkit.broadcastMessage(Main.color("&4Shut the &e&lFUCK &4up young man!"));
        }
return true;
    }

}
