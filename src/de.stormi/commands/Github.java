package de.stormi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class github implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage(Github: https://github.com/RealStormi/guard ");
        } else
            commandSender.sendMessage("§4§lDu darfst diesen Befehl nur im Spiel benutzen!");
        return false;
    }
}
