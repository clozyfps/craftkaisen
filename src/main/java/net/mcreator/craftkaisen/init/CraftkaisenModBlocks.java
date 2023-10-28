
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftkaisen.block.VeilMainBlockBlock;
import net.mcreator.craftkaisen.block.UnlimitedVoidBlock;
import net.mcreator.craftkaisen.block.QuestBoardBlock;
import net.mcreator.craftkaisen.block.PrisonRealmBlock;
import net.mcreator.craftkaisen.block.GreenVeilBlockBlock;
import net.mcreator.craftkaisen.block.DomainBlockTwoBlock;
import net.mcreator.craftkaisen.block.DomainBlockOneBlock;
import net.mcreator.craftkaisen.block.CursedToolTableBlock;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftkaisenMod.MODID);
	public static final RegistryObject<Block> VEIL_MAIN_BLOCK = REGISTRY.register("veil_main_block", () -> new VeilMainBlockBlock());
	public static final RegistryObject<Block> UNLIMITED_VOID = REGISTRY.register("unlimited_void", () -> new UnlimitedVoidBlock());
	public static final RegistryObject<Block> QUEST_BOARD = REGISTRY.register("quest_board", () -> new QuestBoardBlock());
	public static final RegistryObject<Block> CURSED_TOOL_TABLE = REGISTRY.register("cursed_tool_table", () -> new CursedToolTableBlock());
	public static final RegistryObject<Block> PRISON_REALM = REGISTRY.register("prison_realm", () -> new PrisonRealmBlock());
	public static final RegistryObject<Block> DOMAIN_BLOCK_ONE = REGISTRY.register("domain_block_one", () -> new DomainBlockOneBlock());
	public static final RegistryObject<Block> DOMAIN_BLOCK_TWO = REGISTRY.register("domain_block_two", () -> new DomainBlockTwoBlock());
	public static final RegistryObject<Block> GREEN_VEIL_BLOCK = REGISTRY.register("green_veil_block", () -> new GreenVeilBlockBlock());
}
