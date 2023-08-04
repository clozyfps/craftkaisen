package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
				if (+1 < expReq) {
				} else if (+1 >= expReq) {
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 20, 0.6, 0.6, 0.6, 0);
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
			}
		}
	}
}
