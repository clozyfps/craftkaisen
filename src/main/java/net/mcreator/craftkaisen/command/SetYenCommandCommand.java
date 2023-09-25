
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetYenCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("SetYen").requires(s -> s.hasPermission(1)).then(Commands.argument("playeryen", EntityArgument.player()).then(Commands.argument("yenamount", DoubleArgumentType.doubleArg(0)).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					YenSetProcedure.execute(arguments);
					return 0;
				}))));
	}

}
