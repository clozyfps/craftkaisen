package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MainPartyProcedureProcedure {
public static void execute(
LevelAccessor world,
CommandContext<CommandSourceStack> arguments,
Entity entity
) {
if(
entity == null
) return ;
if (!(StringArgumentType.getString(arguments, "action")).equals("disband")) {if ((StringArgumentType.getString(arguments, "action")).equals("create")) {if (().isEmpty()) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You have created a party! Type /party disband "+entity.getDisplayName().getString()+" to disband the party.")), false);}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You are already in a party!"), false);}}else if ((StringArgumentType.getString(arguments, "action")).equals("invite")) {if () {try {
for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
entityiterator.getPersistentData().putBoolean("Pending", true);if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You have been invited to "+entity.getDisplayName().getString()+"s party! Type /party accept "+entity.getDisplayName().getString()+" to join or /party decline "+entity.getDisplayName().getString()+" to deny the invite.")), false);
}
} catch (CommandSyntaxException e) {
e.printStackTrace();
}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You must be in a party to send an invite!"), false);}}else if ((StringArgumentType.getString(arguments, "action")).equals("accept")) {if (entity.getPersistentData().getBoolean("Pending")) {entity.getPersistentData().putBoolean("Pending", false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You have been successfully joined "+(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "player");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()+"s party! Type /party leave "+(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "player");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()+" to leave the party.")), false);}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You have no pending party invites."), false);}}else if ((StringArgumentType.getString(arguments, "action")).equals("decline")) {if (entity.getPersistentData().getBoolean("Pending")) {entity.getPersistentData().putBoolean("Pending", false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You have been successfully denied "+(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "player");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()+"s invite.")), false);}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You have no pending party invites."), false);}}else if ((StringArgumentType.getString(arguments, "action")).equals("leave")) {if () {if (!(entity.getDisplayName().getString()).equals()) {try {
for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((entity.getDisplayName().getString()+" has left the party!")), false);
}
} catch (CommandSyntaxException e) {
e.printStackTrace();
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You have been successfully left "+(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "player");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()+"s party.")), false);}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You must run /party disband "+entity.getDisplayName().getString()+" to leave the party.")), false);}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You are not in a party currently."), false);}}}else if (&&(StringArgumentType.getString(arguments, "action")).equals("disband")) {if () {if ((entity.getDisplayName().getString()).equals()) {for (Entity entityiterator : new ArrayList<>(world.players())) {
if (().equals(entity.getDisplayName().getString())) {if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "player");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()+" has disbanded the party!")), false);}
}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You must be the leader of the party to run this command!"), false);}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You are not in a party currently."), false);}}
}
}
