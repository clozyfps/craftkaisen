package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class RCTHealingExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double expReq = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.RCT_COOLDOWN.get(), 150, 0, true, false));
	}
}
