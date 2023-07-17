package net.mcreator.craftkaisen.client.gui;

public class SkilltreehpScreen extends AbstractContainerScreen<SkilltreehpMenu> {

	private final static HashMap<String, Object> guistate = SkilltreehpMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_hpguiswitch_1;
	ImageButton imagebutton_energyguiswitch;
	ImageButton imagebutton_powerguiswitch;
	ImageButton imagebutton_speedguiswitch;
	ImageButton imagebutton_firstskillunlock;
	ImageButton imagebutton_speedlogogui;
	ImageButton imagebutton_speedlogogui1;

	public SkilltreehpScreen(SkilltreehpMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/skillltreee.png"));
		this.blit(ms, this.leftPos + -67, this.topPos + -16, 0, 0, 315, 200, 315, 200);

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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltreehp.label_name"), -50, 3, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltreehp.label_stats"), -50, 31, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltreehp.label_technique"), -61, 56, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltreehp.label_balls"), -51, 79, -1);
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

		imagebutton_hpguiswitch_1 = new ImageButton(this.leftPos + -15, this.topPos + -16, 29, 29, 0, 0, 29, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_hpguiswitch_1.png"), 29, 58, e -> {
		});

		guistate.put("button:imagebutton_hpguiswitch_1", imagebutton_hpguiswitch_1);
		this.addRenderableWidget(imagebutton_hpguiswitch_1);

		imagebutton_energyguiswitch = new ImageButton(this.leftPos + 11, this.topPos + -16, 29, 29, 0, 0, 29, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_energyguiswitch.png"), 29, 58, e -> {
		});

		guistate.put("button:imagebutton_energyguiswitch", imagebutton_energyguiswitch);
		this.addRenderableWidget(imagebutton_energyguiswitch);

		imagebutton_powerguiswitch = new ImageButton(this.leftPos + 37, this.topPos + -16, 29, 29, 0, 0, 29, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_powerguiswitch.png"), 29, 58, e -> {
		});

		guistate.put("button:imagebutton_powerguiswitch", imagebutton_powerguiswitch);
		this.addRenderableWidget(imagebutton_powerguiswitch);

		imagebutton_speedguiswitch = new ImageButton(this.leftPos + 63, this.topPos + -16, 29, 29, 0, 0, 29, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_speedguiswitch.png"), 29, 58, e -> {
		});

		guistate.put("button:imagebutton_speedguiswitch", imagebutton_speedguiswitch);
		this.addRenderableWidget(imagebutton_speedguiswitch);

		imagebutton_firstskillunlock = new ImageButton(this.leftPos + 8, this.topPos + 77, 12, 12, 0, 0, 12, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_firstskillunlock.png"), 12, 24, e -> {
		});

		guistate.put("button:imagebutton_firstskillunlock", imagebutton_firstskillunlock);
		this.addRenderableWidget(imagebutton_firstskillunlock);

		imagebutton_speedlogogui = new ImageButton(this.leftPos + 34, this.topPos + 75, 16, 16, 0, 0, 16, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_speedlogogui.png"), 16, 32, e -> {
		});

		guistate.put("button:imagebutton_speedlogogui", imagebutton_speedlogogui);
		this.addRenderableWidget(imagebutton_speedlogogui);

		imagebutton_speedlogogui1 = new ImageButton(this.leftPos + 60, this.topPos + 75, 16, 16, 0, 0, 16, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_speedlogogui1.png"), 16, 32, e -> {
		});

		guistate.put("button:imagebutton_speedlogogui1", imagebutton_speedlogogui1);
		this.addRenderableWidget(imagebutton_speedlogogui1);

	}

}
