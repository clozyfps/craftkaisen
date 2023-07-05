
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.craftkaisen.entity.LapseBlueEntity;
import net.mcreator.craftkaisen.client.model.Modellapseblue;

public class LapseBlueRenderer extends MobRenderer<LapseBlueEntity, Modellapseblue<LapseBlueEntity>> {
	public LapseBlueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellapseblue(context.bakeLayer(Modellapseblue.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<LapseBlueEntity, Modellapseblue<LapseBlueEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("craftkaisen:textures/entities/lapsebluetexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LapseBlueEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/air103_layer_2.png");
	}
}
