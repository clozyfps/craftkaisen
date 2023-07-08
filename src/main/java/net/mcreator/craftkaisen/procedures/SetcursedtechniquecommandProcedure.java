package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import java.util.HashMap;

public class SetcursedtechniquecommandProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Limitless") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("limitless")) {
			SetLimitlessProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Restricted") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("restricted")) {
			SetHeavenlyProcedure.execute(entity);
		}
	}
}
