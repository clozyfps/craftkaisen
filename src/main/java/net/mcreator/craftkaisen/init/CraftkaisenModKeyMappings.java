
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.craftkaisen.network.UseTechniqueMessage;
import net.mcreator.craftkaisen.network.SwitchTechniqueMessage;
import net.mcreator.craftkaisen.network.OpenMainMenuBindMessage;
import net.mcreator.craftkaisen.network.FlashStepMessage;
import net.mcreator.craftkaisen.network.BlockBindMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftkaisenModKeyMappings {
	public static final KeyMapping SWITCH_TECHNIQUE = new KeyMapping("key.craftkaisen.switch_technique", GLFW.GLFW_KEY_R, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SwitchTechniqueMessage(0, 0));
				SwitchTechniqueMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BLOCK_BIND = new KeyMapping("key.craftkaisen.block_bind", GLFW.GLFW_KEY_V, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new BlockBindMessage(0, 0));
				BlockBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				BLOCK_BIND_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - BLOCK_BIND_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new BlockBindMessage(1, dt));
				BlockBindMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_TECHNIQUE = new KeyMapping("key.craftkaisen.use_technique", GLFW.GLFW_KEY_F, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new UseTechniqueMessage(0, 0));
				UseTechniqueMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FLASH_STEP = new KeyMapping("key.craftkaisen.flash_step", GLFW.GLFW_KEY_C, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new FlashStepMessage(0, 0));
				FlashStepMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_MAIN_MENU_BIND = new KeyMapping("key.craftkaisen.open_main_menu_bind", GLFW.GLFW_KEY_TAB, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new OpenMainMenuBindMessage(0, 0));
				OpenMainMenuBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long BLOCK_BIND_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWITCH_TECHNIQUE);
		event.register(BLOCK_BIND);
		event.register(USE_TECHNIQUE);
		event.register(FLASH_STEP);
		event.register(OPEN_MAIN_MENU_BIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SWITCH_TECHNIQUE.consumeClick();
				BLOCK_BIND.consumeClick();
				USE_TECHNIQUE.consumeClick();
				FLASH_STEP.consumeClick();
				OPEN_MAIN_MENU_BIND.consumeClick();
			}
		}
	}
}
