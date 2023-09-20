package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class PlusPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("cei", (entity.getPersistentData().getDouble("cei") + 1));
	}
}
