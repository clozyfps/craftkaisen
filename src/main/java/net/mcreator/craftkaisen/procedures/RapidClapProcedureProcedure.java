package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RapidClapProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 2, 2, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 60, false, false));
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		CraftkaisenMod.queueServerWork(2, () -> {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 2), y, (z + 0));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 2), y, (z + 0), _ent.getYRot(), _ent.getXRot());
			}
			entity.getPersistentData().putBoolean("aoefirst", true);
			CraftkaisenMod.queueServerWork(20, () -> {
				entity.getPersistentData().putBoolean("aoefirst", false);
			});
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, 3);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 2, 2, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			CraftkaisenMod.queueServerWork(2, () -> {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + -4), y, (z + 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + -4), y, (z + 0), _ent.getYRot(), _ent.getXRot());
				}
				entity.getPersistentData().putBoolean("aoefirst", true);
				CraftkaisenMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("aoefirst", false);
				});
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							entityiterator.hurt(DamageSource.GENERIC, 3);
							entityiterator.getPersistentData().putBoolean("aoe", true);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 1, 3, 1, 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				CraftkaisenMod.queueServerWork(3, () -> {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + 4), y, (z + 0));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + 4), y, (z + 0), _ent.getYRot(), _ent.getXRot());
					}
					entity.getPersistentData().putBoolean("aoefirst", true);
					CraftkaisenMod.queueServerWork(20, () -> {
						entity.getPersistentData().putBoolean("aoefirst", false);
					});
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								entityiterator.hurt(DamageSource.GENERIC, 3);
								entityiterator.getPersistentData().putBoolean("aoe", true);
							}
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 1, 3, 1, 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					CraftkaisenMod.queueServerWork(2, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + -6), y, (z + -2));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + -6), y, (z + -2), _ent.getYRot(), _ent.getXRot());
						}
						entity.getPersistentData().putBoolean("aoefirst", true);
						CraftkaisenMod.queueServerWork(20, () -> {
							entity.getPersistentData().putBoolean("aoefirst", false);
						});
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 3);
									entityiterator.getPersistentData().putBoolean("aoe", true);
								}
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 1, 2, 1, 0);
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					});
				});
			});
		});
	}
}
