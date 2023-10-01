package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class RCTPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCT) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.RCT_COOLDOWN.get()) : false)) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.RCT_HEALING.get()) : false)) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.RCT_HEALING.get(), 300, 0, true, false));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(CraftkaisenModMobEffects.RCT_HEALING.get());
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.RCT_COOLDOWN.get(), 600, 0, true, false));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Reverse Cursed Technique on cooldown."), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Not unlocked."), true);
		}
	}
}
