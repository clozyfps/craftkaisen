
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CursedspiritroppongiEntity;
import net.mcreator.craftkaisen.client.model.Modelroppongicursedspirit;

public class CursedspiritroppongiRenderer extends MobRenderer<CursedspiritroppongiEntity, Modelroppongicursedspirit<CursedspiritroppongiEntity>> {
	public CursedspiritroppongiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroppongicursedspirit(context.bakeLayer(Modelroppongicursedspirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CursedspiritroppongiEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/roppongicursedspirit.png");
	}
}
