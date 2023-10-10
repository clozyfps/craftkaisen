package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
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
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Move3EffectsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double planty = 0;
		double plantz = 0;
		double plantx = 0;
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
										_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1,
												1);
									} else {
										_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:clap")), SoundSource.NEUTRAL, 1, 1,
												false);
									}
								}
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
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(DamageSource.GENERIC, (float) (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Damage);
					entityiterator.getPersistentData().putBoolean("aoe", true);
				}
			}
		}
	}
}
