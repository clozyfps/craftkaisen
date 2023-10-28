package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkAtomWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 25, 6, 3, 6, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, x, y, z, 40, 5, 3, 5, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:electric")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0.22 0.11 0.31 3 ^0 ^0 ^0 3 3 3 0 40");
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(11 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(!(immediatesourceentity == entityiterator))) {
						entityiterator.hurt(DamageSource.GENERIC, 8);
						entity.setDeltaMovement(new Vec3((1.5 * entity.getLookAngle().x), (0.2 * entity.getLookAngle().y), (1.5 * entity.getLookAngle().z)));
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		}
		immediatesourceentity.setNoGravity(true);
		CraftkaisenMod.queueServerWork(30, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
		int horizontalRadiusSphere = (int) 3 - 1;
		int verticalRadiusSphere = (int) 3 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
					}
				}
			}
		}
	}
}
