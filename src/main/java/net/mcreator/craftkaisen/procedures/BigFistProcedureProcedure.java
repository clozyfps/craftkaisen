package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.BigFistEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class BigFistProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new BigFistEntity(CraftkaisenModEntities.BIG_FIST.get(), _level);
			entityToSpawn.moveTo(x, y, z, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		entity.getPersistentData().putBoolean("fistenlarge", true);
		CraftkaisenMod.queueServerWork(100, () -> {
			entity.getPersistentData().putBoolean("fistenlarge", false);
		});
	}
}
