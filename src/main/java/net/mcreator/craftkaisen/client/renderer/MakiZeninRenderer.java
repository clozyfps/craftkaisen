
package net.mcreator.craftkaisen.client.renderer;

public class MakiZeninRenderer extends HumanoidMobRenderer<MakiZeninEntity, HumanoidModel<MakiZeninEntity>> {

	public MakiZeninRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(MakiZeninEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/makitexture.png");
	}

}
