package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UseMovesProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("hold") == false) {
			if ((entity.getPersistentData().getString("currentMove")).equals("Hollow Purple")) {
				if (entity.getPersistentData().getDouble("purpleCharge") == 0) {
					HollowPurpleProcedureProcedure.execute(world, entity);
					entity.getPersistentData().putDouble("purpleCharge", (entity.getPersistentData().getDouble("chargeTime")));
				}
				entity.getPersistentData().putDouble("chargeTime", 0);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("currentMove"), true);
			entity.getPersistentData().putString("currentMove", "");
		}
	}
}
