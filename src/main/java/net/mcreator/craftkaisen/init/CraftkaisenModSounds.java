
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class CraftkaisenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftkaisenMod.MODID);
	public static final RegistryObject<SoundEvent> BLOOD = REGISTRY.register("blood", () -> new SoundEvent(new ResourceLocation("craftkaisen", "blood")));
	public static final RegistryObject<SoundEvent> CLAP = REGISTRY.register("clap", () -> new SoundEvent(new ResourceLocation("craftkaisen", "clap")));
	public static final RegistryObject<SoundEvent> BONES = REGISTRY.register("bones", () -> new SoundEvent(new ResourceLocation("craftkaisen", "bones")));
	public static final RegistryObject<SoundEvent> HIT = REGISTRY.register("hit", () -> new SoundEvent(new ResourceLocation("craftkaisen", "hit")));
	public static final RegistryObject<SoundEvent> RCT_HEARTBEAT = REGISTRY.register("rct.heartbeat", () -> new SoundEvent(new ResourceLocation("craftkaisen", "rct.heartbeat")));
	public static final RegistryObject<SoundEvent> ELECTRIC = REGISTRY.register("electric", () -> new SoundEvent(new ResourceLocation("craftkaisen", "electric")));
}
