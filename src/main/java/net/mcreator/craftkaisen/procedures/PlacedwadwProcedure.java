package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlacedwadwProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, String text) {
		execute(null, world, x, y, z, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, String text) {
		if (text == null)
			return;
		if ((text).equals("Place")) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craftkaisen", "domain"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}
