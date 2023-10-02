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

import net.mcreator.craftkaisen.world.inventory.DomainCreatorGUIMenu;
import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class FinishPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		entity.getPersistentData().putBoolean("showErr", false);
		if (!(entity.getPersistentData().getString("base")).isEmpty()) {
			entity.getPersistentData().putDouble("progressCT", (entity.getPersistentData().getDouble("progressCT") + 1));
		} else {
			if (!entity.getPersistentData().getBoolean("showErr")) {
				entity.getPersistentData().putString("errMsg", "No base!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
		if (!((entity.getPersistentData().getString("primary")).isEmpty() || (entity.getPersistentData().getString("secondary")).isEmpty())) {
			entity.getPersistentData().putDouble("progressCT", (entity.getPersistentData().getDouble("progressCT") + 1));
		} else {
			if (!entity.getPersistentData().getBoolean("showErr")) {
				entity.getPersistentData().putString("errMsg", "Missing color!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
		if (!(guistate.containsKey("text:CTName") ? ((EditBox) guistate.get("text:CTName")).getValue() : "").isEmpty()) {
			entity.getPersistentData().putDouble("progressCT", (entity.getPersistentData().getDouble("progressCT") + 1));
		} else {
			if (!entity.getPersistentData().getBoolean("showErr")) {
				entity.getPersistentData().putString("errMsg", "No name!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
		if (entity.getPersistentData().getDouble("progressCT") == 3) {
			{
				String _setval = entity.getPersistentData().getString("primary");
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PrimaryColor = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = entity.getPersistentData().getString("secondary");
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SecondaryColor = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = guistate.containsKey("text:CTName") ? ((EditBox) guistate.get("text:CTName")).getValue() : "";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = entity.getPersistentData().getString("base");
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Base = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("DomainCreatorGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new DomainCreatorGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
