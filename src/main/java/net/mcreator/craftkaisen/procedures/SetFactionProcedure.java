package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetFactionProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				if ((StringArgumentType.getString(arguments, "faction")).equals("curse") || (StringArgumentType.getString(arguments, "faction")).equals("Curse")) {
					{
						String _setval = "Curse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Faction = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((StringArgumentType.getString(arguments, "faction")).equals("sorcerer") || (StringArgumentType.getString(arguments, "faction")).equals("Sorcerer")) {
					{
						String _setval = "Sorcerer";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Faction = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Invalid, must be \"curse\" or \"sorcerer\"!"), true);
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
