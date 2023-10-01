
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.EmptyMechamaruEntity;
<<<<<<< HEAD
import net.mcreator.craftkaisen.client.model.Modelmechamaruoffline;

public class EmptyMechamaruRenderer extends MobRenderer<EmptyMechamaruEntity, Modelmechamaruoffline<EmptyMechamaruEntity>> {
=======
import net.mcreator.craftkaisen.client.model.Modelmechamaruofflinenew;

public class EmptyMechamaruRenderer extends MobRenderer<EmptyMechamaruEntity, Modelmechamaruofflinenew<EmptyMechamaruEntity>> {
>>>>>>> branch 'master' of https://github.com/clozyfps/craftkaisen.git
	public EmptyMechamaruRenderer(EntityRendererProvider.Context context) {
<<<<<<< HEAD
		super(context, new Modelmechamaruoffline(context.bakeLayer(Modelmechamaruoffline.LAYER_LOCATION)), 0.1f);
=======
		super(context, new Modelmechamaruofflinenew(context.bakeLayer(Modelmechamaruofflinenew.LAYER_LOCATION)), 0.1f);
>>>>>>> branch 'master' of https://github.com/clozyfps/craftkaisen.git
	}

	@Override
	public ResourceLocation getTextureLocation(EmptyMechamaruEntity entity) {
		return new ResourceLocation("craftkaisen:textures/entities/mechmaruoffline.png");
	}
}
