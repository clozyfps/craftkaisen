
package net.mcreator.craftkaisen.client.renderer;

public class CursedspiritrugbyfieldRenderer extends MobRenderer<CursedspiritrugbyfieldEntity, Modelcursedspiritrugbyfield<CursedspiritrugbyfieldEntity>> {

	public CursedspiritrugbyfieldRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritrugbyfield(context.bakeLayer(Modelcursedspiritrugbyfield.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritrugbyfieldEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/rugbyfieldcursedspirit_3.png");
	}

}
