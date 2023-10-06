package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AddXYZCoordsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getPersistentData().getBoolean("prOwner")) {
					entityiterator.getPersistentData().putDouble("prX", x);
					entityiterator.getPersistentData().putDouble("prY", y);
					entityiterator.getPersistentData().putDouble("prZ", z);
				}
			}
		}
	}
}
