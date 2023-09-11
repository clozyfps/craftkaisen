package net.mcreator.craftkaisen.procedures;

<<<<<<< HEAD
=======
import net.minecraft.world.phys.Vec3;
>>>>>>> branch 'master' of https://github.com/clozyfps/craftkaisen.git
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class DomainExpansionEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 10, 1, false, false));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7l Domain Expansion:"), true);
		CraftkaisenMod.queueServerWork(20, () -> {
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Flames") || entity instanceof JogoEntity) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7l\u00A76 Coffin Of The Iron Mountain"), true);
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
												});
											});
										});
									});
								});
							});
						});
					});
				});
			}
		});
	}
}
