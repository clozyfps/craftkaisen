package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class PressedPowerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("DefenseChosen", false);
		entity.getPersistentData().putBoolean("CEChosen", false);
		entity.getPersistentData().putBoolean("SpeedChosen", false);
		entity.getPersistentData().putBoolean("PowerChosen", true);
		UpgradeSkillTreeProcedure.execute(world, entity);
	}
}
