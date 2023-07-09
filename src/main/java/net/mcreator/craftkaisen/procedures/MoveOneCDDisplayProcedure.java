package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class MoveOneCDDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean value = false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_1_COOLDOWN.get()) : false) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
}
