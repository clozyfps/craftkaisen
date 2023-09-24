package net.mcreator.craftkaisen.client.gui;

public class DesignGUIScreen extends AbstractContainerScreen<DesignGUIMenu> {

	private final static HashMap<String, Object> guistate = DesignGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox PrimaryColor;
	EditBox SecondaryColor;

	Button button_confirm;

	public DesignGUIScreen(DesignGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 512;
		this.imageHeight = 512;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/design_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		PrimaryColor.render(ms, mouseX, mouseY, partialTicks);
		SecondaryColor.render(ms, mouseX, mouseY, partialTicks);

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

		if (PrimaryColor.isFocused())
			return PrimaryColor.keyPressed(key, b, c);
		if (SecondaryColor.isFocused())
			return SecondaryColor.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PrimaryColor.tick();
		SecondaryColor.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.design_gui.label_colors"), 53, 147, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.design_gui.label_blue_yellow_red_purple_green"), 69, 161, -12829636);
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

		PrimaryColor = new EditBox(this.font, this.leftPos + 283, this.topPos + 227, 120, 20, Component.translatable("gui.craftkaisen.design_gui.PrimaryColor")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.design_gui.PrimaryColor").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.design_gui.PrimaryColor").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.design_gui.PrimaryColor").getString());
				else
					setSuggestion(null);
			}
		};
		PrimaryColor.setMaxLength(32767);

		guistate.put("text:PrimaryColor", PrimaryColor);
		this.addWidget(this.PrimaryColor);
		SecondaryColor = new EditBox(this.font, this.leftPos + 283, this.topPos + 254, 120, 20, Component.translatable("gui.craftkaisen.design_gui.SecondaryColor")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.design_gui.SecondaryColor").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.design_gui.SecondaryColor").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.design_gui.SecondaryColor").getString());
				else
					setSuggestion(null);
			}
		};
		SecondaryColor.setMaxLength(32767);

		guistate.put("text:SecondaryColor", SecondaryColor);
		this.addWidget(this.SecondaryColor);

		button_confirm = new Button(this.leftPos + 406, this.topPos + 239, 61, 20, Component.translatable("gui.craftkaisen.design_gui.button_confirm"), e -> {
		});

		guistate.put("button:button_confirm", button_confirm);
		this.addRenderableWidget(button_confirm);

	}

}
