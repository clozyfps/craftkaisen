package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftkaisenMod;

import javax.annotation.Nullable;

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
					randomRCT = Mth.nextInt(RandomSource.create(), 1, 100);
					if (randomRCT >= 1) {
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
									_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RED_ELECTRICITY.get()), x, y, z, 10, 0.3, 1.2, 0.3, 0);
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("\u00A7c...the core of cursed energy.."), true);
								CraftkaisenMod.queueServerWork(10, () -> {
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.JUMP);
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(MobEffects.BLINDNESS);
								});
							});
						});
					}
				}
			}
		}
	}
}
