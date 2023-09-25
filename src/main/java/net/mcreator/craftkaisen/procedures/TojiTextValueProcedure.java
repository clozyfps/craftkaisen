package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class TojiTextValueProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("TojiBuy")) {
			return true;
		}
		return false;
	}
}
