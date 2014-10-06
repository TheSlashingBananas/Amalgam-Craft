package net.slasherxt.amalgam.item;

import java.util.HashMap;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAmalgamIngot extends ItemAmalgam {
	
	public static final Item lapis = new ItemStack(Items.dye, 4).getItem();
	
	/**
	 * List of Mixtures and Names
	 * 
	 * 			Coal	Iron	Gold	Diamond		Emerald		Redstone	Lapis
	 * 
	 * Coal		XXX		Cron	Golal	Comond		Emeroal		Roalstone	Licmis
	 * 
	 * Iron		XXX		XXX		Golon	Irmond		Emeron		Rirstone	Lirmis
	 * 
	 * Gold		XXX		XXX		XXX		Gomond		Emeold		Rogstone	Ligmis
	 * 
	 * Diamond	XXX		XXX		XXX		XXX			Ememond		Rimstone	Liamis
	 * 
	 * Emerald	XXX		XXX		XXX		XXX			XXX			Remstone	Leimis
	 * 
	 * Redstone	XXX		XXX		XXX		XXX			XXX			XXX			Rapis
	 * 
	 * Lapis	XXX		XXX		XXX		XXX			XXX			XXX			XXX
	 */
	
	public static final String[] ingotMixturesNameList = {"cron", "golal", "golon", "comond", "irmond", "gomond",
		"emeroal", "emeron", "emeold", "ememond", "roalstone", "rirstone", "rogstone", "rimstone", "remstone",
		"licmis", "lirmis", "ligmis", "liamis", "leimis", "rapis"};
	
	public static final HashMap<String, Item> ingotMixturesPairingList1 = new HashMap<String, Item>();
	public static final HashMap<String, Item> ingotMixturesPairingList2 = new HashMap<String, Item>();
	
	public static void initRecipesList() {
		initList1();
		initList2();
	}
	
	private static void initList1() {
		ingotMixturesPairingList1.put("cron", Items.coal);
		ingotMixturesPairingList1.put("golal", Items.coal);
		ingotMixturesPairingList1.put("golon", Items.iron_ingot);
		ingotMixturesPairingList1.put("comond", Items.coal);
		ingotMixturesPairingList1.put("irmond", Items.iron_ingot);
		ingotMixturesPairingList1.put("gomond", Items.gold_ingot);
		ingotMixturesPairingList1.put("emeroal", Items.coal);
		ingotMixturesPairingList1.put("emeron", Items.iron_ingot);
		ingotMixturesPairingList1.put("emeold", Items.gold_ingot);
		ingotMixturesPairingList1.put("ememond", Items.diamond);
		ingotMixturesPairingList1.put("roalstone", Items.coal);
		ingotMixturesPairingList1.put("rirstone", Items.iron_ingot);
		ingotMixturesPairingList1.put("rogstone", Items.gold_ingot);
		ingotMixturesPairingList1.put("rimstone", Items.diamond);
		ingotMixturesPairingList1.put("remstone", Items.emerald);
		ingotMixturesPairingList1.put("licmis", Items.coal);
		ingotMixturesPairingList1.put("lirmis", Items.iron_ingot);
		ingotMixturesPairingList1.put("ligmis", Items.gold_ingot);
		ingotMixturesPairingList1.put("liamis", Items.diamond);
		ingotMixturesPairingList1.put("leimis", Items.emerald);
		ingotMixturesPairingList1.put("rapis", Items.redstone);
	}
	
	private static void initList2() {
		ingotMixturesPairingList2.put("cron", Items.iron_ingot);
		ingotMixturesPairingList2.put("golal", Items.gold_ingot);
		ingotMixturesPairingList2.put("golon", Items.gold_ingot);
		ingotMixturesPairingList2.put("comond", Items.diamond);
		ingotMixturesPairingList2.put("irmond", Items.diamond);
		ingotMixturesPairingList2.put("gomond", Items.diamond);
		ingotMixturesPairingList2.put("emeroal", Items.emerald);
		ingotMixturesPairingList2.put("emeron", Items.emerald);
		ingotMixturesPairingList2.put("emeold", Items.emerald);
		ingotMixturesPairingList2.put("ememond", Items.emerald);
		ingotMixturesPairingList2.put("roalstone", Items.redstone);
		ingotMixturesPairingList2.put("rirstone", Items.redstone);
		ingotMixturesPairingList2.put("rogstone", Items.redstone);
		ingotMixturesPairingList2.put("rimstone", Items.redstone);
		ingotMixturesPairingList2.put("remstone", Items.redstone);
		ingotMixturesPairingList2.put("licmis", lapis);
		ingotMixturesPairingList2.put("lirmis", lapis);
		ingotMixturesPairingList2.put("ligmis", lapis);
		ingotMixturesPairingList2.put("liamis", lapis);
		ingotMixturesPairingList2.put("leimis", lapis);
		ingotMixturesPairingList2.put("rapis", lapis);
		
	}
}
