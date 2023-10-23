package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.ManipulationSlotGuiMenu;
import net.mcreator.craftkaisen.network.ManipulationSlotGuiButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ManipulationSlotGuiScreen extends AbstractContainerScreen<ManipulationSlotGuiMenu> {
	private final static HashMap<String, Object> guistate = ManipulationSlotGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;

	public ManipulationSlotGuiScreen(ManipulationSlotGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 220;
		this.imageHeight = 120;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/manipulation_slot_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.manipulation_slot_gui.label_select_the_slot_of_the_cursed_sp"), 13, 27, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_1 = new Button(this.leftPos + 17, this.topPos + 46, 30, 20, Component.translatable("gui.craftkaisen.manipulation_slot_gui.button_1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ManipulationSlotGuiButtonMessage(0, x, y, z));
				ManipulationSlotGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = new Button(this.leftPos + 71, this.topPos + 46, 30, 20, Component.translatable("gui.craftkaisen.manipulation_slot_gui.button_2"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ManipulationSlotGuiButtonMessage(1, x, y, z));
				ManipulationSlotGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = new Button(this.leftPos + 122, this.topPos + 46, 30, 20, Component.translatable("gui.craftkaisen.manipulation_slot_gui.button_3"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ManipulationSlotGuiButtonMessage(2, x, y, z));
				ManipulationSlotGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_4 = new Button(this.leftPos + 171, this.topPos + 46, 30, 20, Component.translatable("gui.craftkaisen.manipulation_slot_gui.button_4"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new ManipulationSlotGuiButtonMessage(3, x, y, z));
				ManipulationSlotGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);
	}
}
