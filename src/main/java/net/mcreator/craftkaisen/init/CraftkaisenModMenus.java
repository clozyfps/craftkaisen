
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.SkillTreeSelectorGUIMenu;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<MenuType<SkillTreeSelectorGUIMenu>> SKILL_TREE_SELECTOR_GUI = REGISTRY.register("skill_tree_selector_gui", () -> IForgeMenuType.create(SkillTreeSelectorGUIMenu::new));
}
