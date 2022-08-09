package ga.hallzmine.cityblocks.world.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockBase extends Block {

  private final VoxelShape voxelshape;

  public BlockBase(Properties properties, VoxelShape voxelshapes) {
    super(properties);
    this.voxelshape = voxelshapes;
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {

    return this.voxelshape;
  }
}
