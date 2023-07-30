package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class SetHeavenlyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Restricted";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Technique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedTechnique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CursedEnergy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CursedEnergyCap = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MoveSpecialCost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MoveUltimateCost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
