package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class RevealingOnesHandEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = entity.getPersistentData().getDouble("1Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move1Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("2Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move2Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("3Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move3Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("4Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move4Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("5Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move5Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("6Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move6Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData().getDouble("7Damage");
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Move7Damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
