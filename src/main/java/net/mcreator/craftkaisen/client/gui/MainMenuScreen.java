package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.procedures.TechniqueDisplayProcedure;
import net.mcreator.craftkaisen.procedures.SPDisplayProcedure;
import net.mcreator.craftkaisen.procedures.LevelDisplayProcedure;
import net.mcreator.craftkaisen.procedures.JobValueProcedure;
import net.mcreator.craftkaisen.procedures.GradeValueProcedure;
import net.mcreator.craftkaisen.procedures.FameValueProcedure;
import net.mcreator.craftkaisen.procedures.ExpDisplayProcedure;
import net.mcreator.craftkaisen.procedures.DisplayPlayerProcedure;
import net.mcreator.craftkaisen.network.MainMenuButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainMenuScreen extends AbstractContainerScreen<MainMenuMenu> {
	private final static HashMap<String, Object> guistate = MainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_technique;
	ImageButton imagebutton_st_button_2;

	public MainMenuScreen(MainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 200;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		if (DisplayPlayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 67, this.topPos + 149, 30, 0f, 0, livingEntity);
		}
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/newmenu.png"));
		this.blit(ms, this.leftPos + -93, this.topPos + -27, 0, 0, 427, 240, 427, 240);

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
		this.font.draw(poseStack,

				LevelDisplayProcedure.execute(entity), -73, -3, -13496561);
		this.font.draw(poseStack,

				ExpDisplayProcedure.execute(entity), -73, 15, -13496561);
		this.font.draw(poseStack,

				TechniqueDisplayProcedure.execute(entity), -73, 105, -13496561);
		this.font.draw(poseStack,

				SPDisplayProcedure.execute(entity), -73, 33, -13496561);
		this.font.draw(poseStack,

				JobValueProcedure.execute(entity), -73, 51, -13627890);
		this.font.draw(poseStack,

				GradeValueProcedure.execute(entity), -73, 69, -13627890);
		this.font.draw(poseStack,

				FameValueProcedure.execute(entity), -73, 87, -13627890);
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
		button_technique = new Button(this.leftPos + 25, this.topPos + -6, 72, 20, Component.translatable("gui.craftkaisen.main_menu.button_technique"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(0, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_technique", button_technique);
		this.addRenderableWidget(button_technique);
		imagebutton_st_button_2 = new ImageButton(this.leftPos + -65, this.topPos + 127, 74, 13, 0, 0, 13, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_st_button_2.png"), 74, 26, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(1, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_st_button_2", imagebutton_st_button_2);
		this.addRenderableWidget(imagebutton_st_button_2);
	}
}
