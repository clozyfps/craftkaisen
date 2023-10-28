package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PressedDomainClashProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("domainPress", (Mth.nextInt(RandomSource.create(), 0, 4)));
		entity.getPersistentData().putDouble("domainClash", (entity.getPersistentData().getDouble("domainClash") + 1));
	}
}
