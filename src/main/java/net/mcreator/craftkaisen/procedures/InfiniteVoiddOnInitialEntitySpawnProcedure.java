package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InfiniteVoiddOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftkaisenMod.queueServerWork(300, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "infvoidreplacement"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(55 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof PathfinderMob)) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					CraftkaisenMod.queueServerWork(50, () -> {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7l\u00A70 This is the inner world of Limitless. Perception, communication... "), true);
						CraftkaisenMod.queueServerWork(20, () -> {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7l\u00A70 Every action involved in living is forcibly carried out an infinite number of times. "), true);
							CraftkaisenMod.queueServerWork(20, () -> {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("\u00A7l\u00A70 It's ironic, isn't it?"), true);
								CraftkaisenMod.queueServerWork(20, () -> {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("\u00A7l\u00A70 When granted everything, you can't do anything... but just die peacefully."), true);
								});
							});
						});
					});
					if (entityiterator.getPersistentData().getBoolean("infinitevoid") == false) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 250, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 250, false, false));
					}
				}
			}
		}
	}
}
