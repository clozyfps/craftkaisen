package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ExpansionProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Ratio")) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			entity.getPersistentData().putDouble("ratio", (Mth.nextInt(RandomSource.create(), 0, 100)));
			if (entity.getPersistentData().getDouble("ratio") <= entity.getPersistentData().getDouble("ratiochance")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(14 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CRIT, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.1, 2, 0.1, 0.1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLOOD.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 5, 0.5, 2, 0.5, 0.2);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RATIO.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.1, 2, 0.1, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 0.1, 2, 0.1, 0);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 6 2.5 6 0 20");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0.42 0.06 0.44 2 ^0 ^0 ^0 6 2.5 6 0 20");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")),
											SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1,
											false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:splatter")), SoundSource.NEUTRAL, 1,
											1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:splatter")), SoundSource.NEUTRAL, 1, 1,
											false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL,
											1, 1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1,
											false);
								}
							}
							entityiterator.hurt(((new Object() {
								public DamageSource get(final String _msgID, Entity _directSource) {
									return new EntityDamageSource(_msgID, _directSource) {
										@Override
										public Component getLocalizedDeathMessage(LivingEntity _livingEntity) {
											Component _attackerName = null;
											Component _entityName = _livingEntity.getDisplayName();
											Component _itemName = null;
											Entity _attacker = this.getEntity();
											ItemStack _itemStack = ItemStack.EMPTY;
											if (_attacker != null) {
												_attackerName = _attacker.getDisplayName();
											}
											if (_attacker instanceof LivingEntity _livingAttacker) {
												_itemStack = _livingAttacker.getMainHandItem();
											}
											if (!_itemStack.isEmpty() && _itemStack.hasCustomHoverName()) {
												_itemName = _itemStack.getDisplayName();
											}
											if (_attacker != null && _itemName != null) {
												return Component.translatable("death.attack." + _msgID + ".player.item", _entityName, _attackerName, _itemName);
											} else if (_attacker != null) {
												return Component.translatable("death.attack." + _msgID + ".player", _entityName, _attackerName);
											} else {
												return Component.translatable("death.attack." + _msgID, _entityName);
											}
										}
									};
								}
							}).get("Ratio", entity)), 15);
							entityiterator.getPersistentData().putBoolean("aoe", true);
						}
					}
				}
				entity.getPersistentData().putBoolean("aoefirst", true);
				CraftkaisenMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("aoefirst", false);
				});
				entity.getPersistentData().putDouble("ratiochance", 0);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Landed Critical Attack!"), true);
			} else {
				entity.getPersistentData().putDouble("ratiochance", (entity.getPersistentData().getDouble("ratiochance") + 1));
			}
		}
	}
}
