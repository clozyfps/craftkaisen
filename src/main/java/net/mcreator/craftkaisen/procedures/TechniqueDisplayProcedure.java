package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class TechniqueDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Restricted) {
			v = "CT : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique;
		} else {
			v = "Restriction : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RestrictedType;
		}
		return v;
	}
}
