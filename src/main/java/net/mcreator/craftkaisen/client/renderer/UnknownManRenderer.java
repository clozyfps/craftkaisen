
package net.mcreator.craftkaisen.client.renderer;

public class UnknownManRenderer extends HumanoidMobRenderer<UnknownManEntity, HumanoidModel<UnknownManEntity>> {

	public UnknownManRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(UnknownManEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/tuxedo_steve.png");
	}

}
