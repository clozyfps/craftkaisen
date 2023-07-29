
package net.mcreator.craftkaisen.client.renderer;

public class FlyHeadRenderer extends MobRenderer<FlyHeadEntity, Modelcurse_1<FlyHeadEntity>> {

	public FlyHeadRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcurse_1(context.bakeLayer(Modelcurse_1.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FlyHeadEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mainflyheadtexture.png");
	}

}
