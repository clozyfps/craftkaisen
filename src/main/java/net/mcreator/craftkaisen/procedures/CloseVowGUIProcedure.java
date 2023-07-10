package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CloseVowGUIProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getDisplayName().getString()).equals()) {
				entityiterator.getPersistentData().putBoolean("vowPending", false);
			}
		}
	}
}
