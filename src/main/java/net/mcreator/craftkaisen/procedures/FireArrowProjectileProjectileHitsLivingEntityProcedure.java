package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class FireArrowProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.setSecondsOnFire(10);
		entity.setDeltaMovement(new Vec3((1 * immediatesourceentity.getLookAngle().x), (0 * immediatesourceentity.getLookAngle().y), (1 * immediatesourceentity.getLookAngle().z)));
	}
}
