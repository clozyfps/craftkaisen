
package net.mcreator.craftkaisen.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;

public class PrisonRealmBiomeBiome {

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(-13421773).waterFogColor(-10066330).skyColor(-16777216).foliageColorOverride(-13421773).grassColorOverride(-13421773)
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.ASH, 0.0075f)).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings
				.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						PlacementUtils.register("craftkaisen:tree_prison_realm_biome",
								FeatureUtils.register("craftkaisen:tree_prison_realm_biome", Feature.TREE,
										new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(7, 2, 0), BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()),
												new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
												.decorators(ImmutableList.of(PrisonRealmBiomeLeaveDecorator.INSTANCE, PrisonRealmBiomeTrunkDecorator.INSTANCE

														, PrisonRealmBiomeFruitDecorator.INSTANCE))
												.build()),
								List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
										BiomeFilter.biome())));

		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);

		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(CraftkaisenModEntities.CURSEDSPIRITROPPONGI.get(), 20, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), 20, 1, 3));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(CraftkaisenModEntities.CURSEDSPIRITGRASSHOPPER.get(), 20, 1, 1));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(CraftkaisenModEntities.CURSEDSPIRITRUGBYFIELD.get(), 20, 1, 2));

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(0f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}

}
