package net.slasherxt.amalgam.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.slasherxt.amalgam.handler.ConfigurationHandler;
import net.slasherxt.amalgam.item.ItemAmalgam;
import net.slasherxt.amalgam.item.ItemAmalgamIngot;
import net.slasherxt.amalgam.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static ItemAmalgam mixingTool;
	public static ItemAmalgamIngot[] ingotMixList;
	
	public static void preInit() {
		mixingTool = new ItemAmalgam();
		ingotMixList = new ItemAmalgamIngot[ItemAmalgamIngot.ingotMixturesNameList.length];
	}
	
	public static void init() {
		mixingTool.setUnlocalizedName("mixingTool").setMaxStackSize(1).setContainerItem(mixingTool);
		for(int i=0;i<ingotMixList.length;i++) {
			ingotMixList[i] = new ItemAmalgamIngot();
		}
		
		for(int i=0;i<ingotMixList.length;i++) {
			ingotMixList[i].setUnlocalizedName(ItemAmalgamIngot.ingotMixturesNameList[i]);
		}
		
		ItemAmalgamIngot.initRecipesList();
	}
	
	public static void register() {
		registerItem(mixingTool, mixingTool.getUnlocalizedName());
		for(int i=0;i<ingotMixList.length;i++) {
			registerItem(ingotMixList[i], ingotMixList[i].getUnlocalizedName());
		}
	}
	
	private static void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}
	
	public static void loadRecipes() {
		mixingTool.setContainerItem(mixingTool);
		
		//TODO Fix to where don't have dupe recipes..
		
		if(ConfigurationHandler.hardMode) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mixingTool), "did", "iii", " s ", 'i', new ItemStack(Items.iron_ingot), 'd', new ItemStack(Items.diamond), 's', new ItemStack(Items.stick)));
		} else {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mixingTool), "ici", "iii", " s ", 'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(Items.stick)));
		}
		
		for(int i=0;i<ingotMixList.length;i++) {
			createOreRecipe(ingotMixList[i], ItemAmalgamIngot.ingotMixturesPairingList1.get(ingotMixList[i].getItemName(ingotMixList[i])), ItemAmalgamIngot.ingotMixturesPairingList2.get(ingotMixList[i].getItemName(ingotMixList[i])));
		}
	}
	
	private static void createOreRecipe(Item output, Item ore1, Item ore2) {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(output), new ItemStack(ore1), new ItemStack(ore2), new ItemStack(mixingTool)));
	}
}
