
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
import net.mcreator.craftkaisen.network.SimpleDomainMessage;
import net.mcreator.craftkaisen.network.ReverseCursedTechniqueBindMessage;
import net.mcreator.craftkaisen.network.OpenMainMenuBindMessage;
import net.mcreator.craftkaisen.network.OpenInventoryCurseBindMessage;
import net.mcreator.craftkaisen.network.ManipulationWheelOpenMessage;
import net.mcreator.craftkaisen.network.LeaveEnterMechMessage;
import net.mcreator.craftkaisen.network.FlashStepMessage;
import net.mcreator.craftkaisen.network.ChargeCursedEnergyMessage;
import net.mcreator.craftkaisen.network.Ability7Message;
import net.mcreator.craftkaisen.network.Ability6Message;
import net.mcreator.craftkaisen.network.Ability5Message;
import net.mcreator.craftkaisen.network.Ability4Message;
import net.mcreator.craftkaisen.network.Ability3Message;
import net.mcreator.craftkaisen.network.Ability2Message;
import net.mcreator.craftkaisen.network.Ability1Message;
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
	public static final KeyMapping LEAVE_ENTER_MECH = new KeyMapping("key.craftkaisen.leave_enter_mech", GLFW.GLFW_KEY_B, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new LeaveEnterMechMessage(0, 0));
				LeaveEnterMechMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping REVERSE_CURSED_TECHNIQUE_BIND = new KeyMapping("key.craftkaisen.reverse_cursed_technique_bind", GLFW.GLFW_KEY_H, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ReverseCursedTechniqueBindMessage(0, 0));
				ReverseCursedTechniqueBindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MANIPULATION_WHEEL_OPEN = new KeyMapping("key.craftkaisen.manipulation_wheel_open", GLFW.GLFW_KEY_M, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ManipulationWheelOpenMessage(0, 0));
				ManipulationWheelOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				MANIPULATION_WHEEL_OPEN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - MANIPULATION_WHEEL_OPEN_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ManipulationWheelOpenMessage(1, dt));
				ManipulationWheelOpenMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SIMPLE_DOMAIN = new KeyMapping("key.craftkaisen.simple_domain", GLFW.GLFW_KEY_N, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SimpleDomainMessage(0, 0));
				SimpleDomainMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SIMPLE_DOMAIN_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SIMPLE_DOMAIN_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SimpleDomainMessage(1, dt));
				SimpleDomainMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_1 = new KeyMapping("key.craftkaisen.ability_1", GLFW.GLFW_KEY_Z, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability1Message(0, 0));
				Ability1Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_1_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_1_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability1Message(1, dt));
				Ability1Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_2 = new KeyMapping("key.craftkaisen.ability_2", GLFW.GLFW_KEY_X, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability2Message(0, 0));
				Ability2Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_2_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_2_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability2Message(1, dt));
				Ability2Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_3 = new KeyMapping("key.craftkaisen.ability_3", GLFW.GLFW_KEY_C, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability3Message(0, 0));
				Ability3Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_3_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_3_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability3Message(1, dt));
				Ability3Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_4 = new KeyMapping("key.craftkaisen.ability_4", GLFW.GLFW_KEY_V, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability4Message(0, 0));
				Ability4Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_4_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_4_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability4Message(1, dt));
				Ability4Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_5 = new KeyMapping("key.craftkaisen.ability_5", GLFW.GLFW_KEY_B, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability5Message(0, 0));
				Ability5Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_5_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_5_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability5Message(1, dt));
				Ability5Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_6 = new KeyMapping("key.craftkaisen.ability_6", GLFW.GLFW_KEY_N, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability6Message(0, 0));
				Ability6Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_6_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_6_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability6Message(1, dt));
				Ability6Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_7 = new KeyMapping("key.craftkaisen.ability_7", GLFW.GLFW_KEY_M, "key.categories.jjk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability7Message(0, 0));
				Ability7Message.pressAction(Minecraft.getInstance().player, 0, 0);
				ABILITY_7_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ABILITY_7_LASTPRESS);
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Ability7Message(1, dt));
				Ability7Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long CHARGE_CURSED_ENERGY_LASTPRESS = 0;
	private static long MANIPULATION_WHEEL_OPEN_LASTPRESS = 0;
	private static long SIMPLE_DOMAIN_LASTPRESS = 0;
	private static long ABILITY_1_LASTPRESS = 0;
	private static long ABILITY_2_LASTPRESS = 0;
	private static long ABILITY_3_LASTPRESS = 0;
	private static long ABILITY_4_LASTPRESS = 0;
	private static long ABILITY_5_LASTPRESS = 0;
	private static long ABILITY_6_LASTPRESS = 0;
	private static long ABILITY_7_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWITCH_TECHNIQUE);
		event.register(USE_TECHNIQUE);
		event.register(FLASH_STEP);
		event.register(OPEN_MAIN_MENU_BIND);
		event.register(CHARGE_CURSED_ENERGY);
		event.register(OPEN_INVENTORY_CURSE_BIND);
		event.register(LEAVE_ENTER_MECH);
		event.register(REVERSE_CURSED_TECHNIQUE_BIND);
		event.register(MANIPULATION_WHEEL_OPEN);
		event.register(SIMPLE_DOMAIN);
		event.register(ABILITY_1);
		event.register(ABILITY_2);
		event.register(ABILITY_3);
		event.register(ABILITY_4);
		event.register(ABILITY_5);
		event.register(ABILITY_6);
		event.register(ABILITY_7);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SWITCH_TECHNIQUE.consumeClick();
				USE_TECHNIQUE.consumeClick();
				FLASH_STEP.consumeClick();
				OPEN_MAIN_MENU_BIND.consumeClick();
				CHARGE_CURSED_ENERGY.consumeClick();
				OPEN_INVENTORY_CURSE_BIND.consumeClick();
				LEAVE_ENTER_MECH.consumeClick();
				REVERSE_CURSED_TECHNIQUE_BIND.consumeClick();
				MANIPULATION_WHEEL_OPEN.consumeClick();
				SIMPLE_DOMAIN.consumeClick();
				ABILITY_1.consumeClick();
				ABILITY_2.consumeClick();
				ABILITY_3.consumeClick();
				ABILITY_4.consumeClick();
				ABILITY_5.consumeClick();
				ABILITY_6.consumeClick();
				ABILITY_7.consumeClick();
			}
		}
	}
}
