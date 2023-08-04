package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MasteredRCTHealingActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("rctTimer") == 0) {
			entity.getPersistentData().putDouble("rctTimer", 20);
		} else if (entity.getPersistentData().getDouble("rctTimer") > 0) {
			entity.getPersistentData().putDouble("rctTimer", (entity.getPersistentData().getDouble("rctTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("rctTimer") == 0) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy < (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergyCap) {
				if (entity.getPersistentData().getDouble("healthTick") < 10) {
					entity.getPersistentData().putDouble("healthTick", (entity.getPersistentData().getDouble("healthTick") + 1));
				} else if (entity.getPersistentData().getDouble("healthTick") == 10) {
					entity.getPersistentData().putDouble("healthTick", (entity.getPersistentData().getDouble("healthTick") + 1));
					entity.getPersistentData().putDouble("rctdamageValue", 1);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("The reverse cursed technique begins to burn.."), false);
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("overuse").bypassArmor(), (float) entity.getPersistentData().getDouble("rctdamageValue"));
				} else if (entity.getPersistentData().getDouble("healthTick") > 10) {
					entity.getPersistentData().putDouble("healthTick", (entity.getPersistentData().getDouble("healthTick") + 1));
					entity.getPersistentData().putDouble("rctdamageValue", (entity.getPersistentData().getDouble("rctdamageValue") + 1));
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("overuse").bypassArmor(), (float) entity.getPersistentData().getDouble("rctdamageValue"));
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 20, 0.6, 1.2, 0.6, 0);
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy + 25;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
