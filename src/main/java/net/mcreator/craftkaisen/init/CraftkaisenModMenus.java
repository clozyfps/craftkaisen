
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.SkillTreeMainGUIMenu;
import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.world.inventory.InventoryCurseGUIMenu;
import net.mcreator.craftkaisen.world.inventory.BindingVowGUIMenu;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<MenuType<MainMenuMenu>> MAIN_MENU = REGISTRY.register("main_menu", () -> IForgeMenuType.create(MainMenuMenu::new));
	public static final RegistryObject<MenuType<BindingVowGUIMenu>> BINDING_VOW_GUI = REGISTRY.register("binding_vow_gui", () -> IForgeMenuType.create(BindingVowGUIMenu::new));
	public static final RegistryObject<MenuType<SkillTreeMainGUIMenu>> SKILL_TREE_MAIN_GUI = REGISTRY.register("skill_tree_main_gui", () -> IForgeMenuType.create(SkillTreeMainGUIMenu::new));
	public static final RegistryObject<MenuType<InventoryCurseGUIMenu>> INVENTORY_CURSE_GUI = REGISTRY.register("inventory_curse_gui", () -> IForgeMenuType.create(InventoryCurseGUIMenu::new));
}
