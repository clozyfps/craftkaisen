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

public class DesignConfirmProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		entity.getPersistentData().putBoolean("showErr", false);
		if (((guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Blue")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("blue")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Yellow")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("yellow")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Red")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("red")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Purple")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("purple")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Green")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("green")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Orange")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("orange")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("Black")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("black")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("White")
				|| (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : "").contains("white"))
				&& ((guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Blue")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("blue")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Yellow")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("yellow")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Red")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("red")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Purple")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("purple")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Green")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("green")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Orange")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("orange")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("Black")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("black")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("White")
						|| (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : "").contains("white"))) {
			entity.getPersistentData().putString("primary", (guistate.containsKey("text:PrimaryColor") ? ((EditBox) guistate.get("text:PrimaryColor")).getValue() : ""));
			entity.getPersistentData().putString("secondary", (guistate.containsKey("text:SecondaryColor") ? ((EditBox) guistate.get("text:SecondaryColor")).getValue() : ""));
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
				entity.getPersistentData().putString("errMsg", "Colors typed incorrectly or is empty!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
	}
}
