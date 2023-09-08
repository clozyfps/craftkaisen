package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CurseKickProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		degree = Math.toRadians(entity.getYRot());
		xRadius = 3;
		zRadius = 3;
		for (int index0 = 0; index0 < 36; index0++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 1;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x_pos, y_pos, z_pos, 5, 0.1, 0.1, 0.1, 0);
			if (!entity.getPersistentData().getBoolean("redState")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 0.1 0.9 0.1 0 1");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.12 0.84 0.73 2 ^0 ^0 ^0 0.1 0.9 0.1 0 1");
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 0.1 0.9 0.1 0 1");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.84 0.12 0.24 2 ^0 ^0 ^0 0.1 0.9 0.1 0 1");
			}
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entity.hurt(DamageSource.GENERIC, 13);
					}
				}
			}
			degree = degree + Math.toRadians(6);
		}
	}
}
