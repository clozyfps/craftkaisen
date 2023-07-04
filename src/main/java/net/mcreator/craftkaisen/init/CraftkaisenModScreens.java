
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
import net.mcreator.craftkaisen.client.gui.StrengthSkillScreen;
import net.mcreator.craftkaisen.client.gui.StrengthSkillAlt2Screen;
import net.mcreator.craftkaisen.client.gui.StrengthSkillAlt1Screen;
import net.mcreator.craftkaisen.client.gui.StrengthFinalAlt2Screen;
import net.mcreator.craftkaisen.client.gui.StrengthFinalAlt1Screen;
import net.mcreator.craftkaisen.client.gui.StrengthCoreScreen;
import net.mcreator.craftkaisen.client.gui.Strength7Screen;
import net.mcreator.craftkaisen.client.gui.Strength6Screen;
import net.mcreator.craftkaisen.client.gui.Strength5Screen;
import net.mcreator.craftkaisen.client.gui.Strength4Screen;
import net.mcreator.craftkaisen.client.gui.Strength3Screen;
import net.mcreator.craftkaisen.client.gui.Strength2Screen;
import net.mcreator.craftkaisen.client.gui.Strength1Screen;
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
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_CORE.get(), StrengthCoreScreen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_1.get(), Strength1Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_2.get(), Strength2Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_SKILL.get(), StrengthSkillScreen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_3.get(), Strength3Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_SKILL_ALT_1.get(), StrengthSkillAlt1Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_SKILL_ALT_2.get(), StrengthSkillAlt2Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_4.get(), Strength4Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_5.get(), Strength5Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_6.get(), Strength6Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_7.get(), Strength7Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_FINAL_ALT_1.get(), StrengthFinalAlt1Screen::new);
			MenuScreens.register(CraftkaisenModMenus.STRENGTH_FINAL_ALT_2.get(), StrengthFinalAlt2Screen::new);
		});
	}
}
