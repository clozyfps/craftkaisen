package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.TojiContractGuiMenu;
import net.mcreator.craftkaisen.network.TojiContractGuiButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TojiContractGuiScreen extends AbstractContainerScreen<TojiContractGuiMenu> {
	private final static HashMap<String, Object> guistate = TojiContractGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox TojiPlayerKill;
	Button button_purchase;

	public TojiContractGuiScreen(TojiContractGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 132;
		this.imageHeight = 32;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/toji_contract_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		TojiPlayerKill.render(ms, mouseX, mouseY, partialTicks);
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
		if (TojiPlayerKill.isFocused())
			return TojiPlayerKill.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TojiPlayerKill.tick();
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
		TojiPlayerKill = new EditBox(this.font, this.leftPos + 5, this.topPos + 5, 120, 20, Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill").getString());
				else
					setSuggestion(null);
			}
		};
		TojiPlayerKill.setMaxLength(32767);
		guistate.put("text:TojiPlayerKill", TojiPlayerKill);
		this.addWidget(this.TojiPlayerKill);
		button_purchase = new Button(this.leftPos + 32, this.topPos + 26, 67, 20, Component.translatable("gui.craftkaisen.toji_contract_gui.button_purchase"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new TojiContractGuiButtonMessage(0, x, y, z));
				TojiContractGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_purchase", button_purchase);
		this.addRenderableWidget(button_purchase);
	}
}
