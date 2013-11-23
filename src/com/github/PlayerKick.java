package com.github;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class PlayerKick implements Listener {
    @EventHandler public void onPlayerLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        if (!isRegistered(player)) {
            event.disallow(PlayerLoginEvent.Result.KICK_FULL, "Code = ");
        }
    }

    public boolean isRegistered(Player player) {
        // TODO run player UUID/name through database to check if registered
        return false;
    }
}
