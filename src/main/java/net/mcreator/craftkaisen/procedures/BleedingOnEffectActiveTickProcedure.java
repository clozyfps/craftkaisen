package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BleedingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLOOD.get()), x, y, z, 6, 0.3, 2, 0.3, 0.2);
		entity.hurt(DamageSource.GENERIC, 1);
	}
}
