
package net.mcreator.craftkaisen.client.renderer;

public class WrappedUpRenderer extends MobRenderer<WrappedUpEntity, Modelmummy<WrappedUpEntity>> {

	public WrappedUpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmummy(context.bakeLayer(Modelmummy.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(WrappedUpEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mummy.png");
	}

}
