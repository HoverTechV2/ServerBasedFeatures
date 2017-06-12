package me.HoverTechV2.ServerBasedFeatures.Commands;

import me.HoverTechV2.ServerBasedFeatures.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HellCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("hell")) {

            if (!(sender instanceof Player)) {

                sender.sendMessage("You need to be a player logged on the server to execute this command.");
                Bukkit.broadcastMessage(Main.color("&4Non Player Entity attempted an invalid command."));

                return false;
            }

            Player player = (Player) sender;

            if (player.isOp()) {

                if (args.length == 0) {
                    player.sendMessage(Main.color("&cYou need to specify a player!"));
                    return true;
                } else if (args.length == 1) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    if (target == null) {
                        player.sendMessage(Main.color("&4This player is not online!"));
                        return true;
                    }
                    target.setGameMode(GameMode.SURVIVAL);
                    target.setFireTicks(1000);
                    Bukkit.broadcastMessage(Main.color("&e&l" + target.getName() + " &4has been set on fire by " + sender.getName() + "!"));
                    return true;

                }

                player.sendMessage(Main.color("&cYou do not have permissions to execute this command."));
            }

        }

        return true;
    }

}
