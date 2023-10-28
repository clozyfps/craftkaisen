package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Ab5pressedProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (entity.getPersistentData().getDouble("chargeTime")==0) {entity.getPersistentData().putString("currentMove", );entity.getPersistentData().putBoolean("hold", true);}
}
}
