package de.eldritch.spigot.poppy_hats;

import de.eldritch.spigot.poppy_hats.core.PlayerInteractEntityListener;
import org.bukkit.plugin.java.JavaPlugin;

public class PoppyHats extends JavaPlugin {
    public static PoppyHats singleton;

    @Override
    public void onEnable() {
        singleton = this;

        getServer().getPluginManager().registerEvents(new PlayerInteractEntityListener(), this);
    }
}
