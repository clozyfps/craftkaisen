
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.ClapRushOnEffectActiveTickProcedure;

public class ClapRushMobEffect extends MobEffect {
	public ClapRushMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.clap_rush";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ClapRushOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
