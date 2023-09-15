
package net.mcreator.craftkaisen.client.renderer;

public class MalevolentShrineRenderer extends MobRenderer<MalevolentShrineEntity, Modelmalevolentshrine<MalevolentShrineEntity>> {

	public MalevolentShrineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmalevolentshrine(context.bakeLayer(Modelmalevolentshrine.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MalevolentShrineEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/shrinetextureeeeeeeee.png");
	}

}
