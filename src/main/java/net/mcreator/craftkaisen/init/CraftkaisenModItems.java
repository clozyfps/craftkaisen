
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

import net.mcreator.craftkaisen.item.YutaKatanaItem;
import net.mcreator.craftkaisen.item.WoodenBallItem;
import net.mcreator.craftkaisen.item.WoodBindsArmorItem;
import net.mcreator.craftkaisen.item.TwistItem;
import net.mcreator.craftkaisen.item.TojiArmorItem;
import net.mcreator.craftkaisen.item.Test2Item;
import net.mcreator.craftkaisen.item.TesItem;
import net.mcreator.craftkaisen.item.TalismanItem;
import net.mcreator.craftkaisen.item.SunglassesItem;
import net.mcreator.craftkaisen.item.SukunaFightingArmorItem;
import net.mcreator.craftkaisen.item.StopItem;
import net.mcreator.craftkaisen.item.SleepItem;
import net.mcreator.craftkaisen.item.RootProjectileItem;
import net.mcreator.craftkaisen.item.ReversalRedProjectileItem;
import net.mcreator.craftkaisen.item.PrisonRealmSealedItem;
import net.mcreator.craftkaisen.item.PrisonRealmArmorItem;
import net.mcreator.craftkaisen.item.PonyTailItem;
import net.mcreator.craftkaisen.item.PlayfulCloudItem;
import net.mcreator.craftkaisen.item.NanamiKnifeItem;
import net.mcreator.craftkaisen.item.NailProjectileItem;
import net.mcreator.craftkaisen.item.NailItem;
import net.mcreator.craftkaisen.item.NaginataItem;
import net.mcreator.craftkaisen.item.MiwaKatanaItem;
import net.mcreator.craftkaisen.item.MechamaruArmorItem;
import net.mcreator.craftkaisen.item.MahoragaWheelItem;
import net.mcreator.craftkaisen.item.MagmaRockProjectileItem;
import net.mcreator.craftkaisen.item.KatanaItem;
import net.mcreator.craftkaisen.item.KashimoStaffItem;
import net.mcreator.craftkaisen.item.JujutsuSorcererOutfitItem;
import net.mcreator.craftkaisen.item.InvertedSpearofHeavenItem;
import net.mcreator.craftkaisen.item.HollowPurpleItem;
import net.mcreator.craftkaisen.item.HiarItem;
import net.mcreator.craftkaisen.item.HammerItem;
import net.mcreator.craftkaisen.item.GojoUniformItem;
import net.mcreator.craftkaisen.item.GetoArmorItem;
import net.mcreator.craftkaisen.item.GetCrushedItem;
import net.mcreator.craftkaisen.item.FlowerfieldsItem;
import net.mcreator.craftkaisen.item.FireArrowProjectileItem;
import net.mcreator.craftkaisen.item.ExplodeItem;
import net.mcreator.craftkaisen.item.EsoArmorItem;
import net.mcreator.craftkaisen.item.DisasterFlameItem;
import net.mcreator.craftkaisen.item.DarkAtomItem;
import net.mcreator.craftkaisen.item.CursedWombDeathPaintingItem;
import net.mcreator.craftkaisen.item.CursedSpiritOrbItem;
import net.mcreator.craftkaisen.item.CursedFingerItem;
import net.mcreator.craftkaisen.item.CursedBudItem;
import net.mcreator.craftkaisen.item.CoughSyrupItem;
import net.mcreator.craftkaisen.item.ClapItem;
import net.mcreator.craftkaisen.item.BoltProjectileItem;
import net.mcreator.craftkaisen.item.BlindfoldItem;
import net.mcreator.craftkaisen.item.BlastAwayItem;
import net.mcreator.craftkaisen.item.BandageBlindfoldItem;
import net.mcreator.craftkaisen.item.AbilityChangerItem;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftkaisenMod.MODID);
	public static final RegistryObject<Item> FLY_HEAD_SPAWN_EGG = REGISTRY.register("fly_head_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.FLY_HEAD, -9481374, -10534831, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
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
	public static final RegistryObject<Item> MALEVOLENT_SHRINE_SPAWN_EGG = REGISTRY.register("malevolent_shrine_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.MALEVOLENT_SHRINE, -6737152, -16764058, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MAHORAGA_WHEEL_HELMET = REGISTRY.register("mahoraga_wheel_helmet", () -> new MahoragaWheelItem.Helmet());
	public static final RegistryObject<Item> SUNGLASSES_HELMET = REGISTRY.register("sunglasses_helmet", () -> new SunglassesItem.Helmet());
	public static final RegistryObject<Item> SUKUNA_FIGHTING_ARMOR_CHESTPLATE = REGISTRY.register("sukuna_fighting_armor_chestplate", () -> new SukunaFightingArmorItem.Chestplate());
	public static final RegistryObject<Item> JOGO_SPAWN_EGG = REGISTRY.register("jogo_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.JOGO, -6711040, -16777216, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSEDSPIRITRUGBYFIELD_SPAWN_EGG = REGISTRY.register("cursedspiritrugbyfield_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD, -16750951, -6750157, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> DISASTER_FLAME = REGISTRY.register("disaster_flame", () -> new DisasterFlameItem());
	public static final RegistryObject<Item> FIRE_ARROW_PROJECTILE = REGISTRY.register("fire_arrow_projectile", () -> new FireArrowProjectileItem());
	public static final RegistryObject<Item> WOODEN_BALL = REGISTRY.register("wooden_ball", () -> new WoodenBallItem());
	public static final RegistryObject<Item> CURSED_BUD = REGISTRY.register("cursed_bud", () -> new CursedBudItem());
	public static final RegistryObject<Item> FLOWERFIELDS = REGISTRY.register("flowerfields", () -> new FlowerfieldsItem());
	public static final RegistryObject<Item> CURSEDSPIRITROPPONGI_SPAWN_EGG = REGISTRY.register("cursedspiritroppongi_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSEDSPIRITROPPONGI, -16750951, -6750157, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> GOJO_UNIFORM_CHESTPLATE = REGISTRY.register("gojo_uniform_chestplate", () -> new GojoUniformItem.Chestplate());
	public static final RegistryObject<Item> GOJO_UNIFORM_LEGGINGS = REGISTRY.register("gojo_uniform_leggings", () -> new GojoUniformItem.Leggings());
	public static final RegistryObject<Item> INVENTORY_CURSE_SPAWN_EGG = REGISTRY.register("inventory_curse_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.INVENTORY_CURSE, -11390382, -12835770, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSEDSPIRITGRASSHOPPER_SPAWN_EGG = REGISTRY.register("cursedspiritgrasshopper_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSEDSPIRITGRASSHOPPER, -16737997, -52, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> HIAR_HELMET = REGISTRY.register("hiar_helmet", () -> new HiarItem.Helmet());
	public static final RegistryObject<Item> MEGUMI_FUSHIGURO_SPAWN_EGG = REGISTRY.register("megumi_fushiguro_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.MEGUMI_FUSHIGURO, -16777114, -16777216, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> UNKNOWN_MAN_SPAWN_EGG = REGISTRY.register("unknown_man_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.UNKNOWN_MAN, -16777216, -1, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> ITADORI_SPAWN_EGG = REGISTRY.register("itadori_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.ITADORI, -15788000, -25187, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> SUKUNA_SPAWN_EGG = REGISTRY.register("sukuna_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.SUKUNA, -15001051, -1597023, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> MAGMA_ROCK_PROJECTILE = REGISTRY.register("magma_rock_projectile", () -> new MagmaRockProjectileItem());
	public static final RegistryObject<Item> ESO_ARMOR_CHESTPLATE = REGISTRY.register("eso_armor_chestplate", () -> new EsoArmorItem.Chestplate());
	public static final RegistryObject<Item> ESO_ARMOR_LEGGINGS = REGISTRY.register("eso_armor_leggings", () -> new EsoArmorItem.Leggings());
	public static final RegistryObject<Item> ESO_SPAWN_EGG = REGISTRY.register("eso_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.ESO, -6790332, -14532754, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> MAHITO_SPAWN_EGG = REGISTRY.register("mahito_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.MAHITO, -3355444, -16764058, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSED_TOOL_TABLE = block(CraftkaisenModBlocks.CURSED_TOOL_TABLE, CraftkaisenModTabs.TAB_JJKITEMS);
	public static final RegistryObject<Item> TALISMAN = REGISTRY.register("talisman", () -> new TalismanItem());
	public static final RegistryObject<Item> CURSEDSPIRITMOUTH_SPAWN_EGG = REGISTRY.register("cursedspiritmouth_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSEDSPIRITMOUTH, -1, -39322, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> ULTIMATE_MECHAMARU_SPAWN_EGG = REGISTRY.register("ultimate_mechamaru_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.ULTIMATE_MECHAMARU, -15921894, -11388626, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> MECHAMARU_ARMOR_HELMET = REGISTRY.register("mechamaru_armor_helmet", () -> new MechamaruArmorItem.Helmet());
	public static final RegistryObject<Item> MECHAMARU_ARMOR_CHESTPLATE = REGISTRY.register("mechamaru_armor_chestplate", () -> new MechamaruArmorItem.Chestplate());
	public static final RegistryObject<Item> MECHAMARU_ARMOR_LEGGINGS = REGISTRY.register("mechamaru_armor_leggings", () -> new MechamaruArmorItem.Leggings());
	public static final RegistryObject<Item> PRISON_REALM_ARMOR_CHESTPLATE = REGISTRY.register("prison_realm_armor_chestplate", () -> new PrisonRealmArmorItem.Chestplate());
	public static final RegistryObject<Item> PRISON_REALM = block(CraftkaisenModBlocks.PRISON_REALM, CraftkaisenModTabs.TAB_JJKITEMS);
	public static final RegistryObject<Item> PRISON_REALM_SEALED = REGISTRY.register("prison_realm_sealed", () -> new PrisonRealmSealedItem());
	public static final RegistryObject<Item> RIKO_AMANAI_SPAWN_EGG = REGISTRY.register("riko_amanai_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.RIKO_AMANAI, -1, -1, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> BAGGED_HEAD_CURSE_USER_SPAWN_EGG = REGISTRY.register("bagged_head_curse_user_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.BAGGED_HEAD_CURSE_USER, -1, -1454728, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> BOLT_PROJECTILE = REGISTRY.register("bolt_projectile", () -> new BoltProjectileItem());
	public static final RegistryObject<Item> DOMAIN_BLOCK_ONE = block(CraftkaisenModBlocks.DOMAIN_BLOCK_ONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DOMAIN_BLOCK_TWO = block(CraftkaisenModBlocks.DOMAIN_BLOCK_TWO, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABILITY_CHANGER = REGISTRY.register("ability_changer", () -> new AbilityChangerItem());
	public static final RegistryObject<Item> WOOD_BINDS_ARMOR_CHESTPLATE = REGISTRY.register("wood_binds_armor_chestplate", () -> new WoodBindsArmorItem.Chestplate());
	public static final RegistryObject<Item> ROOT_PROJECTILE = REGISTRY.register("root_projectile", () -> new RootProjectileItem());
	public static final RegistryObject<Item> PONY_TAIL_HELMET = REGISTRY.register("pony_tail_helmet", () -> new PonyTailItem.Helmet());
	public static final RegistryObject<Item> MAKI_ZENIN_SPAWN_EGG = REGISTRY.register("maki_zenin_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.MAKI_ZENIN, -15000778, -14068422, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> NAGINATA = REGISTRY.register("naginata", () -> new NaginataItem());
	public static final RegistryObject<Item> REVERSAL_RED_PROJECTILE = REGISTRY.register("reversal_red_projectile", () -> new ReversalRedProjectileItem());
	public static final RegistryObject<Item> YUTA_OKKOTSU_SPAWN_EGG = REGISTRY.register("yuta_okkotsu_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.YUTA_OKKOTSU, -1, -16777216, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> YUTA_KATANA = REGISTRY.register("yuta_katana", () -> new YutaKatanaItem());
	public static final RegistryObject<Item> SUGURU_GETO_SPAWN_EGG = REGISTRY.register("suguru_geto_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.SUGURU_GETO, -16777216, -256, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSED_SPIRIT_ZOMBA_SPAWN_EGG = REGISTRY.register("cursed_spirit_zomba_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSED_SPIRIT_ZOMBA, -10767437, -5002371, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSED_SPIRIT_KISS_SPAWN_EGG = REGISTRY.register("cursed_spirit_kiss_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.CURSED_SPIRIT_KISS, -2910256, -13226961, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> KENJAKU_SPAWN_EGG = REGISTRY.register("kenjaku_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.KENJAKU, -13945533, -14080, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> CURSED_SPIRIT_ORB = REGISTRY.register("cursed_spirit_orb", () -> new CursedSpiritOrbItem());
	public static final RegistryObject<Item> NANAMI_KENTO_SPAWN_EGG = REGISTRY.register("nanami_kento_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.NANAMI_KENTO, -1, -2631783, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> AOI_TODO_SPAWN_EGG = REGISTRY.register("aoi_todo_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.AOI_TODO, -2636401, -15132391, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> NANAMI_KNIFE = REGISTRY.register("nanami_knife", () -> new NanamiKnifeItem());
	public static final RegistryObject<Item> GREEN_VEIL_BLOCK = block(CraftkaisenModBlocks.GREEN_VEIL_BLOCK, CraftkaisenModTabs.TAB_JJKMOBS);
	public static final RegistryObject<Item> MIWA_KATANA = REGISTRY.register("miwa_katana", () -> new MiwaKatanaItem());
	public static final RegistryObject<Item> KASUMI_MIWA_SPAWN_EGG = REGISTRY.register("kasumi_miwa_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.KASUMI_MIWA, -15921885, -16726785, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> HANAMI_SPAWN_EGG = REGISTRY.register("hanami_spawn_egg", () -> new ForgeSpawnEggItem(CraftkaisenModEntities.HANAMI, -4473973, -1, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> HAJIME_KASHIMO_SPAWN_EGG = REGISTRY.register("hajime_kashimo_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftkaisenModEntities.HAJIME_KASHIMO, -3414549, -16726785, new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS)));
	public static final RegistryObject<Item> KASHIMO_STAFF = REGISTRY.register("kashimo_staff", () -> new KashimoStaffItem());
	public static final RegistryObject<Item> DARK_ATOM = REGISTRY.register("dark_atom", () -> new DarkAtomItem());
	public static final RegistryObject<Item> NAIL = REGISTRY.register("nail", () -> new NailItem());
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> NAIL_PROJECTILE = REGISTRY.register("nail_projectile", () -> new NailProjectileItem());
	public static final RegistryObject<Item> CURSED_WOMB_DEATH_PAINTING = REGISTRY.register("cursed_womb_death_painting", () -> new CursedWombDeathPaintingItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
