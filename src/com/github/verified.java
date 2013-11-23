package com.github;

import org.bukkit.plugin.java.JavaPlugin;

public class verified extends JavaPlugin {
	public void onEnable(){
		getLogger().info("Verification Plugin enabled!");
		getServer().getPluginManager().registerEvents(new playerkick(), this);
	}
	public void onDisable(){
		getLogger().info("Verification plugin disabled");
	}
}
