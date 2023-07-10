package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VowBrokenProcedureProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				if (entity.getPersistentData().getBoolean((entity.getDisplayName().getString() + "VowApproved"))) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
						}
					}
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
