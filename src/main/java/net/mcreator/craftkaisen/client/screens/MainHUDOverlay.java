
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

import net.mcreator.craftkaisen.procedures.QuestProgressDisplayProcedure;
import net.mcreator.craftkaisen.procedures.QuestDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoodDisplayYellowProcedure;
import net.mcreator.craftkaisen.procedures.MoodDisplayRedProcedure;
import net.mcreator.craftkaisen.procedures.MoodDisplayGreenProcedure;
import net.mcreator.craftkaisen.procedures.CursedEnergyDisplayProcedure;

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
			if (MoodDisplayGreenProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/happy.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -207, posY + -76, 0, 0, 16, 16, 16, 16);
			}
			if (MoodDisplayYellowProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/meh.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -207, posY + -76, 0, 0, 16, 16, 16, 16);
			}
			if (MoodDisplayRedProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craftkaisen:textures/screens/mad.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -207, posY + -76, 0, 0, 16, 16, 16, 16);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					CursedEnergyDisplayProcedure.execute(entity), posX + 94, posY + 103, -1);
			if (MoveOneCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_one"), posX + -207, posY + -58, -65536);
			if (MoveTwoCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_two"), posX + -207, posY + -40, -65536);
			if (MoveThreeCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_3"), posX + -207, posY + -22, -65536);
			if (MoveFourCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_four"), posX + -207, posY + -4, -65536);
			if (MoveFiveCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_five"), posX + -207, posY + 14, -65536);
			if (SpecialCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_special"), posX + -207, posY + 32, -65536);
			if (UltimateCDDisplayProcedure.execute())
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_ultimate"), posX + -207, posY + 50, -65536);
			if (QuestDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_quests"), posX + 90, posY + -112, -1);
			if (QuestDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_empty"), posX + 90, posY + -103, -1);
			if (QuestDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						QuestProgressDisplayProcedure.execute(entity), posX + 90, posY + -94, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
