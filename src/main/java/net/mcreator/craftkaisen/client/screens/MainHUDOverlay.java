
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.UltimateCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.SpecialCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoveTwoCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoveThreeCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoveOneCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoveFourCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.MoveFiveCDDisplayProcedure;
import net.mcreator.craftkaisen.procedures.CursedEnergyDisplayProcedure;

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
		if (true) {
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					CursedEnergyDisplayProcedure.execute(entity), posX + 94, posY + 103, -1);
			if (MoveOneCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_one"), posX + -207, posY + -58, -65536);
			if (MoveTwoCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_two"), posX + -207, posY + -40, -65536);
			if (MoveThreeCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_3"), posX + -207, posY + -22, -65536);
			if (MoveFourCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_four"), posX + -207, posY + -4, -65536);
			if (MoveFiveCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_move_five"), posX + -207, posY + 14, -65536);
			if (SpecialCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_special"), posX + -207, posY + 32, -65536);
			if (UltimateCDDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_ultimate"), posX + -207, posY + 50, -65536);
		}
	}
}
