package net.mcreator.craftkaisen.client.gui;

public class SelfVowGUIScreen extends AbstractContainerScreen<SelfVowGUIMenu> {

	private final static HashMap<String, Object> guistate = SelfVowGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Checkbox HeartsForCE;
	Checkbox CEForHearts;

	Button button_vow;

	public SelfVowGUIScreen(SelfVowGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 220;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/self_vow_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		this.renderTooltip(ms, mouseX, mouseY);

		if (mouseX > leftPos + 11 && mouseX < leftPos + 35 && mouseY > topPos + 21 && mouseY < topPos + 45)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.self_vow_gui.tooltip_will_trade_2_hearts_for_100_more"), mouseX, mouseY);
		if (mouseX > leftPos + 11 && mouseX < leftPos + 35 && mouseY > topPos + 51 && mouseY < topPos + 75)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.self_vow_gui.tooltip_will_trade_100_from_your_ce_cap"), mouseX, mouseY);
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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.self_vow_gui.label_self_vows"), 86, 7, -12829636);
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

		button_vow = new Button(this.leftPos + 90, this.topPos + 173, 40, 20, Component.translatable("gui.craftkaisen.self_vow_gui.button_vow"), e -> {
		});

		guistate.put("button:button_vow", button_vow);
		this.addRenderableWidget(button_vow);

		HeartsForCE = new Checkbox(this.leftPos + 13, this.topPos + 23, 20, 20, Component.translatable("gui.craftkaisen.self_vow_gui.HeartsForCE"), false);

		guistate.put("checkbox:HeartsForCE", HeartsForCE);
		this.addRenderableWidget(HeartsForCE);
		CEForHearts = new Checkbox(this.leftPos + 13, this.topPos + 53, 20, 20, Component.translatable("gui.craftkaisen.self_vow_gui.CEForHearts"), false);

		guistate.put("checkbox:CEForHearts", CEForHearts);
		this.addRenderableWidget(CEForHearts);
	}

}
