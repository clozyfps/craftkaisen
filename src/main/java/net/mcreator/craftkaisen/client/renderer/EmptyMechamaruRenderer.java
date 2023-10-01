
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.EmptyMechamaruEntity;
import net.mcreator.craftkaisen.client.model.Modelmechamaruofflinenew;

public class EmptyMechamaruRenderer extends MobRenderer<EmptyMechamaruEntity, Modelmechamaruofflinenew<EmptyMechamaruEntity>> {
	public EmptyMechamaruRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmechamaruofflinenew(context.bakeLayer(Modelmechamaruofflinenew.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmptyMechamaruEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mechmaruoffline.png");
	}
}
