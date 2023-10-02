
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.craftkaisen.entity.ReversalRedEntityEntity;
import net.mcreator.craftkaisen.client.model.Modelreversalred;

public class ReversalRedEntityRenderer extends MobRenderer<ReversalRedEntityEntity, Modelreversalred<ReversalRedEntityEntity>> {
	public ReversalRedEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreversalred(context.bakeLayer(Modelreversalred.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<ReversalRedEntityEntity, Modelreversalred<ReversalRedEntityEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("craftkaisen:textures/entities/redd.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ReversalRedEntityEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/redtexture.png");
	}
}
