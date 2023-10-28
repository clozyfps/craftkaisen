package net.mcreator.craftkaisen.client.gui;

public class CursedTechniqueMenuScreen extends AbstractContainerScreen<CursedTechniqueMenuMenu> {

	private final static HashMap<String, Object> guistate = CursedTechniqueMenuMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_unlock;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;
	Button button_5;
	Button button_6;
	Button button_7;
	Button button_empty;
	Button button_empty1;

	public CursedTechniqueMenuScreen(CursedTechniqueMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/cursed_technique_menu.png");

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
		this.font.draw(poseStack,

				ReturnTechniqueProcedure.execute(), 51, 7, -12829636);
		this.font.draw(poseStack,

				ReturnMoveCostProcedure.execute(), 6, 133, -12829636);
		this.font.draw(poseStack,

				SPDisplayProcedure.execute(entity), 6, 115, -12829636);
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

		button_unlock = new Button(this.leftPos + 105, this.topPos + 133, 56, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_unlock"), e -> {
			if (

			DisplaymovebuttonProcedure.execute()

			) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(0, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplaymovebuttonProcedure.execute()

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:button_unlock", button_unlock);
		this.addRenderableWidget(button_unlock);

		button_1 = new Button(this.leftPos + 177, this.topPos + 25, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(1, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});

		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);

		button_2 = new Button(this.leftPos + 177, this.topPos + 52, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_2"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(2, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});

		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);

		button_3 = new Button(this.leftPos + 177, this.topPos + 79, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_3"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(3, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});

		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);

		button_4 = new Button(this.leftPos + 177, this.topPos + 106, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_4"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(4, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});

		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);

		button_5 = new Button(this.leftPos + 177, this.topPos + 133, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_5"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(5, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});

		guistate.put("button:button_5", button_5);
		this.addRenderableWidget(button_5);

		button_6 = new Button(this.leftPos + 195, this.topPos + 25, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_6"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(6, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});

		guistate.put("button:button_6", button_6);
		this.addRenderableWidget(button_6);

		button_7 = new Button(this.leftPos + 195, this.topPos + 52, 9, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_7"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(7, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});

		guistate.put("button:button_7", button_7);
		this.addRenderableWidget(button_7);

		button_empty = new Button(this.leftPos + 141, this.topPos + 7, 18, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_empty"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(8, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});

		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);

		button_empty1 = new Button(this.leftPos + 24, this.topPos + 7, 18, 20, Component.translatable("gui.craftkaisen.cursed_technique_menu.button_empty1"), e -> {
			if (true) {
				CraftkaisenMod.PACKET_HANDLER.sendToServer(new CursedTechniqueMenuButtonMessage(9, x, y, z));
				CursedTechniqueMenuButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});

		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);

	}

}
