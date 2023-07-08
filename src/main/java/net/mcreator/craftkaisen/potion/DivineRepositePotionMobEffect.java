
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.DivineRepositePotionOnEffectActiveTickProcedure;

public class DivineRepositePotionMobEffect extends MobEffect {
	public DivineRepositePotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.divine_reposite_potion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DivineRepositePotionOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
