package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class InvertedSpearofHeavenRemoveInfinityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.INFINITY.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftkaisenModMobEffects.INFINITY.get());
		}
	}
}
