package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JobProcedureProcedure {
	public static void execute(HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Jujutsu Sorcerer") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Jujutsu sorcerer")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("jujutsu sorcerer") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Sorcerer")
				|| (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("sorcerer") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("jujutsu Sorcerer")) {
		}
	}
}
