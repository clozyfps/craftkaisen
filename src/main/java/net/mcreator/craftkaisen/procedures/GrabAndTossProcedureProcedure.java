package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GrabAndTossProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					entityiterator.hurt(DamageSource.GENERIC, 7);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 250, false, false));
					CraftkaisenMod.queueServerWork(20, () -> {
						entityiterator.setDeltaMovement(new Vec3((1.7 * entity.getLookAngle().x), (0.2 * entity.getLookAngle().y), (1.7 * entity.getLookAngle().z)));
					});
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 0.1, 2, 0.1, 0);
				}
			}
		}
	}
}
