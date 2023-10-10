package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BoltProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double plantx = 0;
		double plantz = 0;
		double planty = 0;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Yellow")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.97 0.91 0.19 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Red")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 0 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Blue")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.25 0.61 0.91 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Green")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 1 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Black")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Purple")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("Orange")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.99 0.57 0.11 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PrimaryColor).equals("White")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		}
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Yellow")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.97 0.91 0.19 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Red")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 0 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Blue")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.25 0.61 0.91 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Green")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 1 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Black")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Purple")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("Orange")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.99 0.57 0.11 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SecondaryColor).equals("White")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 1.3 0.7 1.3 0 10");
		}
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:electric")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity.getPersistentData().getBoolean("moveused1")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Imbue) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Spatial")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.3) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 50, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 8), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 8)), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if (!((world.getBlockState(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)), Blocks.GRAVEL.defaultBlockState(), 3);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(6);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					plantx = x + Mth.nextInt(RandomSource.create(), -1, 5);
					planty = y + Mth.nextInt(RandomSource.create(), -4, 2);
					plantz = z + Mth.nextInt(RandomSource.create(), -1, 5);
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 2), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 2)),
									Blocks.SPRUCE_WOOD.defaultBlockState());
						world.levelEvent(2001, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 3), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 3)),
								Block.getId(Blocks.SPRUCE_WOOD.defaultBlockState()));
					} else {
						if ((world.getBlockState(new BlockPos(plantx, planty, plantz))).is(BlockTags.create(new ResourceLocation("craftkaisen:flowers")))) {
							world.destroyBlock(new BlockPos(plantx, planty, plantz), false);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
													false);
										}
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 65, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.GLOWING);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
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
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.3) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 50, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 8), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 8)), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if (!((world.getBlockState(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)), Blocks.GRAVEL.defaultBlockState(), 3);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(6);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					plantx = x + Mth.nextInt(RandomSource.create(), -1, 5);
					planty = y + Mth.nextInt(RandomSource.create(), -4, 2);
					plantz = z + Mth.nextInt(RandomSource.create(), -1, 5);
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 2), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 2)),
									Blocks.SPRUCE_WOOD.defaultBlockState());
						world.levelEvent(2001, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 3), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 3)),
								Block.getId(Blocks.SPRUCE_WOOD.defaultBlockState()));
					} else {
						if ((world.getBlockState(new BlockPos(plantx, planty, plantz))).is(BlockTags.create(new ResourceLocation("craftkaisen:flowers")))) {
							world.destroyBlock(new BlockPos(plantx, planty, plantz), false);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
													false);
										}
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 65, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.GLOWING);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
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
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.3) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 50, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 8), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 8)), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if (!((world.getBlockState(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)), Blocks.GRAVEL.defaultBlockState(), 3);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(6);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					plantx = x + Mth.nextInt(RandomSource.create(), -1, 5);
					planty = y + Mth.nextInt(RandomSource.create(), -4, 2);
					plantz = z + Mth.nextInt(RandomSource.create(), -1, 5);
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 2), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 2)),
									Blocks.SPRUCE_WOOD.defaultBlockState());
						world.levelEvent(2001, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 3), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 3)),
								Block.getId(Blocks.SPRUCE_WOOD.defaultBlockState()));
					} else {
						if ((world.getBlockState(new BlockPos(plantx, planty, plantz))).is(BlockTags.create(new ResourceLocation("craftkaisen:flowers")))) {
							world.destroyBlock(new BlockPos(plantx, planty, plantz), false);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
													false);
										}
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 65, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.GLOWING);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
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
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.3) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 50, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 8), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 8)), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if (!((world.getBlockState(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)), Blocks.GRAVEL.defaultBlockState(), 3);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(6);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					plantx = x + Mth.nextInt(RandomSource.create(), -1, 5);
					planty = y + Mth.nextInt(RandomSource.create(), -4, 2);
					plantz = z + Mth.nextInt(RandomSource.create(), -1, 5);
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 2), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 2)),
									Blocks.SPRUCE_WOOD.defaultBlockState());
						world.levelEvent(2001, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 3), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 3)),
								Block.getId(Blocks.SPRUCE_WOOD.defaultBlockState()));
					} else {
						if ((world.getBlockState(new BlockPos(plantx, planty, plantz))).is(BlockTags.create(new ResourceLocation("craftkaisen:flowers")))) {
							world.destroyBlock(new BlockPos(plantx, planty, plantz), false);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
													false);
										}
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 65, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.GLOWING);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
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
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.3) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 50, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 8), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 8)), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if (!((world.getBlockState(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)), Blocks.GRAVEL.defaultBlockState(), 3);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(6);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					plantx = x + Mth.nextInt(RandomSource.create(), -1, 5);
					planty = y + Mth.nextInt(RandomSource.create(), -4, 2);
					plantz = z + Mth.nextInt(RandomSource.create(), -1, 5);
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 2), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 2)),
									Blocks.SPRUCE_WOOD.defaultBlockState());
						world.levelEvent(2001, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 3), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 3)),
								Block.getId(Blocks.SPRUCE_WOOD.defaultBlockState()));
					} else {
						if ((world.getBlockState(new BlockPos(plantx, planty, plantz))).is(BlockTags.create(new ResourceLocation("craftkaisen:flowers")))) {
							world.destroyBlock(new BlockPos(plantx, planty, plantz), false);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
													false);
										}
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 65, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.GLOWING);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
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
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (!(immediatesourceentity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("aoe", true);
										entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.3) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Transfiguration")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.IDLE_TRANSFIGURATION.get(), 50, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Corruption")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 8), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 8)), Blocks.AIR.defaultBlockState(), 3);
					} else {
						if (!((world.getBlockState(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 5), y + Mth.nextInt(RandomSource.create(), -4, 2), z + Mth.nextInt(RandomSource.create(), -1, 5)), Blocks.GRAVEL.defaultBlockState(), 3);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Flame")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.setSecondsOnFire(6);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120, 1));
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Plant")) {
					plantx = x + Mth.nextInt(RandomSource.create(), -1, 5);
					planty = y + Mth.nextInt(RandomSource.create(), -4, 2);
					plantz = z + Mth.nextInt(RandomSource.create(), -1, 5);
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						if (world instanceof ServerLevel _level)
							FallingBlockEntity.fall(_level, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 2), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 2)),
									Blocks.SPRUCE_WOOD.defaultBlockState());
						world.levelEvent(2001, new BlockPos(x + Mth.nextInt(RandomSource.create(), -1, 3), y + Mth.nextInt(RandomSource.create(), -1, 2), z + Mth.nextInt(RandomSource.create(), -1, 3)),
								Block.getId(Blocks.SPRUCE_WOOD.defaultBlockState()));
					} else {
						if ((world.getBlockState(new BlockPos(plantx, planty, plantz))).is(BlockTags.create(new ResourceLocation("craftkaisen:flowers")))) {
							world.destroyBlock(new BlockPos(plantx, planty, plantz), false);
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Swap")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										Entity _ent = entityiterator;
										_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
													false);
										}
									}
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Jackpot")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.LUCK);
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 3600, 1));
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.UNLUCK);
								}
							}
						}
					}
				} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Base).equals("Marker")) {
					if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Reverse) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 65, 1));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.GLOWING);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Damage);
						entityiterator.getPersistentData().putBoolean("aoe", true);
					}
				}
			}
		}
		CraftkaisenMod.queueServerWork(50, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}
