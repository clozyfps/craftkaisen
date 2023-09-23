
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetSPCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setsp").requires(s -> s.hasPermission(3)).then(Commands.argument("player", EntityArgument.player()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(0)))));
	}

}
