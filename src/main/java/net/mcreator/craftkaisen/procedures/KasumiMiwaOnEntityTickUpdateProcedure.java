package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class KasumiMiwaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.009) {
				if (!entity.getPersistentData().getBoolean("simpledomain")) {
					entity.getPersistentData().putBoolean("simpledomain", true);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 250, 250, false, false));
					CraftkaisenMod.queueServerWork(250, () -> {
						entity.getPersistentData().putBoolean("simpledomain", false);
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
					});
				}
			}
		}
	}
}
