
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedspiritgrasshopperEntity;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritgrasshopper;

public class CursedspiritgrasshopperRenderer extends MobRenderer<CursedspiritgrasshopperEntity, Modelcursedspiritgrasshopper<CursedspiritgrasshopperEntity>> {
	public CursedspiritgrasshopperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritgrasshopper(context.bakeLayer(Modelcursedspiritgrasshopper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritgrasshopperEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/grasshoppercursedspirit.png");
	}
}
