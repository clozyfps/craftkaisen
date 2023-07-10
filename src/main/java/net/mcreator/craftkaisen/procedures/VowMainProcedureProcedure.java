package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VowMainProcedureProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
CommandContext<CommandSourceStack> arguments,
Entity entity,
HashMap cmdparams
) {
if(
entity == null ||
cmdparams == null
) return ;
if (!(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").isEmpty()) {try {
for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
if () {entity.getPersistentData().putBoolean("vowPending", true);{
if(entityiterator instanceof ServerPlayer _ent) {
BlockPos _bpos = new BlockPos(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("BindingVowGUI");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new BindingVowGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
}
}
}
} catch (CommandSyntaxException e) {
e.printStackTrace();
}}
}
}
