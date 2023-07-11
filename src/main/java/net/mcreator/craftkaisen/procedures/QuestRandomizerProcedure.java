package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class QuestRandomizerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomMob = 0;
		double amount = 0;
		if (!entity.getPersistentData().getBoolean("quest")) {
			entity.getPersistentData().putBoolean("quest", true);
			randomMob = Mth.nextInt(RandomSource.create(), 1, 5);
			if (randomMob == 1) {
				{
					String _setval = "Fingerbearer";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 100, 200);
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (randomMob == 2) {
				{
					String _setval = "Mahito";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 300, 400);
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (randomMob == 3) {
				{
					String _setval = "Basic Cursed Spirits";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				amount = Mth.nextInt(RandomSource.create(), 1, 10);
				{
					double _setval = amount;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = amount * 3;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (randomMob == 4) {
				{
					String _setval = "Toji";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 450, 500);
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (randomMob == 5) {
				{
					String _setval = "Gojo";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 500, 600);
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
