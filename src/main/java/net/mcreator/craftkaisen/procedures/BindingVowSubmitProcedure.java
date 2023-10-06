package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BindingVowSubmitProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.containsKey("checkbox:KillVow") ? ((Checkbox) guistate.get("checkbox:KillVow")).selected() : false) {
			entity.getPersistentData().putDouble("progressVow", 1);
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((guistate.containsKey("text:PlayerNameKill") ? ((EditBox) guistate.get("text:PlayerNameKill")).getValue() : "").equals(entityiterator.getDisplayName().getString())) {
					entity.getPersistentData().putDouble("progressVow", (entity.getPersistentData().getDouble("progressVow") + 1));
					entity.getPersistentData().putBoolean("killvow", true);
					entity.getPersistentData().putBoolean("itemvow", false);
				}
			}
		}
		if (guistate.containsKey("checkbox:ItemVow") ? ((Checkbox) guistate.get("checkbox:ItemVow")).selected() : false) {
			entity.getPersistentData().putDouble("progressVow", 1);
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) >= 1 && (guistate.containsKey("text:PlayerNameKill") ? ((EditBox) guistate.get("text:PlayerNameKill")).getValue() : "").equals(entityiterator.getDisplayName().getString())) {
					entity.getPersistentData().putDouble("progressVow", (entity.getPersistentData().getDouble("progressVow") + 1));
					entity.getPersistentData().putBoolean("killvow", false);
					entity.getPersistentData().putBoolean("itemvow", true);
				}
			}
		}
		if (guistate.containsKey("checkbox:OfferItemVow") ? ((Checkbox) guistate.get("checkbox:OfferItemVow")).selected() : false) {
			entity.getPersistentData().putDouble("boxesOfferChecked", (entity.getPersistentData().getDouble("boxesOfferChecked") + 1));
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(1) >= 1) {
					entity.getPersistentData().putDouble("progressVow", (entity.getPersistentData().getDouble("progressVow") + 1));
					entity.getPersistentData().putBoolean("offerItem", true);
				}
			}
		}
		if (!(guistate.containsKey("text:Player") ? ((EditBox) guistate.get("text:Player")).getValue() : "").isEmpty()) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((guistate.containsKey("text:Player") ? ((EditBox) guistate.get("text:Player")).getValue() : "").equals(entityiterator.getDisplayName().getString())) {
					entity.getPersistentData().putDouble("progressVow", (entity.getPersistentData().getDouble("progressVow") + 1));
				}
			}
		}
		if (entity.getPersistentData().getDouble("progressVow") == 4 && entity.getPersistentData().getDouble("boxesChecked") == 1 && entity.getPersistentData().getDouble("boxesOfferChecked") == 1) {
			entity.getPersistentData().putDouble("progressVow", 0);
			entity.getPersistentData().putDouble("boxesChecked", 0);
			entity.getPersistentData().putDouble("boxesOfferChecked", 0);
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((guistate.containsKey("text:Player") ? ((EditBox) guistate.get("text:Player")).getValue() : "").equals(entityiterator.getDisplayName().getString())
						&& (!entityiterator.getPersistentData().getBoolean("vowPending") || !entityiterator.getPersistentData().getBoolean("vowPendingSender"))) {
					if (entity.getPersistentData().getBoolean("killvow")) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7cVow proposed by " + entity.getDisplayName().getString() + ", they request that you do not kill or harm "
									+ (guistate.containsKey("text:PlayerNameKill") ? ((EditBox) guistate.get("text:PlayerNameKill")).getValue() : "") + " and in return you will get a "
									+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getDisplayName().getString())
									+ ". You can accept by saying \"Accept\" or deny by saying \"Deny\".")), false);
					} else if (entity.getPersistentData().getBoolean("itemvow")) {
						if (entity.getPersistentData().getBoolean("offerItem")) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("\u00A7cVow proposed by " + entity.getDisplayName().getString() + ", they request that you do not pick up any type of "
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getDisplayName()
												.getString())
										+ "'s and in return you will get a "
										+ ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getDisplayName()
												.getString())
										+ ". You can accept by saying \"Accept\" or deny by saying \"Deny\".")), false);
						}
					}
					if (entity.getPersistentData().getBoolean("itemvow")) {
					}
					if (entity instanceof Player _player)
						_player.closeContainer();
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7cVow proposed to " + entityiterator.getDisplayName().getString() + ".")), true);
					entityiterator.getPersistentData().putBoolean("vowPending", true);
					entityiterator.getPersistentData().putBoolean("offerItemSent", true);
					entity.getPersistentData().putBoolean("vowPendingSender", true);
					entityiterator.getPersistentData().putString("vowSender", (entity.getDisplayName().getString()));
				} else if (entityiterator.getPersistentData().getBoolean("vowPending")) {
					if (entity instanceof Player _player)
						_player.closeContainer();
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Failed"), false);
				}
			}
		} else if (entity.getPersistentData().getDouble("boxesChecked") > 1) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Failed"), false);
		}
	}
}
