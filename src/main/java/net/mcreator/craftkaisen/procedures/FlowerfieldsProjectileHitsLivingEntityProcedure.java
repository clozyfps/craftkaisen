package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FlowerfieldsProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double loop = 0;
		double particleAmount = 0;
		loop = 0;
		particleAmount = 15;
		xRadius = 4;
		zRadius = 4;
		while (loop < particleAmount) {
			world.addParticle(ParticleTypes.FALLING_SPORE_BLOSSOM, (x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius), 0, 0.05, 0);
			loop = loop + 1;
		}
		CraftkaisenMod.queueServerWork(30, () -> {
			int horizontalRadiusSphere = (int) 12 - 1;
			int verticalRadiusSphere = (int) 12 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if ((world.getBlockState(new BlockPos(x, y, z))) == Blocks.AIR.defaultBlockState()) {
								world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi), Blocks.DARK_OAK_WOOD.defaultBlockState(), 3);
							}
						}
					}
				}
			}
		});
	}
}
