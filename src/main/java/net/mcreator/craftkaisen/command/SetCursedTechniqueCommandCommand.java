
package net.mcreator.craftkaisen.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import net.mcreator.craftkaisen.procedures.SetCursedTechniqueProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class SetCursedTechniqueCommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("setcursedtechnique").requires(s -> s.hasPermission(1)).then(Commands.argument("technique", StringArgumentType.word()).executes(arguments -> {
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
