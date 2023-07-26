package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class QuestBoardRightClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomQuestMob = 0;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestMob).isEmpty()) {
			randomQuestMob = Mth.nextInt(RandomSource.create(), 1, 3);
			if (randomQuestMob == 1) {
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
					double _setval = 1500;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (randomQuestMob == 2) {
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
					double _setval = 1000;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (randomQuestMob == 3) {
				{
					String _setval = "Husk";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 1, 10);
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestAmount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).QuestAmount * 5;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuestReward = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
