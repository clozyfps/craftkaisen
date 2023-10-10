package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.entity.HollowPurpleEntityEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class HollowPurpleWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 1 0 1 5.5 ^0 ^0 ^0 7 3 7 0 90");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 3, 2, 3, 0);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof HollowPurpleEntityEntity) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo(x, y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
					}
				} else if (true) {
					entityiterator.hurt(DamageSource.GENERIC, 15);
				}
			}
		}
		world.destroyBlock(new BlockPos(x, y, z), false);
		immediatesourceentity.setNoGravity(true);
		CraftkaisenMod.queueServerWork(200, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
		sx = -15;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -15;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -15;
				for (int index2 = 0; index2 < 6; index2++) {
					if (!((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR)) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			world.destroyBlock(new BlockPos(x + sx, y + sy, z + sz), false);
			sx = sx + 0.5;
			int horizontalRadiusSphere = (int) Math.min(sx, 15) - 1;
			int verticalRadiusSphere = (int) Math.min(sx, 15) - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (!((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
								world.setBlock(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY() - 1, immediatesourceentity.getZ()), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ()), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY() + 1, immediatesourceentity.getZ()), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					}
				}
			}
			world.setBlock(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY() - 1, immediatesourceentity.getZ()), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY() + 1, immediatesourceentity.getZ()), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ()), Blocks.AIR.defaultBlockState(), 3);
		}
		int horizontalRadiusSphere = (int) 15 - 1;
		int verticalRadiusSphere = (int) 15 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x + xi, y + i, z + zi), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 1 0 1 5.5 ^0 ^0 ^0 7 3 7 0 90");
					}
				}
			}
		}
	}
}
