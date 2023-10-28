package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HollowPurpleTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("hollowPurple") >= 0) {
			entity.getPersistentData().putDouble("hollowPurple", (entity.getPersistentData().getDouble("hollowPurple") - 1));
			entity.getPersistentData().putDouble("hollowDistance", (entity.getPersistentData().getDouble("hollowDistance") + 0.12857143));
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 1, 1.5, 1, 1.5, 1);
			if (entity.getPersistentData().getDouble("hollowPurple") >= 1) {
				if ((entity.getDirection()) == Direction.EAST) {
				} else if ((entity.getDirection()) == Direction.WEST) {
				} else if ((entity.getDirection()) == Direction.NORTH) {
				} else if ((entity.getDirection()) == Direction.SOUTH) {
				}
			}
			if (entity.getPersistentData().getDouble("hollowPurple") == 1) {
				entity.getPersistentData().putDouble("purpleDistance", 0);
				entity.getPersistentData().putBoolean("purple", true);
			}
		}
	}
}
