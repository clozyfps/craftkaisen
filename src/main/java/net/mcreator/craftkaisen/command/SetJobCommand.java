
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetJobCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setjob").requires(s -> s.hasPermission(1))

		);
	}

}
