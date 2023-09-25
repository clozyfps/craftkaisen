
package net.mcreator.craftkaisen.network;

import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChantMessage {

	int type, pressedms;

	public ChantMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ChantMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ChantMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ChantMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(ChantMessage.class, ChantMessage::buffer, ChantMessage::new, ChantMessage::handler);
	}

}
