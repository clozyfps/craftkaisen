
package net.mcreator.craftkaisen.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.craftkaisen.procedures.PlayfulCloudLivingEntityIsHitWithToolProcedure;
import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

public class PlayfulCloudItem extends SwordItem {
	public PlayfulCloudItem() {
		super(new Tier() {
			public int getUses() {
				return 1900;
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
		}, 3, -1f, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKWEAPONS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PlayfulCloudLivingEntityIsHitWithToolProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}
