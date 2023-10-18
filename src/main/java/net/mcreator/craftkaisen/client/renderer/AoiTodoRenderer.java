
package net.mcreator.craftkaisen.client.renderer;

public class AoiTodoRenderer extends HumanoidMobRenderer<AoiTodoEntity, HumanoidModel<AoiTodoEntity>> {

	public AoiTodoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(AoiTodoEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/aoi_todo.png");
	}

}
