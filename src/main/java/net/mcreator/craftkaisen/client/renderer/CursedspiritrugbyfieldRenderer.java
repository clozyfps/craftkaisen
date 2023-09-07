
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedspiritrugbyfieldEntity;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritrugbyfield;

public class CursedspiritrugbyfieldRenderer extends MobRenderer<CursedspiritrugbyfieldEntity, Modelcursedspiritrugbyfield<CursedspiritrugbyfieldEntity>> {
	public CursedspiritrugbyfieldRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritrugbyfield(context.bakeLayer(Modelcursedspiritrugbyfield.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritrugbyfieldEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/rugbyfieldcursedspirit_3.png");
	}
}
