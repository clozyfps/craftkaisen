
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftkaisen.client.renderer.WrappedUpRenderer;
import net.mcreator.craftkaisen.client.renderer.UnknownManRenderer;
import net.mcreator.craftkaisen.client.renderer.UltimateMechamaruRenderer;
import net.mcreator.craftkaisen.client.renderer.TojiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.SukunaRenderer;
import net.mcreator.craftkaisen.client.renderer.SatoruGojoRenderer;
import net.mcreator.craftkaisen.client.renderer.RikoAmanaiRenderer;
import net.mcreator.craftkaisen.client.renderer.ReversalRedEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.PrisonRealmMobRenderer;
import net.mcreator.craftkaisen.client.renderer.MegumiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.MaximumMeteorRenderer;
import net.mcreator.craftkaisen.client.renderer.MalevolentShrineRenderer;
import net.mcreator.craftkaisen.client.renderer.MakiZeninRenderer;
import net.mcreator.craftkaisen.client.renderer.MahitoSpikeRenderer;
import net.mcreator.craftkaisen.client.renderer.MahitoRenderer;
import net.mcreator.craftkaisen.client.renderer.MagmaRockRenderer;
import net.mcreator.craftkaisen.client.renderer.MagmaRockProjectileRenderer;
import net.mcreator.craftkaisen.client.renderer.LapseBlueRenderer;
import net.mcreator.craftkaisen.client.renderer.JujutsuStudentRenderer;
import net.mcreator.craftkaisen.client.renderer.JogoRenderer;
import net.mcreator.craftkaisen.client.renderer.ItadoriRenderer;
import net.mcreator.craftkaisen.client.renderer.InventoryCurseRenderer;
import net.mcreator.craftkaisen.client.renderer.InfiniteVoiddRenderer;
import net.mcreator.craftkaisen.client.renderer.HollowPurpleEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.FlyHeadRenderer;
import net.mcreator.craftkaisen.client.renderer.FireArrowRenderer;
import net.mcreator.craftkaisen.client.renderer.FingerBearerRenderer;
import net.mcreator.craftkaisen.client.renderer.EsoRenderer;
import net.mcreator.craftkaisen.client.renderer.EmptyMechamaruRenderer;
import net.mcreator.craftkaisen.client.renderer.EmberInsectRenderer;
import net.mcreator.craftkaisen.client.renderer.CursedspiritrugbyfieldRenderer;
import net.mcreator.craftkaisen.client.renderer.CursedspiritroppongiRenderer;
import net.mcreator.craftkaisen.client.renderer.CursedspiritmouthRenderer;
import net.mcreator.craftkaisen.client.renderer.CursedspiritgrasshopperRenderer;
import net.mcreator.craftkaisen.client.renderer.BigFistRenderer;
import net.mcreator.craftkaisen.client.renderer.BaggedHeadCurseUserRenderer;
import net.mcreator.craftkaisen.client.renderer.BaggedHeadCurseUserCloneRenderer;

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
		event.registerEntityRenderer(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD.get(), CursedspiritrugbyfieldRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.DISASTER_FLAME.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAXIMUM_METEOR.get(), MaximumMeteorRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.EMBER_INSECT.get(), EmberInsectRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.FIRE_ARROW.get(), FireArrowRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.FIRE_ARROW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.WOODEN_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.CURSED_BUD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.FLOWERFIELDS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.CURSEDSPIRITROPPONGI.get(), CursedspiritroppongiRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.INVENTORY_CURSE.get(), InventoryCurseRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.CURSEDSPIRITGRASSHOPPER.get(), CursedspiritgrasshopperRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MEGUMI_FUSHIGURO.get(), MegumiFushiguroRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAGMA_ROCK.get(), MagmaRockRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.UNKNOWN_MAN.get(), UnknownManRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.ITADORI.get(), ItadoriRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.SUKUNA.get(), SukunaRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAGMA_ROCK_PROJECTILE.get(), MagmaRockProjectileRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.BIG_FIST.get(), BigFistRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.ESO.get(), EsoRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAHITO.get(), MahitoRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAHITO_SPIKE.get(), MahitoSpikeRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), CursedspiritmouthRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.ULTIMATE_MECHAMARU.get(), UltimateMechamaruRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.EMPTY_MECHAMARU.get(), EmptyMechamaruRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.WRAPPED_UP.get(), WrappedUpRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.RIKO_AMANAI.get(), RikoAmanaiRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.BAGGED_HEAD_CURSE_USER_CLONE.get(), BaggedHeadCurseUserCloneRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.BAGGED_HEAD_CURSE_USER.get(), BaggedHeadCurseUserRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.REVERSAL_RED_ENTITY.get(), ReversalRedEntityRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.PRISON_REALM_MOB.get(), PrisonRealmMobRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.BOLT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.ROOT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftkaisenModEntities.MAKI_ZENIN.get(), MakiZeninRenderer::new);
	}
}
