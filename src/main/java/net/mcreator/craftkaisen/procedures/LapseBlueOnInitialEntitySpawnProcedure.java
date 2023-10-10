package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class LapseBlueOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftkaisenMod.queueServerWork(25, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
		world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.LAPSE_BLUE_PARTICLE.get()), x, y, z, 0, 1, 0);
		int horizontalRadiusSphere = (int) 6 - 1;
		int verticalRadiusSphere = (int) 6 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (!((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))));
						}
					}
				}
			}
		}
	}
}
