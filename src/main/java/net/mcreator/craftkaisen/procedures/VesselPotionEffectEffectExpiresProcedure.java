package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VesselPotionEffectEffectExpiresProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
for (Entity entityiterator : new ArrayList<>(world.players())) {
{
Entity _ent = entityiterator;
_ent.teleportTo((entityiterator.getPersistentData().getDouble("xTP")),(entityiterator.getPersistentData().getDouble("yTP")),(entityiterator.getPersistentData().getDouble("zTP")));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entityiterator.getPersistentData().getDouble("xTP")), (entityiterator.getPersistentData().getDouble("yTP")), (entityiterator.getPersistentData().getDouble("zTP")), _ent.getYRot(), _ent.getXRot());
}{
String _setval = ;
entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Technique = _setval;
capability.syncPlayerVariables(entity);
});
}if (entity instanceof ServerPlayer _player) _player.setGameMode(GameType.SURVIVAL);
}if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.VESSEL_COOLDOWN.get(),6000,0, true, false));
}
}
