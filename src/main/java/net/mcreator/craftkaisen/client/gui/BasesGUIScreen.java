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

import net.mcreator.craftkaisen.world.inventory.BasesGUIMenu;
import net.mcreator.craftkaisen.procedures.ErrorDisplayProcedure;
import net.mcreator.craftkaisen.procedures.DIsplayErrorProcedure;
import net.mcreator.craftkaisen.network.BasesGUIButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BasesGUIScreen extends AbstractContainerScreen<BasesGUIMenu> {
	private final static HashMap<String, Object> guistate = BasesGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox ChoiceBox;
	Button button_confirm;

	public BasesGUIScreen(BasesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 512;
		this.imageHeight = 512;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/bases_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		ChoiceBox.render(ms, mouseX, mouseY, partialTicks);
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
		if (ChoiceBox.isFocused())
			return ChoiceBox.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		ChoiceBox.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.bases_gui.label_bases"), 70, 172, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.bases_gui.label_spaitial_transfiguration_corru"), 92, 187, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.bases_gui.label_string_world_marker"), 92, 201, -12829636);
		if (ErrorDisplayProcedure.execute(entity))
			this.font.draw(poseStack,

					DIsplayErrorProcedure.execute(entity), 166, 140, -65536);
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
		ChoiceBox = new EditBox(this.font, this.leftPos + 165, this.topPos + 153, 120, 20, Component.translatable("gui.craftkaisen.bases_gui.ChoiceBox")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.bases_gui.ChoiceBox").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.bases_gui.ChoiceBox").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.bases_gui.ChoiceBox").getString());
				else
					setSuggestion(null);
			}
		};
		ChoiceBox.setMaxLength(32767);
		guistate.put("text:ChoiceBox", ChoiceBox);
		this.addWidget(this.ChoiceBox);
		button_confirm = new Button(this.leftPos + 300, this.topPos + 153, 61, 20, Component.translatable("gui.craftkaisen.bases_gui.button_confirm"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new BasesGUIButtonMessage(0, x, y, z));
				BasesGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_confirm", button_confirm);
		this.addRenderableWidget(button_confirm);
	}
}
