package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class IdleTransfigurationOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.GENERIC, 7);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 3, false, false));
	}
}
