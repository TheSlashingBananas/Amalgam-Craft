package net.slasherxt.amalgam.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.slasherxt.amalgam.init.ModItems;
import net.slasherxt.amalgam.reference.Reference;

public class CreativeTabSM {
	public static final CreativeTabs SM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.mixingTool;
		}
	};
}
