
package net.mcreator.craftkaisen.client.renderer;

public class UltimateMechamaruRenderer extends HumanoidMobRenderer<UltimateMechamaruEntity, HumanoidModel<UltimateMechamaruEntity>> {

	public UltimateMechamaruRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(UltimateMechamaruEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/jujutsu_kaisen_ultimate_mechamaru.png");
	}

}
