package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DomainExpansionOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Flames") || entity instanceof JogoEntity) {
			entity.getPersistentData().putBoolean("aoefirst", true);
			CraftkaisenMod.queueServerWork(20, () -> {
				entity.getPersistentData().putBoolean("aoefirst", false);
			});
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!(entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SimpleDomainActive) {
							entityiterator.hurt(DamageSource.GENERIC, 10);
							entityiterator.setSecondsOnFire(15);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 5, 5, false, false));
							entityiterator.getPersistentData().putBoolean("aoe", true);
						}
					}
				}
			}
		}
	}
}
