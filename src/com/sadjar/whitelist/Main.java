package com.sadjar.whitelist;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	public Main plugin;
	
	
	public void onEnable() {
		System.out.print("[Whitelist] Plugin activated!");
		Bukkit.getServer().setWhitelist(true);
	}
	
	public void onDisable() {
		System.out.print("[Whitelist] Disabled!");
	}

}
