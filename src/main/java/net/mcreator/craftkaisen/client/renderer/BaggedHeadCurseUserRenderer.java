
package net.mcreator.craftkaisen.client.renderer;

public class BaggedHeadCurseUserRenderer extends HumanoidMobRenderer<BaggedHeadCurseUserEntity, HumanoidModel<BaggedHeadCurseUserEntity>> {

	public BaggedHeadCurseUserRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(BaggedHeadCurseUserEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/bht.png");
	}

}
