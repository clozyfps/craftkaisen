package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class PartyMainProcedureProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "action")).equals("create")) {
			entity.getPersistentData().putBoolean((entity.getDisplayName().getString() + "sParty"), true);
		} else if ((StringArgumentType.getString(arguments, "action")).equals("invite")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					entityiterator.getPersistentData().putBoolean((entity.getDisplayName().getString() + "Pending"), true);
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								("Invited to party by " + entity.getDisplayName().getString() + ". Type /party accept " + entity.getDisplayName().getString() + " to join and /party decline " + entity.getDisplayName().getString() + " to decline.")),
								false);
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "action")).equals("accept")) {
			if (entity.getPersistentData().getBoolean(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "player");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getDisplayName().getString() + "Pending"))) {
				entity.getPersistentData().putBoolean((entity.getDisplayName().getString() + "sParty"), true);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("Successfully joined " + entity.getDisplayName().getString() + "s Party!")), false);
			}
		} else if ((StringArgumentType.getString(arguments, "action")).equals("decline")) {
			if (entity.getPersistentData().getBoolean(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "player");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getDisplayName().getString() + "Pending"))) {
				entity.getPersistentData().putBoolean((entity.getDisplayName().getString() + "Pending"), false);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("Declined " + entity.getDisplayName().getString() + " party invite.")), false);
			}
		} else if ((StringArgumentType.getString(arguments, "action")).equals("disband")) {
			entity.getPersistentData().putBoolean((entity.getDisplayName().getString() + "sParty"), false);
		}
	}
}
