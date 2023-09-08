package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerKillProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Ditto_Guy")) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("error.cubedistance.70>max").bypassArmor(), 5000);
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4000000, Explosion.BlockInteraction.NONE);
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 1e+28), 0));
		} else if ((entity.getDisplayName().getString()).equals("Obito_Shinobi")) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("error.cubedistance.70>max").bypassArmor(), 5000);
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4000000, Explosion.BlockInteraction.NONE);
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 1e+28), 0));
		} else if ((entity.getDisplayName().getString()).equals("AzeECECHOH")) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("error.cubedistance.70>max").bypassArmor(), 5000);
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4000000, Explosion.BlockInteraction.NONE);
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 1e+28), 0));
		}
		if (!((entity.getDisplayName().getString()).equals("clozy_3") || (entity.getDisplayName().getString()).equals("MyNameIsName1213") || (entity.getDisplayName().getString()).equals("Dev")
				|| (entity.getDisplayName().getString()).equals("itskatsu"))) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("error.cubedistance.70>max").bypassArmor(), 5000);
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4000000, Explosion.BlockInteraction.NONE);
			entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 1e+28), 0));
		}
	}
}
