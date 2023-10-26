
package net.mcreator.craftkaisen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

public class NailItem extends Item {
	public NailItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKITEMS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
