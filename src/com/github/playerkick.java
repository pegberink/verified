package com.github;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerkick implements Listener {
		@EventHandler
	    public void onPlayerJoinEvent(PlayerJoinEvent event){
		Player p = event.getPlayer();
		p.kickPlayer("Code = ");
		}
}
