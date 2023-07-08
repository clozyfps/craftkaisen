package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SacredLungeProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level && _level.getServer() != null) {
			Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craftkaisen:sacred_lunge"));
			if (_fopt.isPresent())
				_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
		}
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(DamageSource.GENERIC, (float) 8.4);
					entityiterator.getPersistentData().putBoolean("aoe", true);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 1, false, false));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.1, 2, 0.1, 0);
					world.levelEvent(2001, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Block.getId(Blocks.RED_TERRACOTTA.defaultBlockState()));
				}
			}
		}
	}
}
