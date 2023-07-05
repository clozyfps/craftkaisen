
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.ReversalRedMobEffect;
import net.mcreator.craftkaisen.potion.LapseBlueTemporaryMobEffect;
import net.mcreator.craftkaisen.potion.HollowPurpleTemporaryMobEffect;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftkaisenMod.MODID);
	public static final RegistryObject<MobEffect> REVERSAL_RED = REGISTRY.register("reversal_red", () -> new ReversalRedMobEffect());
	public static final RegistryObject<MobEffect> LAPSE_BLUE_TEMPORARY = REGISTRY.register("lapse_blue_temporary", () -> new LapseBlueTemporaryMobEffect());
	public static final RegistryObject<MobEffect> HOLLOW_PURPLE_TEMPORARY = REGISTRY.register("hollow_purple_temporary", () -> new HollowPurpleTemporaryMobEffect());
}
