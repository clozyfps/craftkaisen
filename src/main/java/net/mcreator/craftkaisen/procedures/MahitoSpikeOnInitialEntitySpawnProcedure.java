package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MahitoSpikeOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftkaisenMod.queueServerWork(25, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
