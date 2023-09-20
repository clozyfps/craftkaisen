package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplayAmountProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if (entity.getPersistentData().getDouble("cei") < 10) {
			v = "0" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("cei"));
		} else {
			v = new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("cei"));
		}
		return v;
	}
}
