package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.SkillTreeMainGUIMenu;
import net.mcreator.craftkaisen.procedures.DisplayPowerVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayPowerIVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayPowerIIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayPowerIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayPowerICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayDefenseVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayDefenseIVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayDefenseIIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayDefenseIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayDefenseICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayCursedEnergyVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayCursedEnergyIVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayCursedEnergyIIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayCursedEnergyIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayCursedEnergyICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayAgilityVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayAgilityIVCheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayAgilityIIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayAgilityIICheckProcedure;
import net.mcreator.craftkaisen.procedures.DisplayAgilityICheckProcedure;
import net.mcreator.craftkaisen.network.SkillTreeMainGUIButtonMessage;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillTreeMainGUIScreen extends AbstractContainerScreen<SkillTreeMainGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillTreeMainGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_clicked_core;
	ImageButton imagebutton_clicked_core1;
	ImageButton imagebutton_clicked_core2;
	ImageButton imagebutton_clicked_core3;
	ImageButton imagebutton_clicked_core4;
	ImageButton imagebutton_clicked_core5;
	ImageButton imagebutton_clicked_core6;
	ImageButton imagebutton_clicked_core7;
	ImageButton imagebutton_clicked_core8;
	ImageButton imagebutton_clicked_core9;
	ImageButton imagebutton_clicked_core10;
	ImageButton imagebutton_clicked_core11;
	ImageButton imagebutton_clicked_core12;
	ImageButton imagebutton_clicked_core13;
	ImageButton imagebutton_clicked_core14;
	ImageButton imagebutton_clicked_core15;
	ImageButton imagebutton_clicked_core16;
	ImageButton imagebutton_clicked_core17;
	ImageButton imagebutton_clicked_core18;
	ImageButton imagebutton_clicked_core19;

	public SkillTreeMainGUIScreen(SkillTreeMainGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + -59 && mouseX < leftPos + -35 && mouseY > topPos + -60 && mouseY < topPos + -36)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_defense_i_upgrades_max_health"), mouseX, mouseY);
		if (mouseX > leftPos + -97 && mouseX < leftPos + -73 && mouseY > topPos + -59 && mouseY < topPos + -35)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_defense_i_upgrades_max_health1"), mouseX, mouseY);
		if (mouseX > leftPos + -135 && mouseX < leftPos + -111 && mouseY > topPos + -59 && mouseY < topPos + -35)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_defense_i_upgrades_max_health2"), mouseX, mouseY);
		if (mouseX > leftPos + -113 && mouseX < leftPos + -89 && mouseY > topPos + -83 && mouseY < topPos + -59)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_defense_i_upgrades_max_health3"), mouseX, mouseY);
		if (mouseX > leftPos + -151 && mouseX < leftPos + -127 && mouseY > topPos + -82 && mouseY < topPos + -58)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_defense_i_upgrades_max_health4"), mouseX, mouseY);
		if (mouseX > leftPos + -173 && mouseX < leftPos + -149 && mouseY > topPos + -60 && mouseY < topPos + -36)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_resistence_i_upgrades_resisten"), mouseX, mouseY);
		if (mouseX > leftPos + -211 && mouseX < leftPos + -187 && mouseY > topPos + -60 && mouseY < topPos + -36)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_resistence_i_upgrades_resisten1"), mouseX, mouseY);
		if (mouseX > leftPos + -211 && mouseX < leftPos + -187 && mouseY > topPos + -20 && mouseY < topPos + 4)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_resistence_iii_upgrades_resist"), mouseX, mouseY);
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + -60 && mouseY < topPos + -36)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ce_i_increases_cursed_energy_c"), mouseX, mouseY);
		if (mouseX > leftPos + 72 && mouseX < leftPos + 96 && mouseY > topPos + -60 && mouseY < topPos + -36)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ce_ii_increases_cursed_energy"), mouseX, mouseY);
		if (mouseX > leftPos + 110 && mouseX < leftPos + 134 && mouseY > topPos + -60 && mouseY < topPos + -36)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ce_iii_increases_cursed_energy"), mouseX, mouseY);
		if (mouseX > leftPos + 133 && mouseX < leftPos + 157 && mouseY > topPos + -82 && mouseY < topPos + -58)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ce_iv_increases_cursed_energy"), mouseX, mouseY);
		if (mouseX > leftPos + 155 && mouseX < leftPos + 179 && mouseY > topPos + -104 && mouseY < topPos + -80)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ce_v_increases_cursed_energy_c"), mouseX, mouseY);
		if (mouseX > leftPos + 112 && mouseX < leftPos + 136 && mouseY > topPos + -104 && mouseY < topPos + -80)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ss4black_flash_5_sp_4_random"), mouseX, mouseY);
		if (mouseX > leftPos + -59 && mouseX < leftPos + -35 && mouseY > topPos + 35 && mouseY < topPos + 59)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_power_i_increases_melee_damage"), mouseX, mouseY);
		if (mouseX > leftPos + -81 && mouseX < leftPos + -57 && mouseY > topPos + 57 && mouseY < topPos + 81)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_power_ii_increases_melee_damag"), mouseX, mouseY);
		if (mouseX > leftPos + -103 && mouseX < leftPos + -79 && mouseY > topPos + 36 && mouseY < topPos + 60)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_power_iii_increases_melee_dama"), mouseX, mouseY);
		if (mouseX > leftPos + -142 && mouseX < leftPos + -118 && mouseY > topPos + 36 && mouseY < topPos + 60)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_power_iv_increases_melee_damag"), mouseX, mouseY);
		if (mouseX > leftPos + -164 && mouseX < leftPos + -140 && mouseY > topPos + 59 && mouseY < topPos + 83)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_power_v_increases_melee_damage"), mouseX, mouseY);
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + 36 && mouseY < topPos + 60)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_agility_i_increases_speedss9_1"), mouseX, mouseY);
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + 74 && mouseY < topPos + 98)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_agility_ii_increases_speedss9"), mouseX, mouseY);
		if (mouseX > leftPos + 58 && mouseX < leftPos + 82 && mouseY > topPos + 52 && mouseY < topPos + 76)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_agility_iii_increases_speedss9"), mouseX, mouseY);
		if (mouseX > leftPos + 92 && mouseX < leftPos + 116 && mouseY > topPos + 52 && mouseY < topPos + 76)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_agility_iv_increases_speedss9"), mouseX, mouseY);
		if (mouseX > leftPos + 128 && mouseX < leftPos + 152 && mouseY > topPos + 52 && mouseY < topPos + 76)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_agility_v_increases_speedss9_2"), mouseX, mouseY);
		if (mouseX > leftPos + 57 && mouseX < leftPos + 81 && mouseY > topPos + 13 && mouseY < topPos + 37)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_ssfflashstep_3_sp_grade_3"), mouseX, mouseY);
		if (mouseX > leftPos + -182 && mouseX < leftPos + -158 && mouseY > topPos + 36 && mouseY < topPos + 60)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_attck_knockback_i_increases_at"), mouseX, mouseY);
		if (mouseX > leftPos + -158 && mouseX < leftPos + -134 && mouseY > topPos + 14 && mouseY < topPos + 38)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_attck_knockback_ii_increases_a"), mouseX, mouseY);
		if (mouseX > leftPos + -121 && mouseX < leftPos + -97 && mouseY > topPos + 14 && mouseY < topPos + 38)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_attck_knockback_iii_increases"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/skilltree.png"));
		this.blit(ms, this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (DisplayDefenseICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -58, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayDefenseIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -96, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayDefenseIIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -134, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayDefenseIVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -112, this.topPos + -81, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayDefenseVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -150, this.topPos + -81, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayPowerICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -58, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayPowerIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -80, this.topPos + 59, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayPowerIIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -102, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayPowerIVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -141, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayPowerVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -163, this.topPos + 60, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayCursedEnergyICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 36, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayCursedEnergyIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 73, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayCursedEnergyIIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 111, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayCursedEnergyIVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 133, this.topPos + -81, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayCursedEnergyVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 155, this.topPos + -103, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayAgilityICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 36, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayAgilityIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 36, this.topPos + 76, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayAgilityIIICheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 58, this.topPos + 54, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayAgilityIVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 94, this.topPos + 54, 0, 0, 23, 23, 23, 23);
		}
		if (DisplayAgilityVCheckProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 131, this.topPos + 54, 0, 0, 23, 23, 23, 23);
		}
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
		imagebutton_clicked_core = new ImageButton(this.leftPos + -59, this.topPos + -60, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(0, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core", imagebutton_clicked_core);
		this.addRenderableWidget(imagebutton_clicked_core);
		imagebutton_clicked_core1 = new ImageButton(this.leftPos + 35, this.topPos + -60, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core1.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(1, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core1", imagebutton_clicked_core1);
		this.addRenderableWidget(imagebutton_clicked_core1);
		imagebutton_clicked_core2 = new ImageButton(this.leftPos + 35, this.topPos + 36, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core2.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(2, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core2", imagebutton_clicked_core2);
		this.addRenderableWidget(imagebutton_clicked_core2);
		imagebutton_clicked_core3 = new ImageButton(this.leftPos + -58, this.topPos + 36, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core3.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(3, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core3", imagebutton_clicked_core3);
		this.addRenderableWidget(imagebutton_clicked_core3);
		imagebutton_clicked_core4 = new ImageButton(this.leftPos + -97, this.topPos + -59, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core4.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(4, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core4", imagebutton_clicked_core4);
		this.addRenderableWidget(imagebutton_clicked_core4);
		imagebutton_clicked_core5 = new ImageButton(this.leftPos + -135, this.topPos + -58, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core5.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(5, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core5", imagebutton_clicked_core5);
		this.addRenderableWidget(imagebutton_clicked_core5);
		imagebutton_clicked_core6 = new ImageButton(this.leftPos + -113, this.topPos + -82, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core6.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(6, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core6", imagebutton_clicked_core6);
		this.addRenderableWidget(imagebutton_clicked_core6);
		imagebutton_clicked_core7 = new ImageButton(this.leftPos + -151, this.topPos + -82, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core7.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(7, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core7", imagebutton_clicked_core7);
		this.addRenderableWidget(imagebutton_clicked_core7);
		imagebutton_clicked_core8 = new ImageButton(this.leftPos + 72, this.topPos + -60, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core8.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(8, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core8", imagebutton_clicked_core8);
		this.addRenderableWidget(imagebutton_clicked_core8);
		imagebutton_clicked_core9 = new ImageButton(this.leftPos + 111, this.topPos + -59, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core9.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(9, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core9", imagebutton_clicked_core9);
		this.addRenderableWidget(imagebutton_clicked_core9);
		imagebutton_clicked_core10 = new ImageButton(this.leftPos + 133, this.topPos + -82, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core10.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(10, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core10", imagebutton_clicked_core10);
		this.addRenderableWidget(imagebutton_clicked_core10);
		imagebutton_clicked_core11 = new ImageButton(this.leftPos + 156, this.topPos + -104, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core11.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(11, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core11", imagebutton_clicked_core11);
		this.addRenderableWidget(imagebutton_clicked_core11);
		imagebutton_clicked_core12 = new ImageButton(this.leftPos + -81, this.topPos + 58, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core12.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(12, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core12", imagebutton_clicked_core12);
		this.addRenderableWidget(imagebutton_clicked_core12);
		imagebutton_clicked_core13 = new ImageButton(this.leftPos + -103, this.topPos + 37, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core13.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(13, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core13", imagebutton_clicked_core13);
		this.addRenderableWidget(imagebutton_clicked_core13);
		imagebutton_clicked_core14 = new ImageButton(this.leftPos + -141, this.topPos + 37, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core14.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(14, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core14", imagebutton_clicked_core14);
		this.addRenderableWidget(imagebutton_clicked_core14);
		imagebutton_clicked_core15 = new ImageButton(this.leftPos + -164, this.topPos + 59, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core15.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(15, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core15", imagebutton_clicked_core15);
		this.addRenderableWidget(imagebutton_clicked_core15);
		imagebutton_clicked_core16 = new ImageButton(this.leftPos + 35, this.topPos + 73, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core16.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(16, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core16", imagebutton_clicked_core16);
		this.addRenderableWidget(imagebutton_clicked_core16);
		imagebutton_clicked_core17 = new ImageButton(this.leftPos + 58, this.topPos + 52, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core17.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(17, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core17", imagebutton_clicked_core17);
		this.addRenderableWidget(imagebutton_clicked_core17);
		imagebutton_clicked_core18 = new ImageButton(this.leftPos + 93, this.topPos + 52, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core18.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(18, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core18", imagebutton_clicked_core18);
		this.addRenderableWidget(imagebutton_clicked_core18);
		imagebutton_clicked_core19 = new ImageButton(this.leftPos + 129, this.topPos + 52, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core19.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(19, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_clicked_core19", imagebutton_clicked_core19);
		this.addRenderableWidget(imagebutton_clicked_core19);
	}
}
