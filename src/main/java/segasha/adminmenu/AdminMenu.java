package segasha.adminmenu;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import segasha.adminmenu.commands.ManageCommand;


public final class AdminMenu extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("manage").setExecutor(new ManageCommand());

    }

}
