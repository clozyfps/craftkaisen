
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetRCTLevelCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setrctlevel").requires(s -> s.hasPermission(3)).then(Commands.argument("level", DoubleArgumentType.doubleArg(0, 2)).then(Commands.argument("player", EntityArgument.player()))));
	}

}
