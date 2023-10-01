package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.entity.SukunaEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.ItadoriEntity;
import net.mcreator.craftkaisen.entity.EsoEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KnockbackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity.getX(), entity.getY(), entity.getZ(), entity, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof ItadoriEntity || sourceentity instanceof SatoruGojoEntity || sourceentity instanceof EsoEntity || sourceentity instanceof MahitoEntity) {
			if (Math.random() < 0.07) {
				entity.setDeltaMovement(new Vec3((2 * sourceentity.getLookAngle().x), (2.5 * sourceentity.getLookAngle().y), (2 * sourceentity.getLookAngle().z)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 1, 2, 1, 1);
				CraftkaisenMod.queueServerWork(15, () -> {
					{
						Entity _ent = sourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				});
				entity.getPersistentData().putBoolean("slam", true);
			}
		}
		if (sourceentity instanceof SukunaEntity) {
			if (Math.random() < 0.08) {
				entity.setDeltaMovement(new Vec3((4 * sourceentity.getLookAngle().x), (2.5 * sourceentity.getLookAngle().y), (4 * sourceentity.getLookAngle().z)));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 8, 1, 2, 1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 3, 1, 2, 1, 0);
				CraftkaisenMod.queueServerWork(20, () -> {
					{
						Entity _ent = sourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				});
				entity.getPersistentData().putBoolean("slam", true);
			}
		}
	}
}
