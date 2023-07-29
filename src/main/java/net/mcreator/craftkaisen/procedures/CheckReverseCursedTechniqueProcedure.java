package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckReverseCursedTechniqueProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
double randomRCT = 0;
if (!) {if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth():-1)<=5) {randomRCT = Mth.nextInt(RandomSource.create(), 1, 100);if (!(randomRCT<95)) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You feel the heartbeat in your chest grow louder.. you have reached a new state of being."), false);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:rct.heartbeat")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:rct.heartbeat")),
SoundSource.PLAYERS, 1, 1, false);
}
}if (entity instanceof LivingEntity _entity) _entity.setHealth(20);}}}
}
}
