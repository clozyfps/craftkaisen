package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
