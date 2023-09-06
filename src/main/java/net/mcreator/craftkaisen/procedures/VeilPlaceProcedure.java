package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftkaisen.CraftkaisenMod;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class VeilPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_eight_veil"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 24, z - 22), new BlockPos(x - 22, y + 24, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.random, 3);
			}
		}
		CraftkaisenMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_seven_veil"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 23, z - 22), new BlockPos(x - 22, y + 23, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			CraftkaisenMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_six_veil"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 22, z - 22), new BlockPos(x - 22, y + 22, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				CraftkaisenMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_five_veil"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 21, z - 22), new BlockPos(x - 22, y + 21, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					CraftkaisenMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_four_veil"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 20, z - 22), new BlockPos(x - 22, y + 20, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						CraftkaisenMod.queueServerWork(1, () -> {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_three_veil"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 19, z - 22), new BlockPos(x - 22, y + 19, z - 22),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
							CraftkaisenMod.queueServerWork(1, () -> {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_three_veil"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 18, z - 22), new BlockPos(x - 22, y + 18, z - 22),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
								CraftkaisenMod.queueServerWork(1, () -> {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_three_veil"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 17, z - 22), new BlockPos(x - 22, y + 17, z - 22),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
									CraftkaisenMod.queueServerWork(1, () -> {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_three_veil"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 16, z - 22), new BlockPos(x - 22, y + 16, z - 22),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
										CraftkaisenMod.queueServerWork(1, () -> {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_three_veil"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 15, z - 22), new BlockPos(x - 22, y + 15, z - 22),
															new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
												}
											}
											CraftkaisenMod.queueServerWork(1, () -> {
												if (world instanceof ServerLevel _serverworld) {
													StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_three_veil"));
													if (template != null) {
														template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 14, z - 22), new BlockPos(x - 22, y + 14, z - 22),
																new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
													}
												}
												CraftkaisenMod.queueServerWork(1, () -> {
													if (world instanceof ServerLevel _serverworld) {
														StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_two_veil"));
														if (template != null) {
															template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 13, z - 22), new BlockPos(x - 22, y + 13, z - 22),
																	new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
														}
													}
													CraftkaisenMod.queueServerWork(1, () -> {
														if (world instanceof ServerLevel _serverworld) {
															StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_two_veil"));
															if (template != null) {
																template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 12, z - 22), new BlockPos(x - 22, y + 12, z - 22),
																		new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
															}
														}
														CraftkaisenMod.queueServerWork(1, () -> {
															if (world instanceof ServerLevel _serverworld) {
																StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_two_veil"));
																if (template != null) {
																	template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 11, z - 22), new BlockPos(x - 22, y + 11, z - 22),
																			new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																}
															}
															CraftkaisenMod.queueServerWork(1, () -> {
																if (world instanceof ServerLevel _serverworld) {
																	StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_two_veil"));
																	if (template != null) {
																		template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 10, z - 22), new BlockPos(x - 22, y + 10, z - 22),
																				new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																	}
																}
																CraftkaisenMod.queueServerWork(1, () -> {
																	if (world instanceof ServerLevel _serverworld) {
																		StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_two_veil"));
																		if (template != null) {
																			template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 9, z - 22), new BlockPos(x - 22, y + 9, z - 22),
																					new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																		}
																	}
																	CraftkaisenMod.queueServerWork(1, () -> {
																		if (world instanceof ServerLevel _serverworld) {
																			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_two_veil"));
																			if (template != null) {
																				template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 8, z - 22), new BlockPos(x - 22, y + 8, z - 22),
																						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																			}
																		}
																		CraftkaisenMod.queueServerWork(1, () -> {
																			if (world instanceof ServerLevel _serverworld) {
																				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																				if (template != null) {
																					template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 7, z - 22), new BlockPos(x - 22, y + 7, z - 22),
																							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																				}
																			}
																			CraftkaisenMod.queueServerWork(1, () -> {
																				if (world instanceof ServerLevel _serverworld) {
																					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																					if (template != null) {
																						template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 6, z - 22), new BlockPos(x - 22, y + 6, z - 22),
																								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																					}
																				}
																				CraftkaisenMod.queueServerWork(1, () -> {
																					if (world instanceof ServerLevel _serverworld) {
																						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																						if (template != null) {
																							template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 5, z - 22), new BlockPos(x - 22, y + 5, z - 22),
																									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																						}
																					}
																					CraftkaisenMod.queueServerWork(1, () -> {
																						if (world instanceof ServerLevel _serverworld) {
																							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																							if (template != null) {
																								template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 4, z - 22), new BlockPos(x - 22, y + 4, z - 22),
																										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																							}
																						}
																						CraftkaisenMod.queueServerWork(1, () -> {
																							if (world instanceof ServerLevel _serverworld) {
																								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																								if (template != null) {
																									template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 3, z - 22), new BlockPos(x - 22, y + 3, z - 22),
																											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																								}
																							}
																							CraftkaisenMod.queueServerWork(1, () -> {
																								if (world instanceof ServerLevel _serverworld) {
																									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																									if (template != null) {
																										template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 2, z - 22), new BlockPos(x - 22, y + 2, z - 22),
																												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																									}
																								}
																								CraftkaisenMod.queueServerWork(1, () -> {
																									if (world instanceof ServerLevel _serverworld) {
																										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
																										if (template != null) {
																											template.placeInWorld(_serverworld, new BlockPos(x - 22, y + 1, z - 22), new BlockPos(x - 22, y + 1, z - 22),
																													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
																										}
																									}
																									CraftkaisenMod.queueServerWork(1, () -> {
																										if (world instanceof ServerLevel _serverworld) {
																											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "layer_one_veil"));
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
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
		if (world.isClientSide()) {
			if (entity instanceof AbstractClientPlayer player) {
				var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftkaisen", "player_animation"));
				if (animation != null && !animation.isActive()) {
					animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftkaisen", "veilcast"))));
				}
			}
		}
	}
}
