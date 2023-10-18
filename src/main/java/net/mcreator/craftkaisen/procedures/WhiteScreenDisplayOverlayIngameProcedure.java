package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class WhiteScreenDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("white")) {
			return true;
		}
		return false;
	}
}
