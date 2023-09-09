
package net.mcreator.craftkaisen.client.renderer;

public class CursedspiritroppongiRenderer extends MobRenderer<CursedspiritroppongiEntity, Modelroppongicursedspirit<CursedspiritroppongiEntity>> {

	public CursedspiritroppongiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroppongicursedspirit(context.bakeLayer(Modelroppongicursedspirit.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritroppongiEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/roppongicursedspirit.png");
	}

}
