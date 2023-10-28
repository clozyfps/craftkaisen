package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SkyOfFlamesOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new MagmaRockEntity(CraftkaisenModEntities.MAGMA_ROCK.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextInt(RandomSource.create(), -5, 10)), (y + 12), (z + Mth.nextInt(RandomSource.create(), -5, 10)), world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
