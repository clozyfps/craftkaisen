
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedspiritmouthEntity;
import net.mcreator.craftkaisen.client.model.Modelmouthcursedspirit;

public class CursedspiritmouthRenderer extends MobRenderer<CursedspiritmouthEntity, Modelmouthcursedspirit<CursedspiritmouthEntity>> {
	public CursedspiritmouthRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouthcursedspirit(context.bakeLayer(Modelmouthcursedspirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritmouthEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mouthcursedspirit.png");
	}
}
