package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CursedComboProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 2, 2, 2, 2, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 2, 2, 2, 2, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 0.1, 2, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2, false);
			}
		}
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(DamageSource.GENERIC, 5);
					entityiterator.getPersistentData().putBoolean("aoe", true);
					entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.2) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
				}
			}
		}
		if (!entity.getPersistentData().getBoolean("redState")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.12 0.84 0.73 2 ^0 ^0 ^0 2 1.4 2 0 10");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.84 0.12 0.24 2 ^0 ^0 ^0 2 1.4 2 0 10");
		}
		CraftkaisenMod.queueServerWork(5, () -> {
			if (!entity.getPersistentData().getBoolean("redState")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.12 0.84 0.73 2 ^0 ^0 ^0 2 1.4 2 0 10");
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.84 0.12 0.24 2 ^0 ^0 ^0 2 1.4 2 0 10");
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 2, 2, 2, 2, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 2, 2, 2, 2, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 0.1, 2, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2, false);
				}
			}
			entity.getPersistentData().putBoolean("aoefirst", true);
			CraftkaisenMod.queueServerWork(20, () -> {
				entity.getPersistentData().putBoolean("aoefirst", false);
			});
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt(DamageSource.GENERIC, 5);
						entityiterator.getPersistentData().putBoolean("aoe", true);
						entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.2) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
					}
				}
			}
			CraftkaisenMod.queueServerWork(5, () -> {
				if (!entity.getPersistentData().getBoolean("redState")) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.12 0.84 0.73 2 ^0 ^0 ^0 2 1.4 2 0 10");
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.84 0.12 0.24 2 ^0 ^0 ^0 2 1.4 2 0 10");
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 2, 2, 2, 2, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 2, 2, 2, 2, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 0.1, 2, 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2, false);
					}
				}
				entity.getPersistentData().putBoolean("aoefirst", true);
				CraftkaisenMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("aoefirst", false);
				});
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							entityiterator.hurt(DamageSource.GENERIC, 5);
							entityiterator.getPersistentData().putBoolean("aoe", true);
							entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.2) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
						}
					}
				}
				CraftkaisenMod.queueServerWork(5, () -> {
					if (!entity.getPersistentData().getBoolean("redState")) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.12 0.84 0.73 2 ^0 ^0 ^0 2 1.4 2 0 10");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 2 1.4 2 0 10");
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.84 0.12 0.24 2 ^0 ^0 ^0 2 1.4 2 0 10");
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 2, 2, 2, 2, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 2, 2, 2, 2, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 0.1, 2, 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 2, false);
						}
					}
					entity.getPersistentData().putBoolean("aoefirst", true);
					CraftkaisenMod.queueServerWork(20, () -> {
						entity.getPersistentData().putBoolean("aoefirst", false);
					});
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								entityiterator.hurt(DamageSource.GENERIC, 5);
								entityiterator.getPersistentData().putBoolean("aoe", true);
								entityiterator.setDeltaMovement(new Vec3(((-1) * entityiterator.getLookAngle().x), ((-0.2) * entityiterator.getLookAngle().y), ((-1) * entityiterator.getLookAngle().z)));
							}
						}
					}
				});
			});
		});
	}
}
