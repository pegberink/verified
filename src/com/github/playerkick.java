package com.github;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerLoginEvent;

public class playerkick {
	    public void onPlayerLoginEvent(PlayerLoginEvent event){
		Player p = event.getPlayer();
		p.kickPlayer("Code = ");
		}
}
