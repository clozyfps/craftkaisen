
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
import net.mcreator.craftkaisen.client.model.Modeltoji_curse;
import net.mcreator.craftkaisen.client.model.Modelsunglasses;
import net.mcreator.craftkaisen.client.model.Modelsukunafightingchestplate;
import net.mcreator.craftkaisen.client.model.Modelsukunafacemark;
import net.mcreator.craftkaisen.client.model.Modelsixeyes;
import net.mcreator.craftkaisen.client.model.Modelroppongicursedspirit;
import net.mcreator.craftkaisen.client.model.Modelmetalbat;
import net.mcreator.craftkaisen.client.model.Modelmegumihair;
import net.mcreator.craftkaisen.client.model.Modelmaximummeteornewwww;
import net.mcreator.craftkaisen.client.model.Modelmalevolentshrine;
import net.mcreator.craftkaisen.client.model.Modelmahoraga_wheel;
import net.mcreator.craftkaisen.client.model.Modelmagmaprojectile;
import net.mcreator.craftkaisen.client.model.Modellapseblue;
import net.mcreator.craftkaisen.client.model.Modeljogo;
import net.mcreator.craftkaisen.client.model.Modeljjkoutfiot;
import net.mcreator.craftkaisen.client.model.Modelinventorycurseground;
import net.mcreator.craftkaisen.client.model.Modelhollowpurplenew;
import net.mcreator.craftkaisen.client.model.Modelhollowpurple;
import net.mcreator.craftkaisen.client.model.Modelgojopants;
import net.mcreator.craftkaisen.client.model.Modelgojochestplate;
import net.mcreator.craftkaisen.client.model.Modelgetosandalsnew;
import net.mcreator.craftkaisen.client.model.Modelgetorobes;
import net.mcreator.craftkaisen.client.model.Modelgetolegs;
import net.mcreator.craftkaisen.client.model.Modelfist;
import net.mcreator.craftkaisen.client.model.Modelesopants;
import net.mcreator.craftkaisen.client.model.Modelesochestplate;
import net.mcreator.craftkaisen.client.model.Modelemberinsect;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritrugbyfield;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritgrasshopper;
import net.mcreator.craftkaisen.client.model.Modelcurse_1;
import net.mcreator.craftkaisen.client.model.Modelblackblindfold;
import net.mcreator.craftkaisen.client.model.ModelGoddessClanWings;
import net.mcreator.craftkaisen.client.model.ModelFingerBearernew;
import net.mcreator.craftkaisen.client.model.ModelFingerBearer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftkaisenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelblackblindfold.LAYER_LOCATION, Modelblackblindfold::createBodyLayer);
		event.registerLayerDefinition(Modeltoji_curse.LAYER_LOCATION, Modeltoji_curse::createBodyLayer);
		event.registerLayerDefinition(Modelgetorobes.LAYER_LOCATION, Modelgetorobes::createBodyLayer);
		event.registerLayerDefinition(Modelfist.LAYER_LOCATION, Modelfist::createBodyLayer);
		event.registerLayerDefinition(Modelsixeyes.LAYER_LOCATION, Modelsixeyes::createBodyLayer);
		event.registerLayerDefinition(Modelmetalbat.LAYER_LOCATION, Modelmetalbat::createBodyLayer);
		event.registerLayerDefinition(Modelgojopants.LAYER_LOCATION, Modelgojopants::createBodyLayer);
		event.registerLayerDefinition(Modelcurse_1.LAYER_LOCATION, Modelcurse_1::createBodyLayer);
		event.registerLayerDefinition(Modelmalevolentshrine.LAYER_LOCATION, Modelmalevolentshrine::createBodyLayer);
		event.registerLayerDefinition(Modelsukunafightingchestplate.LAYER_LOCATION, Modelsukunafightingchestplate::createBodyLayer);
		event.registerLayerDefinition(Modelmegumihair.LAYER_LOCATION, Modelmegumihair::createBodyLayer);
		event.registerLayerDefinition(Modelgetosandalsnew.LAYER_LOCATION, Modelgetosandalsnew::createBodyLayer);
		event.registerLayerDefinition(Modelgetolegs.LAYER_LOCATION, Modelgetolegs::createBodyLayer);
		event.registerLayerDefinition(Modelgojochestplate.LAYER_LOCATION, Modelgojochestplate::createBodyLayer);
		event.registerLayerDefinition(Modelinventorycurseground.LAYER_LOCATION, Modelinventorycurseground::createBodyLayer);
		event.registerLayerDefinition(ModelFingerBearer.LAYER_LOCATION, ModelFingerBearer::createBodyLayer);
		event.registerLayerDefinition(Modeltojishirt.LAYER_LOCATION, Modeltojishirt::createBodyLayer);
		event.registerLayerDefinition(Modelcursedspiritgrasshopper.LAYER_LOCATION, Modelcursedspiritgrasshopper::createBodyLayer);
		event.registerLayerDefinition(Modeljogo.LAYER_LOCATION, Modeljogo::createBodyLayer);
		event.registerLayerDefinition(Modelsunglasses.LAYER_LOCATION, Modelsunglasses::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurplenew.LAYER_LOCATION, Modelhollowpurplenew::createBodyLayer);
		event.registerLayerDefinition(Modelsukunafacemark.LAYER_LOCATION, Modelsukunafacemark::createBodyLayer);
		event.registerLayerDefinition(ModelGoddessClanWings.LAYER_LOCATION, ModelGoddessClanWings::createBodyLayer);
		event.registerLayerDefinition(Modeltojipants.LAYER_LOCATION, Modeltojipants::createBodyLayer);
		event.registerLayerDefinition(Modelemberinsect.LAYER_LOCATION, Modelemberinsect::createBodyLayer);
		event.registerLayerDefinition(Modelesochestplate.LAYER_LOCATION, Modelesochestplate::createBodyLayer);
		event.registerLayerDefinition(Modelcursedspiritrugbyfield.LAYER_LOCATION, Modelcursedspiritrugbyfield::createBodyLayer);
		event.registerLayerDefinition(Modelesopants.LAYER_LOCATION, Modelesopants::createBodyLayer);
		event.registerLayerDefinition(Modelmahoraga_wheel.LAYER_LOCATION, Modelmahoraga_wheel::createBodyLayer);
		event.registerLayerDefinition(Modellapseblue.LAYER_LOCATION, Modellapseblue::createBodyLayer);
		event.registerLayerDefinition(Modelmagmaprojectile.LAYER_LOCATION, Modelmagmaprojectile::createBodyLayer);
		event.registerLayerDefinition(ModelFingerBearernew.LAYER_LOCATION, ModelFingerBearernew::createBodyLayer);
		event.registerLayerDefinition(Modeljjkoutfiot.LAYER_LOCATION, Modeljjkoutfiot::createBodyLayer);
		event.registerLayerDefinition(Modelmaximummeteornewwww.LAYER_LOCATION, Modelmaximummeteornewwww::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurple.LAYER_LOCATION, Modelhollowpurple::createBodyLayer);
		event.registerLayerDefinition(Modelroppongicursedspirit.LAYER_LOCATION, Modelroppongicursedspirit::createBodyLayer);
	}
}
