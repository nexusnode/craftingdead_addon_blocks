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

public class SlabConcreteBarrierBlock extends OrientableBlockBase {

  protected static final Map<Direction, VoxelShape> SHAPES =
      BlockShapes.computeOrientableShape(Stream
          .of(Block.box(0, 8, 7, 16, 22, 9), Block.box(0, 8, 9, 16, 10, 11),
              Block.box(0, 8, 5, 16, 10, 7), Block.box(0, 0, 0, 16, 8, 16))
          .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get());

  public SlabConcreteBarrierBlock() {
    super(Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion());
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPES.get(state.getValue(HorizontalDirectionalBlock.FACING));
  }
}
