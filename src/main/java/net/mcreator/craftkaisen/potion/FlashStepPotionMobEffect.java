
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.FlashStepPotionOnEffectActiveTickProcedure;

public class FlashStepPotionMobEffect extends MobEffect {
	public FlashStepPotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.flash_step_potion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FlashStepPotionOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
