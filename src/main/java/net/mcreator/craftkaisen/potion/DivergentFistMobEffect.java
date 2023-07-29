
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.DivergentFistOnEffectActiveTickProcedure;

public class DivergentFistMobEffect extends MobEffect {
	public DivergentFistMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16751002);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.divergent_fist";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DivergentFistOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
