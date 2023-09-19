
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.RepeatedSlicingOnEffectActiveTickProcedure;

public class RepeatedSlicingMobEffect extends MobEffect {
	public RepeatedSlicingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.repeated_slicing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RepeatedSlicingOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
