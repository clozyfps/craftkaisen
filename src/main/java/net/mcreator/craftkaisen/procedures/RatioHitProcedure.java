package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftkaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RatioHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity, event.getSource().getDirectEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		execute(null, world, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (((immediatesourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique).equals("Ratio")) {
			immediatesourceentity.getPersistentData().putDouble("ratio", (Mth.nextInt(RandomSource.create(), 0, 100)));
			if (immediatesourceentity.getPersistentData().getDouble("ratio") <= immediatesourceentity.getPersistentData().getDouble("ratiochance")) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.1, 2, 0.1, 0.1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLOOD.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 5, 0.5, 2, 0.5, 0.2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RATIO.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 2, 0.1, 0);
				if (immediatesourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Landed Critical Attack!"), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:splatter")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:splatter")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				immediatesourceentity.getPersistentData().putDouble("ratiochance", 0);
				entity.hurt(((new Object() {
					public DamageSource get(final String _msgID, Entity _directSource) {
						return new EntityDamageSource(_msgID, _directSource) {
							@Override
							public Component getLocalizedDeathMessage(LivingEntity _livingEntity) {
								Component _attackerName = null;
								Component _entityName = _livingEntity.getDisplayName();
								Component _itemName = null;
								Entity _attacker = this.getEntity();
								ItemStack _itemStack = ItemStack.EMPTY;
								if (_attacker != null) {
									_attackerName = _attacker.getDisplayName();
								}
								if (_attacker instanceof LivingEntity _livingAttacker) {
									_itemStack = _livingAttacker.getMainHandItem();
								}
								if (!_itemStack.isEmpty() && _itemStack.hasCustomHoverName()) {
									_itemName = _itemStack.getDisplayName();
								}
								if (_attacker != null && _itemName != null) {
									return Component.translatable("death.attack." + _msgID + ".player.item", _entityName, _attackerName, _itemName);
								} else if (_attacker != null) {
									return Component.translatable("death.attack." + _msgID + ".player", _entityName, _attackerName);
								} else {
									return Component.translatable("death.attack." + _msgID, _entityName);
								}
							}
						};
					}
				}).get("Ratio", immediatesourceentity)), 5);
				immediatesourceentity.getPersistentData().putBoolean("aoefirst", true);
				entity.getPersistentData().putBoolean("aoe", true);
				CraftkaisenMod.queueServerWork(20, () -> {
					immediatesourceentity.getPersistentData().putBoolean("aoefirst", false);
				});
			} else {
				immediatesourceentity.getPersistentData().putDouble("ratiochance", (immediatesourceentity.getPersistentData().getDouble("ratiochance") + 5));
			}
		}
	}
}
