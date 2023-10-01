package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BagMaskManOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.1) {
				if (!entity.getPersistentData().getBoolean("cloned")) {
					for (int index0 = 0; index0 < 7; index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new BagMaskCloneEntity(CraftkaisenModEntities.DELETED_MOD_ELEMENT.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					entity.getPersistentData().putBoolean("cloned", true);
				}
			}
		}
	}
}
