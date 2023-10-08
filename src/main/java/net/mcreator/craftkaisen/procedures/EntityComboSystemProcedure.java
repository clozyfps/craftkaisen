package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityComboSystemProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity.getX(), entity.getY(), entity.getZ(), entity, event.getSource().getDirectEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		execute(null, world, x, y, z, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof SatoruGojoEntity) {
			if (Math.random() < 0.07) {
				immediatesourceentity.setDeltaMovement(new Vec3(0, (y + 2), 0));
				CraftkaisenMod.queueServerWork(5, () -> {
					{
						Entity _ent = immediatesourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					CraftkaisenMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(immediatesourceentity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 10);
								}
							}
						}
					});
				});
			}
			if (Math.random() < 0.07) {
				entity.setDeltaMovement(new Vec3((2.5 * immediatesourceentity.getLookAngle().x), (2 * immediatesourceentity.getLookAngle().y), (2.5 * immediatesourceentity.getLookAngle().z)));
				CraftkaisenMod.queueServerWork(10, () -> {
					{
						Entity _ent = immediatesourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					CraftkaisenMod.queueServerWork(1, () -> {
						entity.setDeltaMovement(new Vec3((2.5 * immediatesourceentity.getLookAngle().x), ((-2) * immediatesourceentity.getLookAngle().y), (2.5 * immediatesourceentity.getLookAngle().z)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(immediatesourceentity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 10);
								}
							}
						}
					});
				});
			}
		} else if (immediatesourceentity instanceof MahitoEntity) {
			if (Math.random() < 0.08) {
				entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 2.5), 0));
				CraftkaisenMod.queueServerWork(10, () -> {
					{
						Entity _ent = immediatesourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 1, false, false));
					entity.getPersistentData().putBoolean("slam", true);
					CraftkaisenMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(immediatesourceentity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 10);
								}
							}
						}
						entity.getPersistentData().putBoolean("slam", true);
						CraftkaisenMod.queueServerWork(5, () -> {
							entity.setDeltaMovement(new Vec3((immediatesourceentity.getLookAngle().x * 2), (entity.getDeltaMovement().y() - 2.5), 0));
							entity.getPersistentData().putBoolean("slam", true);
							CraftkaisenMod.queueServerWork(5, () -> {
								{
									Entity _ent = immediatesourceentity;
									_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(immediatesourceentity == entityiterator)) {
											entityiterator.hurt(DamageSource.GENERIC, 10);
										}
									}
								}
								entity.getPersistentData().putBoolean("slam", true);
							});
						});
					});
				});
			}
		}
	}
}
