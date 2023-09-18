
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.WeaponCooldownMobEffect;
import net.mcreator.craftkaisen.potion.VesselPotionEffectMobEffect;
import net.mcreator.craftkaisen.potion.VesselCooldownMobEffect;
import net.mcreator.craftkaisen.potion.TwistingMobEffect;
import net.mcreator.craftkaisen.potion.ToughBodyMobEffect;
import net.mcreator.craftkaisen.potion.StoppedMobEffect;
import net.mcreator.craftkaisen.potion.SleepingMobEffect;
import net.mcreator.craftkaisen.potion.SkyOfFlamesMobEffect;
import net.mcreator.craftkaisen.potion.SixeyespotionMobEffect;
import net.mcreator.craftkaisen.potion.ShrineMobEffect;
import net.mcreator.craftkaisen.potion.RootsPotionMobEffect;
import net.mcreator.craftkaisen.potion.ReversalRedMobEffect;
import net.mcreator.craftkaisen.potion.ReversalRedFinalMobEffect;
import net.mcreator.craftkaisen.potion.RCTHealingMobEffect;
import net.mcreator.craftkaisen.potion.RCTCooldownMobEffect;
import net.mcreator.craftkaisen.potion.MoveUltimateCooldownMobEffect;
import net.mcreator.craftkaisen.potion.MoveSpecialCooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move5CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move4CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move3CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move2CooldownMobEffect;
import net.mcreator.craftkaisen.potion.Move1CooldownMobEffect;
import net.mcreator.craftkaisen.potion.MasteredRCTHealingMobEffect;
import net.mcreator.craftkaisen.potion.IrritatedThroatMobEffect;
import net.mcreator.craftkaisen.potion.InfinityMobEffect;
import net.mcreator.craftkaisen.potion.FlashStepPotionMobEffect;
import net.mcreator.craftkaisen.potion.FlashStepCooldownMobEffect;
import net.mcreator.craftkaisen.potion.EmberFloorMobEffect;
import net.mcreator.craftkaisen.potion.EmberControlMobEffect;
import net.mcreator.craftkaisen.potion.DomainExpansionMobEffect;
import net.mcreator.craftkaisen.potion.DivineRepositePotionMobEffect;
import net.mcreator.craftkaisen.potion.DivergentFistMobEffect;
import net.mcreator.craftkaisen.potion.CursedSpiritMobEffect;
import net.mcreator.craftkaisen.potion.CrushingMobEffect;
import net.mcreator.craftkaisen.potion.ClapRushMobEffect;
import net.mcreator.craftkaisen.potion.ChargeCEEffectMobEffect;
import net.mcreator.craftkaisen.potion.BurntOutEffectMobEffect;
import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftkaisenMod.MODID);
	public static final RegistryObject<MobEffect> REVERSAL_RED = REGISTRY.register("reversal_red", () -> new ReversalRedMobEffect());
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
	public static final RegistryObject<MobEffect> CLAP_RUSH = REGISTRY.register("clap_rush", () -> new ClapRushMobEffect());
	public static final RegistryObject<MobEffect> TOUGH_BODY = REGISTRY.register("tough_body", () -> new ToughBodyMobEffect());
	public static final RegistryObject<MobEffect> SIXEYESPOTION = REGISTRY.register("sixeyespotion", () -> new SixeyespotionMobEffect());
	public static final RegistryObject<MobEffect> DIVERGENT_FIST = REGISTRY.register("divergent_fist", () -> new DivergentFistMobEffect());
	public static final RegistryObject<MobEffect> RCT_HEALING = REGISTRY.register("rct_healing", () -> new RCTHealingMobEffect());
	public static final RegistryObject<MobEffect> MASTERED_RCT_HEALING = REGISTRY.register("mastered_rct_healing", () -> new MasteredRCTHealingMobEffect());
	public static final RegistryObject<MobEffect> RCT_COOLDOWN = REGISTRY.register("rct_cooldown", () -> new RCTCooldownMobEffect());
	public static final RegistryObject<MobEffect> VESSEL_POTION_EFFECT = REGISTRY.register("vessel_potion_effect", () -> new VesselPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> VESSEL_COOLDOWN = REGISTRY.register("vessel_cooldown", () -> new VesselCooldownMobEffect());
	public static final RegistryObject<MobEffect> EMBER_CONTROL = REGISTRY.register("ember_control", () -> new EmberControlMobEffect());
	public static final RegistryObject<MobEffect> EMBER_FLOOR = REGISTRY.register("ember_floor", () -> new EmberFloorMobEffect());
	public static final RegistryObject<MobEffect> SHRINE = REGISTRY.register("shrine", () -> new ShrineMobEffect());
	public static final RegistryObject<MobEffect> ROOTS_POTION = REGISTRY.register("roots_potion", () -> new RootsPotionMobEffect());
	public static final RegistryObject<MobEffect> DOMAIN_EXPANSION = REGISTRY.register("domain_expansion", () -> new DomainExpansionMobEffect());
	public static final RegistryObject<MobEffect> BURNT_OUT_EFFECT = REGISTRY.register("burnt_out_effect", () -> new BurntOutEffectMobEffect());
	public static final RegistryObject<MobEffect> CURSED_SPIRIT = REGISTRY.register("cursed_spirit", () -> new CursedSpiritMobEffect());
	public static final RegistryObject<MobEffect> SKY_OF_FLAMES = REGISTRY.register("sky_of_flames", () -> new SkyOfFlamesMobEffect());
}
