package ga.hallzmine.cityblocks.world.block;

import java.util.Map;
import java.util.stream.Stream;
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

public class SteelPoleBarrierBlock extends OrientableBlockBase {

  protected static final Map<Direction, VoxelShape> SHAPES =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(13, 0, 7, 15, 13, 9), Block.box(1, 0, 7, 3, 13, 9),
              Block.box(0, 9.3, 6, 16, 12.3, 7), Block.box(0, 5.3, 6, 16, 8.3, 7))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());

  public SteelPoleBarrierBlock() {
    super(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion());
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPES.get(state.getValue(HorizontalDirectionalBlock.FACING));
  }
}
