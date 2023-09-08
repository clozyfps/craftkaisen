package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RootsPotionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(entity.level
				.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
				.getBlockPos().getX(),
				entity.level.clip(
						new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY(),
				entity.level.clip(
						new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ()),
				Blocks.DARK_OAK_WOOD.defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EXPLOSION, (entity.level
					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX()),
					(entity.level.clip(
							new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY()),
					(entity.level.clip(
							new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getZ()),
					1, 0.01, 2, 0.01, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, (entity.level
					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX()),
					(entity.level.clip(
							new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY()),
					(entity.level.clip(
							new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distancewood")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getZ()),
					1, 0.01, 2, 0.01, 0);
		if (entity.isShiftKeyDown()) {
			entity.getPersistentData().putDouble("distancewood", (entity.getPersistentData().getDouble("distancewood") + 0.4));
		} else if (Screen.hasControlDown()) {
			entity.getPersistentData().putDouble("distancewood", (entity.getPersistentData().getDouble("distancewood") - 0.4));
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 2, false, false));
	}
}
