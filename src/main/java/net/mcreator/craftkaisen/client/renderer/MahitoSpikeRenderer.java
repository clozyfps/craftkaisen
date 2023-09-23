
package net.mcreator.craftkaisen.client.renderer;

public class MahitoSpikeRenderer extends MobRenderer<MahitoSpikeEntity, Modelmetalbat<MahitoSpikeEntity>> {

	public MahitoSpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmetalbat(context.bakeLayer(Modelmetalbat.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MahitoSpikeEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/metaltexture.png");
	}

}
