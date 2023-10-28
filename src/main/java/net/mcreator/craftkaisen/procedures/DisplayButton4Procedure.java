package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplayButton4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (entity.getPersistentData().getDouble("domainPress") == 3) {
			v = false;
		} else {
			v = true;
		}
		return v;
	}
}
