package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class PressedMinusProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("cei") != 0) {
			entity.getPersistentData().putDouble("cei", (entity.getPersistentData().getDouble("cei") - 1));
		}
	}
}
