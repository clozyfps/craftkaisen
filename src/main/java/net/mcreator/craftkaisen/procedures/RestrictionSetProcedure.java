package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

public class RestrictionSetProcedure {
	public static void execute(Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Restricted == true) {
			if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Fragile") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("fragile")) {
				{
					String _setval = "Fragile";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RestrictedType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Physically Gifted") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Physically Gifted")) {
				{
					String _setval = "Physically Gifted";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RestrictedType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You arent restricted"), true);
		}
	}
}
