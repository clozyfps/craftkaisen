package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class ErrorDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (entity.getPersistentData().getBoolean("showErr")) {
			v = true;
		} else {
			v = false;
		}
		return v;
	}
}
