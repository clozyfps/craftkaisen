package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireArrowProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.setSecondsOnFire(10);
		entity.setDeltaMovement(new Vec3((1 * immediatesourceentity.getLookAngle().x), (0 * immediatesourceentity.getLookAngle().y), (1 * immediatesourceentity.getLookAngle().z)));
	}
}
