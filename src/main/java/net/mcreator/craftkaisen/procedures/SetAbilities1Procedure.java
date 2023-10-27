package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetAbilities1Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Limitless")) {
			entity.getPersistentData().putDouble("maxMoves", 7);
			if (entity.getPersistentData().getDouble("moveNumber") == 1) {
				{
					String _setval = "Lapse Blue";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 5;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
				{
					String _setval = "Reversal Red";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 10;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
				{
					String _setval = "Teleport";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 15;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
				{
					String _setval = "Flight";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 10;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
				{
					String _setval = "Hollow Purple";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 25;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
				{
					String _setval = "Infinity";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 30;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
				{
					String _setval = "Unlimited Void";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SelectedTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 50;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Cost = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
