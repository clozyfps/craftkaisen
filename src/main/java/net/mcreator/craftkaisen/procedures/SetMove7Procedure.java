package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetMove7Procedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (.contains((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique)) {}
}
}
