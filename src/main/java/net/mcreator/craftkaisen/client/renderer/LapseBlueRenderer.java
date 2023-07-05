
package net.mcreator.craftkaisen.client.renderer;

public class LapseBlueRenderer extends MobRenderer<LapseBlueEntity, Modellapseblue<LapseBlueEntity>> {

	public LapseBlueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellapseblue(context.bakeLayer(Modellapseblue.LAYER_LOCATION)), 0.5f);

		this.addLayer(new EyesLayer<LapseBlueEntity, Modellapseblue<LapseBlueEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("craftkaisen:textures/entities/lapsebluetexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LapseBlueEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/air103_layer_2.png");
	}

}
