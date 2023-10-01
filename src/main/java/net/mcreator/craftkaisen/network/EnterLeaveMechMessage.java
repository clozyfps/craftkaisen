
package net.mcreator.craftkaisen.network;

import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnterLeaveMechMessage {

	int type, pressedms;

	public EnterLeaveMechMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public EnterLeaveMechMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(EnterLeaveMechMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(EnterLeaveMechMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			LeaveMechOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(EnterLeaveMechMessage.class, EnterLeaveMechMessage::buffer, EnterLeaveMechMessage::new, EnterLeaveMechMessage::handler);
	}

}
