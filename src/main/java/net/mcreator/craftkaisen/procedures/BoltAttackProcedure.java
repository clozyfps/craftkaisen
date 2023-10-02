package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BoltAttackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("moveused1")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PROCEDURE HERE DUMBASS"), false);
		} else if (entity.getPersistentData().getBoolean("moveused2")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PROCEDURE HERE DUMBASS"), false);
		} else if (entity.getPersistentData().getBoolean("moveused3")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PROCEDURE HERE DUMBASS"), false);
		} else if (entity.getPersistentData().getBoolean("moveused4")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PROCEDURE HERE DUMBASS"), false);
		} else if (entity.getPersistentData().getBoolean("moveused5")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PROCEDURE HERE DUMBASS"), false);
		} else if (entity.getPersistentData().getBoolean("moveused6")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("PROCEDURE HERE DUMBASS"), false);
		}
	}
}
