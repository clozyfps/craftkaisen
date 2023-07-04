
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.StrengthSkillTreeGUIMenu;
import net.mcreator.craftkaisen.procedures.OpenStrengthSkillProcedure;
import net.mcreator.craftkaisen.procedures.OpenStrengthSkillAlt2Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrengthSkillAlt1Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrengthFinalAlt2Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrengthFinalAlt1Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrengthCoreProcedure;
import net.mcreator.craftkaisen.procedures.OpenStrength7Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrength6Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrength5Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrength4Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrength3Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrength2Procedure;
import net.mcreator.craftkaisen.procedures.OpenStrength1Procedure;
import net.mcreator.craftkaisen.procedures.BackButtonSkillTreeProcedure;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StrengthSkillTreeGUIButtonMessage {
	private final int buttonID, x, y, z;

	public StrengthSkillTreeGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StrengthSkillTreeGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StrengthSkillTreeGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StrengthSkillTreeGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = StrengthSkillTreeGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenStrengthCoreProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenStrength1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenStrength2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenStrengthSkillProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenStrength3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenStrengthSkillAlt2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenStrengthSkillAlt1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OpenStrength4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			OpenStrength5Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			OpenStrength6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			OpenStrength7Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			OpenStrengthFinalAlt2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 12) {

			OpenStrengthFinalAlt1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			BackButtonSkillTreeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(StrengthSkillTreeGUIButtonMessage.class, StrengthSkillTreeGUIButtonMessage::buffer, StrengthSkillTreeGUIButtonMessage::new, StrengthSkillTreeGUIButtonMessage::handler);
	}
}
