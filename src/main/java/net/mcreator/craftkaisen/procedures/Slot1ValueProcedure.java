package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.CursedspiritrugbyfieldEntity;
import net.mcreator.craftkaisen.entity.CursedspiritroppongiEntity;
import net.mcreator.craftkaisen.entity.CursedspiritmouthEntity;
import net.mcreator.craftkaisen.entity.CursedspiritgrasshopperEntity;
import net.mcreator.craftkaisen.entity.CursedSpiritZombaEntity;
import net.mcreator.craftkaisen.entity.CursedSpiritKissEntity;

public class Slot1ValueProcedure {
	public static Entity execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return null;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit1).equals("Zomba")) {
			return world instanceof Level _level ? new CursedSpiritZombaEntity(CraftkaisenModEntities.CURSED_SPIRIT_ZOMBA.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit1).equals("Roppongi")) {
			return world instanceof Level _level ? new CursedspiritroppongiEntity(CraftkaisenModEntities.CURSEDSPIRITROPPONGI.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit1).equals("Rugby")) {
			return world instanceof Level _level ? new CursedspiritrugbyfieldEntity(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit1).equals("Grasshopper")) {
			return world instanceof Level _level ? new CursedspiritgrasshopperEntity(CraftkaisenModEntities.CURSEDSPIRITGRASSHOPPER.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit1).equals("Kiss")) {
			return world instanceof Level _level ? new CursedSpiritKissEntity(CraftkaisenModEntities.CURSED_SPIRIT_KISS.get(), _level) : null;
		} else if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).ConsumedSpirit1).equals("Mouth")) {
			return world instanceof Level _level ? new CursedspiritmouthEntity(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), _level) : null;
		}
		return null;
	}
}
