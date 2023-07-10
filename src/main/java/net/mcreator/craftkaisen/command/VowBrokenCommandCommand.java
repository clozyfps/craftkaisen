
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class VowBrokenCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("vowbrokencommand")

				.then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					VowBrokenProcedureProcedure.execute(arguments, entity);
					return 0;
				})));
	}

}
