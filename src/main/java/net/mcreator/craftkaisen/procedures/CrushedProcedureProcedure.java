package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CrushedProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new GetCrushedEntity(CraftkaisenModEntities.GET_CRUSHED.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 0, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 6.5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7l Get Crushed."), true);
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.IRRITATED_THROAT.get()) : false) {
			entity.hurt(DamageSource.GENERIC, 5);
		}
	}
}
