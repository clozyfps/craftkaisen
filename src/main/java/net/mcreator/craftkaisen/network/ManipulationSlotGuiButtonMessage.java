
package net.mcreator.craftkaisen.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ManipulationSlotGuiButtonMessage {

	private final int buttonID, x, y, z;

	public ManipulationSlotGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ManipulationSlotGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ManipulationSlotGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ManipulationSlotGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ManipulationSlotGuiMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			Slot1SelectedManipulationProcedure.execute();
		}
		if (buttonID == 1) {

			Slot2SelectedManipulationProcedure.execute();
		}
		if (buttonID == 2) {

			Slot3SelectedManipulationProcedure.execute();
		}
		if (buttonID == 3) {

			Slot4SelectedManipulationProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(ManipulationSlotGuiButtonMessage.class, ManipulationSlotGuiButtonMessage::buffer, ManipulationSlotGuiButtonMessage::new, ManipulationSlotGuiButtonMessage::handler);
	}

}
