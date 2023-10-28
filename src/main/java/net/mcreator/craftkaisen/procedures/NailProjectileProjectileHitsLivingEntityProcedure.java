package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NailProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 15, 1, false, false));
	}
}
