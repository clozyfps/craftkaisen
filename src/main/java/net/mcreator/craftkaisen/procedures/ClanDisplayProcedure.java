package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ClanDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Clan : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Clan;
	}
}
