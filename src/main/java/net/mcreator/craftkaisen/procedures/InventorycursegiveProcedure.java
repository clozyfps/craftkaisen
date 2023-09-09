package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InventorycursegiveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).InventoryCurse == true) {
			{
				boolean _setval = false;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InventoryCurse = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
