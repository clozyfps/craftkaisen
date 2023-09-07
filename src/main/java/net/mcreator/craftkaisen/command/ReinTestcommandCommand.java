
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class ReinTestcommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("reintestcommand")

				.executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					TestProcedure.execute(world, entity);
					return 0;
				}));
	}

}
