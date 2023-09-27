
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.craftkaisen.client.gui.TojiContractGuiScreen;
import net.mcreator.craftkaisen.client.gui.TechniqueCreatorGUIScreen;
import net.mcreator.craftkaisen.client.gui.TalismanGUIScreen;
import net.mcreator.craftkaisen.client.gui.SwordCreatorScreen;
import net.mcreator.craftkaisen.client.gui.SkillTreeMainGUIScreen;
import net.mcreator.craftkaisen.client.gui.MainMenuScreen;
import net.mcreator.craftkaisen.client.gui.InventoryCurseGUIScreen;
import net.mcreator.craftkaisen.client.gui.DesignGUIScreen;
import net.mcreator.craftkaisen.client.gui.CustomCTGUIScreen;
import net.mcreator.craftkaisen.client.gui.BindingVowGUIScreen;
import net.mcreator.craftkaisen.client.gui.BasesGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftkaisenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CraftkaisenModMenus.MAIN_MENU.get(), MainMenuScreen::new);
			MenuScreens.register(CraftkaisenModMenus.BINDING_VOW_GUI.get(), BindingVowGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.SKILL_TREE_MAIN_GUI.get(), SkillTreeMainGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.INVENTORY_CURSE_GUI.get(), InventoryCurseGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.SWORD_CREATOR.get(), SwordCreatorScreen::new);
			MenuScreens.register(CraftkaisenModMenus.TALISMAN_GUI.get(), TalismanGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.CUSTOM_CTGUI.get(), CustomCTGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.BASES_GUI.get(), BasesGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.DESIGN_GUI.get(), DesignGUIScreen::new);
			MenuScreens.register(CraftkaisenModMenus.TOJI_CONTRACT_GUI.get(), TojiContractGuiScreen::new);
			MenuScreens.register(CraftkaisenModMenus.TECHNIQUE_CREATOR_GUI.get(), TechniqueCreatorGUIScreen::new);
		});
	}
}
