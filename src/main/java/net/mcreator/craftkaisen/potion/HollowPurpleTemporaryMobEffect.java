
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.HollowPurpleTemporaryOnEffectActiveTickProcedure;
import net.mcreator.craftkaisen.procedures.HollowPurpleTemporaryEffectExpiresProcedure;

public class HollowPurpleTemporaryMobEffect extends MobEffect {
	public HollowPurpleTemporaryMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.hollow_purple_temporary";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HollowPurpleTemporaryOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HollowPurpleTemporaryEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
