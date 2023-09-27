
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.WrappedUpEntity;
import net.mcreator.craftkaisen.client.model.Modelmummy;

public class WrappedUpRenderer extends MobRenderer<WrappedUpEntity, Modelmummy<WrappedUpEntity>> {
	public WrappedUpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmummy(context.bakeLayer(Modelmummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WrappedUpEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mummy.png");
	}
}
