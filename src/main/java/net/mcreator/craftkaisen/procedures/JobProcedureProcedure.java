package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

public class JobProcedureProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Jujutsu Sorcerer") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Jujutsu sorcerer")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("jujutsu sorcerer") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Sorcerer")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("sorcerer") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("jujutsu Sorcerer")) {
			{
				String _setval = "Jujutsu Sorcerer";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Job = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
