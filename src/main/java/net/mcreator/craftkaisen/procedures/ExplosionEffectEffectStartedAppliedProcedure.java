package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ExplosionEffectEffectStartedAppliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Yellow")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.97 0.91 0.19 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Red")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 0 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Blue")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.25 0.61 0.91 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Green")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 1 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Black")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Purple")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Orange")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.99 0.57 0.11 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("White")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 5 2 5 0 20");
		}
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Yellow")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.97 0.91 0.19 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Red")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 0 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Blue")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.25 0.61 0.91 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Green")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 1 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Black")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Purple")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Orange")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.99 0.57 0.11 1 ^0 ^0 ^0 5 2 5 0 20");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("White")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 5 2 5 0 20");
		}
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 60, 8, 4, 8, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 8, 4, 8, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 1, 8, 4, 8, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 1, 8, 4, 8, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity.getPersistentData().getBoolean("moveused1")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3((entity.getX() - entityiterator.getX()), (entity.getY() - entityiterator.getY()), (entity.getZ() - entityiterator.getZ())));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3(((-1.2) * entityiterator.getLookAngle().x), ((-2.7) * entityiterator.getLookAngle().y), ((-1.2) * entityiterator.getLookAngle().z)));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 60, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 150, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get());
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(10);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						for (int index0 = 0; index0 < 15; index0++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					} else {
						for (int index1 = 0; index1 < 15; index1++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Add Marker"), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Remove Marker"), false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("moveused2")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3((entity.getX() - entityiterator.getX()), (entity.getY() - entityiterator.getY()), (entity.getZ() - entityiterator.getZ())));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3(((-1.2) * entityiterator.getLookAngle().x), ((-2.7) * entityiterator.getLookAngle().y), ((-1.2) * entityiterator.getLookAngle().z)));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 60, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 150, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get());
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(10);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						for (int index2 = 0; index2 < 15; index2++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					} else {
						for (int index3 = 0; index3 < 15; index3++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Add Marker"), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Remove Marker"), false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("moveused3")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3((entity.getX() - entityiterator.getX()), (entity.getY() - entityiterator.getY()), (entity.getZ() - entityiterator.getZ())));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3(((-1.2) * entityiterator.getLookAngle().x), ((-2.7) * entityiterator.getLookAngle().y), ((-1.2) * entityiterator.getLookAngle().z)));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 60, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 150, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get());
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(10);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						for (int index4 = 0; index4 < 15; index4++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					} else {
						for (int index5 = 0; index5 < 15; index5++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Add Marker"), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Remove Marker"), false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("moveused4")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3((entity.getX() - entityiterator.getX()), (entity.getY() - entityiterator.getY()), (entity.getZ() - entityiterator.getZ())));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3(((-1.2) * entityiterator.getLookAngle().x), ((-2.7) * entityiterator.getLookAngle().y), ((-1.2) * entityiterator.getLookAngle().z)));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 60, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 150, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get());
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(10);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						for (int index6 = 0; index6 < 15; index6++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					} else {
						for (int index7 = 0; index7 < 15; index7++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Add Marker"), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Remove Marker"), false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("moveused5")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3((entity.getX() - entityiterator.getX()), (entity.getY() - entityiterator.getY()), (entity.getZ() - entityiterator.getZ())));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3(((-1.2) * entityiterator.getLookAngle().x), ((-2.7) * entityiterator.getLookAngle().y), ((-1.2) * entityiterator.getLookAngle().z)));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 60, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 150, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get());
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(10);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						for (int index8 = 0; index8 < 15; index8++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					} else {
						for (int index9 = 0; index9 < 15; index9++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Add Marker"), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Remove Marker"), false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("moveused6")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3((entity.getX() - entityiterator.getX()), (entity.getY() - entityiterator.getY()), (entity.getZ() - entityiterator.getZ())));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setDeltaMovement(new Vec3(((-1.2) * entityiterator.getLookAngle().x), ((-2.7) * entityiterator.getLookAngle().y), ((-1.2) * entityiterator.getLookAngle().z)));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 60, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 150, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get());
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(10);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						for (int index10 = 0; index10 < 15; index10++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					} else {
						for (int index11 = 0; index11 < 15; index11++) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new RootProjectileEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 8, 1);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), (Mth.nextInt(RandomSource.create(), -1, 6)), 1, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftkaisenMod.queueServerWork(70, () -> {
							int horizontalRadiusSphere = (int) 100 - 1;
							int verticalRadiusSphere = (int) 100 - 1;
							int yIterationsSphere = verticalRadiusSphere;
							for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
								for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
									for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
										double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
												+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
										if (distanceSq <= 1.0) {
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.DARK_OAK_WOOD) {
												{
													BlockPos _bp = new BlockPos(x + xi, y + i, z + zi);
													BlockState _bs = Blocks.AIR.defaultBlockState();
													BlockState _bso = world.getBlockState(_bp);
													for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
														Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
														if (_property != null && _bs.getValue(_property) != null)
															try {
																_bs = _bs.setValue(_property, (Comparable) entry.getValue());
															} catch (Exception e) {
															}
													}
													world.setBlock(_bp, _bs, 3);
												}
											}
										}
									}
								}
							}
						});
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getZ()), (entityiterator.getY()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getZ()), (entity.getY()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getZ()), (entity.getY()), _ent.getYRot(), _ent.getXRot());
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3200, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Add Marker"), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Remove Marker"), false);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		}
	}
}
