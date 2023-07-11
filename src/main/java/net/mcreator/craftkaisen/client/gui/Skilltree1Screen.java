package net.mcreator.craftkaisen.client.gui;

public class Skilltree1Screen extends AbstractContainerScreen<Skilltree1Menu> {

	private final static HashMap<String, Object> guistate = Skilltree1Menu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Skilltree1Screen(Skilltree1Menu container, Inventory inventory, Component text) {
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
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltree_1.label_name"), -50, 3, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltree_1.label_stats"), -50, 31, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltree_1.label_technique"), -61, 56, -1);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.skilltree_1.label_balls"), -51, 79, -1);
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

	}

}
