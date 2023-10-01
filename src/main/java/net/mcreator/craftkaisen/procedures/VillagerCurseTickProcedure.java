package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.CursedspiritrugbyfieldEntity;
import net.mcreator.craftkaisen.entity.CursedspiritroppongiEntity;
import net.mcreator.craftkaisen.entity.CursedspiritmouthEntity;
import net.mcreator.craftkaisen.entity.CursedspiritgrasshopperEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VillagerCurseTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Villager) {
			if (entity.getPersistentData().getDouble("villagermood") <= -1) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 10, 3, 2, 3, 0);
				entity.getPersistentData().putDouble("villagermood", 1);
				entity.getPersistentData().putDouble("villagerandom", (Mth.nextInt(RandomSource.create(), 1, 4)));
				if (entity.getPersistentData().getDouble("villagerandom") == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CursedspiritgrasshopperEntity(CraftkaisenModEntities.CURSEDSPIRITGRASSHOPPER.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (entity.getPersistentData().getDouble("villagerandom") == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CursedspiritmouthEntity(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (entity.getPersistentData().getDouble("villagerandom") == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CursedspiritrugbyfieldEntity(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (entity.getPersistentData().getDouble("villagerandom") == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CursedspiritroppongiEntity(CraftkaisenModEntities.CURSEDSPIRITROPPONGI.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getPersistentData().getDouble("villagermood") > -1) {
				if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 1, z)) < 10) {
					entity.getPersistentData().putDouble("villagermood", (entity.getPersistentData().getDouble("villagermood") - 0.03));
				}
				if (!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
					entity.getPersistentData().putDouble("villagermood", (entity.getPersistentData().getDouble("villagermood") - 0.03));
				}
			}
		}
	}
}
