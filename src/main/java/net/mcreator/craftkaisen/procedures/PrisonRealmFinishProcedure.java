package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PrisonRealmFinishProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((guistate.containsKey("text:TargetPlayer") ? ((EditBox) guistate.get("text:TargetPlayer")).getValue() : "").equals(entityiterator.getDisplayName().getString())) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Player Connected."), true);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(entity.getPersistentData().getDouble("prX"), entity.getPersistentData().getDouble("prY"), entity.getPersistentData().getDouble("prZ"));
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("targetedPlayer", (entityiterator.getDisplayName().getString()));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Player not found!"), true);
			}
		}
	}
}
