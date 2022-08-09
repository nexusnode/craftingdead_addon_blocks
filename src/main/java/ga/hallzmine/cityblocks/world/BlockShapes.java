package ga.hallzmine.cityblocks.world;

import java.util.EnumMap;
import java.util.Map;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockShapes {
  public static final VoxelShape STREET_LIGHT = net.minecraft.world.phys.shapes.Shapes
      .join(Block.box(6.5, 0, 6.5, 9.5, 8, 9.5), Block.box(7, 0, 7, 9, 16, 9), BooleanOp.OR);
  public static final VoxelShape STREET_LIGHT_CROSS =
      Shapes.join(Block.box(0, 7, 7, 16, 9, 9), Block.box(7, 7, 0, 9, 9, 16), BooleanOp.OR);
  public static final VoxelShape STREET_LIGHT_POLE = Block.box(7, 0, 7, 9, 16, 9);

  public static Map<Direction, VoxelShape> computeOrientableShape(VoxelShape in) {
    var directions = Direction.values();
    var orientedShapes = new EnumMap<Direction, VoxelShape>(Direction.class);
    for (Direction direction : directions) {
      var buffer = new VoxelShape[]{in, Shapes.empty()};

      int times = (direction.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
      for (int j = 0; j < times; j++) {
        buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] =
            Shapes.or(buffer[1], Shapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
        buffer[0] = buffer[1];
        buffer[1] = Shapes.empty();
      }

      orientedShapes.put(direction, buffer[0]);
    }
    return orientedShapes;
  }
}
