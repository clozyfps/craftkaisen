package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MoodDisplayRedProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean value = false;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood <= 10
				&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood >= 0) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
}
