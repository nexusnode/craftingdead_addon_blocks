package ga.hallzmine.cityblocks.world.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OrientableTallBlock extends OrientableBlockBase {

  protected static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 32, 16);

  public OrientableTallBlock() {
    super(Properties.of(Material.METAL).noOcclusion());
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPE;
  }
}
