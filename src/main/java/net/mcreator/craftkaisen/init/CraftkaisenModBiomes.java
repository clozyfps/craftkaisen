
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.craftkaisen.world.biome.PrisonRealmBiomeBiome;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, CraftkaisenMod.MODID);
	public static final RegistryObject<Biome> PRISON_REALM_BIOME = REGISTRY.register("prison_realm_biome", PrisonRealmBiomeBiome::createBiome);
}
