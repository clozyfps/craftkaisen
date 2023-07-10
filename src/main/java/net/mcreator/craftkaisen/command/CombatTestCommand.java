
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class CombatTestCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("combattest")

		);
	}

}
