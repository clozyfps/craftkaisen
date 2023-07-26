
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.model.Modeltojishirt;
import net.mcreator.craftkaisen.client.model.Modeltojipants;
import net.mcreator.craftkaisen.client.model.Modelsixeyes;
import net.mcreator.craftkaisen.client.model.Modellapseblue;
import net.mcreator.craftkaisen.client.model.Modeljjkoutfiot;
import net.mcreator.craftkaisen.client.model.Modelhollowpurplenew;
import net.mcreator.craftkaisen.client.model.Modelhollowpurple;
import net.mcreator.craftkaisen.client.model.Modelgetosandalsnew;
import net.mcreator.craftkaisen.client.model.Modelgetorobes;
import net.mcreator.craftkaisen.client.model.Modelgetolegs;
import net.mcreator.craftkaisen.client.model.Modelblindfold;
import net.mcreator.craftkaisen.client.model.Modelbandageblindfold;
import net.mcreator.craftkaisen.client.model.ModelFingerBearernew;
import net.mcreator.craftkaisen.client.model.ModelFingerBearer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftkaisenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgetolegs.LAYER_LOCATION, Modelgetolegs::createBodyLayer);
		event.registerLayerDefinition(ModelFingerBearer.LAYER_LOCATION, ModelFingerBearer::createBodyLayer);
		event.registerLayerDefinition(Modeltojishirt.LAYER_LOCATION, Modeltojishirt::createBodyLayer);
		event.registerLayerDefinition(Modelgetorobes.LAYER_LOCATION, Modelgetorobes::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurplenew.LAYER_LOCATION, Modelhollowpurplenew::createBodyLayer);
		event.registerLayerDefinition(Modelsixeyes.LAYER_LOCATION, Modelsixeyes::createBodyLayer);
		event.registerLayerDefinition(Modeltojipants.LAYER_LOCATION, Modeltojipants::createBodyLayer);
		event.registerLayerDefinition(Modelbandageblindfold.LAYER_LOCATION, Modelbandageblindfold::createBodyLayer);
		event.registerLayerDefinition(Modellapseblue.LAYER_LOCATION, Modellapseblue::createBodyLayer);
		event.registerLayerDefinition(ModelFingerBearernew.LAYER_LOCATION, ModelFingerBearernew::createBodyLayer);
		event.registerLayerDefinition(Modelgetosandalsnew.LAYER_LOCATION, Modelgetosandalsnew::createBodyLayer);
		event.registerLayerDefinition(Modeljjkoutfiot.LAYER_LOCATION, Modeljjkoutfiot::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurple.LAYER_LOCATION, Modelhollowpurple::createBodyLayer);
		event.registerLayerDefinition(Modelblindfold.LAYER_LOCATION, Modelblindfold::createBodyLayer);
	}
}
