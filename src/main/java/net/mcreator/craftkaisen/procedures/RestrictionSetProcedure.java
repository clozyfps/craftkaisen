package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RestrictionSetProcedure {
public static void execute(
Entity entity,
HashMap cmdparams
) {
if(
entity == null ||
cmdparams == null
) return ;
if (==true) {if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Fragile")||(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("fragile")) {}else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Physically Gifted")||(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Physically Gifted")) {}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You arent restricted"), true);}
}
}
