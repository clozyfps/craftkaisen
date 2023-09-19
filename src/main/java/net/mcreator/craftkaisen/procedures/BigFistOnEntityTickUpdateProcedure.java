package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BigFistOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!entityiterator.getPersistentData().getBoolean("fistenlarge")) {
					if (!(entityiterator instanceof BigFistEntity)) {
						if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 0.1, 2, 0.1, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 3, 0.1, 2, 0.1, 0.8);
							entityiterator.hurt(DamageSource.GENERIC, 10);
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
													_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + entityiterator.getStringUUID()));
								}
							}
							entityiterator.setDeltaMovement(new Vec3((2 * entity.getLookAngle().x), (1.2 * entity.getLookAngle().y), (2 * entity.getLookAngle().z)));
							if (entity.getPersistentData().getDouble("fistTimer") == 0) {
								if (!entity.getPersistentData().getBoolean("fistTag")) {
									entity.getPersistentData().putDouble("fistTimer", 60);
								} else {
									if (!entity.level.isClientSide())
										entity.discard();
								}
							} else {
								entity.getPersistentData().putDouble("fistTimer", (entity.getPersistentData().getDouble("fistTimer") - 1));
								entity.getPersistentData().putBoolean("fistTag", true);
							}
						}
					}
				}
			}
		}
	}
}
