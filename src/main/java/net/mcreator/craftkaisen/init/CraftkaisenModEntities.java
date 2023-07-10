
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.TwistEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.StopEntity;
import net.mcreator.craftkaisen.entity.SleepEntity;
import net.mcreator.craftkaisen.entity.LapseBlueEntity;
import net.mcreator.craftkaisen.entity.JujutsuStudentEntity;
import net.mcreator.craftkaisen.entity.InfiniteVoiddEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleEntityEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleEntity;
import net.mcreator.craftkaisen.entity.GetCrushedEntity;
import net.mcreator.craftkaisen.entity.ExplodeEntity;
import net.mcreator.craftkaisen.entity.BlastAwayEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftkaisenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<EntityType<HollowPurpleEntity>> HOLLOW_PURPLE = register("projectile_hollow_purple",
			EntityType.Builder.<HollowPurpleEntity>of(HollowPurpleEntity::new, MobCategory.MISC).setCustomClientFactory(HollowPurpleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HollowPurpleEntityEntity>> HOLLOW_PURPLE_ENTITY = register("hollow_purple_entity", EntityType.Builder.<HollowPurpleEntityEntity>of(HollowPurpleEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HollowPurpleEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LapseBlueEntity>> LAPSE_BLUE = register("lapse_blue", EntityType.Builder.<LapseBlueEntity>of(LapseBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(LapseBlueEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JujutsuStudentEntity>> JUJUTSU_STUDENT = register("jujutsu_student",
			EntityType.Builder.<JujutsuStudentEntity>of(JujutsuStudentEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JujutsuStudentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TojiFushiguroEntity>> TOJI_FUSHIGURO = register("toji_fushiguro",
			EntityType.Builder.<TojiFushiguroEntity>of(TojiFushiguroEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TojiFushiguroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InfiniteVoiddEntity>> INFINITE_VOIDD = register("infinite_voidd",
			EntityType.Builder.<InfiniteVoiddEntity>of(InfiniteVoiddEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InfiniteVoiddEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplodeEntity>> EXPLODE = register("projectile_explode",
			EntityType.Builder.<ExplodeEntity>of(ExplodeEntity::new, MobCategory.MISC).setCustomClientFactory(ExplodeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwistEntity>> TWIST = register("projectile_twist",
			EntityType.Builder.<TwistEntity>of(TwistEntity::new, MobCategory.MISC).setCustomClientFactory(TwistEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GetCrushedEntity>> GET_CRUSHED = register("projectile_get_crushed",
			EntityType.Builder.<GetCrushedEntity>of(GetCrushedEntity::new, MobCategory.MISC).setCustomClientFactory(GetCrushedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StopEntity>> STOP = register("projectile_stop",
			EntityType.Builder.<StopEntity>of(StopEntity::new, MobCategory.MISC).setCustomClientFactory(StopEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SleepEntity>> SLEEP = register("projectile_sleep",
			EntityType.Builder.<SleepEntity>of(SleepEntity::new, MobCategory.MISC).setCustomClientFactory(SleepEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlastAwayEntity>> BLAST_AWAY = register("projectile_blast_away",
			EntityType.Builder.<BlastAwayEntity>of(BlastAwayEntity::new, MobCategory.MISC).setCustomClientFactory(BlastAwayEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HollowPurpleEntityEntity.init();
			LapseBlueEntity.init();
			JujutsuStudentEntity.init();
			TojiFushiguroEntity.init();
			InfiniteVoiddEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HOLLOW_PURPLE_ENTITY.get(), HollowPurpleEntityEntity.createAttributes().build());
		event.put(LAPSE_BLUE.get(), LapseBlueEntity.createAttributes().build());
		event.put(JUJUTSU_STUDENT.get(), JujutsuStudentEntity.createAttributes().build());
		event.put(TOJI_FUSHIGURO.get(), TojiFushiguroEntity.createAttributes().build());
		event.put(INFINITE_VOIDD.get(), InfiniteVoiddEntity.createAttributes().build());
	}
}
