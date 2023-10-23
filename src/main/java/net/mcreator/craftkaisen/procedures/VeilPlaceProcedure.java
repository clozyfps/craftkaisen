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
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil1"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		CraftkaisenMod.queueServerWork(5, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
							3);
				}
			}
			CraftkaisenMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin1"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				CraftkaisenMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "coffin1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					CraftkaisenMod.queueServerWork(5, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil5"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						CraftkaisenMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil6"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							CraftkaisenMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil7"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
								CraftkaisenMod.queueServerWork(5, () -> {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil8"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
									CraftkaisenMod.queueServerWork(5, () -> {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "newveil9"));
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
