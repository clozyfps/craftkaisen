package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.world.inventory.BindingVowGUIMenu;
import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class VowMainProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if (!(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").isEmpty()) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).VowsEnabled) {
						entity.getPersistentData().putBoolean("vowPending", true);
						{
							String _setval = entity.getDisplayName().getString();
							entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.VowSender = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						{
							String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
							entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.VowDescription = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						{
							if (entityiterator instanceof ServerPlayer _ent) {
								BlockPos _bpos = new BlockPos(x, y, z);
								NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return Component.literal("BindingVowGUI");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new BindingVowGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
