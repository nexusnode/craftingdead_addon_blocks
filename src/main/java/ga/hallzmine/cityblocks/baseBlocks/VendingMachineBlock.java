package ga.hallzmine.cityblocks.baseBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.block.HorizontalBlock.HORIZONTAL_FACING;

public class VendingMachineBlock extends OrientableBlockBase {

    private ItemStack stack;
    private int id;

    public VendingMachineBlock() {
        super(Properties.create(Material.IRON).notSolid());
        runCalculation(Block.makeCuboidShape(0,0,0,16,32,16));
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


    /*
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        this.id++;
        this.stack = new ItemStack(RegistryHandler.ROAD_BLANK_ITEM.get(), 1);
        SimpleNamedContainerProvider container = new SimpleNamedContainerProvider((id, playerInventory, entity) -> new VendingMachineContainer(), ITextComponent.getTextComponentOrEmpty("Vending Machine"));
        Container menu = container.createMenu(5391, player.inventory, player);
        Inventory inventory = new Inventory(27);
        menu.inventorySlots.add(0,new Slot(inventory, 0, 0, 0));
        inventory.addItem(stack);
        player.openContainer(container);

        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
     */
}
