package com.justbru00.epic.chickengame.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.justbru00.epic.chickengame.listeners.ScaffoldListener;

public class Main extends JavaPlugin {

	private static Main instance;
	
	/**
	 * Map size
	 * /fill ~ ~ ~ ~31 ~31 ~31 minecraft:cyan_stained_glass outline
	 */
	
	@Override
	public void onDisable() {
		
		instance = null;
	}

	@Override
	public void onEnable() {
		instance = this;
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new ScaffoldListener(), instance);
	
	}

	public static Main getInstance() {
		return instance;
	}	
	
	

}
