package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import java.util.HashMap;

public class SetCursedTechniqueProcedureProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Limitless") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("limitless")) {
			SetLimitlessProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Restricted") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("restricted")) {
			SetHeavenlyProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Voice") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("voice")) {
			SetVoiceProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Boogie") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("boogie")) {
			SetClapProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Divergent") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("divergent")) {
			SetDivergentProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Flames") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("flames")) {
			SetFlamesProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Sukuna") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("sukuna")) {
			SetSukunaProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Plants") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("plants")) {
			SetPlantsProcedure.execute(entity);
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Transfiguration") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("transfiguration")) {
			SetTransfigurationProcedure.execute(entity);
		}
	}
}
