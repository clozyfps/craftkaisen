package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RegenCursedEnergyProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (!=) {if (entity.getPersistentData().getDouble("cursedEnergyTimer")==20) {entity.getPersistentData().putDouble("cursedEnergyTimer", 0);}else if (entity.getPersistentData().getDouble("cursedEnergyTimer")<20) {entity.getPersistentData().putDouble("cursedEnergyTimer", (entity.getPersistentData().getDouble("cursedEnergyTimer")+1));}if (entity.getPersistentData().getDouble("cursedEnergyTimer")==20) {if (!=0&&<) {}}}
}
}
