package net.mcreator.craftkaisen.world.features.treedecorators;

public class PrisonRealmBiomeLeaveDecorator extends LeaveVineDecorator {

	public static final PrisonRealmBiomeLeaveDecorator INSTANCE = new PrisonRealmBiomeLeaveDecorator();

	public static com.mojang.serialization.Codec<LeaveVineDecorator> codec;
	public static TreeDecoratorType<?> tdt;

	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		ForgeRegistries.TREE_DECORATOR_TYPES.register("prison_realm_biome_tree_leave_decorator", tdt);
	}

	public PrisonRealmBiomeLeaveDecorator() {
		super(0.25f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(TreeDecorator.Context context) {
		context.leaves().forEach((blockpos) -> {
			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.west();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}

			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.east();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}

			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.north();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}

			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.south();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}
		});
	}

	private static void addVine(BlockPos pos, TreeDecorator.Context context) {
		context.setBlock(pos, Blocks.VINE.defaultBlockState());
		int i = 4;
		for (BlockPos blockpos = pos.below(); context.isAir(blockpos) && i > 0; --i) {
			context.setBlock(blockpos, Blocks.VINE.defaultBlockState());
			blockpos = blockpos.below();
		}

	}

}
