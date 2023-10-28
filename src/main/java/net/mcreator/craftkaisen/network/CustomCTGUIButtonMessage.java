
package net.mcreator.craftkaisen.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomCTGUIButtonMessage {

	private final int buttonID, x, y, z;

	public CustomCTGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CustomCTGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CustomCTGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CustomCTGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CustomCTGUIMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			FinishPressedProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 1) {

			OpenBasesGUIProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 2) {

			OpenDesignGUIProcedure.execute(world, x, y, z, entity, guistate);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(CustomCTGUIButtonMessage.class, CustomCTGUIButtonMessage::buffer, CustomCTGUIButtonMessage::new, CustomCTGUIButtonMessage::handler);
	}

}
