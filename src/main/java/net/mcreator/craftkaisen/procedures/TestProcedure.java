package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TestProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("success"), false);
		{
			String _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique;
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.VesselTechnique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer = entity.getDisplayName().getString();
		CraftkaisenModVariables.MapVariables.get(world).syncData(world);
	}
}
