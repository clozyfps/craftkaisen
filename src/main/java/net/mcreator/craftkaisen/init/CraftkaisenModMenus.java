
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.TechniqueSkillTreeMenu;
import net.mcreator.craftkaisen.world.inventory.StrengthSkillTreeGUIMenu;
import net.mcreator.craftkaisen.world.inventory.SkillTreeSelectorGUIMenu;
import net.mcreator.craftkaisen.world.inventory.DurabilitySkillTreeMenu;
import net.mcreator.craftkaisen.world.inventory.CursedEnergySkillTreeMenu;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<MenuType<StrengthSkillTreeGUIMenu>> STRENGTH_SKILL_TREE_GUI = REGISTRY.register("strength_skill_tree_gui", () -> IForgeMenuType.create(StrengthSkillTreeGUIMenu::new));
	public static final RegistryObject<MenuType<SkillTreeSelectorGUIMenu>> SKILL_TREE_SELECTOR_GUI = REGISTRY.register("skill_tree_selector_gui", () -> IForgeMenuType.create(SkillTreeSelectorGUIMenu::new));
	public static final RegistryObject<MenuType<DurabilitySkillTreeMenu>> DURABILITY_SKILL_TREE = REGISTRY.register("durability_skill_tree", () -> IForgeMenuType.create(DurabilitySkillTreeMenu::new));
	public static final RegistryObject<MenuType<CursedEnergySkillTreeMenu>> CURSED_ENERGY_SKILL_TREE = REGISTRY.register("cursed_energy_skill_tree", () -> IForgeMenuType.create(CursedEnergySkillTreeMenu::new));
	public static final RegistryObject<MenuType<TechniqueSkillTreeMenu>> TECHNIQUE_SKILL_TREE = REGISTRY.register("technique_skill_tree", () -> IForgeMenuType.create(TechniqueSkillTreeMenu::new));
}
