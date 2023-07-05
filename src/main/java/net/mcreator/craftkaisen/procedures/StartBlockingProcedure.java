package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class StartBlockingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).BlockBar <= (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CraftkaisenModVariables.PlayerVariables())).BlockBarCap) {
			{
				boolean _setval = true;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Blocking = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.BLOCKING_EFFECT.get(), 999999, 1, true, false));
		}
	}
}
