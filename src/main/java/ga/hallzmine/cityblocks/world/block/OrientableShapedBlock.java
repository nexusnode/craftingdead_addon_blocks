package ga.hallzmine.cityblocks.world.block;

import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class OrientableShapedBlock extends HorizontalDirectionalBlock {

  private final Map<Direction, VoxelShape> shapes;

  public OrientableShapedBlock(Properties properties, Map<Direction, VoxelShape> shapes) {
    super(properties);
    this.shapes = shapes;
  }

  @Override
  public BlockState getStateForPlacement(BlockPlaceContext context) {
    return this.defaultBlockState().setValue(FACING,
        context.getHorizontalDirection().getOpposite());
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(FACING);
  }

  @SuppressWarnings("deprecation")
  @Override
  @NotNull
  public VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos,
      @NotNull CollisionContext context) {
    return this.shapes.get(state.getValue(HorizontalDirectionalBlock.FACING));
  }
}
