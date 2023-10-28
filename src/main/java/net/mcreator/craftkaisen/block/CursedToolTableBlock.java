
package net.mcreator.craftkaisen.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class CursedToolTableBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CursedToolTableBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 45f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(1, 0, 12, 2, 4, 13), box(14, 0, 12, 15, 4, 13), box(2, 1, 12, 14, 3, 13), box(14, 0, 3, 15, 4, 4), box(2, 1, 3, 14, 3, 4), box(1, 0, 3, 2, 4, 4), box(1, 4, 3, 15, 5, 13), box(3, 5, 6, 4, 6, 11),
					box(2, 5, 5, 5, 6, 6), box(0, 9, 2, 16, 10, 14), box(7, 10, 3, 15, 10.15, 13), box(2, 10, 4, 6, 11, 8), box(2, 11, 4, 6, 14, 5), box(2, 11, 7, 6, 14, 8), box(5, 11, 5, 6, 14, 7), box(2, 11, 5, 3, 14, 7), box(14, 5, 12, 15, 9, 13),
					box(1, 5, 12, 2, 9, 13), box(14, 5, 3, 15, 9, 4), box(2, 6, 3, 14, 8, 4), box(1, 5, 3, 2, 9, 4));
			case NORTH -> Shapes.or(box(14, 0, 3, 15, 4, 4), box(1, 0, 3, 2, 4, 4), box(2, 1, 3, 14, 3, 4), box(1, 0, 12, 2, 4, 13), box(2, 1, 12, 14, 3, 13), box(14, 0, 12, 15, 4, 13), box(1, 4, 3, 15, 5, 13), box(12, 5, 5, 13, 6, 10),
					box(11, 5, 10, 14, 6, 11), box(0, 9, 2, 16, 10, 14), box(1, 10, 3, 9, 10.15, 13), box(10, 10, 8, 14, 11, 12), box(10, 11, 11, 14, 14, 12), box(10, 11, 8, 14, 14, 9), box(10, 11, 9, 11, 14, 11), box(13, 11, 9, 14, 14, 11),
					box(1, 5, 3, 2, 9, 4), box(14, 5, 3, 15, 9, 4), box(1, 5, 12, 2, 9, 13), box(2, 6, 12, 14, 8, 13), box(14, 5, 12, 15, 9, 13));
			case EAST -> Shapes.or(box(12, 0, 14, 13, 4, 15), box(12, 0, 1, 13, 4, 2), box(12, 1, 2, 13, 3, 14), box(3, 0, 1, 4, 4, 2), box(3, 1, 2, 4, 3, 14), box(3, 0, 14, 4, 4, 15), box(3, 4, 1, 13, 5, 15), box(6, 5, 12, 11, 6, 13),
					box(5, 5, 11, 6, 6, 14), box(2, 9, 0, 14, 10, 16), box(3, 10, 1, 13, 10.15, 9), box(4, 10, 10, 8, 11, 14), box(4, 11, 10, 5, 14, 14), box(7, 11, 10, 8, 14, 14), box(5, 11, 10, 7, 14, 11), box(5, 11, 13, 7, 14, 14),
					box(12, 5, 1, 13, 9, 2), box(12, 5, 14, 13, 9, 15), box(3, 5, 1, 4, 9, 2), box(3, 6, 2, 4, 8, 14), box(3, 5, 14, 4, 9, 15));
			case WEST -> Shapes.or(box(3, 0, 1, 4, 4, 2), box(3, 0, 14, 4, 4, 15), box(3, 1, 2, 4, 3, 14), box(12, 0, 14, 13, 4, 15), box(12, 1, 2, 13, 3, 14), box(12, 0, 1, 13, 4, 2), box(3, 4, 1, 13, 5, 15), box(5, 5, 3, 10, 6, 4),
					box(10, 5, 2, 11, 6, 5), box(2, 9, 0, 14, 10, 16), box(3, 10, 7, 13, 10.15, 15), box(8, 10, 2, 12, 11, 6), box(11, 11, 2, 12, 14, 6), box(8, 11, 2, 9, 14, 6), box(9, 11, 5, 11, 14, 6), box(9, 11, 2, 11, 14, 3),
					box(3, 5, 14, 4, 9, 15), box(3, 5, 1, 4, 9, 2), box(12, 5, 14, 13, 9, 15), box(12, 6, 2, 13, 8, 14), box(12, 5, 1, 13, 9, 2));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return this.defaultBlockState().setValue(FACING, Direction.NORTH);
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		OpenSwordCreatorGUIProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}