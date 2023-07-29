
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
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftkaisenMod.MODID);
	public static final RegistryObject<Block> VEIL_MAIN_BLOCK = REGISTRY.register("veil_main_block", () -> new VeilMainBlockBlock());
	public static final RegistryObject<Block> QUEST_BOARD = REGISTRY.register("quest_board", () -> new QuestBoardBlock());
	public static final RegistryObject<Block> UNLIMITED_VOID = REGISTRY.register("unlimited_void", () -> new UnlimitedVoidBlock());
}
