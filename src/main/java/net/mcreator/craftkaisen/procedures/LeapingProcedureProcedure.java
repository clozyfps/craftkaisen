package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LeapingProcedureProcedure {
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
		if (entity.isShiftKeyDown()) {
			if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR)) {
				if (entity.getPersistentData().getDouble("leapPower") < 60) {
					entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "particle dust 1 1 1 1 ~ ~ ~ 0.3 0 0.3 0.05 5 force");
						}
					}
				} else if (entity.getPersistentData().getDouble("leapPower") >= 60 && entity.getPersistentData().getDouble("leapPower") < 100) {
					entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "particle dust 1 1 1 1.25 ~ ~ ~ 0.3 0 0.3 0.1 10 force");
						}
					}
				} else if (entity.getPersistentData().getDouble("leapPower") >= 100 && entity.getPersistentData().getDouble("leapPower") < 140) {
					entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "particle dust 1 1 1 1.5 ~ ~ ~ 0.3 0 0.3 0.15 15 force");
						}
					}
				} else if (entity.getPersistentData().getDouble("leapPower") >= 140) {
					entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "particle dust 1 1 1 1.75 ~ ~ ~ 0.3 0 0.3 0.2 20 force");
						}
					}
				}
			}
		} else {
			if (entity.getPersistentData().getDouble("leapPower") >= 60 && entity.getPersistentData().getDouble("leapPower") < 100) {
				entity.getPersistentData().putDouble("leapPower", 0);
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 3), (entity.getLookAngle().y * 3), (entity.getLookAngle().z * 3)));
			} else if (entity.getPersistentData().getDouble("leapPower") >= 100 && entity.getPersistentData().getDouble("leapPower") < 120) {
				entity.getPersistentData().putDouble("leapPower", 0);
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 4), (entity.getLookAngle().y * 4), (entity.getLookAngle().z * 4)));
			} else if (entity.getPersistentData().getDouble("leapPower") >= 120) {
				entity.getPersistentData().putDouble("leapPower", 0);
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 5), (entity.getLookAngle().y * 5), (entity.getLookAngle().z * 5)));
			}
		}
	}
}
