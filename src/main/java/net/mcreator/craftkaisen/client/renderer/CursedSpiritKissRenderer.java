
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedSpiritKissEntity;
import net.mcreator.craftkaisen.client.model.Modelpinksprite;

public class CursedSpiritKissRenderer extends MobRenderer<CursedSpiritKissEntity, Modelpinksprite<CursedSpiritKissEntity>> {
	public CursedSpiritKissRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpinksprite(context.bakeLayer(Modelpinksprite.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedSpiritKissEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/pink_sprite.png");
	}
}
