
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.craftkaisen.world.features.UnlimitedVoidStructureFeature;
import net.mcreator.craftkaisen.world.features.UnlimitedVoidReplacementFeature;
import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber
public class CraftkaisenModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CraftkaisenMod.MODID);
	public static final RegistryObject<Feature<?>> UNLIMITED_VOID_REPLACEMENT = REGISTRY.register("unlimited_void_replacement", UnlimitedVoidReplacementFeature::feature);
	public static final RegistryObject<Feature<?>> UNLIMITED_VOID_STRUCTURE = REGISTRY.register("unlimited_void_structure", UnlimitedVoidStructureFeature::feature);
}
