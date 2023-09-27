package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BasesConfirmProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		entity.getPersistentData().putBoolean("showErr", false);
		if ((guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Spaitial")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("spaitial")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Transfiguration")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("transfiguration")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Corruption")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("corruption")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Flame")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("flame")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Plant")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("plant")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Swap")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("swap")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Jackpot")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("jackpot")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("String")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("string")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("Marker")
				|| (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : "").contains("marker")) {
			entity.getPersistentData().putString("base", (guistate.containsKey("text:ChoiceBox") ? ((EditBox) guistate.get("text:ChoiceBox")).getValue() : ""));
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
		} else {
			if (!entity.getPersistentData().getBoolean("showErr")) {
				entity.getPersistentData().putString("errMsg", "Base typed incorrectly or is empty!");
				entity.getPersistentData().putBoolean("showErr", true);
			}
		}
	}
}
