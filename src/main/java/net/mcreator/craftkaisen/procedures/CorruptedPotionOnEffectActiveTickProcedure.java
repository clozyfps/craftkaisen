package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CorruptedPotionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("corrupttimer", (entity.getPersistentData().getDouble("corrupttimer") + 1));
		if (entity.getPersistentData().getDouble("corrupttimer") >= 20) {
			world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.GRAVEL.defaultBlockState()));
			entity.getPersistentData().putDouble("corrupttimer", 0);
			entity.hurt(DamageSource.GENERIC, 7);
		}
	}
}
