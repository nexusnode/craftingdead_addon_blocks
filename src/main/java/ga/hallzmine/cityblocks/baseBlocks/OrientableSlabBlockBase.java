package ga.hallzmine.cityblocks.baseBlocks;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OrientableSlabBlockBase extends SlabBlock {

  public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
  public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
  public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
  protected static final VoxelShape BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
  protected static final VoxelShape TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);

  public OrientableSlabBlockBase(Block.Properties properties) {
    super(properties);
    this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM)
        .setValue(WATERLOGGED, Boolean.valueOf(false)));
  }

  @Nullable
  @Override
  public BlockState getStateForPlacement(BlockPlaceContext context) {
    BlockPos blockpos = context.getClickedPos();
    BlockState blockstate = context.getLevel().getBlockState(blockpos);
    if (blockstate.is(this)) {
      return blockstate.setValue(TYPE, SlabType.DOUBLE)
          .setValue(WATERLOGGED, Boolean.valueOf(false))
          .setValue(FACING, context.getHorizontalDirection().getOpposite());
    } else {
      FluidState fluidstate = context.getLevel().getFluidState(blockpos);
      BlockState blockstate1 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM)
          .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER))
          .setValue(FACING, context.getHorizontalDirection().getOpposite());
      Direction direction = context.getClickedFace();
      return direction != Direction.DOWN && (direction == Direction.UP || !(
          context.getClickLocation().y - (double) blockpos.getY() > 0.5D)) ? blockstate1
          : blockstate1.setValue(TYPE, SlabType.TOP);
    }
  }

  @Override
  public BlockState rotate(BlockState state, Rotation rot) {
    return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
  }

  @Override
  public BlockState mirror(BlockState state, Mirror mirrorIn) {
    return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
  }

  @Override
  public boolean useShapeForLightOcclusion(BlockState state) {
    return state.getValue(TYPE) != SlabType.DOUBLE;
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(TYPE, WATERLOGGED, FACING);
  }
}
