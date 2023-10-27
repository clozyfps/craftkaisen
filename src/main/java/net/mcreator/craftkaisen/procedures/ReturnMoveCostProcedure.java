package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class ReturnMoveCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Cost: " + new java.text.DecimalFormat("##.##").format((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Cost);
	}
}
