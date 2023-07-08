package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class UseTechniqueOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Limitless")) {
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Lapse Blue")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 55, 1, false, false));
					LapseBlueProcedureProcedure.execute(world, entity);
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Reversal Red")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					ReversalRedProcedureProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 60, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Hollow Purple")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					HollowPurpleProcedureProcedure.execute(entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 90, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Infinite Combo")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					InfiniteComboProcedureProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 35, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Strong Hit")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					StrongHitProcedureProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 35, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Infinity")) {
				InfinityProcedureProcedure.execute(entity);
			}
		}
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Restricted")) {
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Playful Cloud")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.WEAPON_COOLDOWN.get()) : false)) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.WEAPON_COOLDOWN.get(), 1450, 1, false, false));
					PlayfulCloudProcedureProcedure.execute(world, entity);
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Inverted Spear Of Heaven")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.WEAPON_COOLDOWN.get()) : false)) {
					InvertedSpearOfHeavenProcedureProcedure.execute(world, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.WEAPON_COOLDOWN.get(), 1450, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Sacred Lunge")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					SacredLungeProcedureProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 50, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Heavenly Barrage")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					InfiniteComboProcedureProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 35, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Divine Riposite")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.COOLDOWN.get()) : false)) {
					StrongHitProcedureProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.COOLDOWN.get(), 35, 1, false, false));
				}
			}
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Repeated God Slashes")) {
				InfinityProcedureProcedure.execute(entity);
			}
		}
	}
}
