package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RepeatingSlicesProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.REPEATED_SLICING.get(), 50, 1, false, false));
	}
}
