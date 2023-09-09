package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InventoryCurseRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			boolean _setval = true;
			sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.InventoryCurse = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
