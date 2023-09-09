
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.InventoryCurseEntity;
import net.mcreator.craftkaisen.client.model.Modelinventorycurseground;

public class InventoryCurseRenderer extends MobRenderer<InventoryCurseEntity, Modelinventorycurseground<InventoryCurseEntity>> {
	public InventoryCurseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinventorycurseground(context.bakeLayer(Modelinventorycurseground.LAYER_LOCATION)), 0.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(InventoryCurseEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/inventorycursetexture.png");
	}
}
