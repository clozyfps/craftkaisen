package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import java.util.HashMap;
import java.util.ArrayList;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class PartyMainProcedureProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((StringArgumentType.getString(arguments, "action")).equals("create")) {
			entity.getPersistentData().putBoolean((entity.getDisplayName().getString() + "sParty"), true);
			entity.getPersistentData().putBoolean((entity.getDisplayName().getString() + "Leader"), true);
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
					_player.displayClientMessage(Component.literal(("Successfully joined " + (new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getDisplayName().getString() + "s Party!")), false);
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
					_player.displayClientMessage(Component.literal(("Declined " + (new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "player");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getDisplayName().getString() + " party invite.")), false);
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("disband")) {
			if (entity.getPersistentData().getBoolean((entity.getDisplayName().getString() + "Leader"))) {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getPersistentData().getBoolean((entity.getDisplayName().getString() + "sParty"))) {
						entityiterator.getPersistentData().putBoolean((entity.getDisplayName().getString() + "sParty"), false);
					}
				}
			}
		}
	}
}
