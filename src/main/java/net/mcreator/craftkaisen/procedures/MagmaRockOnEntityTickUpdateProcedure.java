package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MagmaRockOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LAVA, x, y, z, 1, 0.1, 2, 0.1, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 8, 1, 2, 1, 0);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x, y - 3, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 8, 1, 1, 1, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(7 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.SKY_OF_FLAMES.get()) : false)) {
						entityiterator.hurt(DamageSource.GENERIC, 6);
						entityiterator.setSecondsOnFire(5);
					}
				}
			}
			world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.MAGMA_BLOCK.defaultBlockState()));
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x, y + 1, z), Blocks.MAGMA_BLOCK.defaultBlockState());
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x, y + 2, z), Blocks.MAGMA_BLOCK.defaultBlockState());
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x + 1, y + 3, z), Blocks.MAGMA_BLOCK.defaultBlockState());
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x + 2, y + 3, z), Blocks.MAGMA_BLOCK.defaultBlockState());
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x, y + 3, z + 1), Blocks.MAGMA_BLOCK.defaultBlockState());
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x, y + 3, z + 2), Blocks.MAGMA_BLOCK.defaultBlockState());
		}
	}
}
