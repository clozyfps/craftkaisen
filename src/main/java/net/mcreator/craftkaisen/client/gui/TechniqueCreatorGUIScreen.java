package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.TechniqueCreatorGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TechniqueCreatorGUIScreen extends AbstractContainerScreen<TechniqueCreatorGUIMenu> {
	private final static HashMap<String, Object> guistate = TechniqueCreatorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox TechniqueName;
	Checkbox ImbueTechnique;
	Checkbox ReverseEffect;
	Button button_create;
	Button button_technique_specific_settings;

	public TechniqueCreatorGUIScreen(TechniqueCreatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 135;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/technique_creator_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		TechniqueName.render(ms, mouseX, mouseY, partialTicks);
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
		if (TechniqueName.isFocused())
			return TechniqueName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TechniqueName.tick();
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
		TechniqueName = new EditBox(this.font, this.leftPos + 27, this.topPos + 30, 120, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName").getString());
				else
					setSuggestion(null);
			}
		};
		TechniqueName.setMaxLength(32767);
		guistate.put("text:TechniqueName", TechniqueName);
		this.addWidget(this.TechniqueName);
		button_create = new Button(this.leftPos + 59, this.topPos + 124, 56, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.button_create"), e -> {
		});
		guistate.put("button:button_create", button_create);
		this.addRenderableWidget(button_create);
		button_technique_specific_settings = new Button(this.leftPos + 4, this.topPos + 3, 166, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.button_technique_specific_settings"), e -> {
		});
		guistate.put("button:button_technique_specific_settings", button_technique_specific_settings);
		this.addRenderableWidget(button_technique_specific_settings);
		ImbueTechnique = new Checkbox(this.leftPos + 27, this.topPos + 60, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.ImbueTechnique"), false);
		guistate.put("checkbox:ImbueTechnique", ImbueTechnique);
		this.addRenderableWidget(ImbueTechnique);
		ReverseEffect = new Checkbox(this.leftPos + 27, this.topPos + 94, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.ReverseEffect"), false);
		guistate.put("checkbox:ReverseEffect", ReverseEffect);
		this.addRenderableWidget(ReverseEffect);
	}
}
