
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BigFistEntity;
import net.mcreator.craftkaisen.client.model.Modelfist;

public class BigFistRenderer extends MobRenderer<BigFistEntity, Modelfist<BigFistEntity>> {
	public BigFistRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfist(context.bakeLayer(Modelfist.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigFistEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/fist.png");
	}
}
