package ga.hallzmine.cityblocks.world.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class OrientableTallBlock extends OrientableBlock {

  protected static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 32, 16);

  public OrientableTallBlock() {
    super(Properties.of(Material.METAL).noOcclusion());
  }

  @SuppressWarnings("deprecation")
  @Override
  @NotNull
  public VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos,
      @NotNull CollisionContext context) {
    return SHAPE;
  }
}
