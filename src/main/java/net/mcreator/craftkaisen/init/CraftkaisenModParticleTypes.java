
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
}
