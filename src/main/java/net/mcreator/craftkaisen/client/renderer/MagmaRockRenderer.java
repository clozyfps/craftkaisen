
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MagmaRockEntity;
import net.mcreator.craftkaisen.client.model.Modelmagmaprojectile;

public class MagmaRockRenderer extends MobRenderer<MagmaRockEntity, Modelmagmaprojectile<MagmaRockEntity>> {
	public MagmaRockRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmagmaprojectile(context.bakeLayer(Modelmagmaprojectile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagmaRockEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/magmablock.png");
	}
}
