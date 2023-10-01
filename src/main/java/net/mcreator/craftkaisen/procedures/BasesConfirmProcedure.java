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
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.craftkaisen.world.inventory.CustomCTGUIMenu;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class BasesConfirmProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		entity.getPersistentData().putBoolean("showErr", false);
		if ((guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Spatial")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("spatial")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Transfiguration")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("transfiguration")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Corruption")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("corruption")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Flame")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("flame")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Plant")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("plant")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Swap")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("swap")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Jackpot")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("jackpot")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("String")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("string")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Marker")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("marker")) {
			entity.getPersistentData().putString("base", (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : ""));
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("CustomCTGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new CustomCTGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (guistate.get("text:CTName") instanceof EditBox _tf)
				_tf.setValue((entity.getPersistentData().getString("ctName")));
		} else {
			if (!entity.getPersistentData().getBoolean("showErr")) {
				entity.getPersistentData().putString("errMsg", "Base typed incorrectly or is empty!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
	}
}
