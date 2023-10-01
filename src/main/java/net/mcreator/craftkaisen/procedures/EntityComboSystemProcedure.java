package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class EntityComboSystemProcedure {
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
		if (sourceentity instanceof SatoruGojoEntity) {
			if (Math.random() < 0.01) {
				sourceentity.setDeltaMovement(new Vec3(0, (y + 2), 0));
				CraftkaisenMod.queueServerWork(5, () -> {
					{
						Entity _ent = sourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					CraftkaisenMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(sourceentity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 10);
								}
							}
						}
					});
				});
			}
			if (Math.random() < 0.009) {
				entity.setDeltaMovement(new Vec3((2.5 * sourceentity.getLookAngle().x), (2 * sourceentity.getLookAngle().y), (2.5 * sourceentity.getLookAngle().z)));
				CraftkaisenMod.queueServerWork(10, () -> {
					{
						Entity _ent = sourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					CraftkaisenMod.queueServerWork(1, () -> {
						entity.setDeltaMovement(new Vec3((2.5 * sourceentity.getLookAngle().x), ((-2) * sourceentity.getLookAngle().y), (2.5 * sourceentity.getLookAngle().z)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(sourceentity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 10);
								}
							}
						}
					});
				});
			}
		} else if (sourceentity instanceof MahitoEntity) {
			if (Math.random() < 0.008) {
				entity.setDeltaMovement(new Vec3(0, (y + 2.5), 0));
				CraftkaisenMod.queueServerWork(10, () -> {
					{
						Entity _ent = sourceentity;
						_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 1, false, false));
					CraftkaisenMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(sourceentity == entityiterator)) {
									entityiterator.hurt(DamageSource.GENERIC, 10);
								}
							}
						}
						CraftkaisenMod.queueServerWork(5, () -> {
							entity.setDeltaMovement(new Vec3((sourceentity.getLookAngle().x * 2), (y - 2.5), 0));
							CraftkaisenMod.queueServerWork(5, () -> {
								{
									Entity _ent = sourceentity;
									_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 40, 2, 3, 2, 0);
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(sourceentity == entityiterator)) {
											entityiterator.hurt(DamageSource.GENERIC, 10);
										}
									}
								}
							});
						});
					});
				});
			}
		}
	}
}
