
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.client.model.Modelmahito;

public class MahitoRenderer extends MobRenderer<MahitoEntity, Modelmahito<MahitoEntity>> {
	public MahitoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmahito(context.bakeLayer(Modelmahito.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MahitoEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mahito.png");
	}
}
