package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class SetDivergentProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Divergent";
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
			double _setval = 500;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.CursedEnergyCap = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 100;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 125;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 50;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 140;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 300;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 200;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MoveSpecialCost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 500;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MoveUltimateCost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
