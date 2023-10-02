package net.mcreator.craftkaisen.client.gui;

public class DomainCreatorGUIScreen extends AbstractContainerScreen<DomainCreatorGUIMenu> {

	private final static HashMap<String, Object> guistate = DomainCreatorGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox DomainName;

	Checkbox SureHitEffect;
	Checkbox RepeatedAttack;
	Checkbox SelfEffect;

	Button button_create;

	public DomainCreatorGUIScreen(DomainCreatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 260;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/domain_creator_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		DomainName.render(ms, mouseX, mouseY, partialTicks);

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

		if (DomainName.isFocused())
			return DomainName.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		DomainName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.domain_creator_gui.label_primary_block"), 12, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.domain_creator_gui.label_secondary_block"), 12, 34, -12829636);
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

		DomainName = new EditBox(this.font, this.leftPos + 6, this.topPos + 57, 120, 20, Component.translatable("gui.craftkaisen.domain_creator_gui.DomainName")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.domain_creator_gui.DomainName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.domain_creator_gui.DomainName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.domain_creator_gui.DomainName").getString());
				else
					setSuggestion(null);
			}
		};
		DomainName.setMaxLength(32767);

		guistate.put("text:DomainName", DomainName);
		this.addWidget(this.DomainName);

		button_create = new Button(this.leftPos + 183, this.topPos + 106, 56, 20, Component.translatable("gui.craftkaisen.domain_creator_gui.button_create"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new DomainCreatorGUIButtonMessage(0, x, y, z));
				DomainCreatorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_create", button_create);
		this.addRenderableWidget(button_create);

		SureHitEffect = new Checkbox(this.leftPos + 138, this.topPos + 5, 20, 20, Component.translatable("gui.craftkaisen.domain_creator_gui.SureHitEffect"), false);

		guistate.put("checkbox:SureHitEffect", SureHitEffect);
		this.addRenderableWidget(SureHitEffect);
		RepeatedAttack = new Checkbox(this.leftPos + 138, this.topPos + 32, 20, 20, Component.translatable("gui.craftkaisen.domain_creator_gui.RepeatedAttack"), false);

		guistate.put("checkbox:RepeatedAttack", RepeatedAttack);
		this.addRenderableWidget(RepeatedAttack);
		SelfEffect = new Checkbox(this.leftPos + 138, this.topPos + 59, 20, 20, Component.translatable("gui.craftkaisen.domain_creator_gui.SelfEffect"), false);

		guistate.put("checkbox:SelfEffect", SelfEffect);
		this.addRenderableWidget(SelfEffect);
	}

}
