package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
