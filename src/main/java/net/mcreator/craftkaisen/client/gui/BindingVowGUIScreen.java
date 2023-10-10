package net.mcreator.craftkaisen.client.gui;

public class BindingVowGUIScreen extends AbstractContainerScreen<BindingVowGUIMenu> {

	private final static HashMap<String, Object> guistate = BindingVowGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox PlayerNameKill;
	EditBox Player;

	Checkbox KillVow;
	Checkbox ItemVow;
	Checkbox GiveItem;

	Button button_submit;
	Button button_self_vow;

	public BindingVowGUIScreen(BindingVowGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 512;
		this.imageHeight = 512;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/binding_vow_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		PlayerNameKill.render(ms, mouseX, mouseY, partialTicks);
		Player.render(ms, mouseX, mouseY, partialTicks);

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

		if (PlayerNameKill.isFocused())
			return PlayerNameKill.keyPressed(key, b, c);
		if (Player.isFocused())
			return Player.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PlayerNameKill.tick();
		Player.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_offers"), 264, 140, -12829636);
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

		PlayerNameKill = new EditBox(this.font, this.leftPos + 54, this.topPos + 170, 120, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.PlayerNameKill")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.binding_vow_gui.PlayerNameKill").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.binding_vow_gui.PlayerNameKill").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.binding_vow_gui.PlayerNameKill").getString());
				else
					setSuggestion(null);
			}
		};
		PlayerNameKill.setMaxLength(32767);

		guistate.put("text:PlayerNameKill", PlayerNameKill);
		this.addWidget(this.PlayerNameKill);
		Player = new EditBox(this.font, this.leftPos + 56, this.topPos + 240, 120, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.Player")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.binding_vow_gui.Player").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.binding_vow_gui.Player").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.binding_vow_gui.Player").getString());
				else
					setSuggestion(null);
			}
		};
		Player.setMaxLength(32767);

		guistate.put("text:Player", Player);
		this.addWidget(this.Player);

		button_submit = new Button(this.leftPos + 181, this.topPos + 240, 56, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.button_submit"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new BindingVowGUIButtonMessage(0, x, y, z));
				BindingVowGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_submit", button_submit);
		this.addRenderableWidget(button_submit);

		button_self_vow = new Button(this.leftPos + 56, this.topPos + 347, 66, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.button_self_vow"), e -> {
		});

		guistate.put("button:button_self_vow", button_self_vow);
		this.addRenderableWidget(button_self_vow);

		KillVow = new Checkbox(this.leftPos + 54, this.topPos + 146, 20, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.KillVow"), false);

		guistate.put("checkbox:KillVow", KillVow);
		this.addRenderableWidget(KillVow);
		ItemVow = new Checkbox(this.leftPos + 54, this.topPos + 195, 20, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.ItemVow"), false);

		guistate.put("checkbox:ItemVow", ItemVow);
		this.addRenderableWidget(ItemVow);
		GiveItem = new Checkbox(this.leftPos + 264, this.topPos + 156, 20, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.GiveItem"), false);

		guistate.put("checkbox:GiveItem", GiveItem);
		this.addRenderableWidget(GiveItem);
	}

}
