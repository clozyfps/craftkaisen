package net.mcreator.craftkaisen.client.gui;

public class SwordCreatorScreen extends AbstractContainerScreen<SwordCreatorMenu> {

	private final static HashMap<String, Object> guistate = SwordCreatorMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox SwordName;

	Checkbox KatanaBox;
	Checkbox GreatswordBox;
	Checkbox DaggerBox;

	Button button_create;
	Button button_empty;
	Button button_empty1;

	public SwordCreatorScreen(SwordCreatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 500;
		this.imageHeight = 500;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/sword_creator.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		SwordName.render(ms, mouseX, mouseY, partialTicks);

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

		if (SwordName.isFocused())
			return SwordName.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		SwordName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_weapon_types"), 58, 145, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_materials"), 380, 144, -12829636);
		this.font.draw(poseStack,

				DisplayCostProcedure.execute(), 227, 277, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_5_cost"), 128, 170, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_3_cost"), 106, 206, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_1_cost"), 107, 243, -12829636);
		if (

		DIsplayVProcedure.execute(entity)

		)
			this.font.draw(poseStack,

					DIsplayErrorProcedure.execute(entity), 189, 219, -65536);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_iron_ingots"), 382, 169, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_diamonds"), 383, 196, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_diamond_blocks"), 383, 223, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.sword_creator.label_cursed_energy_investment"), 184, 145, -12829636);
		this.font.draw(poseStack,

				DisplayAmountProcedure.execute(entity), 241, 168, -12829636);
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

		SwordName = new EditBox(this.font, this.leftPos + 189, this.topPos + 231, 120, 20, Component.translatable("gui.craftkaisen.sword_creator.SwordName")) {
			{
				setSuggestion(Component.translatable("gui.craftkaisen.sword_creator.SwordName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.sword_creator.SwordName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craftkaisen.sword_creator.SwordName").getString());
				else
					setSuggestion(null);
			}
		};
		SwordName.setMaxLength(32767);

		guistate.put("text:SwordName", SwordName);
		this.addWidget(this.SwordName);

		button_create = new Button(this.leftPos + 221, this.topPos + 253, 56, 20, Component.translatable("gui.craftkaisen.sword_creator.button_create"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SwordCreatorButtonMessage(0, x, y, z));
				SwordCreatorButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_create", button_create);
		this.addRenderableWidget(button_create);

		button_empty = new Button(this.leftPos + 282, this.topPos + 163, 30, 20, Component.translatable("gui.craftkaisen.sword_creator.button_empty"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SwordCreatorButtonMessage(1, x, y, z));
				SwordCreatorButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});

		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);

		button_empty1 = new Button(this.leftPos + 187, this.topPos + 163, 30, 20, Component.translatable("gui.craftkaisen.sword_creator.button_empty1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new SwordCreatorButtonMessage(2, x, y, z));
				SwordCreatorButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});

		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);

		KatanaBox = new Checkbox(this.leftPos + 41, this.topPos + 200, 20, 20, Component.translatable("gui.craftkaisen.sword_creator.KatanaBox"), false);

		guistate.put("checkbox:KatanaBox", KatanaBox);
		this.addRenderableWidget(KatanaBox);
		GreatswordBox = new Checkbox(this.leftPos + 41, this.topPos + 164, 20, 20, Component.translatable("gui.craftkaisen.sword_creator.GreatswordBox"), false);

		guistate.put("checkbox:GreatswordBox", GreatswordBox);
		this.addRenderableWidget(GreatswordBox);
		DaggerBox = new Checkbox(this.leftPos + 41, this.topPos + 237, 20, 20, Component.translatable("gui.craftkaisen.sword_creator.DaggerBox"), false);

		guistate.put("checkbox:DaggerBox", DaggerBox);
		this.addRenderableWidget(DaggerBox);
	}

}
