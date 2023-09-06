
package net.mcreator.craftkaisen.client.renderer;

public class MaximumMeteorRenderer extends MobRenderer<MaximumMeteorEntity, Modelmaximummeteornewwww<MaximumMeteorEntity>> {

	public MaximumMeteorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximummeteornewwww(context.bakeLayer(Modelmaximummeteornewwww.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MaximumMeteorEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/maximummeteor.png");
	}

}
