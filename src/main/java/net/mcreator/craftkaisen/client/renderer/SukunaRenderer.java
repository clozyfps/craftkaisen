
package net.mcreator.craftkaisen.client.renderer;

public class SukunaRenderer extends HumanoidMobRenderer<SukunaEntity, HumanoidModel<SukunaEntity>> {

	public SukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(SukunaEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/itadori_sukuna.png");
	}

}
