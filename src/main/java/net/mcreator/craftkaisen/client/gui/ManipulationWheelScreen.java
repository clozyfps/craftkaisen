package net.mcreator.craftkaisen.client.gui;

public class ManipulationWheelScreen extends AbstractContainerScreen<ManipulationWheelMenu> {

	private final static HashMap<String, Object> guistate = ManipulationWheelMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_temp;
	ImageButton imagebutton_temp1;
	ImageButton imagebutton_temp2;
	ImageButton imagebutton_temp3;

	public ManipulationWheelScreen(ManipulationWheelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/manipulation_wheel.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);

		super.render(ms, mouseX, mouseY, partialTicks);

		if (

		Slot1ValueProcedure.execute()

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + -29, this.topPos + 63, 20, 0f, 0, livingEntity);
		}
		if (

		Slot2ValueProcedure.execute(world, entity)

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 28, this.topPos + 63, 20, 0f, 0, livingEntity);
		}
		if (

		Slot3ValueProcedure.execute(world, entity)

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + -30, this.topPos + 118, 20, 0f, 0, livingEntity);
		}
		if (

		Slot4ValueProcedure.execute()

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + 28, this.topPos + 118, 20, 0f, 0, livingEntity);
		}

		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/verticalline.png"));
		this.blit(ms, this.leftPos + -62, this.topPos + 16, 0, 0, 128, 128, 128, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/newwhiteline.png"));
		this.blit(ms, this.leftPos + -38, this.topPos + 46, 0, 0, 75, 75, 75, 75);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/blackscreen.png"));
		this.blit(ms, this.leftPos + -63, this.topPos + 16, 0, 0, 128, 128, 128, 128);

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

		imagebutton_temp = new ImageButton(this.leftPos + 0, this.topPos + 16, 65, 65, 0, 0, 65, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_temp.png"), 65, 130, e -> {
		});

		guistate.put("button:imagebutton_temp", imagebutton_temp);
		this.addRenderableWidget(imagebutton_temp);

		imagebutton_temp1 = new ImageButton(this.leftPos + -65, this.topPos + 15, 65, 65, 0, 0, 65, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_temp1.png"), 65, 130, e -> {
		});

		guistate.put("button:imagebutton_temp1", imagebutton_temp1);
		this.addRenderableWidget(imagebutton_temp1);

		imagebutton_temp2 = new ImageButton(this.leftPos + -65, this.topPos + 80, 65, 65, 0, 0, 65, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_temp2.png"), 65, 130, e -> {
		});

		guistate.put("button:imagebutton_temp2", imagebutton_temp2);
		this.addRenderableWidget(imagebutton_temp2);

		imagebutton_temp3 = new ImageButton(this.leftPos + 0, this.topPos + 80, 65, 65, 0, 0, 65, new ResourceLocation("craftkaisen:textures/screens/atlas/imagebutton_temp3.png"), 65, 130, e -> {
		});

		guistate.put("button:imagebutton_temp3", imagebutton_temp3);
		this.addRenderableWidget(imagebutton_temp3);

	}

}
