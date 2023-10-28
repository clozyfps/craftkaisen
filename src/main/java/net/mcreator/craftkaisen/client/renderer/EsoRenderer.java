
package net.mcreator.craftkaisen.client.renderer;

public class EsoRenderer extends HumanoidMobRenderer<EsoEntity, HumanoidModel<EsoEntity>> {

	public EsoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(EsoEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/eso.png");
	}

}
