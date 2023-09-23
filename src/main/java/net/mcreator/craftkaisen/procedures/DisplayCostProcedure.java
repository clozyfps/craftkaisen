package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if (entity.getPersistentData().getDouble("costSword") <= 0) {
			v = "Cost : " + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("costSword"));
		} else {
			v = "Cost : " + "0";
		}
		return v;
	}
}
