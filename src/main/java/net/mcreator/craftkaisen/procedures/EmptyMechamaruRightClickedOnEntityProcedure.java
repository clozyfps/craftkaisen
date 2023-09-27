package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EmptyMechamaruRightClickedOnEntityProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (().equals("Fragile")&&==true) {if(!entity.level.isClientSide()) entity.discard();sourceentity.getPersistentData().putBoolean("mech", true);if (world instanceof ServerLevel _level) {
Entity entityToSpawn = new WrappedUpEntity(CraftkaisenModEntities.WRAPPED_UP.get(), _level);
entityToSpawn.moveTo(x, y, z, 0, 0);
entityToSpawn.setYBodyRot(0);
entityToSpawn.setYHeadRot(0);
entityToSpawn.setDeltaMovement(0, 0, 0);
if (entityToSpawn instanceof Mob _mobToSpawn)
_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
world.addFreshEntity(entityToSpawn);
}
{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(3, new ItemStack(CraftkaisenModItems.MECHAMARU_ARMOR_HELMET.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(CraftkaisenModItems.MECHAMARU_ARMOR_HELMET.get()));
}
}{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(2, new ItemStack(CraftkaisenModItems.MECHAMARU_ARMOR_CHESTPLATE.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftkaisenModItems.MECHAMARU_ARMOR_CHESTPLATE.get()));
}
}{
Entity _entity = sourceentity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(1, new ItemStack(CraftkaisenModItems.MECHAMARU_ARMOR_LEGGINGS.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CraftkaisenModItems.MECHAMARU_ARMOR_LEGGINGS.get()));
}
}}
}
}
