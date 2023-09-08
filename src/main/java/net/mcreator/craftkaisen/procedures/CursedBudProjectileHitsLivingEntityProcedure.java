package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class CursedBudProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("bud", true);
		CraftkaisenMod.queueServerWork(200, () -> {
			entity.getPersistentData().putBoolean("bud", false);
		});
	}
}
