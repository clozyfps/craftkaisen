package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

public class DisplaySelectedTechniqueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).isEmpty()
				|| ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).equals("Moveset2")) {
			v = "Cursed Technique : " + "Not Selected";
		} else if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique).isEmpty()) {
			if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Restricted")) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_1_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 1) {
					v = "\u00A74Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_2_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 2) {
					v = "\u00A74" + "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_3_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 3) {
					v = "\u00A74" + "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_4_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 4) {
					v = "\u00A74" + "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_5_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 5) {
					v = "\u00A74" + "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_SPECIAL_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 6) {
					v = "\u00A74" + "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_ULTIMATE_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 7) {
					v = "\u00A74" + "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "Cursed Technique : " + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
			} else {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_1_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 1) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_2_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 2) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_3_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 3) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_4_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 4) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_5_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 5) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_SPECIAL_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 6) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.MOVE_ULTIMATE_COOLDOWN.get()) : false)
						&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).TechniqueSwitch == 7) {
					v = "\u00A74" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				} else {
					v = "" + (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SelectedTechnique;
				}
			}
		}
		return v;
	}
}
