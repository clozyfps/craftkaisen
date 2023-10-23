package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Slot2ValueProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit2).equals("Zomba")) {
			return world instanceof Level _level ? new CursedSpiritZombaEntity(CraftkaisenModEntities.CURSED_SPIRIT_ZOMBA.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit2).equals("Roppongi")) {
			return world instanceof Level _level ? new CursedspiritroppongiEntity(CraftkaisenModEntities.CURSEDSPIRITROPPONGI.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit2).equals("Rugby")) {
			return world instanceof Level _level ? new CursedspiritrugbyfieldEntity(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit2).equals("Grasshopper")) {
			return world instanceof Level _level ? new CursedspiritgrasshopperEntity(CraftkaisenModEntities.CURSEDSPIRITGRASSHOPPER.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit2).equals("Kiss")) {
			return world instanceof Level _level ? new CursedSpiritKissEntity(CraftkaisenModEntities.CURSED_SPIRIT_KISS.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit2).equals("Mouth")) {
			return world instanceof Level _level ? new CursedspiritmouthEntity(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), _level) : null;
		}
		return null;
	}
}
