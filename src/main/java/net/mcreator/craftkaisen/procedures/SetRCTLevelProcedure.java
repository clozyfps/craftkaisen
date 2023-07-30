package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetRCTLevelProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "level") == 0) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					{
						double _setval = 0;
						entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RCTMastery = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if (DoubleArgumentType.getDouble(arguments, "level") == 1) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					{
						double _setval = 5;
						entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RCTMastery = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if (DoubleArgumentType.getDouble(arguments, "level") == 2) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					{
						double _setval = 10;
						entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RCTMastery = _setval;
							capability.syncPlayerVariables(entityiterator);
						});
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
