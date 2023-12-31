
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.ReversalRedFinalOnEffectActiveTick2Procedure;
import net.mcreator.craftkaisen.procedures.ReversalRedFinalEffectStartedappliedProcedure;

public class ReversalRedFinalMobEffect extends MobEffect {
	public ReversalRedFinalMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407872);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.reversal_red_final";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ReversalRedFinalEffectStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ReversalRedFinalOnEffectActiveTick2Procedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
