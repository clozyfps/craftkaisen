package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CreatePressedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		ItemStack sword = ItemStack.EMPTY;
		double rGrade = 0;
		entity.getPersistentData().putDouble("costSword", 0);
		entity.getPersistentData().putDouble("progress", 0);
		entity.getPersistentData().putString("errMsg", "");
		entity.getPersistentData().putBoolean("showErr", false);
		if ((guistate.containsKey("checkbox:GreatswordBox") ? ((Checkbox) guistate.get("checkbox:GreatswordBox")).selected() : false)
				&& !(guistate.containsKey("checkbox:KatanaBox") ? ((Checkbox) guistate.get("checkbox:KatanaBox")).selected() : false)
				&& !(guistate.containsKey("checkbox:DaggerBox") ? ((Checkbox) guistate.get("checkbox:DaggerBox")).selected() : false)) {
			sword = new ItemStack(Items.WOODEN_SWORD);
			entity.getPersistentData().putDouble("swordType", 1);
			entity.getPersistentData().putDouble("progress", 1);
		} else if (!(guistate.containsKey("checkbox:GreatswordBox") ? ((Checkbox) guistate.get("checkbox:GreatswordBox")).selected() : false)
				&& (guistate.containsKey("checkbox:KatanaBox") ? ((Checkbox) guistate.get("checkbox:KatanaBox")).selected() : false)
				&& !(guistate.containsKey("checkbox:DaggerBox") ? ((Checkbox) guistate.get("checkbox:DaggerBox")).selected() : false)) {
			sword = new ItemStack(Items.IRON_SWORD);
			entity.getPersistentData().putDouble("swordType", 2);
			entity.getPersistentData().putDouble("progress", 1);
		} else if (!(guistate.containsKey("checkbox:GreatswordBox") ? ((Checkbox) guistate.get("checkbox:GreatswordBox")).selected() : false)
				&& !(guistate.containsKey("checkbox:KatanaBox") ? ((Checkbox) guistate.get("checkbox:KatanaBox")).selected() : false)
				&& (guistate.containsKey("checkbox:DaggerBox") ? ((Checkbox) guistate.get("checkbox:DaggerBox")).selected() : false)) {
			sword = new ItemStack(Items.DIAMOND_SWORD);
			entity.getPersistentData().putDouble("swordType", 3);
			entity.getPersistentData().putDouble("progress", 1);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DIAMOND_BLOCK.asItem()) {
			if (entity.getPersistentData().getDouble("progress") == 1) {
				entity.getPersistentData().putDouble("progress", 2);
			}
		}
		if (!(guistate.containsKey("text:SwordName") ? ((EditBox) guistate.get("text:SwordName")).getValue() : "").isEmpty()) {
			if (entity.getPersistentData().getDouble("progress") == 2) {
				entity.getPersistentData().putDouble("progress", 3);
			}
			rGrade = Mth.nextInt(RandomSource.create(), 1, 100);
			if (rGrade < 30) {
				entity.getPersistentData().putString("gradeSword", "GRADE 4");
			} else if (rGrade >= 30 && rGrade < 60) {
				entity.getPersistentData().putString("gradeSword", "GRADE 3");
			} else if (rGrade >= 60 && rGrade < 80) {
				entity.getPersistentData().putString("gradeSword", "SEMI-GRADE 2");
			} else if (rGrade >= 80 && rGrade < 95) {
				entity.getPersistentData().putString("gradeSword", "GRADE 2");
			} else if (rGrade >= 95 && rGrade < 98.5) {
				entity.getPersistentData().putString("gradeSword", "SEMI-GRADE 1");
			} else if (rGrade >= 98.5 && rGrade < 100) {
				entity.getPersistentData().putString("gradeSword", "GRADE 1");
			} else if (rGrade == 100) {
				entity.getPersistentData().putString("gradeSword", "\u00A74SPECIAL GRADE");
			}
			(sword).setHoverName(Component.literal(((guistate.containsKey("text:SwordName") ? ((EditBox) guistate.get("text:SwordName")).getValue() : "") + " [" + entity.getPersistentData().getString("gradeSword") + "]")));
		}
		if (entity.getPersistentData().getDouble("progress") == 3) {
			sword.getOrCreateTag().putBoolean("sealable", true);
			if (entity instanceof Player _player) {
				ItemStack _setstack = sword;
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) - 1));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND);
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(1) - 1));
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(2) - 1));
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("progress") == 2) {
			entity.getPersistentData().putString("errMsg", "No name!");
			entity.getPersistentData().putBoolean("showErr", true);
		} else if (entity.getPersistentData().getDouble("progress") == 1) {
			entity.getPersistentData().putString("errMsg", "Insufficient materials!");
			entity.getPersistentData().putBoolean("showErr", true);
		} else if (entity.getPersistentData().getDouble("progress") == 0) {
			if (!(guistate.containsKey("checkbox:GreatswordBox") ? ((Checkbox) guistate.get("checkbox:GreatswordBox")).selected() : false)
					&& !(guistate.containsKey("checkbox:KatanaBox") ? ((Checkbox) guistate.get("checkbox:KatanaBox")).selected() : false)
					&& !(guistate.containsKey("checkbox:DaggerBox") ? ((Checkbox) guistate.get("checkbox:DaggerBox")).selected() : false)) {
				entity.getPersistentData().putString("errMsg", "No swords checked!");
				entity.getPersistentData().putBoolean("showErr", true);
			} else {
				entity.getPersistentData().putString("errMsg", "Too many swords checked!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
	}
}
