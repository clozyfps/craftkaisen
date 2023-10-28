package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UnlockButtonProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (!.contains((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique)) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints>=(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Cost) {{
double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints-(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Cost;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SkillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}
}
}
