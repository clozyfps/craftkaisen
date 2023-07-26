package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class QuestProgressDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Defeat " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestMob + " - " + new java.text.DecimalFormat("#").format() + "/"
				+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestAmount);
	}
}
