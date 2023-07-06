package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

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

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy != (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergyCap) {
			if (entity.getPersistentData().getDouble("cursedEnergyTimer") == 20) {
				entity.getPersistentData().putDouble("cursedEnergyTimer", 0);
			} else if (entity.getPersistentData().getDouble("cursedEnergyTimer") < 20) {
				entity.getPersistentData().putDouble("cursedEnergyTimer", (entity.getPersistentData().getDouble("cursedEnergyTimer") + 1));
			}
			if (entity.getPersistentData().getDouble("cursedEnergyTimer") == 20) {
				if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy != 0
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy < (entity
								.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergyCap) {
					{
						double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy + 5;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CursedEnergy = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
