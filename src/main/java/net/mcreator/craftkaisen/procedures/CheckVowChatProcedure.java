package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import javax.annotation.Nullable;

import java.util.ArrayList;

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
								ItemStack _setstack = ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).OfferItem);
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entityiterator instanceof Player _player) {
								ItemStack _stktoremove = ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).OfferItem);
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
						}
					}
				}
			} else if ((text).equals("Deny") || (text).equals("deny")) {
				{
					ItemStack _setval = ItemStack.EMPTY;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VowItem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "\"\"";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VowPlayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
