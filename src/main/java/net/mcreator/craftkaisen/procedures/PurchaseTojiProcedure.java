package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PurchaseTojiProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
HashMap guistate
) {
if(
entity == null ||
guistate == null
) return ;
if (!world.getEntitiesOfClass(TojiFushiguroEntity.class,
AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true)
.isEmpty()) {if (>=20000) {entity.getPersistentData().putBoolean("TojiBuy", true);((Entity) world.getEntitiesOfClass(TojiFushiguroEntity.class,
AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putBoolean("TargetingToji", true);{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1e+39 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if ((guistate.containsKey("text:TojiPlayerKill") ? ((EditBox) guistate.get("text:TojiPlayerKill")).getValue() : "").equals(entityiterator.getDisplayName().getString())) {entityiterator.getPersistentData().putBoolean("TojiTarget", true);if (((Entity) world.getEntitiesOfClass(TojiFushiguroEntity.class,
AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
_entity.setTarget(_ent);}
}
}
}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You are not close enough to Toji!"), false);if(entity instanceof Player _player) _player.closeContainer();}
}
}
