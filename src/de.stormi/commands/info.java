package de.stormi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage("Current Version: 0.2.1");
        } else
            commandSender.sendMessage("§4§lDu darfst diesen Befehl nur im Spiel benutzen!");
        return false;
    }
}
