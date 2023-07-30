package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

public class RCTHealingActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double expReq = 0;
		expReq = 300;
		if (entity.getPersistentData().getDouble("rctTimer") == 0) {
			entity.getPersistentData().putDouble("rctTimer", 20);
		} else if (entity.getPersistentData().getDouble("rctTimer") > 0) {
			entity.getPersistentData().putDouble("rctTimer", (entity.getPersistentData().getDouble("rctTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("rctTimer") == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
				if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCTExp + 1 < expReq) {
					{
						double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCTExp + 1;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RCTExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCTExp + 1 >= expReq) {
					{
						double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCTMastery + 1;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RCTMastery = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RCTExp - expReq;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RCTExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 20, 0.6, 0.6, 0.6, 0);
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
			}
		}
	}
}
