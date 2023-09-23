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
	Button button_prestige;
	ImageButton imagebutton_x;
	ImageButton imagebutton_x1;

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
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 178, this.topPos + 141, 30, 0f, 0, livingEntity);
		}
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/mainmenu.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 250, 200, 250, 200);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/lightning.png"));
		this.blit(ms, this.leftPos + 173, this.topPos + 140, 0, 0, 35, 34, 35, 34);

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

				LevelDisplayProcedure.execute(entity), 16, 33, -13496561);
		this.font.draw(poseStack,

				ExpDisplayProcedure.execute(entity), 16, 51, -13496561);
		this.font.draw(poseStack,

				TechniqueDisplayProcedure.execute(entity), 70, 141, -13496561);
		this.font.draw(poseStack,

				SPDisplayProcedure.execute(entity), 16, 69, -13496561);
		this.font.draw(poseStack,

				JobValueProcedure.execute(entity), 43, 87, -13627890);
		this.font.draw(poseStack,

				GradeValueProcedure.execute(entity), 16, 105, -13627890);
		this.font.draw(poseStack,

				FameValueProcedure.execute(entity), 52, 123, -13627890);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.main_menu.label_empty1"), 16, 87, -13824755);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.main_menu.label_fame"), 16, 123, -13824755);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.main_menu.label_technique"), 16, 141, -13824755);
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
		button_prestige = new Button(this.leftPos + 7, this.topPos + 159, 67, 20, Component.translatable("gui.craftkaisen.main_menu.button_prestige"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(0, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_prestige", button_prestige);
		this.addRenderableWidget(button_prestige);
		imagebutton_x = new ImageButton(this.leftPos + 152, this.topPos + 151, 20, 20, 0, 0, 20, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_x.png"), 20, 40, e -> {
		});
		guistate.put("button:imagebutton_x", imagebutton_x);
		this.addRenderableWidget(imagebutton_x);
		imagebutton_x1 = new ImageButton(this.leftPos + 177, this.topPos + 150, 20, 20, 0, 0, 20, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_x1.png"), 20, 40, e -> {
		});
		guistate.put("button:imagebutton_x1", imagebutton_x1);
		this.addRenderableWidget(imagebutton_x1);
	}
}
