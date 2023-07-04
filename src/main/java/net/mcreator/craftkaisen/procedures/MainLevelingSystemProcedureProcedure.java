package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MainLevelingSystemProcedureProcedure {
	@SubscribeEvent
	public static void onLivingDropXp(LivingExperienceDropEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getDroppedExperience());
		}
	}

	public static void execute(double droppedexperience) {
		execute(null, droppedexperience);
	}

private static void execute(
@Nullable Event event,
double droppedexperience
) {
if (+droppedexperience<) {}else if (+droppedexperience>=) {}
}
}
