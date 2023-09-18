package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class SkyOfFlamesEffectExpiresProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() - 15), 0));
		CraftkaisenMod.queueServerWork(5, () -> {
			entity.fallDistance = 0;
		});
	}
}
