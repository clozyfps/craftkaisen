
package net.mcreator.craftkaisen.client.renderer;

public class EmptyMechamaruRenderer extends MobRenderer<EmptyMechamaruEntity, Modelmechamaruofflinenew<EmptyMechamaruEntity>> {

	public EmptyMechamaruRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmechamaruofflinenew(context.bakeLayer(Modelmechamaruofflinenew.LAYER_LOCATION)), 0.1f);

	}

	@Override
	public ResourceLocation getTextureLocation(EmptyMechamaruEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mechmaruoffline.png");
	}

}
