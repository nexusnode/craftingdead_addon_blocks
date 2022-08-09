package ga.hallzmine.cityblocks.world;

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

}
