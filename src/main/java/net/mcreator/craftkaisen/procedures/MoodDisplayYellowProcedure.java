package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class MoodDisplayYellowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean value = false;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood <= 49
				&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood > 10) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}
}
