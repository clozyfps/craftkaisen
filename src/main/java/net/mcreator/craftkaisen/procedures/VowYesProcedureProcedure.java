package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.ArrayList;

public class VowYesProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getDisplayName().getString()).equals((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).VowSender)) {
				entity.getPersistentData().putBoolean((entityiterator.getDisplayName().getString() + "VowApproved"), true);
				entityiterator.getPersistentData().putBoolean((entity.getDisplayName().getString() + "VowApproved"), true);
			}
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
