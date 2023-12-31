
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

import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.WrappedUpEntity;
import net.mcreator.craftkaisen.entity.WoodenBallEntity;
import net.mcreator.craftkaisen.entity.UnknownManEntity;
import net.mcreator.craftkaisen.entity.UltimateMechamaruEntity;
import net.mcreator.craftkaisen.entity.TwistEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.SukunaEntity;
import net.mcreator.craftkaisen.entity.SuguruGetoEntity;
import net.mcreator.craftkaisen.entity.StopEntity;
import net.mcreator.craftkaisen.entity.SleepEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RootProjectileEntity;
import net.mcreator.craftkaisen.entity.RikoAmanaiEntity;
import net.mcreator.craftkaisen.entity.ReversalRedProjectileEntity;
import net.mcreator.craftkaisen.entity.ReversalRedEntityEntity;
import net.mcreator.craftkaisen.entity.PrisonRealmMobEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.NailProjectileEntity;
import net.mcreator.craftkaisen.entity.MegumiFushiguroEntity;
import net.mcreator.craftkaisen.entity.MaximumMeteorEntity;
import net.mcreator.craftkaisen.entity.ManipulationPortalEntity;
import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.entity.MakiZeninEntity;
import net.mcreator.craftkaisen.entity.MahitoSpikeEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.MagmaRockProjectileEntity;
import net.mcreator.craftkaisen.entity.MagmaRockEntity;
import net.mcreator.craftkaisen.entity.LapseBlueEntity;
import net.mcreator.craftkaisen.entity.KenjakuEntity;
import net.mcreator.craftkaisen.entity.KasumiMiwaEntity;
import net.mcreator.craftkaisen.entity.JujutsuStudentEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.ItadoriEntity;
import net.mcreator.craftkaisen.entity.InventoryCurseEntity;
import net.mcreator.craftkaisen.entity.InfiniteVoiddEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleEntityEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.HajimeKashimoEntity;
import net.mcreator.craftkaisen.entity.GetCrushedEntity;
import net.mcreator.craftkaisen.entity.FlyHeadEntity;
import net.mcreator.craftkaisen.entity.FlowerfieldsEntity;
import net.mcreator.craftkaisen.entity.FireArrowProjectileEntity;
import net.mcreator.craftkaisen.entity.FireArrowEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.entity.ExplodeEntity;
import net.mcreator.craftkaisen.entity.EsoEntity;
import net.mcreator.craftkaisen.entity.EnergyBeamEntity;
import net.mcreator.craftkaisen.entity.EmptyMechamaruEntity;
import net.mcreator.craftkaisen.entity.EmberInsectEntity;
import net.mcreator.craftkaisen.entity.DisasterFlameEntity;
import net.mcreator.craftkaisen.entity.DarkAtomEntity;
import net.mcreator.craftkaisen.entity.CursedspiritrugbyfieldEntity;
import net.mcreator.craftkaisen.entity.CursedspiritroppongiEntity;
import net.mcreator.craftkaisen.entity.CursedspiritmouthEntity;
import net.mcreator.craftkaisen.entity.CursedspiritgrasshopperEntity;
import net.mcreator.craftkaisen.entity.CursedSpiritZombaEntity;
import net.mcreator.craftkaisen.entity.CursedSpiritKissEntity;
import net.mcreator.craftkaisen.entity.CursedBudEntity;
import net.mcreator.craftkaisen.entity.ClapEntity;
import net.mcreator.craftkaisen.entity.BoltProjectileEntity;
import net.mcreator.craftkaisen.entity.BlastAwayEntity;
import net.mcreator.craftkaisen.entity.BigFistEntity;
import net.mcreator.craftkaisen.entity.BaggedHeadCurseUserEntity;
import net.mcreator.craftkaisen.entity.BaggedHeadCurseUserCloneEntity;
import net.mcreator.craftkaisen.entity.AoiTodoEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftkaisenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftkaisenMod.MODID);
	public static final RegistryObject<EntityType<FlyHeadEntity>> FLY_HEAD = register("fly_head",
			EntityType.Builder.<FlyHeadEntity>of(FlyHeadEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyHeadEntity::new)

					.sized(0.6f, 0.6f));
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
	public static final RegistryObject<EntityType<ClapEntity>> CLAP = register("projectile_clap",
			EntityType.Builder.<ClapEntity>of(ClapEntity::new, MobCategory.MISC).setCustomClientFactory(ClapEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SatoruGojoEntity>> SATORU_GOJO = register("satoru_gojo",
			EntityType.Builder.<SatoruGojoEntity>of(SatoruGojoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SatoruGojoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FingerBearerEntity>> FINGER_BEARER = register("finger_bearer",
			EntityType.Builder.<FingerBearerEntity>of(FingerBearerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FingerBearerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MalevolentShrineEntity>> MALEVOLENT_SHRINE = register("malevolent_shrine", EntityType.Builder.<MalevolentShrineEntity>of(MalevolentShrineEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MalevolentShrineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JogoEntity>> JOGO = register("jogo",
			EntityType.Builder.<JogoEntity>of(JogoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JogoEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CursedspiritrugbyfieldEntity>> CURSEDSPIRITRUGBYFIELD = register("cursedspiritrugbyfield",
			EntityType.Builder.<CursedspiritrugbyfieldEntity>of(CursedspiritrugbyfieldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CursedspiritrugbyfieldEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<DisasterFlameEntity>> DISASTER_FLAME = register("projectile_disaster_flame",
			EntityType.Builder.<DisasterFlameEntity>of(DisasterFlameEntity::new, MobCategory.MISC).setCustomClientFactory(DisasterFlameEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MaximumMeteorEntity>> MAXIMUM_METEOR = register("maximum_meteor", EntityType.Builder.<MaximumMeteorEntity>of(MaximumMeteorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MaximumMeteorEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EmberInsectEntity>> EMBER_INSECT = register("ember_insect",
			EntityType.Builder.<EmberInsectEntity>of(EmberInsectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmberInsectEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireArrowEntity>> FIRE_ARROW = register("fire_arrow", EntityType.Builder.<FireArrowEntity>of(FireArrowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(FireArrowEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireArrowProjectileEntity>> FIRE_ARROW_PROJECTILE = register("projectile_fire_arrow_projectile", EntityType.Builder.<FireArrowProjectileEntity>of(FireArrowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireArrowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodenBallEntity>> WOODEN_BALL = register("projectile_wooden_ball",
			EntityType.Builder.<WoodenBallEntity>of(WoodenBallEntity::new, MobCategory.MISC).setCustomClientFactory(WoodenBallEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CursedBudEntity>> CURSED_BUD = register("projectile_cursed_bud",
			EntityType.Builder.<CursedBudEntity>of(CursedBudEntity::new, MobCategory.MISC).setCustomClientFactory(CursedBudEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlowerfieldsEntity>> FLOWERFIELDS = register("projectile_flowerfields",
			EntityType.Builder.<FlowerfieldsEntity>of(FlowerfieldsEntity::new, MobCategory.MISC).setCustomClientFactory(FlowerfieldsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CursedspiritroppongiEntity>> CURSEDSPIRITROPPONGI = register("cursedspiritroppongi",
			EntityType.Builder.<CursedspiritroppongiEntity>of(CursedspiritroppongiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CursedspiritroppongiEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<InventoryCurseEntity>> INVENTORY_CURSE = register("inventory_curse",
			EntityType.Builder.<InventoryCurseEntity>of(InventoryCurseEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InventoryCurseEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<CursedspiritgrasshopperEntity>> CURSEDSPIRITGRASSHOPPER = register("cursedspiritgrasshopper",
			EntityType.Builder.<CursedspiritgrasshopperEntity>of(CursedspiritgrasshopperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CursedspiritgrasshopperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MegumiFushiguroEntity>> MEGUMI_FUSHIGURO = register("megumi_fushiguro",
			EntityType.Builder.<MegumiFushiguroEntity>of(MegumiFushiguroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegumiFushiguroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagmaRockEntity>> MAGMA_ROCK = register("magma_rock",
			EntityType.Builder.<MagmaRockEntity>of(MagmaRockEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(MagmaRockEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnknownManEntity>> UNKNOWN_MAN = register("unknown_man",
			EntityType.Builder.<UnknownManEntity>of(UnknownManEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnknownManEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ItadoriEntity>> ITADORI = register("itadori",
			EntityType.Builder.<ItadoriEntity>of(ItadoriEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ItadoriEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SukunaEntity>> SUKUNA = register("sukuna",
			EntityType.Builder.<SukunaEntity>of(SukunaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SukunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagmaRockProjectileEntity>> MAGMA_ROCK_PROJECTILE = register("projectile_magma_rock_projectile", EntityType.Builder.<MagmaRockProjectileEntity>of(MagmaRockProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(MagmaRockProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BigFistEntity>> BIG_FIST = register("big_fist",
			EntityType.Builder.<BigFistEntity>of(BigFistEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigFistEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EsoEntity>> ESO = register("eso",
			EntityType.Builder.<EsoEntity>of(EsoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EsoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MahitoEntity>> MAHITO = register("mahito",
			EntityType.Builder.<MahitoEntity>of(MahitoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MahitoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MahitoSpikeEntity>> MAHITO_SPIKE = register("mahito_spike",
			EntityType.Builder.<MahitoSpikeEntity>of(MahitoSpikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MahitoSpikeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CursedspiritmouthEntity>> CURSEDSPIRITMOUTH = register("cursedspiritmouth",
			EntityType.Builder.<CursedspiritmouthEntity>of(CursedspiritmouthEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedspiritmouthEntity::new)

					.sized(0.7f, 2.1f));
	public static final RegistryObject<EntityType<UltimateMechamaruEntity>> ULTIMATE_MECHAMARU = register("ultimate_mechamaru",
			EntityType.Builder.<UltimateMechamaruEntity>of(UltimateMechamaruEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UltimateMechamaruEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EmptyMechamaruEntity>> EMPTY_MECHAMARU = register("empty_mechamaru",
			EntityType.Builder.<EmptyMechamaruEntity>of(EmptyMechamaruEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmptyMechamaruEntity::new)

					.sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<WrappedUpEntity>> WRAPPED_UP = register("wrapped_up",
			EntityType.Builder.<WrappedUpEntity>of(WrappedUpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WrappedUpEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RikoAmanaiEntity>> RIKO_AMANAI = register("riko_amanai",
			EntityType.Builder.<RikoAmanaiEntity>of(RikoAmanaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RikoAmanaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BaggedHeadCurseUserCloneEntity>> BAGGED_HEAD_CURSE_USER_CLONE = register("bagged_head_curse_user_clone",
			EntityType.Builder.<BaggedHeadCurseUserCloneEntity>of(BaggedHeadCurseUserCloneEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BaggedHeadCurseUserCloneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BaggedHeadCurseUserEntity>> BAGGED_HEAD_CURSE_USER = register("bagged_head_curse_user",
			EntityType.Builder.<BaggedHeadCurseUserEntity>of(BaggedHeadCurseUserEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BaggedHeadCurseUserEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReversalRedEntityEntity>> REVERSAL_RED_ENTITY = register("reversal_red_entity", EntityType.Builder.<ReversalRedEntityEntity>of(ReversalRedEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReversalRedEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PrisonRealmMobEntity>> PRISON_REALM_MOB = register("prison_realm_mob", EntityType.Builder.<PrisonRealmMobEntity>of(PrisonRealmMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(6).setUpdateInterval(3).setCustomClientFactory(PrisonRealmMobEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<BoltProjectileEntity>> BOLT_PROJECTILE = register("projectile_bolt_projectile",
			EntityType.Builder.<BoltProjectileEntity>of(BoltProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BoltProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RootProjectileEntity>> ROOT_PROJECTILE = register("projectile_root_projectile",
			EntityType.Builder.<RootProjectileEntity>of(RootProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RootProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MakiZeninEntity>> MAKI_ZENIN = register("maki_zenin",
			EntityType.Builder.<MakiZeninEntity>of(MakiZeninEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MakiZeninEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReversalRedProjectileEntity>> REVERSAL_RED_PROJECTILE = register("projectile_reversal_red_projectile",
			EntityType.Builder.<ReversalRedProjectileEntity>of(ReversalRedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ReversalRedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YutaOkkotsuEntity>> YUTA_OKKOTSU = register("yuta_okkotsu",
			EntityType.Builder.<YutaOkkotsuEntity>of(YutaOkkotsuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YutaOkkotsuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuguruGetoEntity>> SUGURU_GETO = register("suguru_geto",
			EntityType.Builder.<SuguruGetoEntity>of(SuguruGetoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuguruGetoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnergyBeamEntity>> ENERGY_BEAM = register("energy_beam",
			EntityType.Builder.<EnergyBeamEntity>of(EnergyBeamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnergyBeamEntity::new).fireImmune().sized(0f, 0f));
	public static final RegistryObject<EntityType<CursedSpiritZombaEntity>> CURSED_SPIRIT_ZOMBA = register("cursed_spirit_zomba",
			EntityType.Builder.<CursedSpiritZombaEntity>of(CursedSpiritZombaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedSpiritZombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CursedSpiritKissEntity>> CURSED_SPIRIT_KISS = register("cursed_spirit_kiss",
			EntityType.Builder.<CursedSpiritKissEntity>of(CursedSpiritKissEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CursedSpiritKissEntity::new)

					.sized(1.1f, 2.1f));
	public static final RegistryObject<EntityType<KenjakuEntity>> KENJAKU = register("kenjaku",
			EntityType.Builder.<KenjakuEntity>of(KenjakuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KenjakuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NanamiKentoEntity>> NANAMI_KENTO = register("nanami_kento",
			EntityType.Builder.<NanamiKentoEntity>of(NanamiKentoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NanamiKentoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AoiTodoEntity>> AOI_TODO = register("aoi_todo",
			EntityType.Builder.<AoiTodoEntity>of(AoiTodoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AoiTodoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ManipulationPortalEntity>> MANIPULATION_PORTAL = register("manipulation_portal", EntityType.Builder.<ManipulationPortalEntity>of(ManipulationPortalEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ManipulationPortalEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KasumiMiwaEntity>> KASUMI_MIWA = register("kasumi_miwa",
			EntityType.Builder.<KasumiMiwaEntity>of(KasumiMiwaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KasumiMiwaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HanamiEntity>> HANAMI = register("hanami",
			EntityType.Builder.<HanamiEntity>of(HanamiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HanamiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HajimeKashimoEntity>> HAJIME_KASHIMO = register("hajime_kashimo",
			EntityType.Builder.<HajimeKashimoEntity>of(HajimeKashimoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HajimeKashimoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DarkAtomEntity>> DARK_ATOM = register("projectile_dark_atom",
			EntityType.Builder.<DarkAtomEntity>of(DarkAtomEntity::new, MobCategory.MISC).setCustomClientFactory(DarkAtomEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NailProjectileEntity>> NAIL_PROJECTILE = register("projectile_nail_projectile",
			EntityType.Builder.<NailProjectileEntity>of(NailProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NailProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FlyHeadEntity.init();
			HollowPurpleEntityEntity.init();
			LapseBlueEntity.init();
			JujutsuStudentEntity.init();
			TojiFushiguroEntity.init();
			InfiniteVoiddEntity.init();
			SatoruGojoEntity.init();
			FingerBearerEntity.init();
			MalevolentShrineEntity.init();
			JogoEntity.init();
			CursedspiritrugbyfieldEntity.init();
			MaximumMeteorEntity.init();
			EmberInsectEntity.init();
			FireArrowEntity.init();
			CursedspiritroppongiEntity.init();
			InventoryCurseEntity.init();
			CursedspiritgrasshopperEntity.init();
			MegumiFushiguroEntity.init();
			MagmaRockEntity.init();
			UnknownManEntity.init();
			ItadoriEntity.init();
			SukunaEntity.init();
			BigFistEntity.init();
			EsoEntity.init();
			MahitoEntity.init();
			MahitoSpikeEntity.init();
			CursedspiritmouthEntity.init();
			UltimateMechamaruEntity.init();
			EmptyMechamaruEntity.init();
			WrappedUpEntity.init();
			RikoAmanaiEntity.init();
			BaggedHeadCurseUserCloneEntity.init();
			BaggedHeadCurseUserEntity.init();
			ReversalRedEntityEntity.init();
			PrisonRealmMobEntity.init();
			MakiZeninEntity.init();
			YutaOkkotsuEntity.init();
			SuguruGetoEntity.init();
			EnergyBeamEntity.init();
			CursedSpiritZombaEntity.init();
			CursedSpiritKissEntity.init();
			KenjakuEntity.init();
			NanamiKentoEntity.init();
			AoiTodoEntity.init();
			ManipulationPortalEntity.init();
			KasumiMiwaEntity.init();
			HanamiEntity.init();
			HajimeKashimoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FLY_HEAD.get(), FlyHeadEntity.createAttributes().build());
		event.put(HOLLOW_PURPLE_ENTITY.get(), HollowPurpleEntityEntity.createAttributes().build());
		event.put(LAPSE_BLUE.get(), LapseBlueEntity.createAttributes().build());
		event.put(JUJUTSU_STUDENT.get(), JujutsuStudentEntity.createAttributes().build());
		event.put(TOJI_FUSHIGURO.get(), TojiFushiguroEntity.createAttributes().build());
		event.put(INFINITE_VOIDD.get(), InfiniteVoiddEntity.createAttributes().build());
		event.put(SATORU_GOJO.get(), SatoruGojoEntity.createAttributes().build());
		event.put(FINGER_BEARER.get(), FingerBearerEntity.createAttributes().build());
		event.put(MALEVOLENT_SHRINE.get(), MalevolentShrineEntity.createAttributes().build());
		event.put(JOGO.get(), JogoEntity.createAttributes().build());
		event.put(CURSEDSPIRITRUGBYFIELD.get(), CursedspiritrugbyfieldEntity.createAttributes().build());
		event.put(MAXIMUM_METEOR.get(), MaximumMeteorEntity.createAttributes().build());
		event.put(EMBER_INSECT.get(), EmberInsectEntity.createAttributes().build());
		event.put(FIRE_ARROW.get(), FireArrowEntity.createAttributes().build());
		event.put(CURSEDSPIRITROPPONGI.get(), CursedspiritroppongiEntity.createAttributes().build());
		event.put(INVENTORY_CURSE.get(), InventoryCurseEntity.createAttributes().build());
		event.put(CURSEDSPIRITGRASSHOPPER.get(), CursedspiritgrasshopperEntity.createAttributes().build());
		event.put(MEGUMI_FUSHIGURO.get(), MegumiFushiguroEntity.createAttributes().build());
		event.put(MAGMA_ROCK.get(), MagmaRockEntity.createAttributes().build());
		event.put(UNKNOWN_MAN.get(), UnknownManEntity.createAttributes().build());
		event.put(ITADORI.get(), ItadoriEntity.createAttributes().build());
		event.put(SUKUNA.get(), SukunaEntity.createAttributes().build());
		event.put(BIG_FIST.get(), BigFistEntity.createAttributes().build());
		event.put(ESO.get(), EsoEntity.createAttributes().build());
		event.put(MAHITO.get(), MahitoEntity.createAttributes().build());
		event.put(MAHITO_SPIKE.get(), MahitoSpikeEntity.createAttributes().build());
		event.put(CURSEDSPIRITMOUTH.get(), CursedspiritmouthEntity.createAttributes().build());
		event.put(ULTIMATE_MECHAMARU.get(), UltimateMechamaruEntity.createAttributes().build());
		event.put(EMPTY_MECHAMARU.get(), EmptyMechamaruEntity.createAttributes().build());
		event.put(WRAPPED_UP.get(), WrappedUpEntity.createAttributes().build());
		event.put(RIKO_AMANAI.get(), RikoAmanaiEntity.createAttributes().build());
		event.put(BAGGED_HEAD_CURSE_USER_CLONE.get(), BaggedHeadCurseUserCloneEntity.createAttributes().build());
		event.put(BAGGED_HEAD_CURSE_USER.get(), BaggedHeadCurseUserEntity.createAttributes().build());
		event.put(REVERSAL_RED_ENTITY.get(), ReversalRedEntityEntity.createAttributes().build());
		event.put(PRISON_REALM_MOB.get(), PrisonRealmMobEntity.createAttributes().build());
		event.put(MAKI_ZENIN.get(), MakiZeninEntity.createAttributes().build());
		event.put(YUTA_OKKOTSU.get(), YutaOkkotsuEntity.createAttributes().build());
		event.put(SUGURU_GETO.get(), SuguruGetoEntity.createAttributes().build());
		event.put(ENERGY_BEAM.get(), EnergyBeamEntity.createAttributes().build());
		event.put(CURSED_SPIRIT_ZOMBA.get(), CursedSpiritZombaEntity.createAttributes().build());
		event.put(CURSED_SPIRIT_KISS.get(), CursedSpiritKissEntity.createAttributes().build());
		event.put(KENJAKU.get(), KenjakuEntity.createAttributes().build());
		event.put(NANAMI_KENTO.get(), NanamiKentoEntity.createAttributes().build());
		event.put(AOI_TODO.get(), AoiTodoEntity.createAttributes().build());
		event.put(MANIPULATION_PORTAL.get(), ManipulationPortalEntity.createAttributes().build());
		event.put(KASUMI_MIWA.get(), KasumiMiwaEntity.createAttributes().build());
		event.put(HANAMI.get(), HanamiEntity.createAttributes().build());
		event.put(HAJIME_KASHIMO.get(), HajimeKashimoEntity.createAttributes().build());
	}
}
