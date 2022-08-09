package ga.hallzmine.cityblocks.world.block;

import java.util.Map;
import ga.hallzmine.cityblocks.world.BlockShapes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StreetLightVerticalCrossBlock extends OrientableBlockBase {

  protected static final Map<Direction, VoxelShape> SHAPES = BlockShapes.computeOrientableShape(
      Shapes.join(Block.box(7, 0, 7, 9, 16, 9), Block.box(7, 7, 0, 9, 9, 16), BooleanOp.OR));

  public StreetLightVerticalCrossBlock() {
    super(Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion());
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPES.get(state.getValue(HorizontalDirectionalBlock.FACING));
  }
}
