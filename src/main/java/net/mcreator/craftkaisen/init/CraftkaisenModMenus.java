
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
import net.mcreator.craftkaisen.world.inventory.StrengthSkillMenu;
import net.mcreator.craftkaisen.world.inventory.StrengthSkillAlt2Menu;
import net.mcreator.craftkaisen.world.inventory.StrengthSkillAlt1Menu;
import net.mcreator.craftkaisen.world.inventory.StrengthFinalAlt2Menu;
import net.mcreator.craftkaisen.world.inventory.StrengthFinalAlt1Menu;
import net.mcreator.craftkaisen.world.inventory.StrengthCoreMenu;
import net.mcreator.craftkaisen.world.inventory.Strength7Menu;
import net.mcreator.craftkaisen.world.inventory.Strength6Menu;
import net.mcreator.craftkaisen.world.inventory.Strength5Menu;
import net.mcreator.craftkaisen.world.inventory.Strength4Menu;
import net.mcreator.craftkaisen.world.inventory.Strength3Menu;
import net.mcreator.craftkaisen.world.inventory.Strength2Menu;
import net.mcreator.craftkaisen.world.inventory.Strength1Menu;
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
	public static final RegistryObject<MenuType<StrengthCoreMenu>> STRENGTH_CORE = REGISTRY.register("strength_core", () -> IForgeMenuType.create(StrengthCoreMenu::new));
	public static final RegistryObject<MenuType<Strength1Menu>> STRENGTH_1 = REGISTRY.register("strength_1", () -> IForgeMenuType.create(Strength1Menu::new));
	public static final RegistryObject<MenuType<Strength2Menu>> STRENGTH_2 = REGISTRY.register("strength_2", () -> IForgeMenuType.create(Strength2Menu::new));
	public static final RegistryObject<MenuType<StrengthSkillMenu>> STRENGTH_SKILL = REGISTRY.register("strength_skill", () -> IForgeMenuType.create(StrengthSkillMenu::new));
	public static final RegistryObject<MenuType<Strength3Menu>> STRENGTH_3 = REGISTRY.register("strength_3", () -> IForgeMenuType.create(Strength3Menu::new));
	public static final RegistryObject<MenuType<StrengthSkillAlt1Menu>> STRENGTH_SKILL_ALT_1 = REGISTRY.register("strength_skill_alt_1", () -> IForgeMenuType.create(StrengthSkillAlt1Menu::new));
	public static final RegistryObject<MenuType<StrengthSkillAlt2Menu>> STRENGTH_SKILL_ALT_2 = REGISTRY.register("strength_skill_alt_2", () -> IForgeMenuType.create(StrengthSkillAlt2Menu::new));
	public static final RegistryObject<MenuType<Strength4Menu>> STRENGTH_4 = REGISTRY.register("strength_4", () -> IForgeMenuType.create(Strength4Menu::new));
	public static final RegistryObject<MenuType<Strength5Menu>> STRENGTH_5 = REGISTRY.register("strength_5", () -> IForgeMenuType.create(Strength5Menu::new));
	public static final RegistryObject<MenuType<Strength6Menu>> STRENGTH_6 = REGISTRY.register("strength_6", () -> IForgeMenuType.create(Strength6Menu::new));
	public static final RegistryObject<MenuType<Strength7Menu>> STRENGTH_7 = REGISTRY.register("strength_7", () -> IForgeMenuType.create(Strength7Menu::new));
	public static final RegistryObject<MenuType<StrengthFinalAlt1Menu>> STRENGTH_FINAL_ALT_1 = REGISTRY.register("strength_final_alt_1", () -> IForgeMenuType.create(StrengthFinalAlt1Menu::new));
	public static final RegistryObject<MenuType<StrengthFinalAlt2Menu>> STRENGTH_FINAL_ALT_2 = REGISTRY.register("strength_final_alt_2", () -> IForgeMenuType.create(StrengthFinalAlt2Menu::new));
}
