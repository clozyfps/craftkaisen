package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.StrengthSkillTreeGUIMenu;
import net.mcreator.craftkaisen.network.StrengthSkillTreeGUIButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StrengthSkillTreeGUIScreen extends AbstractContainerScreen<StrengthSkillTreeGUIMenu> {
	private final static HashMap<String, Object> guistate = StrengthSkillTreeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;
	Button button_empty6;
	Button button_empty7;
	Button button_empty8;
	Button button_empty9;
	Button button_empty10;
	Button button_empty11;
	Button button_empty12;
	Button button_back;

	public StrengthSkillTreeGUIScreen(StrengthSkillTreeGUIMenu container, Inventory inventory, Component text) {
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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.label_strength_skill_tree"), 34, -27, -1);
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
		button_empty = new Button(this.leftPos + -105, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(0, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + -65, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(1, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + -25, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty2"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(2, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + -25, this.topPos + 43, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty3"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(3, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new Button(this.leftPos + 14, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty4"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(4, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
		button_empty5 = new Button(this.leftPos + 54, this.topPos + 93, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty5"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(5, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);
		button_empty6 = new Button(this.leftPos + 54, this.topPos + 53, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty6"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(6, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_empty6", button_empty6);
		this.addRenderableWidget(button_empty6);
		button_empty7 = new Button(this.leftPos + 94, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty7"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(7, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_empty7", button_empty7);
		this.addRenderableWidget(button_empty7);
		button_empty8 = new Button(this.leftPos + 134, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty8"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(8, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:button_empty8", button_empty8);
		this.addRenderableWidget(button_empty8);
		button_empty9 = new Button(this.leftPos + 174, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty9"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(9, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:button_empty9", button_empty9);
		this.addRenderableWidget(button_empty9);
		button_empty10 = new Button(this.leftPos + 214, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty10"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(10, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:button_empty10", button_empty10);
		this.addRenderableWidget(button_empty10);
		button_empty11 = new Button(this.leftPos + 254, this.topPos + 93, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty11"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(11, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:button_empty11", button_empty11);
		this.addRenderableWidget(button_empty11);
		button_empty12 = new Button(this.leftPos + 254, this.topPos + 53, 30, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_empty12"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(12, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:button_empty12", button_empty12);
		this.addRenderableWidget(button_empty12);
		button_back = new Button(this.leftPos + 64, this.topPos + 173, 46, 20, Component.translatable("gui.craftkaisen.strength_skill_tree_gui.button_back"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new StrengthSkillTreeGUIButtonMessage(13, x, y, z));
				StrengthSkillTreeGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
