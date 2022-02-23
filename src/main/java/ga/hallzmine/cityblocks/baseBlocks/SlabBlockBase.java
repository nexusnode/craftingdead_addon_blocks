package ga.hallzmine.cityblocks.baseBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SlabBlockBase extends SlabBlock {

  public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
  public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
  protected static final VoxelShape BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
  protected static final VoxelShape TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);

  public SlabBlockBase(Block.Properties properties) {

    super(properties);
    this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM)
        .setValue(WATERLOGGED, Boolean.valueOf(false)));
  }

  public boolean useShapeForLightOcclusion(BlockState state) {
    return state.getValue(TYPE) != SlabType.DOUBLE;
  }

  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(TYPE, WATERLOGGED);
  }

  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    SlabType slabtype = state.getValue(TYPE);
    switch (slabtype) {
      case DOUBLE:
        return Shapes.block();
      case TOP:
        return TOP_SHAPE;
      default:
        return BOTTOM_SHAPE;
    }
  }

}
