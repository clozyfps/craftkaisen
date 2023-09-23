package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.BasesGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BasesGUIScreen extends AbstractContainerScreen<BasesGUIMenu> {
	private final static HashMap<String, Object> guistate = BasesGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_spatial;
	Button button_swap;
	Button button_transfigure;
	Button button_jackpot;
	Button button_flame;
	Button button_speech;
	Button button_plant;

	public BasesGUIScreen(BasesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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
		button_back = new Button(this.leftPos + -116, this.topPos + -28, 66, 20, Component.translatable("gui.craftkaisen.bases_gui.button_back"), e -> {
		});
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_spatial = new Button(this.leftPos + -40, this.topPos + -28, 61, 20, Component.translatable("gui.craftkaisen.bases_gui.button_spatial"), e -> {
		});
		guistate.put("button:button_spatial", button_spatial);
		this.addRenderableWidget(button_spatial);
		button_swap = new Button(this.leftPos + 204, this.topPos + -28, 46, 20, Component.translatable("gui.craftkaisen.bases_gui.button_swap"), e -> {
		});
		guistate.put("button:button_swap", button_swap);
		this.addRenderableWidget(button_swap);
		button_transfigure = new Button(this.leftPos + 33, this.topPos + -28, 82, 20, Component.translatable("gui.craftkaisen.bases_gui.button_transfigure"), e -> {
		});
		guistate.put("button:button_transfigure", button_transfigure);
		this.addRenderableWidget(button_transfigure);
		button_jackpot = new Button(this.leftPos + 128, this.topPos + -28, 61, 20, Component.translatable("gui.craftkaisen.bases_gui.button_jackpot"), e -> {
		});
		guistate.put("button:button_jackpot", button_jackpot);
		this.addRenderableWidget(button_jackpot);
		button_flame = new Button(this.leftPos + -40, this.topPos + 3, 51, 20, Component.translatable("gui.craftkaisen.bases_gui.button_flame"), e -> {
		});
		guistate.put("button:button_flame", button_flame);
		this.addRenderableWidget(button_flame);
		button_speech = new Button(this.leftPos + 26, this.topPos + 3, 56, 20, Component.translatable("gui.craftkaisen.bases_gui.button_speech"), e -> {
		});
		guistate.put("button:button_speech", button_speech);
		this.addRenderableWidget(button_speech);
		button_plant = new Button(this.leftPos + 98, this.topPos + 3, 51, 20, Component.translatable("gui.craftkaisen.bases_gui.button_plant"), e -> {
		});
		guistate.put("button:button_plant", button_plant);
		this.addRenderableWidget(button_plant);
	}
}
