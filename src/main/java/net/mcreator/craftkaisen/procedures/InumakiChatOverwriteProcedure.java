package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InumakiChatOverwriteProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (world.getLevelData().getGameRules().getBoolean(CraftkaisenModGameRules.CK_OVERWRITE_INUMAKI_CHAT)) {
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Voice")) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				random = Mth.nextInt(RandomSource.create(), 1, 8);
				if (random == 1) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Salmon")), false);
					}
				} else if (random == 2) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Bonito Flakes")), false);
					}
				} else if (random == 3) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Kelp")), false);
					}
				} else if (random == 4) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Mustard Leaf")), false);
					}
				} else if (random == 5) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Salmon Roe")), false);
					}
				} else if (random == 6) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Tuna")), false);
					}
				} else if (random == 7) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Tuna Tuna")), false);
					}
				} else if (random == 8) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> " + "Tuna Mayo")), false);
					}
				}
			}
		}
	}
}
