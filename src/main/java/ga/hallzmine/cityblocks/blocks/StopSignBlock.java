package ga.hallzmine.cityblocks.blocks;

import ga.hallzmine.cityblocks.baseBlocks.OrientableBlockBase;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
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

public class StopSignBlock extends OrientableBlockBase {


  public StopSignBlock() {
    super(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion());
    runCalculation(Stream.of(
        Block.box(7, -16, 7, 9, -10, 9),
        Block.box(7.5, -10, 7.5, 8.5, 31, 8.5),
        Block.box(0, 20.68629, 7.25, 16, 27.31371, 7.5),
        Block.box(0, 20.68629, 7.2, 16, 27.31371, 7.55),
        Block.box(4.68629, 16, 7.26, 11.31371, 32, 7.51),
        Block.box(4.68629, 16, 7.27, 11.31371, 32, 7.52)
    ).reduce((v1, v2) -> {
      return Shapes.join(v1, v2, BooleanOp.OR);
    }).get());
  }

  protected static final Map<Direction, VoxelShape> SHAPES = new HashMap<Direction, VoxelShape>();

  protected static void calculateShapes(Direction to, VoxelShape shape) {
    VoxelShape[] buffer = new VoxelShape[]{shape, Shapes.empty()};

    int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
    for (int i = 0; i < times; i++) {
      buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = Shapes.or(buffer[1],
          Shapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
      buffer[0] = buffer[1];
      buffer[1] = Shapes.empty();
    }

    SHAPES.put(to, buffer[0]);
  }

  protected void runCalculation(VoxelShape shape) {
    for (Direction direction : Direction.values()) {
      calculateShapes(direction, shape);
    }
  }


  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPES.get(state.getValue(HorizontalDirectionalBlock.FACING));
  }


}

