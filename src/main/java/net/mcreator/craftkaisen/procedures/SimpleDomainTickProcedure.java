package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.entity.KasumiMiwaEntity;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SimpleDomainTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SimpleDomainActive == true || entity.getPersistentData().getBoolean("simpledomain")) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:batto_sword_drawing"))).isDone()
					|| entity instanceof KasumiMiwaEntity) {
				if ((entity instanceof Player _plr ? _plr.getAbilities().getWalkingSpeed() : 0) < 2) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								entityiterator.hurt(DamageSource.GENERIC, 11);
								{
									boolean _setval = false;
									entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.SimpleDomainActive = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								entity.getPersistentData().putBoolean("simpledomain", false);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 9, 0.5, 2, 0.5, 0);
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLOOD.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 1, 2, 1, 0);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:sweep")), SoundSource.NEUTRAL,
												1, 1);
									} else {
										_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:sweep")), SoundSource.NEUTRAL, 1, 1,
												false);
									}
								}
							}
						}
					}
				} else if ((entity instanceof Player _plr ? _plr.getAbilities().getWalkingSpeed() : 0) >= 2) {
					{
						boolean _setval = false;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SimpleDomainActive = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
					entity.getPersistentData().putBoolean("simpledomain", false);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Simple Domain Expired, You Moved."), true);
				}
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = 6.5;
			zRadius = 6.5;
			for (int index0 = 0; index0 < 36; index0++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.7;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.94 2.5 ^0 ^0 ^0 0.1 0.4 0.1 0 2 ");
				z_pos = z + Math.sin(degree) * zRadius;
				degree = degree + Math.toRadians(5);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = -6.5;
			zRadius = -6.5;
			for (int index1 = 0; index1 < 36; index1++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.7;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.94 2.5 ^0 ^0 ^0 0.1 0.4 0.1 0 2 ");
				z_pos = z + Math.sin(degree) * zRadius;
				degree = degree + Math.toRadians(5);
			}
		}
	}
}
