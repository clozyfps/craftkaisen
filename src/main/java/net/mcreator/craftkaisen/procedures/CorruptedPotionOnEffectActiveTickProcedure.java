package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

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
