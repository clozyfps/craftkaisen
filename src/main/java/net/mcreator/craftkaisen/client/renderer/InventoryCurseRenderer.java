
package net.mcreator.craftkaisen.client.renderer;

public class InventoryCurseRenderer extends MobRenderer<InventoryCurseEntity, Modelinventorycurseground<InventoryCurseEntity>> {

	public InventoryCurseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinventorycurseground(context.bakeLayer(Modelinventorycurseground.LAYER_LOCATION)), 0.1f);

	}

	@Override
	public ResourceLocation getTextureLocation(InventoryCurseEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/inventorycursetexture.png");
	}

}
