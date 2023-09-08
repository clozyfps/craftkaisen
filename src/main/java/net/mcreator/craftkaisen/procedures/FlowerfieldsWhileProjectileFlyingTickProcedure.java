package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FlowerfieldsWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 4);
		{
			double _setval = Math.min((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).FireSpread + 0.1, 5);
			entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FireSpread = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		immediatesourceentity.setNoGravity(true);
		CraftkaisenMod.queueServerWork(70, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
			{
				double _setval = 0;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FireSpread = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
		{
			final Vec3 _center = new Vec3((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class,
					new AABB(_center, _center).inflate(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).FireSpread + 3.5) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && !(entityiterator == immediatesourceentity)) {
					entityiterator.hurt(DamageSource.GENERIC, 3);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 2, false, false));
				}
			}
		}
		int horizontalRadiusSphere = (int) ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).FireSpread + 3.5) - 1;
		int verticalRadiusSphere = (int) ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).FireSpread + 3.5) - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (!((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
							if ((world.getBlockState(new BlockPos(x + xi, y + i + 1, z + zi))).getBlock() == Blocks.AIR) {
								if (random == 1) {
									world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi), Blocks.WHITE_TULIP.defaultBlockState(), 3);
								} else if (random == 2) {
									world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi), Blocks.PINK_TULIP.defaultBlockState(), 3);
								} else if (random == 3) {
									world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi), Blocks.RED_TULIP.defaultBlockState(), 3);
								} else if (random == 4) {
									world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi), Blocks.CORNFLOWER.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
