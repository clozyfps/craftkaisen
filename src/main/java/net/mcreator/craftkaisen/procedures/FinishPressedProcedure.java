package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
				String _setval = guistate.containsKey("text:CTName") ? ((EditBox) guistate.get("text:CTName")).getValue() : "";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("TechniqueCreatorGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TechniqueCreatorGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
