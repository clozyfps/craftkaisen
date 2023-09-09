package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
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

import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LapseBlueOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		String step4 = "";
		String continousfiltering = "";
		String step2 = "";
		String step3 = "";
		String step1 = "";
		String blockid = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double startsize = 0;
		double growspeed = 0;
		double mx = 0;
		double my = 0;
		double percent = 0;
		double mz = 0;
		double size = 0;
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		entity.getPersistentData().putBoolean("aoefirst", true);
		CraftkaisenMod.queueServerWork(20, () -> {
			entity.getPersistentData().putBoolean("aoefirst", false);
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(entityiterator.getPersistentData().getBoolean("lapseuser") == true)) {
						entityiterator.hurt(DamageSource.GENERIC, 9);
						entityiterator.getPersistentData().putBoolean("aoe", true);
						entityiterator.getPersistentData().putBoolean("guardbreaks", true);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 0.2, 2, 0.2, 0);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 0.2, 2, 0.2, 0);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				}
			}
		}
		world.destroyBlock(new BlockPos(x, y, z), false);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0 1 1 2 ^0 ^0 ^0 2 2.5 2 0 20");
		sx = -15;
		percent = 10;
		if (size >= 10 && size < 100) {
			percent = 100;
		} else if (size >= 100 && size < 1000) {
			percent = 1000;
		} else if (size >= 1000 && size < 10000) {
			percent = 10000;
		} else if (size >= 10000 && size < 100000) {
			percent = 100000;
		} else if (size >= 1000000) {
			percent = 10000000;
		}
		startsize = 9;
		size = startsize + Math.round(entity.getPersistentData().getDouble("eaten"));
		growspeed = Math.round(size / percent);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((size / 3) / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
					.collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("kill " + entityiterator.getDisplayName().getString()));
					entity.getPersistentData().putDouble("eaten", (entity.getPersistentData().getDouble("eaten") + growspeed));
				} else {
					if (!entityiterator.level.isClientSide())
						entityiterator.discard();
					entity.getPersistentData().putDouble("eaten", (entity.getPersistentData().getDouble("eaten") + growspeed));
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(size / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getX() > entity.getX()) {
					mx = -1;
				} else {
					mx = 1;
				}
				if (entityiterator.getY() > entity.getY()) {
					my = -1;
				} else {
					my = 1;
				}
				if (entityiterator.getZ() > entity.getZ()) {
					mz = -1;
				} else {
					mz = 1;
				}
				entityiterator.setDeltaMovement(new Vec3(mx, my, mz));
			}
		}
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)).canOcclude()) {
						clickedBlock = (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)));
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			step1 = ("" + clickedBlock).replace("Block{", "");
			step2 = step1.replace("}", "");
			step3 = step2.replace("[", "\",Properties:{");
			step4 = step3.replace("]", "}}");
			continousfiltering = step4.replace("=", ":");
			continousfiltering = continousfiltering.replace("false", "\"false\"");
			continousfiltering = continousfiltering.replace("true", "\"true\"");
			blockid = continousfiltering;
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("summon falling_block ~0.5 ~ ~0.5 {BlockState:{Name:\"" + "" + blockid + ",NoGravity:1b,Time:-1,Passengers:[{id:\"minecraft:armor_stand\",NoGravity:1b,Small:1b,Invisible:1b,NoBasePlate:1b}]}"));
			world.setBlock(new BlockPos(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.LAPSE_BLUE_PARTICLE.get()), x, y, z, 1, 0.1, 2, 0.1, 0);
	}
}
