
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class GiveRestrictionCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("giverestriction").requires(s -> s.hasPermission(1))

		);
	}

}
