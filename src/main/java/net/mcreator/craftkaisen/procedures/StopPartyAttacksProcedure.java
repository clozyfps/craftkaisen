package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StopPartyAttacksProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity immediatesourceentity, Entity sourceentity) {
		execute(null, immediatesourceentity, sourceentity);
	}

private static void execute(
@Nullable Event event,
Entity immediatesourceentity,
Entity sourceentity
) {
if(
immediatesourceentity == null ||
sourceentity == null
) return ;
if ((().equals()||().equals()||(sourceentity.getPersistentData().getString("partyLeaderUser")).equals()||(immediatesourceentity.getPersistentData().getString("partyLeaderUser")).equals())&&(sourceentity instanceof Player||sourceentity instanceof ServerPlayer||immediatesourceentity instanceof Player||immediatesourceentity instanceof ServerPlayer)) {if(event != null && event.isCancelable()) {
event.setCanceled(true);
}}
}
}
