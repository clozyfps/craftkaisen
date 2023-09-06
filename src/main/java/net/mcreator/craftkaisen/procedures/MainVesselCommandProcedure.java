package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftkaisenModGameRules;

import java.util.ArrayList;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class MainVesselCommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
			if (!world.getLevelData().getGameRules().getBoolean(CraftkaisenModGameRules.CK_CUSTOM_VESSEL)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Gamerule"), false);
			} else {
				if ((StringArgumentType.getString(arguments, "message")).equals("request") || (StringArgumentType.getString(arguments, "message")).equals("Request")) {
					if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.VESSEL_COOLDOWN.get()) : false)) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Your vessel has requested your power, type /vessel accept or /vessel deny."), false);
									entityiterator.getPersistentData().putBoolean("requestPending", true);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A74You are on cooldown."), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74You are not the vessel."), false);
					}
				} else if ((StringArgumentType.getString(arguments, "message")).equals("accept") || (StringArgumentType.getString(arguments, "message")).equals("Accept")) {
					if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
						if (entity.getPersistentData().getBoolean("requestPending")) {
							entity.getPersistentData().putDouble("xTP", (entity.getX()));
							entity.getPersistentData().putDouble("yTP", (entity.getY()));
							entity.getPersistentData().putDouble("zTP", (entity.getZ()));
							entity.getPersistentData().putBoolean("requestPending", false);
							if (entity instanceof ServerPlayer _player)
								_player.setGameMode(GameType.SPECTATOR);
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
									}
									{
										String _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).VesselTechnique;
										entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.Technique = _setval;
											capability.syncPlayerVariables(entityiterator);
										});
									}
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.VESSEL_POTION_EFFECT.get(), 1200, 0, true, false));
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A74Your power is not requested."), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74You are not the vessel."), false);
					}
				} else if ((StringArgumentType.getString(arguments, "message")).equals("deny") || (StringArgumentType.getString(arguments, "message")).equals("Deny")) {
					if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
						if (entity.getPersistentData().getBoolean("requestPending")) {
							entity.getPersistentData().putBoolean("requestPending", false);
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("\u00A74The vessel denied your request."), false);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A74Your power is not requested."), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74You are not the vessel."), false);
					}
				} else if ((StringArgumentType.getString(arguments, "message")).equals("trust") || (StringArgumentType.getString(arguments, "message")).equals("Trust")) {
					if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
						entity.getPersistentData().putBoolean("trustPend", true);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74DOING THIS WILL ALLOW THE VESSEL TO USE YOUR POWER AT ANY TIME! TYPE /vessel confirm TO CONFIRM."), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74You are not the vessel."), false);
					}
				} else if ((StringArgumentType.getString(arguments, "message")).equals("confirm") || (StringArgumentType.getString(arguments, "message")).equals("Confirm")) {
					if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
						if (entity.getPersistentData().getBoolean("trustPend")) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if ((entityiterator.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("\u00A74The vessel has granted you their trust, use the awaken key to use their power freely."), false);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A74Use /vessel trust first."), false);
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74You are not the vessel."), false);
					}
				} else if ((StringArgumentType.getString(arguments, "message")).equals("info") || (StringArgumentType.getString(arguments, "message")).equals("Info")) {
					if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("You can use /vessel trust to allow the use of your power at any time."), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A74You are not the vessel."), false);
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74You are not a vessel."), false);
		}
	}
}
