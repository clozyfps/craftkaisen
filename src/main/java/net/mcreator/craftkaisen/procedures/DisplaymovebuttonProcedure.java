package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplaymovebuttonProcedure {
public static boolean execute(
Entity entity
) {
if(
entity == null
) return false;
return
!.contains((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique);
}
}
