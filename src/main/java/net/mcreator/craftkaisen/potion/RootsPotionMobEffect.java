
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.RootsPotionOnEffectActiveTickProcedure;

public class RootsPotionMobEffect extends MobEffect {
	public RootsPotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.roots_potion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RootsPotionOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
