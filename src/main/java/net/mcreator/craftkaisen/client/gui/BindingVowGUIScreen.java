package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.BindingVowGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BindingVowGUIScreen extends AbstractContainerScreen<BindingVowGUIMenu> {
	private final static HashMap<String, Object> guistate = BindingVowGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox PlayerNameKill;
	Checkbox KillVow;
	Checkbox ItemVow;
	Button button_submit;

	public BindingVowGUIScreen(BindingVowGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 226;
	}

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/screens/binding_vow_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		PlayerNameKill.render(ms, mouseX, mouseY, partialTicks);
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
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PlayerNameKill.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_dont_kill_player"), 38, 17, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_dont_pick_up_specific_item"), 38, 56, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craftkaisen.binding_vow_gui.label_item"), 189, 176, -12829636);
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
		PlayerNameKill = new EditBox(this.font, this.leftPos + 20, this.topPos + 172, 120, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.PlayerNameKill")) {
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
		button_submit = new Button(this.leftPos + 122, this.topPos + 198, 56, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.button_submit"), e -> {
		});
		guistate.put("button:button_submit", button_submit);
		this.addRenderableWidget(button_submit);
		KillVow = new Checkbox(this.leftPos + 10, this.topPos + 12, 20, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.KillVow"), false);
		guistate.put("checkbox:KillVow", KillVow);
		this.addRenderableWidget(KillVow);
		ItemVow = new Checkbox(this.leftPos + 10, this.topPos + 52, 20, 20, Component.translatable("gui.craftkaisen.binding_vow_gui.ItemVow"), false);
		guistate.put("checkbox:ItemVow", ItemVow);
		this.addRenderableWidget(ItemVow);
	}
}
