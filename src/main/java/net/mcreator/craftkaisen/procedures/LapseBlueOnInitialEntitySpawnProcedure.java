package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class LapseBlueOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftkaisenMod.queueServerWork(30, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
