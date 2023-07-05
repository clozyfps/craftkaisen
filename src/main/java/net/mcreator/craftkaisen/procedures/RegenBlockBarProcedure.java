package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RegenBlockBarProcedure {
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
		if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Blocking) {
			if (entity.getPersistentData().getDouble("blockBarTimer") == 60) {
				entity.getPersistentData().putDouble("blockBarTimer", 0);
			} else if (entity.getPersistentData().getDouble("blockBarTimer") < 60) {
				entity.getPersistentData().putDouble("blockBarTimer", (entity.getPersistentData().getDouble("blockBarTimer") + 1));
			}
			if (entity.getPersistentData().getDouble("blockBarTimer") == 60) {
				if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).BlockBar != 0) {
					{
						double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).BlockBar - 1;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.BlockBar = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
