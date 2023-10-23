package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HajimeKashimoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.005) {
			}
			if (Math.random() < 0.004) {
			}
			if (Math.random() < 0.004) {
				MultiBoltsProcedureProcedure.execute(world, entity);
			}
			if (Math.random() < 0.004) {
				MultiBoltsProcedureProcedure.execute(world, entity);
			}
			if (Math.random() < 0.002) {
			}
		}
	}
}
