
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.ForgeRegistries;

public class CraftkaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<MenuType<MainMenuMenu>> MAIN_MENU = REGISTRY.register("main_menu", () -> IForgeMenuType.create(MainMenuMenu::new));
	public static final RegistryObject<MenuType<BindingVowGUIMenu>> BINDING_VOW_GUI = REGISTRY.register("binding_vow_gui", () -> IForgeMenuType.create(BindingVowGUIMenu::new));
	public static final RegistryObject<MenuType<SkillTreeMainGUIMenu>> SKILL_TREE_MAIN_GUI = REGISTRY.register("skill_tree_main_gui", () -> IForgeMenuType.create(SkillTreeMainGUIMenu::new));
	public static final RegistryObject<MenuType<InventoryCurseGUIMenu>> INVENTORY_CURSE_GUI = REGISTRY.register("inventory_curse_gui", () -> IForgeMenuType.create(InventoryCurseGUIMenu::new));
	public static final RegistryObject<MenuType<SwordCreatorMenu>> SWORD_CREATOR = REGISTRY.register("sword_creator", () -> IForgeMenuType.create(SwordCreatorMenu::new));
	public static final RegistryObject<MenuType<TalismanGUIMenu>> TALISMAN_GUI = REGISTRY.register("talisman_gui", () -> IForgeMenuType.create(TalismanGUIMenu::new));
	public static final RegistryObject<MenuType<CustomCTGUIMenu>> CUSTOM_CTGUI = REGISTRY.register("custom_ctgui", () -> IForgeMenuType.create(CustomCTGUIMenu::new));
	public static final RegistryObject<MenuType<BasesGUIMenu>> BASES_GUI = REGISTRY.register("bases_gui", () -> IForgeMenuType.create(BasesGUIMenu::new));
	public static final RegistryObject<MenuType<DesignGUIMenu>> DESIGN_GUI = REGISTRY.register("design_gui", () -> IForgeMenuType.create(DesignGUIMenu::new));
	public static final RegistryObject<MenuType<TojiContractGuiMenu>> TOJI_CONTRACT_GUI = REGISTRY.register("toji_contract_gui", () -> IForgeMenuType.create(TojiContractGuiMenu::new));
	public static final RegistryObject<MenuType<TechniqueCreatorGUIMenu>> TECHNIQUE_CREATOR_GUI = REGISTRY.register("technique_creator_gui", () -> IForgeMenuType.create(TechniqueCreatorGUIMenu::new));
	public static final RegistryObject<MenuType<PrisonRealmGUIMenu>> PRISON_REALM_GUI = REGISTRY.register("prison_realm_gui", () -> IForgeMenuType.create(PrisonRealmGUIMenu::new));
}
