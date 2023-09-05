package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
