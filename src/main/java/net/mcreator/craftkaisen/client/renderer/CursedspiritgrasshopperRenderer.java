
package net.mcreator.craftkaisen.client.renderer;

public class CursedspiritgrasshopperRenderer extends MobRenderer<CursedspiritgrasshopperEntity, Modelcursedspiritgrasshopper<CursedspiritgrasshopperEntity>> {

	public CursedspiritgrasshopperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritgrasshopper(context.bakeLayer(Modelcursedspiritgrasshopper.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritgrasshopperEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/grasshoppercursedspirit.png");
	}

}
