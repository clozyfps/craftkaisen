
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MaximumMeteorEntity;
import net.mcreator.craftkaisen.client.model.Modelmaximummeteornewwww;

public class MaximumMeteorRenderer extends MobRenderer<MaximumMeteorEntity, Modelmaximummeteornewwww<MaximumMeteorEntity>> {
	public MaximumMeteorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximummeteornewwww(context.bakeLayer(Modelmaximummeteornewwww.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaximumMeteorEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/maximummeteor.png");
	}
}
