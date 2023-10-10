package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetCursedSpeechProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Cursed Speech";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Technique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Sleep";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedTechnique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Sleep";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Get Crushed";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Explode";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Blast Away";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Twist";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Name = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Don't Move";
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move6Name = _setval;
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
			double _setval = 300;
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
			double _setval = 500;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move6Cost = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
