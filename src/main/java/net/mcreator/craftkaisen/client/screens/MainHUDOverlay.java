
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

import net.mcreator.craftkaisen.procedures.ShowCursedEnergyProcedure;
import net.mcreator.craftkaisen.procedures.QuestProgressDisplayProcedure;
import net.mcreator.craftkaisen.procedures.QuestDisplayProcedure;
import net.mcreator.craftkaisen.procedures.DisplaySelectedTechniqueProcedure;
import net.mcreator.craftkaisen.procedures.DisplayMoveCostProcedure;
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
			if (ShowCursedEnergyProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						CursedEnergyDisplayProcedure.execute(entity), posX + 94, posY + 103, -1);
			if (QuestDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_quests"), posX + 90, posY + -112, -1);
			if (QuestDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craftkaisen.main_hud.label_empty"), posX + 90, posY + -103, -1);
			if (QuestDisplayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						QuestProgressDisplayProcedure.execute(entity), posX + 90, posY + -94, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					DisplaySelectedTechniqueProcedure.execute(entity), posX + -206, posY + 56, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					DisplayMoveCostProcedure.execute(entity), posX + -206, posY + 68, -1);
		}
	}
}
