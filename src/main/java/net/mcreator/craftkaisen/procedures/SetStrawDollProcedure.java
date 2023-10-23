package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class SetStrawDollProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Straw Doll";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Technique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Straw Doll";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedTechnique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Straw Doll";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Resonance";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Hairpin";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Name = _setval;
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
			double _setval = 200;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 300;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 400;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 700;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 1250;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move6Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
