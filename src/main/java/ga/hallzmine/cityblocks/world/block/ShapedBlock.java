package ga.hallzmine.cityblocks.world.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ShapedBlock extends Block {

  private final VoxelShape shape;

  public ShapedBlock(Properties properties, VoxelShape shape) {
    super(properties);
    this.shape = shape;
  }

  @SuppressWarnings("deprecation")
  @Override
  @NotNull
  public VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos,
      @NotNull CollisionContext context) {
    return this.shape;
  }
}
