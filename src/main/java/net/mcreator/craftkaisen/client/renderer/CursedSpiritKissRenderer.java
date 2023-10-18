
package net.mcreator.craftkaisen.client.renderer;

public class CursedSpiritKissRenderer extends MobRenderer<CursedSpiritKissEntity, Modelpinkspirit<CursedSpiritKissEntity>> {

	public CursedSpiritKissRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpinkspirit(context.bakeLayer(Modelpinkspirit.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CursedSpiritKissEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/pinkcursetexture.png");
	}

}
