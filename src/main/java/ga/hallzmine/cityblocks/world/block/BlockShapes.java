package ga.hallzmine.cityblocks.world.block;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Shape definition for all blocks with custom model
 */
public class BlockShapes {
  public static final VoxelShape STREET_LIGHT = net.minecraft.world.phys.shapes.Shapes
      .join(Block.box(6.5, 0, 6.5, 9.5, 8, 9.5), Block.box(7, 0, 7, 9, 16, 9), BooleanOp.OR);
  public static final VoxelShape STREET_LIGHT_CROSS =
      Shapes.join(Block.box(0, 7, 7, 16, 9, 9), Block.box(7, 7, 0, 9, 9, 16), BooleanOp.OR);
  public static final VoxelShape STREET_LIGHT_POLE = Block.box(7, 0, 7, 9, 16, 9);

  public static final Map<Direction, VoxelShape> CONCRETE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(0, 0, 7, 16, 14, 9), Block.box(0, 0, 9, 16, 2, 11),
              Block.box(0, 0, 5, 16, 2, 7))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> POLE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(1, 0, 7, 3, 13, 9), Block.box(13, 0, 7, 15, 13, 9),
              Block.box(0, 9.3, 6, 16, 12.3, 7), Block.box(0, 5.3, 6, 16, 8.3, 7),
              Block.box(1, 13, 7, 3, 15.5, 9), Block.box(13, 13, 7, 15, 15.5, 9))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> ROAD_BARRIER = BlockShapes.computeOrientableShape(
      Stream.of(Block.box(12, -1, 3.75, 15, 12, 4.75), Block.box(1, -1, 3.75, 4, 12, 4.75),
          Block.box(12, -1, 11.1795, 15, 12, 12.1795), Block.box(1, -1, 11.1795, 4, 12, 12.1795),
          Block.box(0, 9, 9.275, 16, 13, 10.275), Block.box(0, 9, 5.67234, 16, 13, 6.67234),
          Block.box(0, 4, 11.275, 16, 8, 12.275), Block.box(0, 4, 3.67234, 16, 8, 4.67234))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> SLAB_CONCRETE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(0, 8, 7, 16, 22, 9), Block.box(0, 8, 9, 16, 10, 11),
              Block.box(0, 8, 5, 16, 10, 7), Block.box(0, 0, 0, 16, 8, 16))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> SLAB_STEEL_POLE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(0, 0, 0, 16, 8, 16), Block.box(1, 8, 7, 3, 21, 9),
              Block.box(13, 8, 7, 15, 21, 9), Block.box(0, 17.3, 6, 16, 20.3, 7),
              Block.box(0, 13.3, 6, 16, 16.3, 7))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> SLAB_STRIPED_CONCRETE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(0, 8, 7, 16, 22, 9), Block.box(0, 8, 9, 16, 10, 11),
              Block.box(0, 8, 5, 16, 10, 7), Block.box(0, 0, 0, 16, 8, 16))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> STEEL_POLE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(13, 0, 7, 15, 13, 9), Block.box(1, 0, 7, 3, 13, 9),
              Block.box(0, 9.3, 6, 16, 12.3, 7), Block.box(0, 5.3, 6, 16, 8.3, 7))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> STOP_SIGN =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(7, -16, 7, 9, -10, 9), Block.box(7.5, -10, 7.5, 8.5, 31, 8.5),
              Block.box(0, 20.68629, 7.25, 16, 27.31371, 7.5),
              Block.box(0, 20.68629, 7.2, 16, 27.31371, 7.55),
              Block.box(4.68629, 16, 7.26, 11.31371, 32, 7.51),
              Block.box(4.68629, 16, 7.27, 11.31371, 32, 7.52))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> STREET_LIGHT_CURVE =
      BlockShapes.computeOrientableShape(
          Shapes.join(Block.box(7, 0, 7, 9, 16, 9), Block.box(7, 7, 9, 9, 9, 16), BooleanOp.OR));
  public static final Map<Direction, VoxelShape> STREET_LIGHT_DOUBLE_CURVE =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(7, 0, 7, 9, 16, 9), Block.box(7, 7, 0, 9, 9, 7),
              Block.box(7, 7, 9, 9, 9, 16))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> STREET_LIGHT_HEAD =
      BlockShapes.computeOrientableShape(Block.box(7, 7, 0, 9, 9, 16));
  public static final Map<Direction, VoxelShape> STREET_LIGHT_HORIZONTAL =
      BlockShapes.computeOrientableShape(Block.box(0, 7, 7, 16, 9, 9));
  public static final Map<Direction, VoxelShape> STREET_LIGHT_VERTICAL_CROSS =
      BlockShapes.computeOrientableShape(
          Shapes.join(Block.box(7, 0, 7, 9, 16, 9), Block.box(7, 7, 0, 9, 9, 16), BooleanOp.OR));
  public static final Map<Direction, VoxelShape> STRIPED_CONCRETE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(0, 0, 7, 16, 14, 9), Block.box(0, 0, 9, 16, 2, 11),
              Block.box(0, 0, 5, 16, 2, 7))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());
  public static final Map<Direction, VoxelShape> TRAFFIC_LIGHT =
      BlockShapes.computeOrientableShape(Block.box(5, 0, 21, 11, 16, 23));
  public static final Map<Direction, VoxelShape> UNLIT_POLE_BARRIER =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(13, 0, 7, 15, 13, 9), Block.box(1, 0, 7, 3, 13, 9),
              Block.box(0, 9.3, 6, 16, 12.3, 7), Block.box(0, 5.3, 6, 16, 8.3, 7))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());

  /**
   * Creates rotates a shape and creates a map for each direction
   *
   * @param in - initial north facing shape
   * @return rotated shapes for each direction
   */
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
