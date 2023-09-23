package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class TestProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("success"), false);
		CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer = entity.getDisplayName().getString();
		CraftkaisenModVariables.MapVariables.get(world).syncData(world);
	}
}
