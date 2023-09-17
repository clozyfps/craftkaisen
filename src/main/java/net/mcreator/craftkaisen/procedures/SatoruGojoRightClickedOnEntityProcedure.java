package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class SatoruGojoRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (((sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Faction).equals("Jujutsu Sorcerer")) {
			if (!((sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mentor).equals("Gojo")
					&& (sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).HasMentor == false && !sourceentity.getPersistentData().getBoolean("gojomentor")) {
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7a Wanna become strong like me? Right click me again to confirm."), false);
				CraftkaisenMod.queueServerWork(2, () -> {
					sourceentity.getPersistentData().putBoolean("gojomentor", true);
				});
			} else if (sourceentity.getPersistentData().getBoolean("gojomentor")) {
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7a Great, I see you wanna become the strongest like me."), false);
				sourceentity.getPersistentData().putBoolean("gojomentor", false);
				{
					String _setval = "Gojo";
					sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Mentor = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					boolean _setval = true;
					sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HasMentor = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else if (((sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Mentor).equals("Gojo")) {
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7a Whats up? Pick a Option - 1. Grade Referral 2. Mission "), false);
				sourceentity.getPersistentData().putBoolean("mentorselect", true);
				CraftkaisenMod.queueServerWork(400, () -> {
					sourceentity.getPersistentData().putBoolean("mentorselect", false);
				});
			}
		}
	}
}
