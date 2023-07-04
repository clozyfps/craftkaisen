package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.Strength5Menu;
import net.mcreator.craftkaisen.network.Strength5ButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Strength5Screen extends AbstractContainerScreen<Strength5Menu> {
	private final static HashMap<String, Object> guistate = Strength5Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_yes;
	Button button_no;

	public Strength5Screen(Strength5Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/strength_5.png");

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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_5.label_core"), 74, 13, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_5.label_this_is_the_core_of_your_abiliti"), 26, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_5.label_abilities_everything_derives_fr"), 16, 63, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_5.label_from_this"), 54, 83, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_5.label_learn_this"), 59, 113, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_5.label_cost_0"), 66, 123, -12829636);
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
		button_yes = new Button(this.leftPos + 16, this.topPos + 133, 40, 20, Component.translatable("gui.craftkaisen.strength_5.button_yes"), e -> {
		});
		guistate.put("button:button_yes", button_yes);
		this.addRenderableWidget(button_yes);
		button_no = new Button(this.leftPos + 116, this.topPos + 133, 35, 20, Component.translatable("gui.craftkaisen.strength_5.button_no"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new Strength5ButtonMessage(1, x, y, z));
				Strength5ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_no", button_no);
		this.addRenderableWidget(button_no);
	}
}
