
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MahitoSpikeEntity;
import net.mcreator.craftkaisen.client.model.Modelmetalbat;

public class MahitoSpikeRenderer extends MobRenderer<MahitoSpikeEntity, Modelmetalbat<MahitoSpikeEntity>> {
	public MahitoSpikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmetalbat(context.bakeLayer(Modelmetalbat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MahitoSpikeEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/metaltexture.png");
	}
}
