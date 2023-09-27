package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RevealBuffProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
String text
) {
if(
entity == null ||
text == null
) return ;
if (text.contains((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Technique)||text.contains(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).toUpperCase())||text.contains(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).toLowerCase())) {if (!(entity.getPersistentData().getDouble("revealTimer")>0)) {entity.getPersistentData().putDouble("revealTimer", 600);{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (.contains(entity.getDisplayName().getString())) {if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS,20,255, true, false));{
Entity _ent = entityiterator;
if(!_ent.level.isClientSide() && _ent.getServer() != null) {
_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(
CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent
), ("tellraw @s {\"text\":\""+""+entity.getDisplayName().getString()+"'s Technique Revealed\",\"bold\":true,\"color\":\"dark_red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":\""+(entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftkaisenModVariables.PlayerVariables())).Technique+"\"}}"));
}
}if (().isEmpty()) {}else{}}
}
}
}}
}
}
