package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ClickedMainCursedEnergyProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (==0) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints>=1) {{
double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints-1;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SkillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (==1) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints>=1) {{
double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints-1;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SkillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (==2) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints>=2) {{
double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints-2;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SkillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (==3) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints>=2&&new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()<=3) {{
double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints-2;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SkillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (==4) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints>=3&&new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()<=3) {{
double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints-3;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SkillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}
}
}
