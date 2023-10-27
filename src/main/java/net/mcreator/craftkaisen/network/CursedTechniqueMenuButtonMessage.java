
package net.mcreator.craftkaisen.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CursedTechniqueMenuButtonMessage {

	private final int buttonID, x, y, z;

	public CursedTechniqueMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CursedTechniqueMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CursedTechniqueMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CursedTechniqueMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CursedTechniqueMenuMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			UnlockButtonProcedure.execute(entity);
		}
		if (buttonID == 1) {

			SetMove1Procedure.execute(entity);
		}
		if (buttonID == 2) {

			SetMove2Procedure.execute(entity);
		}
		if (buttonID == 3) {

			SetMove3Procedure.execute(entity);
		}
		if (buttonID == 4) {

			SetMove4Procedure.execute(entity);
		}
		if (buttonID == 5) {

			SetMove5Procedure.execute(entity);
		}
		if (buttonID == 6) {

			SetMove6Procedure.execute(entity);
		}
		if (buttonID == 7) {

			SetMove7Procedure.execute(entity);
		}
		if (buttonID == 8) {

			ForwardButtonProcedure.execute(entity);
		}
		if (buttonID == 9) {

			BackwardButtonProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(CursedTechniqueMenuButtonMessage.class, CursedTechniqueMenuButtonMessage::buffer, CursedTechniqueMenuButtonMessage::new, CursedTechniqueMenuButtonMessage::handler);
	}

}
