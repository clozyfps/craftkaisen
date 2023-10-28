package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PressedDomainClashProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("domainPress", (Mth.nextInt(RandomSource.create(), 0, 4)));
		entity.getPersistentData().putDouble("domainClash", (entity.getPersistentData().getDouble("domainClash") + 1));
	}
}
