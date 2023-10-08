package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PhysicallyGiftedAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (((sourceentity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).RestrictedType).equals("Physically Gifted")) {
			if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof SwordItem
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof HoeItem)) {
				if (sourceentity.isShiftKeyDown()) {
					if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PHYSICALLY_GIFTED_COOLDOWN.get()) : false)) {
						entity.setDeltaMovement(new Vec3((1.3 * sourceentity.getLookAngle().x), (2 * sourceentity.getLookAngle().y), (1.3 * sourceentity.getLookAngle().z)));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:hit")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craftkaisen:hit")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.IMPACT.get()), x, y, z, 4, 1, 2, 1, 0);
						entity.hurt(DamageSource.GENERIC, 4);
						if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.PHYSICALLY_GIFTED_COOLDOWN.get(), 250, 1, false, false));
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					}
				}
			} else {
				if (sourceentity.isShiftKeyDown()) {
					if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PHYSICALLY_GIFTED_COOLDOWN.get()) : false)) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.DIVINE_REPOSITE_POTION.get(), 1, 1, false, false));
						if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.PHYSICALLY_GIFTED_COOLDOWN.get(), 250, 1, false, false));
						if (sourceentity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
					}
				}
			}
		}
	}
}
