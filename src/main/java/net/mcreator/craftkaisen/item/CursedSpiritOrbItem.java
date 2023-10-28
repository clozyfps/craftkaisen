
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

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

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CursedSpiritOrbPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);

		return retval;
	}

}
