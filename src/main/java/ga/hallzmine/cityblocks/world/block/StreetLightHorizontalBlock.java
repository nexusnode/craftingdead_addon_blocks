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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StreetLightHorizontalBlock extends OrientableBlockBase {

  protected static final Map<Direction, VoxelShape> SHAPES =
      BlockShapes.computeOrientableShape(Block.box(0, 7, 7, 16, 9, 9));

  public StreetLightHorizontalBlock() {
    super(Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion());
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPES.get(state.getValue(HorizontalDirectionalBlock.FACING));
  }
}
