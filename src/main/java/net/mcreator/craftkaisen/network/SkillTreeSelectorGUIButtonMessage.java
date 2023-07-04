
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.SkillTreeSelectorGUIMenu;
import net.mcreator.craftkaisen.procedures.OpenTechniqueSkillTreeProcedure;
import net.mcreator.craftkaisen.procedures.OpenStrengthSkillTreeProcedure;
import net.mcreator.craftkaisen.procedures.OpenDurabilitySkillTreeProcedure;
import net.mcreator.craftkaisen.procedures.OpenCursedEnergySkillTreeProcedure;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SkillTreeSelectorGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SkillTreeSelectorGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SkillTreeSelectorGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SkillTreeSelectorGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SkillTreeSelectorGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SkillTreeSelectorGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenStrengthSkillTreeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenDurabilitySkillTreeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenCursedEnergySkillTreeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenTechniqueSkillTreeProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(SkillTreeSelectorGUIButtonMessage.class, SkillTreeSelectorGUIButtonMessage::buffer, SkillTreeSelectorGUIButtonMessage::new, SkillTreeSelectorGUIButtonMessage::handler);
	}
}
