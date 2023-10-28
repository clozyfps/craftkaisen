package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PropellEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 1.3), (entity.getDeltaMovement().z())));
	}
}
