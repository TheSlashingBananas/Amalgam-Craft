package net.slasherxt.amalgam;

import net.slasherxt.amalgam.handler.ConfigurationHandler;
import net.slasherxt.amalgam.init.ModItems;
import net.slasherxt.amalgam.proxy.IProxy;
import net.slasherxt.amalgam.reference.Reference;
import net.slasherxt.amalgam.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class AmalgamCraft {
	@Instance("AmalgamCraft")
	public static AmalgamCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		LogHelper.info("Loading AmalgamCraft Stuff!");
		
		ModItems.preInit();
		ModItems.init();
		ModItems.register();
		ModItems.loadRecipes();
		
		LogHelper.info("AmalgamCraft Loading Complete!");
		
		LogHelper.info("PreInit Complete");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		LogHelper.info("Loading AmalgamCraft-Extra Stuff!");
		
		//Check for other mods and add more stuff!
		
		LogHelper.info("AmalgamCraft-Extra Loading Complete!");
		
		LogHelper.info("Init Complete");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		/**
		for(int i=3;i<Loader.instance().getActiveModList().size();) {
			LogHelper.error(i + ") " + Loader.instance().getActiveModList().get(i).getModId());
			i++;
		}
		*/
		
		LogHelper.info("PostInit Complete");
		
	}
}
