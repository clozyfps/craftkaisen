package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class ReversalRedFinalOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ReversalRed1Procedure.execute(world, x, y, z, entity);
		CraftkaisenMod.queueServerWork(4, () -> {
			ReversalRed2Procedure.execute(world, x, y, z, entity);
			CraftkaisenMod.queueServerWork(4, () -> {
				ReversalRed3Procedure.execute(world, x, y, z, entity);
				CraftkaisenMod.queueServerWork(4, () -> {
					ReversalRed4Procedure.execute(world, x, y, z, entity);
					CraftkaisenMod.queueServerWork(4, () -> {
						ReversalRed5Procedure.execute(world, x, y, z, entity);
						CraftkaisenMod.queueServerWork(4, () -> {
							RedReversal6Procedure.execute(world, x, y, z, entity);
							CraftkaisenMod.queueServerWork(4, () -> {
								RedReversal7Procedure.execute(world, x, y, z, entity);
							});
						});
					});
				});
			});
		});
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0.96 0 0 2 ^0 ^0 ^0 0.9 1.3 0.9 0 10");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, x, y, z, 6, 5, 2.5, 5, 1);
	}
}
