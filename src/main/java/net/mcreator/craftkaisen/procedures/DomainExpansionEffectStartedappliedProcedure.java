package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.SukunaEntity;
import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class DomainExpansionEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 30, 1, false, false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lDomain Expansion:"), true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:domainexpansion")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:domainexpansion")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		CraftkaisenMod.queueServerWork(40, () -> {
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Flames") || entity instanceof JogoEntity) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7l\u00A76Coffin Of The Iron Mountain."), true);
				entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 0.2), 0));
				CraftkaisenMod.queueServerWork(15, () -> {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					CraftkaisenMod.queueServerWork(3, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						CraftkaisenMod.queueServerWork(3, () -> {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin3"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							CraftkaisenMod.queueServerWork(3, () -> {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin4"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
								CraftkaisenMod.queueServerWork(3, () -> {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin5"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
									CraftkaisenMod.queueServerWork(3, () -> {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin6"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										CraftkaisenMod.queueServerWork(3, () -> {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin7"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22),
															new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
											CraftkaisenMod.queueServerWork(3, () -> {
												if (world instanceof ServerLevel _serverworld) {
													StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin8"));
													if (template != null) {
														template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22),
																new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
													}
												}
												CraftkaisenMod.queueServerWork(800, () -> {
													if (world instanceof ServerLevel _serverworld) {
														StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "domainreplace"));
														if (template != null) {
															template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22),
																	new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
														}
													}
													if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
														_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.BURNT_OUT_EFFECT.get(), 100, 0, true, false));
												});
											});
										});
									});
								});
							});
						});
					});
				});
			} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Sukuna") || entity instanceof SukunaEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MalevolentShrineEntity(CraftkaisenModEntities.MALEVOLENT_SHRINE.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7l\u00A74Malevolent Shrine"), true);
				CraftkaisenMod.queueServerWork(800, () -> {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.BURNT_OUT_EFFECT.get(), 100, 0, true, false));
				});
			}
		});
	}
}
