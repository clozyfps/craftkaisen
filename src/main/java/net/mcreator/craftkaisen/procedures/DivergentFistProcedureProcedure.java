package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class DivergentFistProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.DIVERGENT_FIST.get()) : false)) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DIVERGENT_FIST.get(), 999999, 1, false, false));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftkaisenModMobEffects.DIVERGENT_FIST.get());
		}
	}
}
