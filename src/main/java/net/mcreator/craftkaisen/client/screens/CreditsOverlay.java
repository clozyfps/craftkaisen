
package net.mcreator.craftkaisen.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CreditsOverlay {

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof TitleScreen) {
			int w = event.getScreen().width;
			int h = event.getScreen().height;

			int posX = w / 2;
			int posY = h / 2;

			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;

			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level;
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}

			if (true) {

				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.credits.label_mod_created_by_clozy_katsu_and"), posX + -211, posY + -118, -1);

			}

		}
	}

}
