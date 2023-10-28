
package net.mcreator.craftkaisen.client.renderer;

public class BigFistRenderer extends MobRenderer<BigFistEntity, Modelfist<BigFistEntity>> {

	public BigFistRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfist(context.bakeLayer(Modelfist.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BigFistEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/fist.png");
	}

}
