
package net.mcreator.craftkaisen.client.renderer;

public class RikoAmanaiRenderer extends HumanoidMobRenderer<RikoAmanaiEntity, HumanoidModel<RikoAmanaiEntity>> {

	public RikoAmanaiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(RikoAmanaiEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/riko_amanai.png");
	}

}
