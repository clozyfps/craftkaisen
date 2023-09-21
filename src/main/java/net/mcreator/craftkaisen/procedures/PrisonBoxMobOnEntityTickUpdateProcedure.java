package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PrisonBoxMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double loop = 0;
		double zRadius = 0;
		double particleAmount = 0;
		loop = 0;
		particleAmount = 8;
		xRadius = 10;
		zRadius = 10;
		while (loop < particleAmount) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5 + Math.cos(((Math.PI * 2) / particleAmount) * loop) * xRadius), y, (z + 0.5 + Math.sin(((Math.PI * 2) / particleAmount) * loop) * zRadius)),
								Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 0.1 0.2 0.1 0 2 ");
			loop = loop + 1;
		}
		if (entity.getPersistentData().getDouble("PrisonRealmTimer") == 0) {
			if (!entity.getPersistentData().getBoolean("PrisonRealmTag")) {
				entity.getPersistentData().putDouble("PrisonRealmTimer", 300);
			} else {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PRISON_BOX_READY.get()) : false) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.removeEffect(CraftkaisenModMobEffects.PRISON_BOX_READY.get());
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.PRISON_BOX_READY_NEW.get(), 600, 1, true, false));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 250, true, false));
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Prison Box Ready, Say \"Gate Open\""), true);
						}
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PRISON_BOX_READY.get()) : false)) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 250, true, false));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.PRISON_BOX_AFFECT.get(), 600, 1, true, false));
						}
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("PrisonRealmTimer", (entity.getPersistentData().getDouble("PrisonRealmTimer") - 1));
			entity.getPersistentData().putBoolean("PrisonRealmTag", true);
		}
	}
}
