package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TechniqueMenuProcedure {
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
				String _setval = "Teleport";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move3Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Flight";
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
				double _setval = 5;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move1Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 10;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move2Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 15;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move3Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 10;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move4Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 25;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move5Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 30;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move6Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 50;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move7Cost = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
