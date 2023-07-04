
package net.mcreator.craftkaisen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TesItem extends Item {
	public TesItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
