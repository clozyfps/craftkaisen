package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

public class SetcursedtechniquecommandProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Limitless") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("limitless")) {
			{
				String _setval = "Limitless";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
