
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedSpiritKissEntity;
import net.mcreator.craftkaisen.client.model.Modelpinkspirit;

public class CursedSpiritKissRenderer extends MobRenderer<CursedSpiritKissEntity, Modelpinkspirit<CursedSpiritKissEntity>> {
	public CursedSpiritKissRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpinkspirit(context.bakeLayer(Modelpinkspirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedSpiritKissEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/pinkcursetexture.png");
	}
}
