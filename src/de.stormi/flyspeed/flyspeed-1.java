package de.stormi.flyspeed;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flyspeed1 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.setFlySpeed(1);
            player.sendMessage("flyspeed 1");
            player.setFlying(true);
            player.setAllowFlight(true);
        } else
            commandSender.sendMessage("You cant use this Command in the Console");

        return false;
    }
}
