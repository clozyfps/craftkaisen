package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

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
