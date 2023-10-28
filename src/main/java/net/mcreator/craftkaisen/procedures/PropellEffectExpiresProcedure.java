package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PropellEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() - 5), 0));
		CraftkaisenMod.queueServerWork(10, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 50, 5, 0.5, 5, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.getPersistentData().putBoolean("aoefirst", true);
			CraftkaisenMod.queueServerWork(20, () -> {
				entity.getPersistentData().putBoolean("aoefirst", false);
			});
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, 15);
						if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		});
	}
}
