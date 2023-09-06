
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
import net.mcreator.craftkaisen.client.renderer.SatoruGojoRenderer;
import net.mcreator.craftkaisen.client.renderer.MaximumMeteorRenderer;
import net.mcreator.craftkaisen.client.renderer.MalevolentShrineRenderer;
import net.mcreator.craftkaisen.client.renderer.LapseBlueRenderer;
import net.mcreator.craftkaisen.client.renderer.JujutsuStudentRenderer;
import net.mcreator.craftkaisen.client.renderer.JogoRenderer;
import net.mcreator.craftkaisen.client.renderer.InfiniteVoiddRenderer;
import net.mcreator.craftkaisen.client.renderer.HollowPurpleEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.FlyHeadRenderer;
import net.mcreator.craftkaisen.client.renderer.FingerBearerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftkaisenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CraftkaisenModEntities.FLY_HEAD.get(), FlyHeadRenderer::new);
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
		event.registerEntityRenderer(CraftkaisenModEntities.SATORU_GOJO.get(), SatoruGojoRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.FINGER_BEARER.get(), FingerBearerRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MALEVOLENT_SHRINE.get(), MalevolentShrineRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.JOGO.get(), JogoRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.DISASTER_FLAME.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAXIMUM_METEOR.get(), MaximumMeteorRenderer::new);
	}
}
