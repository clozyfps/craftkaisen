package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Slot3SelectedManipulationProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
{
String _setval = ;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.ConsumedSpirit3 = _setval;
capability.syncPlayerVariables(entity);
});
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((+" Added to the third slot.")), true);if(entity instanceof Player _player) _player.closeContainer();CraftkaisenMod.queueServerWork(1, () -> {
});
}
}
