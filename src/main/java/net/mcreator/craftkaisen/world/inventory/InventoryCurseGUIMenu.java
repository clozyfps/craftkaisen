
package net.mcreator.craftkaisen.world.inventory;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class InventoryCurseGUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public InventoryCurseGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(CraftkaisenModMenus.INVENTORY_CURSE_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(12);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 7, 26) {
			private final int slot = 0;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 34, 26) {
			private final int slot = 1;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 61, 27) {
			private final int slot = 2;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 97, 26) {
			private final int slot = 3;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 124, 26) {
			private final int slot = 4;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 151, 26) {
			private final int slot = 5;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 7, 53) {
			private final int slot = 6;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 34, 53) {
			private final int slot = 7;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 61, 53) {
			private final int slot = 8;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 97, 53) {
			private final int slot = 9;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 124, 53) {
			private final int slot = 10;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 151, 53) {
			private final int slot = 11;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
		InventoryCurseGUIThisGUIIsOpenedProcedure.execute(world, entity);
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 12) {
				if (!this.moveItemStackTo(itemstack1, 12, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 12, false)) {
				if (index < 12 + 27) {
					if (!this.moveItemStackTo(itemstack1, 12 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 12, 12 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override /* failed to load code for net.minecraft.world.inventory.AbstractContainerMenu */
	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		InventoryCurseGUIThisGUIIsClosedProcedure.execute(entity);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 0)
						continue;
					if (j == 1)
						continue;
					if (j == 2)
						continue;
					if (j == 3)
						continue;
					if (j == 4)
						continue;
					if (j == 5)
						continue;
					if (j == 6)
						continue;
					if (j == 7)
						continue;
					if (j == 8)
						continue;
					if (j == 9)
						continue;
					if (j == 10)
						continue;
					if (j == 11)
						continue;
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 0)
						continue;
					if (i == 1)
						continue;
					if (i == 2)
						continue;
					if (i == 3)
						continue;
					if (i == 4)
						continue;
					if (i == 5)
						continue;
					if (i == 6)
						continue;
					if (i == 7)
						continue;
					if (i == 8)
						continue;
					if (i == 9)
						continue;
					if (i == 10)
						continue;
					if (i == 11)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}