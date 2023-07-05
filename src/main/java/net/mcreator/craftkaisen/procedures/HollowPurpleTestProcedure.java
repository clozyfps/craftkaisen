package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.CraftkaisenMod;

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
