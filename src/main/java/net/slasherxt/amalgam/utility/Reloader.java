package net.slasherxt.amalgam.utility;

import net.slasherxt.amalgam.init.ModItems;

public class Reloader {
	/**
	 * Reloads Different parts of the mod based on given cause.
	 * 
	 * Causes: 0 - Recipe Config Change
	 * 
	 * @param cause
	 * 
	 */
	public static void reload(int cause) {
		switch(cause) {
			case 0: {
				ModItems.loadRecipes();
				LogHelper.info("Reloading Recipes!");
				break;
			}			
		}
	}
}
