
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.craftkaisen.client.gui.TechniqueSkillTreeScreen;
import net.mcreator.craftkaisen.client.gui.StrengthSkillTreeGUIScreen;
import net.mcreator.craftkaisen.client.gui.SkillTreeSelectorGUIScreen;
import net.mcreator.craftkaisen.client.gui.DurabilitySkillTreeScreen;
import net.mcreator.craftkaisen.client.gui.CursedEnergySkillTreeScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftkaisenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_SKILL_TREE_GUI.get(), StrengthSkillTreeGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.SKILL_TREE_SELECTOR_GUI.get(), SkillTreeSelectorGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.DURABILITY_SKILL_TREE.get(), DurabilitySkillTreeScreen::new);
			MenuScreens.register(CraftkaisenModMenus.CURSED_ENERGY_SKILL_TREE.get(), CursedEnergySkillTreeScreen::new);
			MenuScreens.register(CraftkaisenModMenus.TECHNIQUE_SKILL_TREE.get(), TechniqueSkillTreeScreen::new);
		});
	}
}
