package net.mcreator.craftkaisen.client.gui;

public class CursedEnergySkillTreeScreen extends AbstractContainerScreen<CursedEnergySkillTreeMenu> {

	private final static HashMap<String, Object> guistate = CursedEnergySkillTreeMenu.guistate;

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
	Button button_empty13;

	public CursedEnergySkillTreeScreen(CursedEnergySkillTreeMenu container, Inventory inventory, Component text) {
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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.label_strength_skill_tree"), 24, -27, -1);
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

		button_empty = new Button(this.leftPos + -105, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty"), e -> {
		});

		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);

		button_empty1 = new Button(this.leftPos + -65, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty1"), e -> {
		});

		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);

		button_empty2 = new Button(this.leftPos + 54, this.topPos + 53, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty2"), e -> {
		});

		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);

		button_empty3 = new Button(this.leftPos + -25, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty3"), e -> {
		});

		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);

		button_empty4 = new Button(this.leftPos + 54, this.topPos + 93, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty4"), e -> {
		});

		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);

		button_empty5 = new Button(this.leftPos + 14, this.topPos + 93, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty5"), e -> {
		});

		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);

		button_empty6 = new Button(this.leftPos + 14, this.topPos + 53, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty6"), e -> {
		});

		guistate.put("button:button_empty6", button_empty6);
		this.addRenderableWidget(button_empty6);

		button_empty7 = new Button(this.leftPos + 94, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty7"), e -> {
		});

		guistate.put("button:button_empty7", button_empty7);
		this.addRenderableWidget(button_empty7);

		button_empty8 = new Button(this.leftPos + 134, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty8"), e -> {
		});

		guistate.put("button:button_empty8", button_empty8);
		this.addRenderableWidget(button_empty8);

		button_empty9 = new Button(this.leftPos + 174, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty9"), e -> {
		});

		guistate.put("button:button_empty9", button_empty9);
		this.addRenderableWidget(button_empty9);

		button_empty10 = new Button(this.leftPos + 214, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty10"), e -> {
		});

		guistate.put("button:button_empty10", button_empty10);
		this.addRenderableWidget(button_empty10);

		button_empty11 = new Button(this.leftPos + 254, this.topPos + 73, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty11"), e -> {
		});

		guistate.put("button:button_empty11", button_empty11);
		this.addRenderableWidget(button_empty11);

		button_empty12 = new Button(this.leftPos + 134, this.topPos + 43, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty12"), e -> {
		});

		guistate.put("button:button_empty12", button_empty12);
		this.addRenderableWidget(button_empty12);

		button_back = new Button(this.leftPos + 64, this.topPos + 173, 46, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_back"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedEnergySkillTreeButtonMessage(13, x, y, z));
				CursedEnergySkillTreeButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});

		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);

		button_empty13 = new Button(this.leftPos + 134, this.topPos + 103, 30, 20, Component.translatable("gui.craftkaisen.cursed_energy_skill_tree.button_empty13"), e -> {
		});

		guistate.put("button:button_empty13", button_empty13);
		this.addRenderableWidget(button_empty13);

	}

}
