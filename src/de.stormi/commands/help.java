package de.stormi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage("Test)
            player.sendMessage("Commands:");
        } else
            commandSender.sendMessage("§4§lYou cant use this Command in the Console!");
        return false;
    }
}
