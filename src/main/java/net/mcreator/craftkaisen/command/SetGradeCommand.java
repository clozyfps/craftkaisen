
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetGradeCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setgrade").requires(s -> s.hasPermission(1))

		);
	}

}
