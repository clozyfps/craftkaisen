
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.PrisonBoxMobEntity;
import net.mcreator.craftkaisen.client.model.Modelprisonbox;

public class PrisonBoxMobRenderer extends MobRenderer<PrisonBoxMobEntity, Modelprisonbox<PrisonBoxMobEntity>> {
	public PrisonBoxMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprisonbox(context.bakeLayer(Modelprisonbox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrisonBoxMobEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/prisonrealmtexture.png");
	}
}
