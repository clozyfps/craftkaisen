
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.model.Modelwood_binds;
import net.mcreator.craftkaisen.client.model.Modeltojishirt;
import net.mcreator.craftkaisen.client.model.Modeltojipants;
import net.mcreator.craftkaisen.client.model.Modeltoji_curse;
import net.mcreator.craftkaisen.client.model.Modelsunglasses;
import net.mcreator.craftkaisen.client.model.Modelsukunafightingchestplate;
import net.mcreator.craftkaisen.client.model.Modelsukunafacemark;
import net.mcreator.craftkaisen.client.model.Modelsixeyes;
import net.mcreator.craftkaisen.client.model.Modelroppongicursedspirit;
import net.mcreator.craftkaisen.client.model.Modelreversalred;
import net.mcreator.craftkaisen.client.model.Modelprsealarmor;
import net.mcreator.craftkaisen.client.model.Modelprisonrealmmob;
import net.mcreator.craftkaisen.client.model.Modelprisonbox;
import net.mcreator.craftkaisen.client.model.Modelprison_realm_mob;
import net.mcreator.craftkaisen.client.model.Modelpinksprite;
import net.mcreator.craftkaisen.client.model.Modelpinkspirit;
import net.mcreator.craftkaisen.client.model.Modelmummy;
import net.mcreator.craftkaisen.client.model.Modelmouthcursedspirit;
import net.mcreator.craftkaisen.client.model.Modelmetalbat;
import net.mcreator.craftkaisen.client.model.Modelmegumihair;
import net.mcreator.craftkaisen.client.model.Modelmechamaruu;
import net.mcreator.craftkaisen.client.model.Modelmechamaruofflinenew;
import net.mcreator.craftkaisen.client.model.Modelmechamaruoffline;
import net.mcreator.craftkaisen.client.model.Modelmaximummeteornewwww;
import net.mcreator.craftkaisen.client.model.Modelmalevolentshrine;
import net.mcreator.craftkaisen.client.model.Modelmakiponytail;
import net.mcreator.craftkaisen.client.model.Modelmahoraga_wheel;
import net.mcreator.craftkaisen.client.model.Modelmahito;
import net.mcreator.craftkaisen.client.model.Modelmagmaprojectile;
import net.mcreator.craftkaisen.client.model.Modellapseblue;
import net.mcreator.craftkaisen.client.model.Modeljogo;
import net.mcreator.craftkaisen.client.model.Modeljjkoutfiot;
import net.mcreator.craftkaisen.client.model.Modelinventorycurseground;
import net.mcreator.craftkaisen.client.model.Modelhollowpurplenew;
import net.mcreator.craftkaisen.client.model.Modelhollowpurple;
import net.mcreator.craftkaisen.client.model.Modelhanami;
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
import net.mcreator.craftkaisen.client.model.Modelbluecurse;
import net.mcreator.craftkaisen.client.model.Modelblackblindfold;
import net.mcreator.craftkaisen.client.model.ModelGoddessClanWings;
import net.mcreator.craftkaisen.client.model.ModelFingerBearernew;
import net.mcreator.craftkaisen.client.model.ModelFingerBearer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftkaisenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmakiponytail.LAYER_LOCATION, Modelmakiponytail::createBodyLayer);
		event.registerLayerDefinition(Modelprison_realm_mob.LAYER_LOCATION, Modelprison_realm_mob::createBodyLayer);
		event.registerLayerDefinition(Modelfist.LAYER_LOCATION, Modelfist::createBodyLayer);
		event.registerLayerDefinition(Modelsixeyes.LAYER_LOCATION, Modelsixeyes::createBodyLayer);
		event.registerLayerDefinition(Modelmahito.LAYER_LOCATION, Modelmahito::createBodyLayer);
		event.registerLayerDefinition(Modelgojopants.LAYER_LOCATION, Modelgojopants::createBodyLayer);
		event.registerLayerDefinition(Modelcurse_1.LAYER_LOCATION, Modelcurse_1::createBodyLayer);
		event.registerLayerDefinition(Modelprisonbox.LAYER_LOCATION, Modelprisonbox::createBodyLayer);
		event.registerLayerDefinition(Modelmalevolentshrine.LAYER_LOCATION, Modelmalevolentshrine::createBodyLayer);
		event.registerLayerDefinition(Modelprisonrealmmob.LAYER_LOCATION, Modelprisonrealmmob::createBodyLayer);
		event.registerLayerDefinition(Modelsukunafightingchestplate.LAYER_LOCATION, Modelsukunafightingchestplate::createBodyLayer);
		event.registerLayerDefinition(Modelgetosandalsnew.LAYER_LOCATION, Modelgetosandalsnew::createBodyLayer);
		event.registerLayerDefinition(Modelgetolegs.LAYER_LOCATION, Modelgetolegs::createBodyLayer);
		event.registerLayerDefinition(Modelgojochestplate.LAYER_LOCATION, Modelgojochestplate::createBodyLayer);
		event.registerLayerDefinition(Modelinventorycurseground.LAYER_LOCATION, Modelinventorycurseground::createBodyLayer);
		event.registerLayerDefinition(ModelFingerBearer.LAYER_LOCATION, ModelFingerBearer::createBodyLayer);
		event.registerLayerDefinition(Modelbluecurse.LAYER_LOCATION, Modelbluecurse::createBodyLayer);
		event.registerLayerDefinition(Modelcursedspiritgrasshopper.LAYER_LOCATION, Modelcursedspiritgrasshopper::createBodyLayer);
		event.registerLayerDefinition(Modeljogo.LAYER_LOCATION, Modeljogo::createBodyLayer);
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
		event.registerLayerDefinition(ModelFingerBearernew.LAYER_LOCATION, ModelFingerBearernew::createBodyLayer);
		event.registerLayerDefinition(Modeljjkoutfiot.LAYER_LOCATION, Modeljjkoutfiot::createBodyLayer);
		event.registerLayerDefinition(Modelwood_binds.LAYER_LOCATION, Modelwood_binds::createBodyLayer);
		event.registerLayerDefinition(Modelroppongicursedspirit.LAYER_LOCATION, Modelroppongicursedspirit::createBodyLayer);
		event.registerLayerDefinition(Modelblackblindfold.LAYER_LOCATION, Modelblackblindfold::createBodyLayer);
		event.registerLayerDefinition(Modeltoji_curse.LAYER_LOCATION, Modeltoji_curse::createBodyLayer);
		event.registerLayerDefinition(Modelgetorobes.LAYER_LOCATION, Modelgetorobes::createBodyLayer);
		event.registerLayerDefinition(Modelmetalbat.LAYER_LOCATION, Modelmetalbat::createBodyLayer);
		event.registerLayerDefinition(Modelmechamaruofflinenew.LAYER_LOCATION, Modelmechamaruofflinenew::createBodyLayer);
		event.registerLayerDefinition(Modelmegumihair.LAYER_LOCATION, Modelmegumihair::createBodyLayer);
		event.registerLayerDefinition(Modelpinksprite.LAYER_LOCATION, Modelpinksprite::createBodyLayer);
		event.registerLayerDefinition(Modelmechamaruu.LAYER_LOCATION, Modelmechamaruu::createBodyLayer);
		event.registerLayerDefinition(Modeltojishirt.LAYER_LOCATION, Modeltojishirt::createBodyLayer);
		event.registerLayerDefinition(Modelhanami.LAYER_LOCATION, Modelhanami::createBodyLayer);
		event.registerLayerDefinition(Modelmechamaruoffline.LAYER_LOCATION, Modelmechamaruoffline::createBodyLayer);
		event.registerLayerDefinition(Modelprsealarmor.LAYER_LOCATION, Modelprsealarmor::createBodyLayer);
		event.registerLayerDefinition(Modelmummy.LAYER_LOCATION, Modelmummy::createBodyLayer);
		event.registerLayerDefinition(Modelsunglasses.LAYER_LOCATION, Modelsunglasses::createBodyLayer);
		event.registerLayerDefinition(Modelmouthcursedspirit.LAYER_LOCATION, Modelmouthcursedspirit::createBodyLayer);
		event.registerLayerDefinition(Modelreversalred.LAYER_LOCATION, Modelreversalred::createBodyLayer);
		event.registerLayerDefinition(Modelmagmaprojectile.LAYER_LOCATION, Modelmagmaprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelmaximummeteornewwww.LAYER_LOCATION, Modelmaximummeteornewwww::createBodyLayer);
		event.registerLayerDefinition(Modelhollowpurple.LAYER_LOCATION, Modelhollowpurple::createBodyLayer);
		event.registerLayerDefinition(Modelpinkspirit.LAYER_LOCATION, Modelpinkspirit::createBodyLayer);
	}
}
