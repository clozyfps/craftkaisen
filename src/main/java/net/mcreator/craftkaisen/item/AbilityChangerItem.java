
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class AbilityChangerItem extends Item {

	public AbilityChangerItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKITEMS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AbilityChangerRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}

}
