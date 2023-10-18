package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetCursedTechniqueProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "technique")).equals("Limitless") || (StringArgumentType.getString(arguments, "technique")).equals("limitless")) {
			SetLimitlessProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Speech") || (StringArgumentType.getString(arguments, "technique")).equals("speech")) {
			SetCursedSpeechProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Sukuna") || (StringArgumentType.getString(arguments, "technique")).equals("sukuna")) {
			SetSukunaProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Flames") || (StringArgumentType.getString(arguments, "technique")).equals("flames")) {
			SetFlamesProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Transfiguration") || (StringArgumentType.getString(arguments, "technique")).equals("transfiguration")) {
			SetTransfigurationProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Plants") || (StringArgumentType.getString(arguments, "technique")).equals("plants")) {
			SetPlantsProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Clap") || (StringArgumentType.getString(arguments, "technique")).equals("clap")) {
			SetClapProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Manipulation") || (StringArgumentType.getString(arguments, "technique")).equals("manipulation")) {
			SetManipulationProcedure.execute(entity);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Not recognized, must be Limitless, Flames, Sukuna, Clap, Plants, Transfiguration, Manipulation or Speech."), false);
		}
	}
}
