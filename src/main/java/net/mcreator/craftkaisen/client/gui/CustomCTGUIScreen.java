package net.mcreator.craftkaisen.client.gui;

public class CustomCTGUIScreen extends AbstractContainerScreen<CustomCTGUIMenu> {

	private final static HashMap<String, Object> guistate = CustomCTGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox CTName;

	Button button_finish;
	Button button_finish1;
	Button button_finish2;

	public CustomCTGUIScreen(CustomCTGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 100;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/custom_ctgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		CTName.render(ms, mouseX, mouseY, partialTicks);

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

		if (CTName.isFocused())
			return CTName.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		CTName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.custom_ctgui.label_technique_creator"), 55, 7, -12829636);
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

		CTName = new EditBox(this.font, this.leftPos + 39, this.topPos + 20, 120, 20, Component.translatable("gui.craftkaisen.custom_ctgui.CTName")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.custom_ctgui.CTName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.custom_ctgui.CTName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.custom_ctgui.CTName").getString());
				else
					setSuggestion(null);
			}
		};
		CTName.setMaxLength(32767);

		guistate.put("text:CTName", CTName);
		this.addWidget(this.CTName);

		button_finish = new Button(this.leftPos + 71, this.topPos + 72, 56, 20, Component.translatable("gui.craftkaisen.custom_ctgui.button_finish"), e -> {
		});

		guistate.put("button:button_finish", button_finish);
		this.addRenderableWidget(button_finish);

		button_finish1 = new Button(this.leftPos + 127, this.topPos + 46, 56, 20, Component.translatable("gui.craftkaisen.custom_ctgui.button_finish1"), e -> {
		});

		guistate.put("button:button_finish1", button_finish1);
		this.addRenderableWidget(button_finish1);

		button_finish2 = new Button(this.leftPos + 15, this.topPos + 46, 56, 20, Component.translatable("gui.craftkaisen.custom_ctgui.button_finish2"), e -> {
		});

		guistate.put("button:button_finish2", button_finish2);
		this.addRenderableWidget(button_finish2);

	}

}
