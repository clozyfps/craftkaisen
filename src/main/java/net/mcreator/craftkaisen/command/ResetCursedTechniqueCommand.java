
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class ResetCursedTechniqueCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("resetcursedtechnique").requires(s -> s.hasPermission(1)).then(Commands.argument("player", EntityArgument.player())));
	}

}
