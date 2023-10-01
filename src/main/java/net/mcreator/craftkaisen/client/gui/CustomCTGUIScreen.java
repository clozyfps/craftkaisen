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

import net.mcreator.craftkaisen.world.inventory.CustomCTGUIMenu;
import net.mcreator.craftkaisen.procedures.ErrorDisplayProcedure;
import net.mcreator.craftkaisen.procedures.DIsplayErrorProcedure;
import net.mcreator.craftkaisen.network.CustomCTGUIButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CustomCTGUIScreen extends AbstractContainerScreen<CustomCTGUIMenu> {
	private final static HashMap<String, Object> guistate = CustomCTGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox CTName;
	Button button_finish;
	Button button_finish1;
	Button button_finish2;

	public CustomCTGUIScreen(CustomCTGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 100;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/custom_ctgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		CTName.render(ms, mouseX, mouseY, partialTicks);
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
		if (CTName.isFocused())
			return CTName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		CTName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.custom_ctgui.label_technique_creator"), 55, 7, -12829636);
		if (ErrorDisplayProcedure.execute(entity))
			this.font.draw(poseStack,

					DIsplayErrorProcedure.execute(entity), 74, 50, -65536);
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
		CTName = new EditBox(this.font, this.leftPos + 39, this.topPos + 20, 120, 20, Component.translatable("gui.craftkaisen.custom_ctgui.CTName")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.custom_ctgui.CTName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.custom_ctgui.CTName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.custom_ctgui.CTName").getString());
				else
					setSuggestion(null);
			}
		};
		CTName.setMaxLength(32767);
		guistate.put("text:CTName", CTName);
		this.addWidget(this.CTName);
		button_finish = new Button(this.leftPos + 71, this.topPos + 72, 56, 20, Component.translatable("gui.craftkaisen.custom_ctgui.button_finish"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CustomCTGUIButtonMessage(0, x, y, z));
				CustomCTGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_finish", button_finish);
		this.addRenderableWidget(button_finish);
		button_finish1 = new Button(this.leftPos + 127, this.topPos + 46, 56, 20, Component.translatable("gui.craftkaisen.custom_ctgui.button_finish1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CustomCTGUIButtonMessage(1, x, y, z));
				CustomCTGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_finish1", button_finish1);
		this.addRenderableWidget(button_finish1);
		button_finish2 = new Button(this.leftPos + 15, this.topPos + 46, 56, 20, Component.translatable("gui.craftkaisen.custom_ctgui.button_finish2"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CustomCTGUIButtonMessage(2, x, y, z));
				CustomCTGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_finish2", button_finish2);
		this.addRenderableWidget(button_finish2);
	}
}
