
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.BlockingEffectMobEffect;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftkaisenMod.MODID);
	public static final RegistryObject<MobEffect> BLOCKING_EFFECT = REGISTRY.register("blocking_effect", () -> new BlockingEffectMobEffect());
}
