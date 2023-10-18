
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetExpCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setlevel").requires(s -> s.hasPermission(1)).then(Commands.argument("player", EntityArgument.player()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(0)))));
	}

}
