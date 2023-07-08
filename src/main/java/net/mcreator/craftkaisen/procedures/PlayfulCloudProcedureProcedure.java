package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftkaisenModItems;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class PlayfulCloudProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(CraftkaisenModItems.PLAYFUL_CLOUD.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		entity.getPersistentData().putBoolean("playfulrestriction", true);
		CraftkaisenMod.queueServerWork(1100, () -> {
			entity.getPersistentData().putBoolean("playfulrestriction", false);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CraftkaisenModItems.PLAYFUL_CLOUD.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		});
	}
}
