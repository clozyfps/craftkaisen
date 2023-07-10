
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.IrritatedThroatOnEffectActiveTickProcedure;

public class IrritatedThroatMobEffect extends MobEffect {
	public IrritatedThroatMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.irritated_throat";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		IrritatedThroatOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
