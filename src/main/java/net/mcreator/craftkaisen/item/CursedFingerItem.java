
package net.mcreator.craftkaisen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.craftkaisen.procedures.EatCursedFingerProcedure;
import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

public class CursedFingerItem extends Item {
	public CursedFingerItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKITEMS).stacksTo(20).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EatCursedFingerProcedure.execute(world, entity);
		return retval;
	}
}
