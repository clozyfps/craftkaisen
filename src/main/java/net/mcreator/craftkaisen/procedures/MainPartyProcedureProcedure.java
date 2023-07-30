package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.ArrayList;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class MainPartyProcedureProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (!(StringArgumentType.getString(arguments, "action")).equals("disband")) {
			if ((StringArgumentType.getString(arguments, "action")).equals("create")) {
				if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PartyLeader).isEmpty()) {
					{
						String _setval = entity.getDisplayName().getString();
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PartyLeader = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.InParty = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("You have created a party! Type /party disband " + entity.getDisplayName().getString() + " to disband the party.")), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You are already in a party!"), false);
				}
			} else if ((StringArgumentType.getString(arguments, "action")).equals("invite")) {
				if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).InParty) {
					try {
						for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
							entityiterator.getPersistentData().putBoolean("Pending", true);
							entityiterator.getPersistentData().putString("InviteName", (entity.getDisplayName().getString()));
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("You have been invited to " + entity.getDisplayName().getString() + "s party! Type /party accept " + entity.getDisplayName().getString() + " to join or /party decline "
										+ entity.getDisplayName().getString() + " to deny the invite.")), false);
						}
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You must be in a party to send an invite!"), false);
				}
			} else if ((StringArgumentType.getString(arguments, "action")).equals("accept")) {
				if (entity.getPersistentData().getBoolean("Pending") && (entity.getPersistentData().getString("InviteName")).equals((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "player");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getDisplayName().getString())) {
					entity.getPersistentData().putBoolean("Pending", false);
					{
						boolean _setval = true;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.InParty = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = (new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getDisplayName().getString();
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PartyLeader = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("You have been successfully joined " + (new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getDisplayName().getString() + "s party! Type /party leave " + (new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getDisplayName().getString() + " to leave the party.")), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You have no pending party invites."), false);
				}
			} else if ((StringArgumentType.getString(arguments, "action")).equals("decline")) {
				if (entity.getPersistentData().getBoolean("Pending")) {
					entity.getPersistentData().putBoolean("Pending", false);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("You have been successfully denied " + (new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "player");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getDisplayName().getString() + "s invite.")), false);
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You have no pending party invites."), false);
				}
			} else if ((StringArgumentType.getString(arguments, "action")).equals("leave")) {
				if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).InParty) {
					if (!(entity.getDisplayName().getString()).equals((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PartyLeader)) {
						try {
							for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + " has left the party!")), false);
							}
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("You have been successfully left " + (new Object() {
								public Entity getEntity() {
									try {
										return EntityArgument.getEntity(arguments, "player");
									} catch (CommandSyntaxException e) {
										e.printStackTrace();
										return null;
									}
								}
							}.getEntity()).getDisplayName().getString() + "s party.")), false);
						{
							boolean _setval = false;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.InParty = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.PartyLeader = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("You must run /party disband " + entity.getDisplayName().getString() + " to leave the party.")), false);
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You are not in a party currently."), false);
				}
			}
		} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).InParty && (StringArgumentType.getString(arguments, "action")).equals("disband")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).InParty) {
				if ((entity.getDisplayName().getString()).equals((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PartyLeader)) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (((entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).PartyLeader).equals(entity.getDisplayName().getString())) {
							{
								boolean _setval = false;
								entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.InParty = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								String _setval = "";
								entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.PartyLeader = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(((new Object() {
									public Entity getEntity() {
										try {
											return EntityArgument.getEntity(arguments, "player");
										} catch (CommandSyntaxException e) {
											e.printStackTrace();
											return null;
										}
									}
								}.getEntity()).getDisplayName().getString() + " has disbanded the party!")), false);
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You must be the leader of the party to run this command!"), false);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You are not in a party currently."), false);
			}
		}
	}
}
