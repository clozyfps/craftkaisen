
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.craftkaisen.item.TwistItem;
import net.mcreator.craftkaisen.item.TojiArmorItem;
import net.mcreator.craftkaisen.item.Test2Item;
import net.mcreator.craftkaisen.item.TesItem;
import net.mcreator.craftkaisen.item.SunglassesItem;
import net.mcreator.craftkaisen.item.SukunaFightingArmorItem;
import net.mcreator.craftkaisen.item.StopItem;
import net.mcreator.craftkaisen.item.SleepItem;
import net.mcreator.craftkaisen.item.PlayfulCloudItem;
import net.mcreator.craftkaisen.item.MahoragaWheelItem;
import net.mcreator.craftkaisen.item.JujutsuSorcererOutfitItem;
import net.mcreator.craftkaisen.item.InvertedSpearofHeavenItem;
import net.mcreator.craftkaisen.item.HollowPurpleItem;
import net.mcreator.craftkaisen.item.GetoArmorItem;
import net.mcreator.craftkaisen.item.GetCrushedItem;
import net.mcreator.craftkaisen.item.ExplodeItem;
import net.mcreator.craftkaisen.item.DisasterFlameItem;
import net.mcreator.craftkaisen.item.CursedFingerItem;
import net.mcreator.craftkaisen.item.CoughSyrupItem;
import net.mcreator.craftkaisen.item.ClapItem;
import net.mcreator.craftkaisen.item.BlindfoldItem;
import net.mcreator.craftkaisen.item.BlastAwayItem;
import net.mcreator.craftkaisen.item.BandageBlindfoldItem;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftkaisenMod.MODID);
	public static final RegistryObject<Item> FLY_HEAD_SPAWN_EGG = REGISTRY.register("fly_head_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.FLY_HEAD, -9481374, -10534831, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HOLLOW_PURPLE = REGISTRY.register("hollow_purple", () -> new HollowPurpleItem());
	public static final RegistryObject<Item> TES = REGISTRY.register("tes", () -> new TesItem());
	public static final RegistryObject<Item> TEST_2 = REGISTRY.register("test_2", () -> new Test2Item());
	public static final RegistryObject<Item> JUJUTSU_STUDENT_SPAWN_EGG = REGISTRY.register("jujutsu_student_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.JUJUTSU_STUDENT, -16382442, -3368704, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> JUJUTSU_SORCERER_OUTFIT_CHESTPLATE = REGISTRY.register("jujutsu_sorcerer_outfit_chestplate", () -> new JujutsuSorcererOutfitItem.Chestplate());
	public static final RegistryObject<Item> JUJUTSU_SORCERER_OUTFIT_LEGGINGS = REGISTRY.register("jujutsu_sorcerer_outfit_leggings", () -> new JujutsuSorcererOutfitItem.Leggings());
	public static final RegistryObject<Item> PLAYFUL_CLOUD = REGISTRY.register("playful_cloud", () -> new PlayfulCloudItem());
	public static final RegistryObject<Item> INVERTED_SPEAROF_HEAVEN = REGISTRY.register("inverted_spearof_heaven", () -> new InvertedSpearofHeavenItem());
	public static final RegistryObject<Item> VEIL_MAIN_BLOCK = block(CraftkaisenModBlocks.VEIL_MAIN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOJI_FUSHIGURO_SPAWN_EGG = REGISTRY.register("toji_fushiguro_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.TOJI_FUSHIGURO, -14934998, -9080194, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> UNLIMITED_VOID = block(CraftkaisenModBlocks.UNLIMITED_VOID, null);
	public static final RegistryObject<Item> BLINDFOLD_HELMET = REGISTRY.register("blindfold_helmet", () -> new BlindfoldItem.Helmet());
	public static final RegistryObject<Item> EXPLODE = REGISTRY.register("explode", () -> new ExplodeItem());
	public static final RegistryObject<Item> TWIST = REGISTRY.register("twist", () -> new TwistItem());
	public static final RegistryObject<Item> GET_CRUSHED = REGISTRY.register("get_crushed", () -> new GetCrushedItem());
	public static final RegistryObject<Item> STOP = REGISTRY.register("stop", () -> new StopItem());
	public static final RegistryObject<Item> SLEEP = REGISTRY.register("sleep", () -> new SleepItem());
	public static final RegistryObject<Item> BLAST_AWAY = REGISTRY.register("blast_away", () -> new BlastAwayItem());
	public static final RegistryObject<Item> COUGH_SYRUP = REGISTRY.register("cough_syrup", () -> new CoughSyrupItem());
	public static final RegistryObject<Item> CLAP = REGISTRY.register("clap", () -> new ClapItem());
	public static final RegistryObject<Item> SATORU_GOJO_SPAWN_EGG = REGISTRY.register("satoru_gojo_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.SATORU_GOJO, -16514026, -2100742, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSED_FINGER = REGISTRY.register("cursed_finger", () -> new CursedFingerItem());
	public static final RegistryObject<Item> QUEST_BOARD = block(CraftkaisenModBlocks.QUEST_BOARD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GETO_ARMOR_CHESTPLATE = REGISTRY.register("geto_armor_chestplate", () -> new GetoArmorItem.Chestplate());
	public static final RegistryObject<Item> GETO_ARMOR_LEGGINGS = REGISTRY.register("geto_armor_leggings", () -> new GetoArmorItem.Leggings());
	public static final RegistryObject<Item> GETO_ARMOR_BOOTS = REGISTRY.register("geto_armor_boots", () -> new GetoArmorItem.Boots());
	public static final RegistryObject<Item> FINGER_BEARER_SPAWN_EGG = REGISTRY.register("finger_bearer_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.FINGER_BEARER, -1642770, -14936291, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> BANDAGE_BLINDFOLD_HELMET = REGISTRY.register("bandage_blindfold_helmet", () -> new BandageBlindfoldItem.Helmet());
	public static final RegistryObject<Item> TOJI_ARMOR_CHESTPLATE = REGISTRY.register("toji_armor_chestplate", () -> new TojiArmorItem.Chestplate());
	public static final RegistryObject<Item> TOJI_ARMOR_LEGGINGS = REGISTRY.register("toji_armor_leggings", () -> new TojiArmorItem.Leggings());
	public static final RegistryObject<Item> MALEVOLENT_SHRINE_SPAWN_EGG = REGISTRY.register("malevolent_shrine_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.MALEVOLENT_SHRINE, -6737152, -16764058, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MAHORAGA_WHEEL_HELMET = REGISTRY.register("mahoraga_wheel_helmet", () -> new MahoragaWheelItem.Helmet());
	public static final RegistryObject<Item> SUNGLASSES_HELMET = REGISTRY.register("sunglasses_helmet", () -> new SunglassesItem.Helmet());
	public static final RegistryObject<Item> SUKUNA_FIGHTING_ARMOR_CHESTPLATE = REGISTRY.register("sukuna_fighting_armor_chestplate", () -> new SukunaFightingArmorItem.Chestplate());
	public static final RegistryObject<Item> JOGO_SPAWN_EGG = REGISTRY.register("jogo_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.JOGO, -6711040, -16777216, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSEDSPIRITRUGBYFIELD_SPAWN_EGG = REGISTRY.register("cursedspiritrugbyfield_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD, -16750951, -6750157, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> DISASTER_FLAME = REGISTRY.register("disaster_flame", () -> new DisasterFlameItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
