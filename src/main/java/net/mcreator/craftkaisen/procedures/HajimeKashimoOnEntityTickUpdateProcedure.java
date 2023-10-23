package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HajimeKashimoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.005) {
				BuzzBurstProcedureProcedure.execute(entity);
			}
			if (Math.random() < 0.004) {
				DartAtomProcedureProcedure.execute(entity);
			}
			if (Math.random() < 0.004) {
				MultiBoltsProcedureProcedure.execute(world, entity);
			}
			if (Math.random() < 0.004) {
				MultiBoltsProcedureProcedure.execute(world, entity);
			}
			if (Math.random() < 0.002) {
				LightningPropellProcedureProcedure.execute(entity);
			}
		}
	}
}
