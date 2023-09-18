package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DisasterFlame3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ballfire", true);
		CraftkaisenMod.queueServerWork(50, () -> {
			entity.getPersistentData().putBoolean("ballfire", false);
		});
		int horizontalRadiusSphere = (int) 7 - 1;
		int verticalRadiusSphere = (int) 7 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FLAME, x + xi, y + i, z + zi, 2, 0.1, 2, 0.1, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!entityiterator.getPersistentData().getBoolean("ballfire")) {
									entityiterator.setSecondsOnFire(10);
									entityiterator.hurt(DamageSource.GENERIC, 2);
								}
							}
						}
					}
				}
			}
		}
		CraftkaisenMod.queueServerWork(2, () -> {
			DisasterFlame4Procedure.execute(world, x, y, z, entity);
			CraftkaisenMod.queueServerWork(2, () -> {
				DisasterFlame5Procedure.execute(world, x, y, z, entity);
				CraftkaisenMod.queueServerWork(2, () -> {
					DisasterFlame6Procedure.execute(world, x, y, z, entity);
				});
			});
		});
	}
}
