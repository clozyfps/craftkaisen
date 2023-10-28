
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class HammerItem extends SwordItem {
	public HammerItem() {
		super(new Tier() {
			public int getUses() {
				return 9999;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1f, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKWEAPONS));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		HammerRightclickedProcedure.execute();
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Right Click to send nails"));
		list.add(Component.literal("(using the ones from your inventory) (must have straw doll technique)"));
	}
}
