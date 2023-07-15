package segasha.adminmenu.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ManageMenu {
    public ManageMenu(Player player,  Player target)  {

        Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.RED + "Manage Player");

        ItemStack targetHead = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta targetHeadMeta = targetHead.getItemMeta();

        targetHeadMeta.setDisplayName(target.getName());

        targetHead.setItemMeta(targetHeadMeta);

        inventory.setItem(22, targetHead);

        ItemStack ban = new ItemStack(Material.BARRIER, 1);
        ItemMeta banMeta = ban.getItemMeta();

        banMeta.setDisplayName(ChatColor.RED + "Ban");
        banMeta.setLore(Arrays.asList(ChatColor.WHITE+ "Ban the target"));

        ban.setItemMeta(banMeta);

        inventory.setItem(11, ban);

        ItemStack mute = new ItemStack(Material.STRUCTURE_VOID);
        ItemMeta muteMeta = mute.getItemMeta();

        muteMeta.setDisplayName(ChatColor.RED + "Mute");
        muteMeta.setLore(Arrays.asList(ChatColor.WHITE + "Mute the target"));

        mute.setItemMeta(muteMeta);

        inventory.setItem(13, mute);

        ItemStack kick = new ItemStack(Material.BLACK_BED);
        ItemMeta kickMeta = kick.getItemMeta();

        kickMeta.setDisplayName(ChatColor.RED + " Kick");
        kickMeta.setLore(Arrays.asList(ChatColor.WHITE + "Kick the target"));

        kick.setItemMeta(kickMeta);

        inventory.setItem(15, kick);

        player.openInventory(inventory);
    }
}
