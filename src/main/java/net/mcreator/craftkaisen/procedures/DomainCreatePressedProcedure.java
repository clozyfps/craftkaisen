package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DomainCreatePressedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.containsKey("checkbox:SureHitEffect") ? ((Checkbox) guistate.get("checkbox:SureHitEffect")).selected() : false) {
			entity.getPersistentData().putDouble("progressDomain", (entity.getPersistentData().getDouble("progressDomain") + 1));
		}
		if (guistate.containsKey("checkbox:RepeatedAttack") ? ((Checkbox) guistate.get("checkbox:RepeatedAttack")).selected() : false) {
			entity.getPersistentData().putDouble("progressDomain", (entity.getPersistentData().getDouble("progressDomain") + 1));
		}
		if (guistate.containsKey("checkbox:SelfEffect") ? ((Checkbox) guistate.get("checkbox:SelfEffect")).selected() : false) {
			entity.getPersistentData().putDouble("progressDomain", (entity.getPersistentData().getDouble("progressDomain") + 1));
		}
		if (!(guistate.containsKey("text:DomainName") ? ((EditBox) guistate.get("text:DomainName")).getValue() : "").isEmpty()) {
			entity.getPersistentData().putDouble("progressDomain", (entity.getPersistentData().getDouble("progressDomain") + 1));
		}
		if (!(new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) == 0 && new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(1) == 0)) {
			entity.getPersistentData().putDouble("progressDomain", (entity.getPersistentData().getDouble("progressDomain") + 1));
		}
		if (entity.getPersistentData().getDouble("progressDomain") == 3) {
			{
				double _setval = 7;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.UnlockedMoves = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = guistate.containsKey("text:DomainName") ? ((EditBox) guistate.get("text:DomainName")).getValue() : "";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move7Name = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Domain";
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Move7Type = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (guistate.containsKey("checkbox:SureHitEffect") ? ((Checkbox) guistate.get("checkbox:SureHitEffect")).selected() : false) {
			} else if (guistate.containsKey("checkbox:RepeatedAttack") ? ((Checkbox) guistate.get("checkbox:RepeatedAttack")).selected() : false) {
			} else if (guistate.containsKey("checkbox:SelfEffect") ? ((Checkbox) guistate.get("checkbox:SelfEffect")).selected() : false) {
			}
		}
	}
}
