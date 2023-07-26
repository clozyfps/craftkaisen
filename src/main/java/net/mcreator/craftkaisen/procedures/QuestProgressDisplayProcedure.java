package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class QuestProgressDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Defeat " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestMob + " - "
				+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestProgress) + "/"
				+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestAmount);
	}
}
