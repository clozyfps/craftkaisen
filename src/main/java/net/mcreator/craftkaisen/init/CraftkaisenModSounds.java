
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.CraftkaisenMod;

public class CraftkaisenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftkaisenMod.MODID);
	public static final RegistryObject<SoundEvent> BLOOD = REGISTRY.register("blood", () -> new SoundEvent(new ResourceLocation("craftkaisen", "blood")));
	public static final RegistryObject<SoundEvent> CLAP = REGISTRY.register("clap", () -> new SoundEvent(new ResourceLocation("craftkaisen", "clap")));
	public static final RegistryObject<SoundEvent> BONES = REGISTRY.register("bones", () -> new SoundEvent(new ResourceLocation("craftkaisen", "bones")));
	public static final RegistryObject<SoundEvent> HIT = REGISTRY.register("hit", () -> new SoundEvent(new ResourceLocation("craftkaisen", "hit")));
	public static final RegistryObject<SoundEvent> RCT_HEARTBEAT = REGISTRY.register("rct.heartbeat", () -> new SoundEvent(new ResourceLocation("craftkaisen", "rct.heartbeat")));
	public static final RegistryObject<SoundEvent> ELECTRIC = REGISTRY.register("electric", () -> new SoundEvent(new ResourceLocation("craftkaisen", "electric")));
	public static final RegistryObject<SoundEvent> KISS = REGISTRY.register("kiss", () -> new SoundEvent(new ResourceLocation("craftkaisen", "kiss")));
	public static final RegistryObject<SoundEvent> DOMAINEXPANSION = REGISTRY.register("domainexpansion", () -> new SoundEvent(new ResourceLocation("craftkaisen", "domainexpansion")));
	public static final RegistryObject<SoundEvent> SWEEP = REGISTRY.register("sweep", () -> new SoundEvent(new ResourceLocation("craftkaisen", "sweep")));
	public static final RegistryObject<SoundEvent> SLICE = REGISTRY.register("slice", () -> new SoundEvent(new ResourceLocation("craftkaisen", "slice")));
	public static final RegistryObject<SoundEvent> SPLATTER = REGISTRY.register("splatter", () -> new SoundEvent(new ResourceLocation("craftkaisen", "splatter")));
}
