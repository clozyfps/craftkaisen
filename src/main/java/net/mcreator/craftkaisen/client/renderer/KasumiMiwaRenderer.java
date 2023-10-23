
package net.mcreator.craftkaisen.client.renderer;

public class KasumiMiwaRenderer extends HumanoidMobRenderer<KasumiMiwaEntity, HumanoidModel<KasumiMiwaEntity>> {

	public KasumiMiwaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(KasumiMiwaEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/jujutsu_kaisen_kasumi_miwa.png");
	}

}
