
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.SkillTreeMenuMenu;
import net.mcreator.craftkaisen.world.inventory.QuestMenuMenu;
import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.world.inventory.BindingVowGUIMenu;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<MenuType<SkillTreeMenuMenu>> SKILL_TREE_MENU = REGISTRY.register("skill_tree_menu", () -> IForgeMenuType.create(SkillTreeMenuMenu::new));
	public static final RegistryObject<MenuType<MainMenuMenu>> MAIN_MENU = REGISTRY.register("main_menu", () -> IForgeMenuType.create(MainMenuMenu::new));
	public static final RegistryObject<MenuType<QuestMenuMenu>> QUEST_MENU = REGISTRY.register("quest_menu", () -> IForgeMenuType.create(QuestMenuMenu::new));
	public static final RegistryObject<MenuType<BindingVowGUIMenu>> BINDING_VOW_GUI = REGISTRY.register("binding_vow_gui", () -> IForgeMenuType.create(BindingVowGUIMenu::new));
}
