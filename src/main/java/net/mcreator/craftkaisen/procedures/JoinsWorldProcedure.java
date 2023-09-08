package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JoinsWorldProcedure {
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
		double random = 0;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).JoinsWorld == false) {
			{
				boolean _setval = true;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JoinsWorld = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			random = Mth.nextInt(RandomSource.create(), 1, 7);
			if (random == 1) {
				{
					String _setval = "Limitless";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (random == 2) {
				{
					String _setval = "Restricted";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (random == 3) {
				{
					String _setval = "Flames";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (random == 4) {
				{
					String _setval = "Plants";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (random == 5) {
				{
					String _setval = "Voice";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (random == 6) {
				{
					String _setval = "Idle Transfiguration";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (random == 7) {
				{
					String _setval = "Boogie";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
