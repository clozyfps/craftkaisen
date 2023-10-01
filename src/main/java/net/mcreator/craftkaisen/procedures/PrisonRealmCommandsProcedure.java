package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.PrisonRealmMobEntity;

import javax.annotation.Nullable;

import java.util.Comparator;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PrisonRealmCommandsProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		Entity entityPr = null;
		if ((text).equals("Gate, Open")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator.getPersistentData().getBoolean("targeted")) {
					world.setBlock(new BlockPos(entityiterator.getPersistentData().getDouble("prX"), entityiterator.getPersistentData().getDouble("prY"), entityiterator.getPersistentData().getDouble("prZ")), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrisonRealmMobEntity(CraftkaisenModEntities.PRISON_REALM_MOB.get(), _level);
						entityToSpawn.moveTo((entityiterator.getPersistentData().getDouble("prX")), (entityiterator.getPersistentData().getDouble("prY")), (entityiterator.getPersistentData().getDouble("prZ")), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					{
						Entity _ent = ((Entity) world.getEntitiesOfClass(PrisonRealmMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null));
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											("execute as " + ((Entity) world.getEntitiesOfClass(PrisonRealmMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + entityiterator.getStringUUID()));
						}
					}
					entityiterator.getPersistentData().putBoolean("beginTimerPr", true);
					entity.getPersistentData().putDouble("timerPrison", 100);
				}
			}
		}
	}
}
