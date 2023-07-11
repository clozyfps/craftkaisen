package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class QuestRandomizerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomMob = 0;
		double amount = 0;
		if (!entity.getPersistentData().getBoolean("quest")) {
			entity.getPersistentData().putBoolean("quest", true);
			randomMob = Mth.nextInt(RandomSource.create(), 1, 5);
			if (randomMob == 1) {
			} else if (randomMob == 2) {
			} else if (randomMob == 3) {
				amount = Mth.nextInt(RandomSource.create(), 1, 10);
			} else if (randomMob == 4) {
			} else if (randomMob == 5) {
			}
		}
	}
}
