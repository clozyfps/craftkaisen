package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LimitlessTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		execute(null, world, x, y, z, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		boolean found = false;
		double chakraSteal = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.getPersistentData().getBoolean("purple") == true) {
			entity.getPersistentData().putDouble("purpleDistance", (entity.getPersistentData().getDouble("purpleDistance") + 1));
			HollowPurpleWhileProjectileFlyingTickProcedure.execute(world, (x + entity.getLookAngle().x * (entity.getPersistentData().getDouble("purpleDistance") + 3)),
					(y + entity.getLookAngle().y * entity.getPersistentData().getDouble("purpleDistance")), (z + entity.getLookAngle().z * (entity.getPersistentData().getDouble("purpleDistance") + 3)), entity, immediatesourceentity);
			{
				final Vec3 _center = new Vec3((x + entity.getLookAngle().x * entity.getPersistentData().getDouble("purpleDistance")), (y + entity.getLookAngle().y * entity.getPersistentData().getDouble("purpleDistance")),
						(z + entity.getLookAngle().z * entity.getPersistentData().getDouble("purpleDistance")));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("purpleCharge") / 20) / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.setDeltaMovement(new Vec3((((x + entity.getLookAngle().x * entity.getPersistentData().getDouble("purpleDistance")) - entityiterator.getX()) / 3),
								(((y + entity.getLookAngle().y * entity.getPersistentData().getDouble("purpleDistance")) - entityiterator.getY()) / 3),
								(((z + entity.getLookAngle().z * entity.getPersistentData().getDouble("purpleDistance")) - entityiterator.getZ()) / 3)));
					}
				}
			}
			if (entity.getPersistentData().getDouble("purpleDistance") >= entity.getPersistentData().getDouble("purpleCharge") * 2) {
				entity.getPersistentData().putBoolean("purple", false);
				entity.getPersistentData().putDouble("purpleCharge", 0);
			}
		}
		if (entity.getPersistentData().getBoolean("infinity") == true) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy >= 1) {
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy - 1;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy < 1) {
				entity.getPersistentData().putBoolean("infinity", true);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator.getPersistentData().getString("owner")).equals(entity.getDisplayName().getString())) {
						if (!(entityiterator instanceof LivingEntity)) {
							entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator.getPersistentData().getString("owner")).equals(entity.getDisplayName().getString())) {
						if (entityiterator instanceof LivingEntity) {
							entityiterator.setDeltaMovement(new Vec3(((entityiterator.getX() - entity.getX()) / 20), ((entityiterator.getY() - entity.getY()) / 20), ((entityiterator.getZ() - entity.getZ()) / 20)));
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator.getPersistentData().getString("owner")).equals(entity.getDisplayName().getString())) {
						entityiterator.setDeltaMovement(new Vec3(((entityiterator.getX() - entity.getX()) / 12), ((entityiterator.getY() - entity.getY()) / 12), ((entityiterator.getZ() - entity.getZ()) / 12)));
					}
				}
			}
		}
	}
}
