package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HollowPurpleWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.PURPLE_MIST.get()), x, y, z, 15, (entity.getPersistentData().getDouble("purpleCharge") / 25), (entity.getPersistentData().getDouble("purpleCharge") / 50),
					(entity.getPersistentData().getDouble("purpleCharge") / 25), 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.PURPLE_LIGHTNING.get()), x, y, z, 5, (entity.getPersistentData().getDouble("purpleCharge") / 25), (entity.getPersistentData().getDouble("purpleCharge") / 50),
					(entity.getPersistentData().getDouble("purpleCharge") / 25), 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.PURPLE_PULSE.get()), x, y, z, 1, 0.1, 0.1, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 9, (entity.getPersistentData().getDouble("purpleCharge") / 25), (entity.getPersistentData().getDouble("purpleCharge") / 50), (entity.getPersistentData().getDouble("purpleCharge") / 25),
					0);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("purpleCharge") / 20) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
				}
			}
		}
		int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("purpleCharge") / 25) - 1;
		int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("purpleCharge") / 25) - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
						world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
