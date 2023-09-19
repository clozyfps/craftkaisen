package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class TransfigurationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Big Fist")) {
			if (!entity.getPersistentData().getBoolean("prohibitUse") && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_2_COOLDOWN.get()) : false)
					&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy >= (entity
							.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Cost) {
				BigFistProcedureProcedure.execute(world, x, y, z, entity);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.MOVE_2_COOLDOWN.get(), 180, 1, false, false));
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy
							- (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Cost;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Repeating Slices")) {
			if (!entity.getPersistentData().getBoolean("prohibitUse") && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_3_COOLDOWN.get()) : false)
					&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy >= (entity
							.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Cost) {
				RepeatingSlicesProcedureProcedure.execute(entity);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.MOVE_3_COOLDOWN.get(), 180, 1, false, false));
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy
							- (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Cost;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Cable Whipping")) {
			if (!entity.getPersistentData().getBoolean("prohibitUse") && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_SPECIAL_COOLDOWN.get()) : false)
					&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy >= (entity
							.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).MoveSpecialCost) {
				ShrineProcedureProcedure.execute(world, x, y, z, entity);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.MOVE_SPECIAL_COOLDOWN.get(), 1500, 1, false, false));
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy
							- (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).MoveSpecialCost;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Self Embodiment of Perfection")) {
			if (!entity.getPersistentData().getBoolean("prohibitUse") && !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_ULTIMATE_COOLDOWN.get()) : false)
					&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy >= (entity
							.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).MoveUltimateCost) {
				ShrineProcedureProcedure.execute(world, x, y, z, entity);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.MOVE_ULTIMATE_COOLDOWN.get(), 1500, 1, false, false));
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy
							- (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).MoveUltimateCost;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
