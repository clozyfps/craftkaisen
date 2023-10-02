package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityEvadingProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
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
		if (entity instanceof SukunaEntity || entity instanceof SatoruGojoEntity) {
			if (Math.random() < 0.2) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.FLASH_STEP_COOLDOWN.get()) : false)) {
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.FLASH_STEP_POTION.get(), 15, 1, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.FLASH_STEP_COOLDOWN.get(), 90, 1, false, false));
					CraftkaisenMod.queueServerWork(20, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getX()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getX()), _ent.getYRot(), _ent.getXRot());
						}
						sourceentity.hurt(DamageSource.GENERIC, 16);
						sourceentity.setDeltaMovement(new Vec3((2.3 * entity.getLookAngle().x), (2.3 * entity.getLookAngle().y), (2.3 * entity.getLookAngle().z)));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					});
				}
			}
		}
	}
}
