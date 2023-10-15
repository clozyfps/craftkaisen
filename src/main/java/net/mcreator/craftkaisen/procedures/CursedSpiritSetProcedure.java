package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.entity.SukunaEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.FlyHeadEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.entity.EsoEntity;
import net.mcreator.craftkaisen.entity.CursedspiritrugbyfieldEntity;
import net.mcreator.craftkaisen.entity.CursedspiritroppongiEntity;
import net.mcreator.craftkaisen.entity.CursedspiritmouthEntity;
import net.mcreator.craftkaisen.entity.CursedspiritgrasshopperEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CursedSpiritSetProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CursedspiritgrasshopperEntity || entity instanceof CursedspiritroppongiEntity || entity instanceof CursedspiritrugbyfieldEntity || entity instanceof CursedspiritmouthEntity || entity instanceof FlyHeadEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.CURSED_SPIRIT.get(), 999999, 0, false, false));
		} else if (entity instanceof JogoEntity || entity instanceof EsoEntity || entity instanceof MahitoEntity || entity instanceof SukunaEntity || entity instanceof FingerBearerEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.CURSED_SPIRIT.get(), 999999, 1, false, false));
		}
	}
}
