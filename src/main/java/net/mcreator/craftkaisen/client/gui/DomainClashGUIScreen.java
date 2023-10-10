package net.mcreator.craftkaisen.client.gui;

public class DomainClashGUIScreen extends AbstractContainerScreen<DomainClashGUIMenu> {

	private final static HashMap<String, Object> guistate = DomainClashGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_empty;

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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.domain_clash_gui.label_domain_clash"), 15, -31, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.domain_clash_gui.label_click"), 30, -17, -1);
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

		button_empty = new Button(this.leftPos + 33, this.topPos + 19, 30, 20, Component.translatable("gui.craftkaisen.domain_clash_gui.button_empty"), e -> {
		});

		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);

	}

}
