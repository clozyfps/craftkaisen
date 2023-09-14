
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetFactionCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setfaction").requires(s -> s.hasPermission(3)).then(Commands.argument("player", EntityArgument.player()).then(Commands.argument("faction", StringArgumentType.word()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);

			Direction direction = entity.getDirection();

			SetFactionProcedure.execute(arguments, entity);
			return 0;
		}))));
	}

}
