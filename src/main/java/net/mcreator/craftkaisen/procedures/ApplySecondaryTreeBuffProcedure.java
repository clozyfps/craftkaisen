package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ApplySecondaryTreeBuffProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (==1) {if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,2,0, true, false));}else if (==2) {if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,2,1, true, false));}else if (==3) {if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,2,2, true, false));}if (==1) {{
Entity _ent = entity;
if(!_ent.level.isClientSide() && _ent.getServer() != null) {
_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(
CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent
), "attribute @s minecraft:generic.attack_knockback base set 1");
}
}}else if (==2) {{
Entity _ent = entity;
if(!_ent.level.isClientSide() && _ent.getServer() != null) {
_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(
CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent
), "attribute @s minecraft:generic.attack_knockback base set 2");
}
}}else if (==3) {{
Entity _ent = entity;
if(!_ent.level.isClientSide() && _ent.getServer() != null) {
_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(
CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent
), "attribute @s minecraft:generic.attack_knockback base set 2");
}
}}
}
}
