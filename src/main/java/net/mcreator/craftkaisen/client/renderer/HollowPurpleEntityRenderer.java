
package net.mcreator.craftkaisen.client.renderer;

public class HollowPurpleEntityRenderer extends MobRenderer<HollowPurpleEntityEntity, Modelhollowpurplenew<HollowPurpleEntityEntity>> {

	public HollowPurpleEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhollowpurplenew(context.bakeLayer(Modelhollowpurplenew.LAYER_LOCATION)), 0f);

		this.addLayer(new EyesLayer<HollowPurpleEntityEntity, Modelhollowpurplenew<HollowPurpleEntityEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("craftkaisen:textures/entities/hollowtexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HollowPurpleEntityEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/air103_layer_2.png");
	}

}
