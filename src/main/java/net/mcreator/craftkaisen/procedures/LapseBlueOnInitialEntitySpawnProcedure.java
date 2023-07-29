package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class LapseBlueOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftkaisenMod.queueServerWork(30, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
		world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.LAPSE_BLUE_PARTICLE.get()), x, y, z, 0, 1, 0);
	}
}
