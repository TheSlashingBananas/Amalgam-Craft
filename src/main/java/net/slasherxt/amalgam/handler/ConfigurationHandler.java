package net.slasherxt.amalgam.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.slasherxt.amalgam.init.ModItems;
import net.slasherxt.amalgam.reference.Reference;
import net.slasherxt.amalgam.utility.Reloader;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	public static Configuration configuration;
	
	// Config Variables Here
	public static boolean hardMode;
	public static boolean hardModeOld;
	
	public static void init(File configFile) {
		if(configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		
		hardModeOld = hardMode;
		
		// Config Values Here
		hardMode = configuration.getBoolean("HardMode", Configuration.CATEGORY_GENERAL, false, "Harder Mixing Recipes");
		
		if(configuration.hasChanged()) {			
			configuration.save();
			
			if(hardModeOld != hardMode) {
				Reloader.reload(0);
			}
		}
	}
}
