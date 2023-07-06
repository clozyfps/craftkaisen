
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.ReversalRedMobEffect;
import net.mcreator.craftkaisen.potion.ReversalRedFinalMobEffect;
import net.mcreator.craftkaisen.potion.FlashStepPotionMobEffect;
import net.mcreator.craftkaisen.potion.FlashStepCooldownMobEffect;
import net.mcreator.craftkaisen.potion.CooldownMobEffect;
import net.mcreator.craftkaisen.potion.BlockingEffectMobEffect;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftkaisenMod.MODID);
	public static final RegistryObject<MobEffect> REVERSAL_RED = REGISTRY.register("reversal_red", () -> new ReversalRedMobEffect());
	public static final RegistryObject<MobEffect> BLOCKING_EFFECT = REGISTRY.register("blocking_effect", () -> new BlockingEffectMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> REVERSAL_RED_FINAL = REGISTRY.register("reversal_red_final", () -> new ReversalRedFinalMobEffect());
	public static final RegistryObject<MobEffect> FLASH_STEP_POTION = REGISTRY.register("flash_step_potion", () -> new FlashStepPotionMobEffect());
	public static final RegistryObject<MobEffect> FLASH_STEP_COOLDOWN = REGISTRY.register("flash_step_cooldown", () -> new FlashStepCooldownMobEffect());
}
