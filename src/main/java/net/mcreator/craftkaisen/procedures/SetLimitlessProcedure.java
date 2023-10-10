package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetLimitlessProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Limitless";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Technique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Lapse Blue";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedTechnique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Lapse Blue";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Reversal Red";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Grab And Toss";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Infinity Combo";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Hollow Purple";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Infinity";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move6Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Unlimited Void";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move7Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 150;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 300;
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
			double _setval = 75;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 800;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move6Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 1250;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move7Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
