
package net.mcreator.craftkaisen.client.renderer;

public class LapseBlueRenderer extends HumanoidMobRenderer<LapseBlueEntity, HumanoidModel<LapseBlueEntity>> {

	public LapseBlueRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(LapseBlueEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/air103_layer_2.png");
	}

}
