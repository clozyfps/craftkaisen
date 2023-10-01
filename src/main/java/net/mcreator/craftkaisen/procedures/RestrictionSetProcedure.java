package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class RestrictionSetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Restricted == true) {
			if ((StringArgumentType.getString(arguments, "type")).equals("Fragile") || (StringArgumentType.getString(arguments, "type")).equals("fragile")) {
				{
					String _setval = "Fragile";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RestrictedType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((StringArgumentType.getString(arguments, "type")).equals("Physically Gifted") || (StringArgumentType.getString(arguments, "type")).equals("Physically Gifted")) {
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
