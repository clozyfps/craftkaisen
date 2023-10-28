package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.DomainClashGUIMenu;
import net.mcreator.craftkaisen.procedures.DisplayButton5Procedure;
import net.mcreator.craftkaisen.procedures.DisplayButton4Procedure;
import net.mcreator.craftkaisen.procedures.DisplayButton3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayButton2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayButton1Procedure;
import net.mcreator.craftkaisen.network.DomainClashGUIButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DomainClashGUIScreen extends AbstractContainerScreen<DomainClashGUIMenu> {
	private final static HashMap<String, Object> guistate = DomainClashGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_press;
	ImageButton imagebutton_press1;
	ImageButton imagebutton_press2;
	ImageButton imagebutton_press3;
	ImageButton imagebutton_press4;

	public DomainClashGUIScreen(DomainClashGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 60;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/domain_clash_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/gui.png"));
		this.blit(ms, this.leftPos + -39, this.topPos + -60, 0, 0, 178, 178, 178, 178);

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
		imagebutton_press = new ImageButton(this.leftPos + -18, this.topPos + -20, 40, 24, 0, 0, 24, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_press.png"), 40, 48, e -> {
			if (DisplayButton1Procedure.execute(entity)) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new DomainClashGUIButtonMessage(0, x, y, z));
				DomainClashGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DisplayButton1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_press", imagebutton_press);
		this.addRenderableWidget(imagebutton_press);
		imagebutton_press1 = new ImageButton(this.leftPos + 73, this.topPos + -7, 40, 24, 0, 0, 24, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_press1.png"), 40, 48, e -> {
			if (DisplayButton2Procedure.execute(entity)) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new DomainClashGUIButtonMessage(1, x, y, z));
				DomainClashGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DisplayButton2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_press1", imagebutton_press1);
		this.addRenderableWidget(imagebutton_press1);
		imagebutton_press2 = new ImageButton(this.leftPos + -15, this.topPos + 64, 40, 24, 0, 0, 24, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_press2.png"), 40, 48, e -> {
			if (DisplayButton3Procedure.execute(entity)) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new DomainClashGUIButtonMessage(2, x, y, z));
				DomainClashGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DisplayButton3Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_press2", imagebutton_press2);
		this.addRenderableWidget(imagebutton_press2);
		imagebutton_press3 = new ImageButton(this.leftPos + 72, this.topPos + 77, 40, 24, 0, 0, 24, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_press3.png"), 40, 48, e -> {
			if (DisplayButton4Procedure.execute(entity)) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new DomainClashGUIButtonMessage(3, x, y, z));
				DomainClashGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DisplayButton4Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_press3", imagebutton_press3);
		this.addRenderableWidget(imagebutton_press3);
		imagebutton_press4 = new ImageButton(this.leftPos + 18, this.topPos + 25, 40, 24, 0, 0, 24, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_press4.png"), 40, 48, e -> {
			if (DisplayButton5Procedure.execute(entity)) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new DomainClashGUIButtonMessage(4, x, y, z));
				DomainClashGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DisplayButton5Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_press4", imagebutton_press4);
		this.addRenderableWidget(imagebutton_press4);
	}
}
