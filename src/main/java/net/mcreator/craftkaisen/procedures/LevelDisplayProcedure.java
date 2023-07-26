package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class LevelDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Level : " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Level);
	}
}
