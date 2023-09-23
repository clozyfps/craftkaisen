
package net.mcreator.craftkaisen.client.renderer;

public class MahitoRenderer extends MobRenderer<MahitoEntity, Modelmahito<MahitoEntity>> {

	public MahitoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmahito(context.bakeLayer(Modelmahito.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MahitoEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mahito.png");
	}

}
