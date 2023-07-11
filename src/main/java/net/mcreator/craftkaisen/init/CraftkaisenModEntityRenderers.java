
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftkaisen.client.renderer.TojiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.LapseBlueRenderer;
import net.mcreator.craftkaisen.client.renderer.JujutsuStudentRenderer;
import net.mcreator.craftkaisen.client.renderer.InfiniteVoiddRenderer;
import net.mcreator.craftkaisen.client.renderer.HollowPurpleEntityRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftkaisenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CraftkaisenModEntities.HOLLOW_PURPLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.HOLLOW_PURPLE_ENTITY.get(), HollowPurpleEntityRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.LAPSE_BLUE.get(), LapseBlueRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.JUJUTSU_STUDENT.get(), JujutsuStudentRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.TOJI_FUSHIGURO.get(), TojiFushiguroRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.INFINITE_VOIDD.get(), InfiniteVoiddRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.EXPLODE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.TWIST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.GET_CRUSHED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.STOP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.SLEEP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.BLAST_AWAY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.CLAP.get(), ThrownItemRenderer::new);
	}
}
