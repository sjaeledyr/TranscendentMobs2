package me.sjaeledyr.transcendentmobs2;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[TranscendentMobs2] TranscendentMobs2 by Sjaeledyr has been loaded!");
        System.out.println("[TranscendentMobs2] Plugin version 1.0-SNAPSHOT");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[TranscendentMobs2]TranscendentMobs2 has been disabled!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("tmobs")) {
            if (!sender.hasPermission("tmobs.admin")) {
                sender.sendMessage(ChatColor.RED + "You do not have permissions to run this command!");
                return true;
            }
        }

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /tmobs reload");
            return true;
        }

        if (args.length > 0) {
            // /tmobs reload
            if (args[0].equalsIgnoreCase("reload")) {
                sender.sendMessage(ChatColor.GREEN + "TranscendentMobs2 has been reloaded!");
                return true;
            }

            if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(ChatColor.RED + "There is currently no help menu programmed!");
                return true;
            }
        }
       return false;
    }
}
