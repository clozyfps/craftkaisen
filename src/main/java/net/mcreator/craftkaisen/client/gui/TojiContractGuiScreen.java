package net.mcreator.craftkaisen.client.gui;

public class TojiContractGuiScreen extends AbstractContainerScreen<TojiContractGuiMenu> {

	private final static HashMap<String, Object> guistate = TojiContractGuiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox TojiPlayerKill;

	Button button_purchase;

	public TojiContractGuiScreen(TojiContractGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 120;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/toji_contract_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		TojiPlayerKill.render(ms, mouseX, mouseY, partialTicks);

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

		if (TojiPlayerKill.isFocused())
			return TojiPlayerKill.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TojiPlayerKill.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.toji_contract_gui.label_ill_assassinate_somebody_for"), 6, 6, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.toji_contract_gui.label_20000_yen"), 6, 17, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.toji_contract_gui.label_i_cant_assure_you_that_ill_beat"), 2, 104, -16777216);
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

		TojiPlayerKill = new EditBox(this.font, this.leftPos + 34, this.topPos + 67, 120, 20, Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.toji_contract_gui.TojiPlayerKill").getString());
				else
					setSuggestion(null);
			}
		};
		TojiPlayerKill.setMaxLength(32767);

		guistate.put("text:TojiPlayerKill", TojiPlayerKill);
		this.addWidget(this.TojiPlayerKill);

		button_purchase = new Button(this.leftPos + 63, this.topPos + 45, 67, 20, Component.translatable("gui.craftkaisen.toji_contract_gui.button_purchase"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new TojiContractGuiButtonMessage(0, x, y, z));
				TojiContractGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_purchase", button_purchase);
		this.addRenderableWidget(button_purchase);

	}

}
