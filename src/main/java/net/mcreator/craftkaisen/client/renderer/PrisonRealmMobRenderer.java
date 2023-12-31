
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.PrisonRealmMobEntity;
import net.mcreator.craftkaisen.client.model.Modelprison_realm_mob;

public class PrisonRealmMobRenderer extends MobRenderer<PrisonRealmMobEntity, Modelprison_realm_mob<PrisonRealmMobEntity>> {
	public PrisonRealmMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprison_realm_mob(context.bakeLayer(Modelprison_realm_mob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrisonRealmMobEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/prmobtextureremake.png");
	}
}
