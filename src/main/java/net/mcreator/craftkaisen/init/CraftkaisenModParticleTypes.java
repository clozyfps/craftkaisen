
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<SimpleParticleType> EVADE = REGISTRY.register("evade", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> IMPACT = REGISTRY.register("impact", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> REST = REGISTRY.register("rest", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LAPSE_BLUE_PARTICLE = REGISTRY.register("lapse_blue_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BLACK_ELECTRICITY = REGISTRY.register("black_electricity", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> RED_ELECTRICITY = REGISTRY.register("red_electricity", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> REVERSAL_RED_PARTICLE = REGISTRY.register("reversal_red_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FLAME_SPARK = REGISTRY.register("flame_spark", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BLOOD = REGISTRY.register("blood", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PURPLE_MIST = REGISTRY.register("purple_mist", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PURPLE_PULSE = REGISTRY.register("purple_pulse", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PURPLE_LIGHTNING = REGISTRY.register("purple_lightning", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLUE_MIST = REGISTRY.register("blue_mist", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> RED_MIST = REGISTRY.register("red_mist", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PURPLE_ELECTRICITY = REGISTRY.register("purple_electricity", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> RATIO = REGISTRY.register("ratio", () -> new SimpleParticleType(false));
}
