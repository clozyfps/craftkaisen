
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.SkillTreeMainGUIMenu;
import net.mcreator.craftkaisen.procedures.ClickedMainPowerProcedure;
import net.mcreator.craftkaisen.procedures.ClickedMainDefenseProcedure;
import net.mcreator.craftkaisen.procedures.ClickedMainCursedEnergyProcedure;
import net.mcreator.craftkaisen.procedures.ClickedMainAgilityProcedure;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SkillTreeMainGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SkillTreeMainGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SkillTreeMainGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SkillTreeMainGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SkillTreeMainGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SkillTreeMainGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ClickedMainDefenseProcedure.execute(entity);
		}
		if (buttonID == 1) {

			ClickedMainCursedEnergyProcedure.execute(entity);
		}
		if (buttonID == 2) {

			ClickedMainAgilityProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ClickedMainPowerProcedure.execute(entity);
		}
		if (buttonID == 4) {

			ClickedMainDefenseProcedure.execute(entity);
		}
		if (buttonID == 5) {

			ClickedMainDefenseProcedure.execute(entity);
		}
		if (buttonID == 6) {

			ClickedMainDefenseProcedure.execute(entity);
		}
		if (buttonID == 7) {

			ClickedMainDefenseProcedure.execute(entity);
		}
		if (buttonID == 8) {

			ClickedMainCursedEnergyProcedure.execute(entity);
		}
		if (buttonID == 9) {

			ClickedMainCursedEnergyProcedure.execute(entity);
		}
		if (buttonID == 10) {

			ClickedMainCursedEnergyProcedure.execute(entity);
		}
		if (buttonID == 11) {

			ClickedMainCursedEnergyProcedure.execute(entity);
		}
		if (buttonID == 12) {

			ClickedMainPowerProcedure.execute(entity);
		}
		if (buttonID == 13) {

			ClickedMainPowerProcedure.execute(entity);
		}
		if (buttonID == 14) {

			ClickedMainPowerProcedure.execute(entity);
		}
		if (buttonID == 15) {

			ClickedMainPowerProcedure.execute(entity);
		}
		if (buttonID == 16) {

			ClickedMainAgilityProcedure.execute(entity);
		}
		if (buttonID == 17) {

			ClickedMainAgilityProcedure.execute(entity);
		}
		if (buttonID == 18) {

			ClickedMainAgilityProcedure.execute(entity);
		}
		if (buttonID == 19) {

			ClickedMainAgilityProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(SkillTreeMainGUIButtonMessage.class, SkillTreeMainGUIButtonMessage::buffer, SkillTreeMainGUIButtonMessage::new, SkillTreeMainGUIButtonMessage::handler);
	}
}
