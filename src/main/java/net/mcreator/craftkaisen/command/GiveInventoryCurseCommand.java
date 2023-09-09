
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class GiveInventoryCurseCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("removeinventorycurse").requires(s -> s.hasPermission(1))

		);
	}

}
