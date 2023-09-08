package net.mcreator.craftkaisen.client.gui;

public class SkillTreeMainGUIScreen extends AbstractContainerScreen<SkillTreeMainGUIMenu> {

	private final static HashMap<String, Object> guistate = SkillTreeMainGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_clicked_core;
	ImageButton imagebutton_clicked_core1;
	ImageButton imagebutton_clicked_core2;
	ImageButton imagebutton_clicked_core3;

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

		if (mouseX > leftPos + -59 && mouseX < leftPos + -35 && mouseY > topPos + -59 && mouseY < topPos + -35)
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
		if (mouseX > leftPos + -181 && mouseX < leftPos + -157 && mouseY > topPos + 36 && mouseY < topPos + 60)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_attck_knockback_i_increases_at"), mouseX, mouseY);
		if (mouseX > leftPos + -158 && mouseX < leftPos + -134 && mouseY > topPos + 14 && mouseY < topPos + 38)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_attck_knockback_ii_increases_a"), mouseX, mouseY);
		if (mouseX > leftPos + -121 && mouseX < leftPos + -97 && mouseY > topPos + 14 && mouseY < topPos + 38)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_attck_knockback_iii_increases"), mouseX, mouseY);
		if (mouseX > leftPos + -38 && mouseX < leftPos + -14 && mouseY > topPos + -24 && mouseY < topPos + 0)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_secondary_branc"), mouseX, mouseY);
		if (mouseX > leftPos + -24 && mouseX < leftPos + 0 && mouseY > topPos + -39 && mouseY < topPos + -15)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_main_defense_br"), mouseX, mouseY);
		if (mouseX > leftPos + -24 && mouseX < leftPos + 0 && mouseY > topPos + 16 && mouseY < topPos + 40)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_secondary_branc1"), mouseX, mouseY);
		if (mouseX > leftPos + -38 && mouseX < leftPos + -14 && mouseY > topPos + 0 && mouseY < topPos + 24)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_main_power_bran"), mouseX, mouseY);
		if (mouseX > leftPos + 0 && mouseX < leftPos + 24 && mouseY > topPos + 16 && mouseY < topPos + 40)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_main_agility_br"), mouseX, mouseY);
		if (mouseX > leftPos + 16 && mouseX < leftPos + 40 && mouseY > topPos + -24 && mouseY < topPos + 0)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_main_power_bran1"), mouseX, mouseY);
		if (mouseX > leftPos + 16 && mouseX < leftPos + 40 && mouseY > topPos + 0 && mouseY < topPos + 24)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_secondary_branc2"), mouseX, mouseY);
		if (mouseX > leftPos + 0 && mouseX < leftPos + 24 && mouseY > topPos + -39 && mouseY < topPos + -15)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.skill_tree_main_gui.tooltip_click_to_upgrade_secondary_branc3"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/skilltree.png"));
		this.blit(ms, this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (

		DisplayDefenseICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -58, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayDefenseIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -96, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayDefenseIIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -134, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayDefenseIVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -112, this.topPos + -81, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayDefenseVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -150, this.topPos + -81, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayPowerICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -58, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayPowerIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -80, this.topPos + 59, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayPowerIIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -102, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayPowerIVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -141, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayPowerVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + -163, this.topPos + 60, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayCursedEnergyICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 36, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayCursedEnergyIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 73, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayCursedEnergyIIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 111, this.topPos + -58, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayCursedEnergyIVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 133, this.topPos + -81, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayCursedEnergyVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 155, this.topPos + -103, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayAgilityICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 36, this.topPos + 37, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayAgilityIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 36, this.topPos + 76, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayAgilityIIICheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 58, this.topPos + 54, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayAgilityIVCheckProcedure.execute()

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/i.png"));
			this.blit(ms, this.leftPos + 94, this.topPos + 54, 0, 0, 23, 23, 23, 23);
		}
		if (

		DisplayAgilityVCheckProcedure.execute()

		) {
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

		imagebutton_clicked_core = new ImageButton(this.leftPos + -24, this.topPos + -39, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(0, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:imagebutton_clicked_core", imagebutton_clicked_core);
		this.addRenderableWidget(imagebutton_clicked_core);

		imagebutton_clicked_core1 = new ImageButton(this.leftPos + 17, this.topPos + -24, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core1.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(1, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});

		guistate.put("button:imagebutton_clicked_core1", imagebutton_clicked_core1);
		this.addRenderableWidget(imagebutton_clicked_core1);

		imagebutton_clicked_core2 = new ImageButton(this.leftPos + 0, this.topPos + 17, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core2.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(2, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});

		guistate.put("button:imagebutton_clicked_core2", imagebutton_clicked_core2);
		this.addRenderableWidget(imagebutton_clicked_core2);

		imagebutton_clicked_core3 = new ImageButton(this.leftPos + -38, this.topPos + 1, 23, 23, 0, 0, 23, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_clicked_core3.png"), 23, 46, e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeMainGUIButtonMessage(3, x, y, z));
				SkillTreeMainGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});

		guistate.put("button:imagebutton_clicked_core3", imagebutton_clicked_core3);
		this.addRenderableWidget(imagebutton_clicked_core3);

	}

}
