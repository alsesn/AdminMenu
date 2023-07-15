package segasha.adminmenu.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;



public class MenuListeners implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        if (!event.getView().getTitle().equals(ChatColor.RED + "Manage Player")) {
            return;
        }

        event.setCancelled(true);

        if (event.getCurrentItem() == null) {
            return;
        }

        Player player = (Player) event.getWhoClicked();
        Player target = Bukkit.getPlayer(event.getView().getItem(22).getItemMeta().getDisplayName());

        if (target == null){
            player.closeInventory();
            player.sendMessage(ChatColor.RED + "The target is not online anymore");
            return;
        }
    }
}
