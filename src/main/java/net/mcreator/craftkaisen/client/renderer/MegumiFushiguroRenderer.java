
package net.mcreator.craftkaisen.client.renderer;

public class MegumiFushiguroRenderer extends HumanoidMobRenderer<MegumiFushiguroEntity, HumanoidModel<MegumiFushiguroEntity>> {

	public MegumiFushiguroRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(MegumiFushiguroEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/megumifushiguro.png");
	}

}
