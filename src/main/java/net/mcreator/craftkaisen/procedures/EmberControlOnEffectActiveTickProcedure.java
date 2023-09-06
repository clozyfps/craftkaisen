package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.craftkaisen.entity.EmberInsectEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class EmberControlOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.level
					.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
					.getBlockPos().getX()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
							ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
							ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof EmberInsectEntity) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo(
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
										ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
										ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
										ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("distanceinsects")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									_ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
		if (entity.isShiftKeyDown()) {
			entity.getPersistentData().putDouble("distanceinsects", (entity.getPersistentData().getDouble("distanceinsects") + 0.4));
		} else if (Screen.hasControlDown()) {
			entity.getPersistentData().putDouble("distanceinsects", (entity.getPersistentData().getDouble("distanceinsects") - 0.4));
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 3, false, false));
	}
}
