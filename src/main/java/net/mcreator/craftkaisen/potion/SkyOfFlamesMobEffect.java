
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.SkyOfFlamesOnEffectActiveTickProcedure;
import net.mcreator.craftkaisen.procedures.SkyOfFlamesEffectStartedappliedProcedure;
import net.mcreator.craftkaisen.procedures.SkyOfFlamesEffectExpiresProcedure;

public class SkyOfFlamesMobEffect extends MobEffect {
	public SkyOfFlamesMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.sky_of_flames";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SkyOfFlamesEffectStartedappliedProcedure.execute(

		);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SkyOfFlamesOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SkyOfFlamesEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
