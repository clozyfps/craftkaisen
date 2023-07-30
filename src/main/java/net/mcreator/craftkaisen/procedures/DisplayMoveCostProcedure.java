package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class DisplayMoveCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).isEmpty()
				|| ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Moveset2")) {
			v = "Cost : " + "0";
		} else {
			v = "Cost : " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Cost);
		}
		return v;
	}
}
