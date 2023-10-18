
package net.mcreator.craftkaisen.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

public class CursedSpiritOrbItem extends Item {
	public CursedSpiritOrbItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKITEMS).stacksTo(16).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}
}
