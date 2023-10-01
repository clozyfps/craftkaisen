
package net.mcreator.craftkaisen.client.renderer;

public class ReversalRedEntityRenderer extends MobRenderer<ReversalRedEntityEntity, Modelreversalred<ReversalRedEntityEntity>> {

	public ReversalRedEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreversalred(context.bakeLayer(Modelreversalred.LAYER_LOCATION)), 0f);

		this.addLayer(new EyesLayer<ReversalRedEntityEntity, Modelreversalred<ReversalRedEntityEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("craftkaisen:textures/entities/redd.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ReversalRedEntityEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/redtexture.png");
	}

}
