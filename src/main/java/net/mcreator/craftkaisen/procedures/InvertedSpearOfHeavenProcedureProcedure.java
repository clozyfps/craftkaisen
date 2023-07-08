package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InvertedSpearOfHeavenProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(CraftkaisenModItems.INVERTED_SPEAROF_HEAVEN.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		entity.getPersistentData().putBoolean("invertedrestriction", true);
		CraftkaisenMod.queueServerWork(1100, () -> {
			entity.getPersistentData().putBoolean("invertedrestriction", false);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CraftkaisenModItems.INVERTED_SPEAROF_HEAVEN.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		});
	}
}
