package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetFactionProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				if ((StringArgumentType.getString(arguments, "faction")).equals("curse") || (StringArgumentType.getString(arguments, "faction")).equals("Curse")) {
				} else if ((StringArgumentType.getString(arguments, "faction")).equals("sorcerer") || (StringArgumentType.getString(arguments, "faction")).equals("Sorcerer")) {
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
