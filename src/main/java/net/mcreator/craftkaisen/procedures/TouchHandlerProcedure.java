package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class TouchHandlerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("usingTouch")) {
			entity.getPersistentData().putBoolean("usingTouch", true);
		} else {
			entity.getPersistentData().putBoolean("usingTouch", false);
		}
	}
}
