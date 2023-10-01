package net.mcreator.craftkaisen.client.gui;

public class PrisonRealmGUIScreen extends AbstractContainerScreen<PrisonRealmGUIMenu> {

	private final static HashMap<String, Object> guistate = PrisonRealmGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox TargetPlayer;

	Button button_finish;

	public PrisonRealmGUIScreen(PrisonRealmGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 128;
		this.imageHeight = 44;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/prison_realm_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		TargetPlayer.render(ms, mouseX, mouseY, partialTicks);

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

		if (TargetPlayer.isFocused())
			return TargetPlayer.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TargetPlayer.tick();
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

		TargetPlayer = new EditBox(this.font, this.leftPos + 3, this.topPos + 5, 120, 20, Component.translatable("gui.craftkaisen.prison_realm_gui.TargetPlayer")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.prison_realm_gui.TargetPlayer").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.prison_realm_gui.TargetPlayer").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.prison_realm_gui.TargetPlayer").getString());
				else
					setSuggestion(null);
			}
		};
		TargetPlayer.setMaxLength(32767);

		guistate.put("text:TargetPlayer", TargetPlayer);
		this.addWidget(this.TargetPlayer);

		button_finish = new Button(this.leftPos + 35, this.topPos + 28, 56, 20, Component.translatable("gui.craftkaisen.prison_realm_gui.button_finish"), e -> {
		});

		guistate.put("button:button_finish", button_finish);
		this.addRenderableWidget(button_finish);

	}

}
