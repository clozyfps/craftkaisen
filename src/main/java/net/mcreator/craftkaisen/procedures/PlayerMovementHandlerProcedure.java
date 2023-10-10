package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerMovementHandlerProcedure {
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
		if (entity.getPersistentData().getBoolean("underSpatial")) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("lookAngleX") * 1.2), (entity.getPersistentData().getDouble("lookAngleY") * 1.2), (entity.getPersistentData().getDouble("lookAngleZ") * 1.2)));
			entity.getPersistentData().putBoolean("underSpatial", false);
		}
	}
}
