
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class InvertedSpearofHeavenItem extends SwordItem {
	public InvertedSpearofHeavenItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
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
		}, 3, -2f, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKWEAPONS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		InvertedSpearofHeavenRemoveInfinityProcedure.execute(entity);
		return retval;
	}
}
