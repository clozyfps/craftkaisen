package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class CursedenergymaxProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 10000000;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CursedEnergy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 10000000;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CursedEnergyCap = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
