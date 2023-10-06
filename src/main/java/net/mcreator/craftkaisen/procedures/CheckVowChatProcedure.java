package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckVowChatProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, Entity entity, String text) {
		execute(null, world, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if (entity.getPersistentData().getBoolean("vowPending")) {
			if ((text).equals("Accept") || (text).equals("accept")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Vow accepted."), false);
				entity.getPersistentData().putBoolean("vowPending", false);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if ((entity.getPersistentData().getString("vowSender")).equals(entityiterator.getDisplayName().getString())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Vow accepted."), false);
						if (entity.getPersistentData().getBoolean("offerItemSent")) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack();
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entityiterator instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack();
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
			} else if ((text).equals("Deny") || (text).equals("deny")) {
				entity.getPersistentData().putBoolean("vowPending", false);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Vow denied."), false);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if ((entity.getPersistentData().getString("vowSender")).equals(entityiterator.getDisplayName().getString())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Vow denied."), false);
					}
				}
			} else {
				if (entity.getPersistentData().getDouble("vowStack") == 0) {
					entity.getPersistentData().putDouble("vowStack", 1);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cUnaccepted command, type \"Accept\" or \"Deny\"."), false);
				} else {
					entity.getPersistentData().putDouble("vowStack", 0);
					entity.getPersistentData().putBoolean("vowPending", false);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7cUnaccepted command, vow failed."), false);
				}
			}
		}
	}
}
