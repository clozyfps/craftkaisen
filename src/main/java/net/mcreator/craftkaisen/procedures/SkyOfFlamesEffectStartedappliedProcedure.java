package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class SkyOfFlamesEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 1.5), 0));
		CraftkaisenMod.queueServerWork(15, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.FLAME_SPARK.get()), x, y, z, 5, 0.1, 2, 0.1, 0);
		});
	}
}
