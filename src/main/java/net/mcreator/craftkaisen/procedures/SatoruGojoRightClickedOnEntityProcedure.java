package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SatoruGojoRightClickedOnEntityProcedure {
public static void execute(
LevelAccessor world,
Entity sourceentity
) {
if(
sourceentity == null
) return ;
if (().equals("Jujutsu Sorcerer")) {if (!().equals("Gojo")&&==false&&!sourceentity.getPersistentData().getBoolean("gojomentor")) {if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7a Wanna become strong like me? Right click me again to confirm."), false);CraftkaisenMod.queueServerWork(2, () -> {
sourceentity.getPersistentData().putBoolean("gojomentor", true);
});
}else if (sourceentity.getPersistentData().getBoolean("gojomentor")) {if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7a Great, I see you wanna become the strongest like me."), false);sourceentity.getPersistentData().putBoolean("gojomentor", false);}else if (().equals("Gojo")) {if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7a Whats up? Pick a Option - 1. Grade Referal 2. Mission "), false);sourceentity.getPersistentData().putBoolean("mentorselect", true);CraftkaisenMod.queueServerWork(400, () -> {
sourceentity.getPersistentData().putBoolean("mentorselect", false);
});
}}
}
}
