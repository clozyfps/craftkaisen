package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SwitchMovesetPressedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (==2) {if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).RCT||(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).BlackFlash||(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Charging) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_pressure_plate.click_on")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_pressure_plate.click_on")),
SoundSource.NEUTRAL, 1, 1, false);
}
}entity.getPersistentData().putDouble("TechNumber2", ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch));entity.getPersistentData().putDouble("Cost2", );{
double _setval = entity.getPersistentData().getDouble("TechNumber1");
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.TechniqueSwitch = _setval;
capability.syncPlayerVariables(entity);
});
}entity.getPersistentData().putString("moveset2value", ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique));{
String _setval = entity.getPersistentData().getString("moveset1");
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SelectedTechnique = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (==1) {if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_pressure_plate.click_off")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_pressure_plate.click_off")),
SoundSource.NEUTRAL, 1, 1, false);
}
}entity.getPersistentData().putDouble("TechNumber1", ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch));entity.getPersistentData().putDouble("Cost1", );{
double _setval = entity.getPersistentData().getDouble("TechNumber2");
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.TechniqueSwitch = _setval;
capability.syncPlayerVariables(entity);
});
}entity.getPersistentData().putString("moveset1", ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique));{
String _setval = entity.getPersistentData().getString("moveset2value");
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.SelectedTechnique = _setval;
capability.syncPlayerVariables(entity);
});
}}
}
}
