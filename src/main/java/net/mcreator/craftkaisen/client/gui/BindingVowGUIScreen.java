package net.mcreator.craftkaisen.client.gui;

public class BindingVowGUIScreen extends AbstractContainerScreen<BindingVowGUIMenu> {

	private final static HashMap<String, Object> guistate = BindingVowGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_yes;
	Button button_yes1;

	public BindingVowGUIScreen(BindingVowGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 193;
		this.imageHeight = 130;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/binding_vow_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_binding_vow"), 67, 4, -12829636);
		this.font.draw(poseStack,

				VowSenderDisplayProcedure.execute(), 13, 22, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_empty"), 13, 40, -12829636);
		this.font.draw(poseStack,

				VowDescriptionDisplayProcedure.execute(), 13, 58, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_do_you_accept"), 60, 85, -12829636);
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

		button_yes = new Button(this.leftPos + 22, this.topPos + 103, 40, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.button_yes"), e -> {
		});

		guistate.put("button:button_yes", button_yes);
		this.addRenderableWidget(button_yes);

		button_yes1 = new Button(this.leftPos + 132, this.topPos + 103, 40, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.button_yes1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new BindingVowGUIButtonMessage(1, x, y, z));
				BindingVowGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});

		guistate.put("button:button_yes1", button_yes1);
		this.addRenderableWidget(button_yes1);

	}

}
