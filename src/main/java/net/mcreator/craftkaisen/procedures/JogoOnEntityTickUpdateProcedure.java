package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JogoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.009) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new DisasterFlameEntity(CraftkaisenModEntities.DISASTER_FLAME.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 9, 3, (byte) 10);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			if (Math.random() < 0.005) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.EMBER_FLOOR.get()) : false)) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.EMBER_FLOOR.get(), 60, 1, false, false));
				}
			}
			if (Math.random() < 0.008) {
				entity.getPersistentData().putBoolean("aoefirst", true);
				CraftkaisenMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("aoefirst", false);
				});
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
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
	}
}
