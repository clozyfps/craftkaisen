package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class PressedDefenseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("DefenseChosen", true);
		entity.getPersistentData().putBoolean("CEChosen", false);
		entity.getPersistentData().putBoolean("SpeedChosen", false);
		entity.getPersistentData().putBoolean("PowerChosen", false);
		UpgradeSkillTreeProcedure.execute(world, entity);
	}
}
