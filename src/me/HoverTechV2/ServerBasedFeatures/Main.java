package me.HoverTechV2.ServerBasedFeatures;

import me.HoverTechV2.ServerBasedFeatures.Commands.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        registerCommands();

        Bukkit.getConsoleSender().sendMessage(color("&4&m---------------------"));
        Bukkit.getConsoleSender().sendMessage(color("&bServerBasedFeatures:"));
        Bukkit.getConsoleSender().sendMessage(color("&bNot having trouble enabling."));
        Bukkit.getConsoleSender().sendMessage(color("&4&m---------------------"));

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(color("&4&m---------------------"));
        Bukkit.getConsoleSender().sendMessage(color("&bServerBasedFeatures:"));
        Bukkit.getConsoleSender().sendMessage(color("&bDisabled."));
        Bukkit.getConsoleSender().sendMessage(color("&4&m---------------------"));
    }

    public void registerCommands() {
        this.getCommand("explode").setExecutor(new ExplodeCommand());
        this.getCommand("fuckoff").setExecutor(new FuckOffCommand());
        this.getCommand("void").setExecutor(new VoidCommand());
        this.getCommand("hell").setExecutor(new HellCommand());
        this.getCommand("youngman").setExecutor(new YongManCommand());
    }

    public static String color(String i) {return ChatColor.translateAlternateColorCodes('&', i);}

    public static Main getInstance() {return instance;}

}
