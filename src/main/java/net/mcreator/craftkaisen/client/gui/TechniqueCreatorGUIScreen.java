package net.mcreator.craftkaisen.client.gui;

public class TechniqueCreatorGUIScreen extends AbstractContainerScreen<TechniqueCreatorGUIMenu> {

	private final static HashMap<String, Object> guistate = TechniqueCreatorGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox TechniqueName;

	Checkbox ImbueTechnique;
	Checkbox ReverseEffect;
	Checkbox OrbBox;
	Checkbox ExplosionBox;
	Checkbox PulseBox;
	Checkbox AreaBox;
	Checkbox BoltBox;
	Checkbox BeamBox;

	Button button_create;
	Button button_technique_specific_settings;

	public TechniqueCreatorGUIScreen(TechniqueCreatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 135;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/technique_creator_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		TechniqueName.render(ms, mouseX, mouseY, partialTicks);

		this.renderTooltip(ms, mouseX, mouseY);

		if (mouseX > leftPos + 280 && mouseX < leftPos + 304 && mouseY > topPos + 53 && mouseY < topPos + 77)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.technique_creator_gui.tooltip_imbues_your_current_ct_in_the_at"), mouseX, mouseY);
		if (mouseX > leftPos + 280 && mouseX < leftPos + 304 && mouseY > topPos + 85 && mouseY < topPos + 109)
			this.renderTooltip(ms, Component.translatable("gui.craftkaisen.technique_creator_gui.tooltip_reverses_the_imbued_technique"), mouseX, mouseY);
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

		if (TechniqueName.isFocused())
			return TechniqueName.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TechniqueName.tick();
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

		TechniqueName = new EditBox(this.font, this.leftPos + 276, this.topPos + 25, 120, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.technique_creator_gui.TechniqueName").getString());
				else
					setSuggestion(null);
			}
		};
		TechniqueName.setMaxLength(32767);

		guistate.put("text:TechniqueName", TechniqueName);
		this.addWidget(this.TechniqueName);

		button_create = new Button(this.leftPos + 346, this.topPos + 123, 56, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.button_create"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new TechniqueCreatorGUIButtonMessage(0, x, y, z));
				TechniqueCreatorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_create", button_create);
		this.addRenderableWidget(button_create);

		button_technique_specific_settings = new Button(this.leftPos + 229, this.topPos + 3, 166, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.button_technique_specific_settings"), e -> {
		});

		guistate.put("button:button_technique_specific_settings", button_technique_specific_settings);
		this.addRenderableWidget(button_technique_specific_settings);

		ImbueTechnique = new Checkbox(this.leftPos + 282, this.topPos + 55, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.ImbueTechnique"), false);

		guistate.put("checkbox:ImbueTechnique", ImbueTechnique);
		this.addRenderableWidget(ImbueTechnique);
		ReverseEffect = new Checkbox(this.leftPos + 282, this.topPos + 87, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.ReverseEffect"), false);

		guistate.put("checkbox:ReverseEffect", ReverseEffect);
		this.addRenderableWidget(ReverseEffect);
		OrbBox = new Checkbox(this.leftPos + 10, this.topPos + 15, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.OrbBox"), false);

		guistate.put("checkbox:OrbBox", OrbBox);
		this.addRenderableWidget(OrbBox);
		ExplosionBox = new Checkbox(this.leftPos + 10, this.topPos + 55, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.ExplosionBox"), false);

		guistate.put("checkbox:ExplosionBox", ExplosionBox);
		this.addRenderableWidget(ExplosionBox);
		PulseBox = new Checkbox(this.leftPos + 10, this.topPos + 95, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.PulseBox"), false);

		guistate.put("checkbox:PulseBox", PulseBox);
		this.addRenderableWidget(PulseBox);
		AreaBox = new Checkbox(this.leftPos + 130, this.topPos + 15, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.AreaBox"), false);

		guistate.put("checkbox:AreaBox", AreaBox);
		this.addRenderableWidget(AreaBox);
		BoltBox = new Checkbox(this.leftPos + 130, this.topPos + 55, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.BoltBox"), false);

		guistate.put("checkbox:BoltBox", BoltBox);
		this.addRenderableWidget(BoltBox);
		BeamBox = new Checkbox(this.leftPos + 130, this.topPos + 95, 20, 20, Component.translatable("gui.craftkaisen.technique_creator_gui.BeamBox"), false);

		guistate.put("checkbox:BeamBox", BeamBox);
		this.addRenderableWidget(BeamBox);
	}

}
