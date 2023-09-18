
package net.mcreator.craftkaisen.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.craftkaisen.procedures.KatanaEntitySwingsItemProcedure;
import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

public class KatanaItem extends SwordItem {
	public KatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
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
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		KatanaEntitySwingsItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
