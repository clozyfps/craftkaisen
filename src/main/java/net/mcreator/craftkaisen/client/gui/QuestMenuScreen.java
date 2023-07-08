package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.QuestMenuMenu;
import net.mcreator.craftkaisen.network.QuestMenuButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class QuestMenuScreen extends AbstractContainerScreen<QuestMenuMenu> {
	private final static HashMap<String, Object> guistate = QuestMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_skill_tree;
	Button button_skill_tree1;

	public QuestMenuScreen(QuestMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 188;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/quest_menu.png");

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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.quest_menu.label_main_menu"), 84, 7, -12829636);
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
		button_skill_tree = new Button(this.leftPos + 152, this.topPos + 18, 77, 20, Component.translatable("gui.craftkaisen.quest_menu.button_skill_tree"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new QuestMenuButtonMessage(0, x, y, z));
				QuestMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_skill_tree", button_skill_tree);
		this.addRenderableWidget(button_skill_tree);
		button_skill_tree1 = new Button(this.leftPos + -34, this.topPos + 18, 77, 20, Component.translatable("gui.craftkaisen.quest_menu.button_skill_tree1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new QuestMenuButtonMessage(1, x, y, z));
				QuestMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_skill_tree1", button_skill_tree1);
		this.addRenderableWidget(button_skill_tree1);
	}
}
