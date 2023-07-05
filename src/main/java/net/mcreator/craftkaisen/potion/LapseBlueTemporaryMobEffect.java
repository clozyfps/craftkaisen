
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.LapseBlueTemporaryOnEffectActiveTickProcedure;
import net.mcreator.craftkaisen.procedures.LapseBlueTemporaryEffectExpiresProcedure;

public class LapseBlueTemporaryMobEffect extends MobEffect {
	public LapseBlueTemporaryMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.lapse_blue_temporary";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LapseBlueTemporaryOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		LapseBlueTemporaryEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
