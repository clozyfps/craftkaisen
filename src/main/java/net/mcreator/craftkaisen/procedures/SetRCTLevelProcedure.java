package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetRCTLevelProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "level") == 0) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if (DoubleArgumentType.getDouble(arguments, "level") == 1) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if (DoubleArgumentType.getDouble(arguments, "level") == 2) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
