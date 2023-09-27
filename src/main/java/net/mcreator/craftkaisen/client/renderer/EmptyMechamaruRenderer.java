
package net.mcreator.craftkaisen.client.renderer;

public class EmptyMechamaruRenderer extends MobRenderer<EmptyMechamaruEntity, Modelmechamaruoffline<EmptyMechamaruEntity>> {

	public EmptyMechamaruRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmechamaruoffline(context.bakeLayer(Modelmechamaruoffline.LAYER_LOCATION)), 0.1f);

	}

	@Override
	public ResourceLocation getTextureLocation(EmptyMechamaruEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mechmaruoffline.png");
	}

}
