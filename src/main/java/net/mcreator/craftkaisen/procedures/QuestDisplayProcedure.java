package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class QuestDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestMob).isEmpty()) {
			v = false;
		} else {
			v = true;
		}
		return v;
	}
}
