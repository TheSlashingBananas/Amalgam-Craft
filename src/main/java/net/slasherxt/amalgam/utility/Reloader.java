package net.slasherxt.amalgam.utility;

import net.minecraft.item.crafting.CraftingManager;
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
				clearRecipes();
				ModItems.loadRecipes();
				LogHelper.info("Reloading Recipes!");
				break;
			}			
		}
	}
	
	private static void clearRecipes() {
		CraftingManager.getInstance().getRecipeList().remove(ModItems.mixingToolRecipe);
	}
}
