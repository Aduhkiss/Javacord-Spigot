package me.atticusthecoder.javacord;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getLogger().info("JavaCord loaded.");
	}

}
