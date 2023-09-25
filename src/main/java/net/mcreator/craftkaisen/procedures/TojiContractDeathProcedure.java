package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TojiContractDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getBoolean("TojiTarget")) {
			entity.getPersistentData().putBoolean("TojiTarget", false);
			if (sourceentity instanceof TojiFushiguroEntity) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getPersistentData().getBoolean("TojiBuy")) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Toji Has Killed Your Target."), false);
					}
				}
			} else {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getPersistentData().getBoolean("TojiBuy")) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Your Target has died but not from Toji"), false);
					}
				}
			}
		}
	}
}
