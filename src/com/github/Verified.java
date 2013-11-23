package com.github;

import org.bukkit.plugin.java.JavaPlugin;

public class Verified extends JavaPlugin {
    public void onEnable() {
        getLogger().info("Verification Plugin enabled!");
        getServer().getPluginManager().registerEvents(new PlayerKick(), this);
    }

    public void onDisable() {
        getLogger().info("Verification plugin disabled");
    }
}
