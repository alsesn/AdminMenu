package segasha.adminmenu.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import segasha.adminmenu.menus.ManageMenu;

public class ManageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;

        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can execute this command");
            return true;
        }

        if (args.length != 1){
            player.sendMessage(ChatColor.RED + "Use: /manege <player>");
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);

        if (target== null){
            player.sendMessage(ChatColor.RED + "Player not found!" );
            return true;
        }

        new ManageMenu(player, target);
        return true;
    }
}
