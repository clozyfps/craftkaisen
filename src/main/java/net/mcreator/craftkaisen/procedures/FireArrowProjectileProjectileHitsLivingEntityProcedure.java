package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class FireArrowProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
