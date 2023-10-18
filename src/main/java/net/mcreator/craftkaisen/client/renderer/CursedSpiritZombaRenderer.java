
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedSpiritZombaEntity;
import net.mcreator.craftkaisen.client.model.Modelbluecurse;

public class CursedSpiritZombaRenderer extends MobRenderer<CursedSpiritZombaEntity, Modelbluecurse<CursedSpiritZombaEntity>> {
	public CursedSpiritZombaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbluecurse(context.bakeLayer(Modelbluecurse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedSpiritZombaEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/sittingcursetexture.png");
	}
}
