
package net.mcreator.craftkaisen.client.renderer;

public class MagmaRockRenderer extends MobRenderer<MagmaRockEntity, Modelmagmaprojectile<MagmaRockEntity>> {

	public MagmaRockRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmagmaprojectile(context.bakeLayer(Modelmagmaprojectile.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MagmaRockEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/magmablock.png");
	}

}
