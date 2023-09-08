
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.MoveUltimateCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoveSpecialCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move5DisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move5CDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move4CDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move3CDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move2CDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move1DisplayProcedure;
import net.mcreator.craftkaisen.procedures.Move1CDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.DisplaySelectedTechniqueProcedure;
import net.mcreator.craftkaisen.procedures.DisplayMoveCostProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MainHUDOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/hud.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -152, posY + 35, 0, 0, 192, 64, 192, 64);

			RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/back.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);

			if (Move1CDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move2CDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move3CDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move4CDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move5CDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (MoveSpecialCDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (MoveUltimateCDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/red.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move2CDDisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/lo.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move1DisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/blue.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			if (Move5DisplayProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/purple.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -209, posY + 35, 0, 0, 64, 64, 64, 64);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_quests"), posX + 90, posY + -112, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_empty"), posX + 90, posY + -103, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_quest1"), posX + 90, posY + -94, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					DisplaySelectedTechniqueProcedure.execute(entity), posX + -207, posY + -97, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					DisplayMoveCostProcedure.execute(entity), posX + -207, posY + -85, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
