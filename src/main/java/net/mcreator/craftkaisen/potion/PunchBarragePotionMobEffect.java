
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.PunchBarragePotionOnEffectActiveTickProcedure;

public class PunchBarragePotionMobEffect extends MobEffect {
	public PunchBarragePotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.punch_barrage_potion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PunchBarragePotionOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
