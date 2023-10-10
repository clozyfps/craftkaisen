package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.CraftkaisenMod;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class CheckReverseCursedTechniqueProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double randomRCT = 0;
		if (!(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Checked) {
			if (entity instanceof Player && entity instanceof ServerPlayer && sourceentity instanceof LivingEntity
					&& !(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCT) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 5) {
					{
						boolean _setval = true;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Checked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.getPersistentData().putBoolean("prohibitUse", true);
					randomRCT = Mth.nextInt(RandomSource.create(), 1, 100);
					if (randomRCT >= 95) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:reverse_cursed_technique_advancement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RCT = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 999999, 255, true, false));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 999999, 255, true, false));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 999999, 255, true, false));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 999999, 128, true, false));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999999, 255, true, false));
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("You feel the heartbeat in your chest grow louder.."), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:rct.heartbeat")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:rct.heartbeat")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 20, 0.3, 1.2, 0.3, 0);
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth(20);
						CraftkaisenMod.queueServerWork(50, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 20, 0.3, 1.2, 0.3, 0);
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("...you finally understand..."), true);
							CraftkaisenMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 10, 0.3, 1.2, 0.3, 0);
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("\u00A7c...the core of cursed energy.."), true);
								CraftkaisenMod.queueServerWork(3, () -> {
									entity.getPersistentData().putBoolean("rctAwak", true);
									if ((world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == Blocks.AIR
											&& (world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == Blocks.AIR
											|| (world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == Blocks.CAVE_AIR && (world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == Blocks.CAVE_AIR
													&& (world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == Blocks.CAVE_AIR) {
										{
											Entity _ent = entity;
											_ent.teleportTo(x, (y + 3), z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, (y + 3), z, _ent.getYRot(), _ent.getXRot());
										}
									}
									entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 3), 0));
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 999999, 255, true, false));
								});
							});
						});
					}
				}
			}
		}
	}
}
