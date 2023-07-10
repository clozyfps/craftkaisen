
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.model.Modellapseblue;
import net.mcreator.craftkaisen.client.model.Modeljjkoutfiot;
import net.mcreator.craftkaisen.client.model.Modelhollowpurplenew;
import net.mcreator.craftkaisen.client.model.Modelhollowpurple;
import net.mcreator.craftkaisen.client.model.Modelblindfold;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftkaisenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellapseblue.LAYER_LOCATION, Modellapseblue::createBodyLayer);
		event.registerLayerDefinition(Modeljjkoutfiot.LAYER_LOCATION, Modeljjkoutfiot::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurple.LAYER_LOCATION, Modelhollowpurple::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurplenew.LAYER_LOCATION, Modelhollowpurplenew::createBodyLayer);
		event.registerLayerDefinition(Modelblindfold.LAYER_LOCATION, Modelblindfold::createBodyLayer);
	}
}
