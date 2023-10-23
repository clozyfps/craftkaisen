package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RatioHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getDirectEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		execute(null, world, entity, immediatesourceentity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity,
Entity immediatesourceentity
) {
if(
entity == null ||
immediatesourceentity == null
) return ;
if (((immediatesourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Ratio")) {immediatesourceentity.getPersistentData().putDouble("ratio", (Mth.nextInt(RandomSource.create(), 0, 100)));if (immediatesourceentity.getPersistentData().getDouble("ratio")<=immediatesourceentity.getPersistentData().getDouble("ratiochance")) {if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 2, 0.1, 0.1);if (world instanceof ServerLevel _level)
_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLOOD.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 5, 0.5, 2, 0.5, 0.2);if (world instanceof ServerLevel _level)
_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RATIO.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 2, 0.1, 0);if (immediatesourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Landed Critical Attack!"), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(entity.getX(),entity.getY(),entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")),
SoundSource.NEUTRAL, 1, 1, false);
}
}if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(entity.getX(),entity.getY(),entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:splatter")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:splatter")),
SoundSource.NEUTRAL, 1, 1, false);
}
}immediatesourceentity.getPersistentData().putDouble("ratiochance", 0);entity.hurt(, 5);immediatesourceentity.getPersistentData().putBoolean("aoefirst", true);entity.getPersistentData().putBoolean("aoe", true);CraftkaisenMod.queueServerWork(20, () -> {
immediatesourceentity.getPersistentData().putBoolean("aoefirst", false);
});
}else{immediatesourceentity.getPersistentData().putDouble("ratiochance", (immediatesourceentity.getPersistentData().getDouble("ratiochance")+5));}}
}
}
