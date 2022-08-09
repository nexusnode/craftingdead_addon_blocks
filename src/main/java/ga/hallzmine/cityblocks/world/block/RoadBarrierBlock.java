package ga.hallzmine.cityblocks.world.block;

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

public class RoadBarrierBlock extends OrientableBlockBase {

  protected static final Map<Direction, VoxelShape> SHAPES = new HashMap<Direction, VoxelShape>();

  public RoadBarrierBlock() {
    super(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion());
    runCalculation(Stream
        .of(Block.box(12, -1, 3.75, 15, 12, 4.75), Block.box(1, -1, 3.75, 4, 12, 4.75),
            Block.box(12, -1, 11.1795, 15, 12, 12.1795), Block.box(1, -1, 11.1795, 4, 12, 12.1795),
            Block.box(0, 9, 9.275, 16, 13, 10.275), Block.box(0, 9, 5.67234, 16, 13, 6.67234),
            Block.box(0, 4, 11.275, 16, 8, 12.275), Block.box(0, 4, 3.67234, 16, 8, 4.67234))
        .reduce((v1, v2) -> {
          return Shapes.join(v1, v2, BooleanOp.OR);
        }).get());
  }

  protected static void calculateShapes(Direction to, VoxelShape shape) {
    VoxelShape[] buffer = new VoxelShape[] {shape, Shapes.empty()};

    int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
    for (int i = 0; i < times; i++) {
      buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] =
          Shapes.or(buffer[1], Shapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
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

