package ga.hallzmine.cityblocks.baseBlocks;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BlockBase extends Block {
    private VoxelShape voxelshape;
    public BlockBase(Properties properties, VoxelShape voxelshapes) {
        super(properties);
        this.voxelshape = voxelshapes;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {

        return this.voxelshape;
    }
}
