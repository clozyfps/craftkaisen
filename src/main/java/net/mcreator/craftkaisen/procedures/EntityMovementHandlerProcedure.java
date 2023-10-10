package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityMovementHandlerProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("underSpatial")) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("lookAngleX") * 1.2), (entity.getPersistentData().getDouble("lookAngleY") * 1.2), (entity.getPersistentData().getDouble("lookAngleZ") * 1.2)));
			entity.getPersistentData().putBoolean("underSpatial", false);
		}
	}
}
