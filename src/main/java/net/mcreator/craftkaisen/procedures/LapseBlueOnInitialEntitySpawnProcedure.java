package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
