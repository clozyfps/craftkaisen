package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.entity.EmberInsectEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class EmberInsectOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator && entityiterator instanceof EmberInsectEntity)) {
					if (!(entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.EMBER_CONTROL.get()) : false)) {
						entityiterator.getPersistentData().putBoolean("aoe", true);
						if (!entity.level.isClientSide())
							entity.discard();
						entityiterator.hurt(DamageSource.GENERIC, 7);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.LAVA, x, y, z, 3, 3, 3, 3, 0);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.FLAME, x, y, z, 15, 3, 3, 3, 0);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 3, 3, 3, 0);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 6, 3, 3, 3, 0);
					}
				}
			}
		}
	}
}
