
package net.mcreator.craftkaisen.client.renderer;

public class CursedSpiritKissRenderer extends MobRenderer<CursedSpiritKissEntity, Modelpinksprite<CursedSpiritKissEntity>> {

	public CursedSpiritKissRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpinksprite(context.bakeLayer(Modelpinksprite.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CursedSpiritKissEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/pink_sprite.png");
	}

}
