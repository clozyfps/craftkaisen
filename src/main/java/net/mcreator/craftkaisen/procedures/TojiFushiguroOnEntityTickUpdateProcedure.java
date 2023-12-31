package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.FlyHeadEntity;

import java.util.ArrayList;

public class TojiFushiguroOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean condition = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.001) {
				for (int index0 = 0; index0 < 30; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new FlyHeadEntity(CraftkaisenModEntities.FLY_HEAD.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() < 0.002) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DIVINE_REPOSITE_POTION.get(), 2, 1, false, false));
			}
		}
		if (entity.getPersistentData().getBoolean("TargetingToji")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator.getPersistentData().getBoolean("TojiTarget")) {
					if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			}
		}
	}
}
