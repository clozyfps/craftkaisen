package net.mcreator.craftkaisen.client.gui;

public class SkillTreeUpgradeGUIScreen extends AbstractContainerScreen<SkillTreeUpgradeGUIMenu> {

	private final static HashMap<String, Object> guistate = SkillTreeUpgradeGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_upgrade_defense;

	public SkillTreeUpgradeGUIScreen(SkillTreeUpgradeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/skill_tree_upgrade_gui.png");

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

				DisplayDefenseCostProcedure.execute(), 7, 51, -12829636);
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

		button_upgrade_defense = new Button(this.leftPos + 6, this.topPos + 27, 103, 20, Component.translatable("gui.craftkaisen.skill_tree_upgrade_gui.button_upgrade_defense"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SkillTreeUpgradeGUIButtonMessage(0, x, y, z));
				SkillTreeUpgradeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_upgrade_defense", button_upgrade_defense);
		this.addRenderableWidget(button_upgrade_defense);

	}

}
