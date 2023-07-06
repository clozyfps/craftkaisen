
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
}