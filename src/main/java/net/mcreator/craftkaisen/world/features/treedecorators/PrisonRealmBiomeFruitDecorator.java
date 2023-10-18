package net.mcreator.craftkaisen.world.features.treedecorators;

public class PrisonRealmBiomeFruitDecorator extends CocoaDecorator {

    public static final PrisonRealmBiomeFruitDecorator INSTANCE = new PrisonRealmBiomeFruitDecorator();

    public static com.mojang.serialization.Codec<PrisonRealmBiomeFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("prison_realm_biome_tree_fruit_decorator", tdt);
    }

    public PrisonRealmBiomeFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
