package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HollowPurpleTestProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 215, 250, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.LAPSE_BLUE_TEMPORARY.get(), 50, 1, false, false));
		CraftkaisenMod.queueServerWork(100, () -> {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7l\u00A7b Combining Lapse Blue."), true);
			CraftkaisenMod.queueServerWork(15, () -> {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7l\u00A74 With Reversal Red."), true);
				CraftkaisenMod.queueServerWork(15, () -> {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7l\u00A74 MAKES HOLLOW PURPLE"), true);
					CraftkaisenMod.queueServerWork(10, () -> {
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.HOLLOW_PURPLE_TEMPORARY.get(), 20, 1, false, false));
					});
				});
			});
		});
	}
}
