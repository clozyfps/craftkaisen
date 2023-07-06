
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.craftkaisen.item.Test2Item;
import net.mcreator.craftkaisen.item.TesItem;
import net.mcreator.craftkaisen.item.JujutsuSorcererOutfitItem;
import net.mcreator.craftkaisen.item.HollowPurpleItem;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftkaisenMod.MODID);
	public static final RegistryObject<Item> HOLLOW_PURPLE = REGISTRY.register("hollow_purple", () -> new HollowPurpleItem());
	public static final RegistryObject<Item> TES = REGISTRY.register("tes", () -> new TesItem());
	public static final RegistryObject<Item> TEST_2 = REGISTRY.register("test_2", () -> new Test2Item());
	public static final RegistryObject<Item> JUJUTSU_STUDENT_SPAWN_EGG = REGISTRY.register("jujutsu_student_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.JUJUTSU_STUDENT, -16382442, -3368704, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> JUJUTSU_SORCERER_OUTFIT_CHESTPLATE = REGISTRY.register("jujutsu_sorcerer_outfit_chestplate", () -> new JujutsuSorcererOutfitItem.Chestplate());
	public static final RegistryObject<Item> JUJUTSU_SORCERER_OUTFIT_LEGGINGS = REGISTRY.register("jujutsu_sorcerer_outfit_leggings", () -> new JujutsuSorcererOutfitItem.Leggings());
}
