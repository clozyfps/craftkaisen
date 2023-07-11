package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckEmotionalStateProcedure {
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
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood <= 10
				&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood > 0) {
			entity.getPersistentData().putBoolean("redState", true);
			entity.getPersistentData().putBoolean("yellowState", false);
			entity.getPersistentData().putBoolean("greenState", false);
		} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood <= 49
				&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood > 10) {
			entity.getPersistentData().putBoolean("redState", false);
			entity.getPersistentData().putBoolean("yellowState", true);
			entity.getPersistentData().putBoolean("greenState", false);
		} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mood >= 50) {
			entity.getPersistentData().putBoolean("redState", false);
			entity.getPersistentData().putBoolean("yellowState", false);
			entity.getPersistentData().putBoolean("greenState", true);
		}
	}
}
