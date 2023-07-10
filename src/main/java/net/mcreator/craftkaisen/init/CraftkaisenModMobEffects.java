
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.WeaponCooldownMobEffect;
import net.mcreator.craftkaisen.potion.TwistingMobEffect;
import net.mcreator.craftkaisen.potion.StoppedMobEffect;
import net.mcreator.craftkaisen.potion.SleepingMobEffect;
import net.mcreator.craftkaisen.potion.ReversalRedMobEffect;
import net.mcreator.craftkaisen.potion.ReversalRedFinalMobEffect;
import net.mcreator.craftkaisen.potion.MoveUltimateCooldownMobEffect;
import net.mcreator.craftkaisen.potion.MoveSpecialCooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move5CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move4CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move3CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move2CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move1CooldownMobEffect;
import net.mcreator.craftkaisen.potion.IrritatedThroatMobEffect;
import net.mcreator.craftkaisen.potion.InfinityMobEffect;
import net.mcreator.craftkaisen.potion.FlashStepPotionMobEffect;
import net.mcreator.craftkaisen.potion.FlashStepCooldownMobEffect;
import net.mcreator.craftkaisen.potion.DivineRepositePotionMobEffect;
import net.mcreator.craftkaisen.potion.CrushingMobEffect;
import net.mcreator.craftkaisen.potion.ChargeCEEffectMobEffect;
import net.mcreator.craftkaisen.potion.BlockingEffectMobEffect;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftkaisenMod.MODID);
	public static final RegistryObject<MobEffect> REVERSAL_RED = REGISTRY.register("reversal_red", () -> new ReversalRedMobEffect());
	public static final RegistryObject<MobEffect> BLOCKING_EFFECT = REGISTRY.register("blocking_effect", () -> new BlockingEffectMobEffect());
	public static final RegistryObject<MobEffect> REVERSAL_RED_FINAL = REGISTRY.register("reversal_red_final", () -> new ReversalRedFinalMobEffect());
	public static final RegistryObject<MobEffect> FLASH_STEP_POTION = REGISTRY.register("flash_step_potion", () -> new FlashStepPotionMobEffect());
	public static final RegistryObject<MobEffect> FLASH_STEP_COOLDOWN = REGISTRY.register("flash_step_cooldown", () -> new FlashStepCooldownMobEffect());
	public static final RegistryObject<MobEffect> INFINITY = REGISTRY.register("infinity", () -> new InfinityMobEffect());
	public static final RegistryObject<MobEffect> WEAPON_COOLDOWN = REGISTRY.register("weapon_cooldown", () -> new WeaponCooldownMobEffect());
	public static final RegistryObject<MobEffect> DIVINE_REPOSITE_POTION = REGISTRY.register("divine_reposite_potion", () -> new DivineRepositePotionMobEffect());
	public static final RegistryObject<MobEffect> MOVE_1_COOLDOWN = REGISTRY.register("move_1_cooldown", () -> new Move1CooldownMobEffect());
	public static final RegistryObject<MobEffect> MOVE_2_COOLDOWN = REGISTRY.register("move_2_cooldown", () -> new Move2CooldownMobEffect());
	public static final RegistryObject<MobEffect> MOVE_3_COOLDOWN = REGISTRY.register("move_3_cooldown", () -> new Move3CooldownMobEffect());
	public static final RegistryObject<MobEffect> MOVE_4_COOLDOWN = REGISTRY.register("move_4_cooldown", () -> new Move4CooldownMobEffect());
	public static final RegistryObject<MobEffect> MOVE_5_COOLDOWN = REGISTRY.register("move_5_cooldown", () -> new Move5CooldownMobEffect());
	public static final RegistryObject<MobEffect> MOVE_SPECIAL_COOLDOWN = REGISTRY.register("move_special_cooldown", () -> new MoveSpecialCooldownMobEffect());
	public static final RegistryObject<MobEffect> MOVE_ULTIMATE_COOLDOWN = REGISTRY.register("move_ultimate_cooldown", () -> new MoveUltimateCooldownMobEffect());
	public static final RegistryObject<MobEffect> CHARGE_CE_EFFECT = REGISTRY.register("charge_ce_effect", () -> new ChargeCEEffectMobEffect());
	public static final RegistryObject<MobEffect> TWISTING = REGISTRY.register("twisting", () -> new TwistingMobEffect());
	public static final RegistryObject<MobEffect> CRUSHING = REGISTRY.register("crushing", () -> new CrushingMobEffect());
	public static final RegistryObject<MobEffect> STOPPED = REGISTRY.register("stopped", () -> new StoppedMobEffect());
	public static final RegistryObject<MobEffect> SLEEPING = REGISTRY.register("sleeping", () -> new SleepingMobEffect());
	public static final RegistryObject<MobEffect> IRRITATED_THROAT = REGISTRY.register("irritated_throat", () -> new IrritatedThroatMobEffect());
}
