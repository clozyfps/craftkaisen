
package net.mcreator.craftkaisen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

import java.util.List;

public class CursedFingerItem extends Item {
	public CursedFingerItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKITEMS).stacksTo(20).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 64;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Finger of the \"King Of Curses\""));
	}
}
