package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireArrowOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftkaisenMod.queueServerWork(350, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
