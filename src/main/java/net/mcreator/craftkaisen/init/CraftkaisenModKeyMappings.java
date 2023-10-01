
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

import net.mcreator.craftkaisen.network.OpenMainMenuBindMessage;
import net.mcreator.craftkaisen.network.OpenInventoryCurseBindMessage;
import net.mcreator.craftkaisen.network.FlashStepMessage;
import net.mcreator.craftkaisen.network.ChargeCursedEnergyMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftkaisenModKeyMappings {
	public static final KeyMapping SWITCH_TECHNIQUE = new KeyMapping("key.craftkaisen.switch_technique", GLFW.GLFW_KEY_R, "key.categories.jjk");
	public static final KeyMapping USE_TECHNIQUE = new KeyMapping("key.craftkaisen.use_technique", GLFW.GLFW_KEY_F, "key.categories.jjk");
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
	public static final KeyMapping CHARGE_CURSED_ENERGY = new KeyMapping("key.craftkaisen.charge_cursed_energy", GLFW.GLFW_KEY_V, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ChargeCursedEnergyMessage(0, 0));
				ChargeCursedEnergyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CHARGE_CURSED_ENERGY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARGE_CURSED_ENERGY_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ChargeCursedEnergyMessage(1, dt));
				ChargeCursedEnergyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_INVENTORY_CURSE_BIND = new KeyMapping("key.craftkaisen.open_inventory_curse_bind", GLFW.GLFW_KEY_X, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new OpenInventoryCurseBindMessage(0, 0));
				OpenInventoryCurseBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHANT = new KeyMapping("key.craftkaisen.chant", GLFW.GLFW_KEY_U, "key.categories.jjk");
	private static long CHARGE_CURSED_ENERGY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWITCH_TECHNIQUE);
		event.register(USE_TECHNIQUE);
		event.register(FLASH_STEP);
		event.register(OPEN_MAIN_MENU_BIND);
		event.register(CHARGE_CURSED_ENERGY);
		event.register(OPEN_INVENTORY_CURSE_BIND);
		event.register(CHANT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				FLASH_STEP.consumeClick();
				OPEN_MAIN_MENU_BIND.consumeClick();
				CHARGE_CURSED_ENERGY.consumeClick();
				OPEN_INVENTORY_CURSE_BIND.consumeClick();
			}
		}
	}
}
