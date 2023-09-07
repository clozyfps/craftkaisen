package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CombustProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(DamageSource.GENERIC, 11);
					entityiterator.setSecondsOnFire(10);
					entityiterator.getPersistentData().putBoolean("aoe", true);
				}
			}
		}
		ReversalRed1Procedure.execute(world, x, y, z, entity);
		CraftkaisenMod.queueServerWork(3, () -> {
			ReversalRed2Procedure.execute(world, x, y, z, entity);
			CraftkaisenMod.queueServerWork(3, () -> {
				ReversalRed3Procedure.execute(world, x, y, z, entity);
				CraftkaisenMod.queueServerWork(3, () -> {
					ReversalRed4Procedure.execute(world, x, y, z, entity);
				});
			});
		});
	}
}
