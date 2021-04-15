package de.stormi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage("§3Du Wurdest geheilt");
        } else
            commandSender.sendMessage("Dieses Kommando darfst du nur als Spieler benutzen!");

        return false;
    }
}
