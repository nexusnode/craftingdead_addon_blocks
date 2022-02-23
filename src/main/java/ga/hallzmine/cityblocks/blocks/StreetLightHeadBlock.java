package ga.hallzmine.cityblocks.blocks;

import ga.hallzmine.cityblocks.baseBlocks.OrientableBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import static net.minecraft.block.HorizontalBlock.HORIZONTAL_FACING;

public class StreetLightHeadBlock extends OrientableBlockBase {



    public StreetLightHeadBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid().setLightLevel((state) -> { return 15; }));
        runCalculation(Block.makeCuboidShape(7, 7, 0, 9, 9, 16));
    }
    protected static final Map<Direction, VoxelShape> SHAPES = new HashMap<Direction, VoxelShape>();
    protected static void calculateShapes(Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[] { shape, VoxelShapes.empty() };

        int times = (to.getHorizontalIndex() - Direction.NORTH.getHorizontalIndex() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1],
                    VoxelShapes.create(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        SHAPES.put(to, buffer[0]);
    }
    protected void runCalculation(VoxelShape shape) {
        for (Direction direction : Direction.values()) {
            calculateShapes(direction, shape);
        }
    }
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }


}

