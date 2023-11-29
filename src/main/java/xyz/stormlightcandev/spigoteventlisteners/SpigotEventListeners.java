package xyz.stormlightcandev.spigoteventlisteners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
public final class SpigotEventListeners extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Plugin started.");

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("Yay a player joined wooo!");
    }
}