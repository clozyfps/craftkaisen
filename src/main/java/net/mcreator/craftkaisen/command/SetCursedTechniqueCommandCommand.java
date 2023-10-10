
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetCursedTechniqueCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setcursedtechnique").requires(s -> s.hasPermission(4)).then(Commands.argument("technique", StringArgumentType.word()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);

			Direction direction = entity.getDirection();

			SetCursedTechniqueProcedure.execute(arguments, entity);
			return 0;
		})));
	}

}
