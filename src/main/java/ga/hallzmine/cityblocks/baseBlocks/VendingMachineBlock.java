package ga.hallzmine.cityblocks.baseBlocks;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VendingMachineBlock extends OrientableBlockBase {

  private ItemStack stack;
  private int id;

  public VendingMachineBlock() {
    super(Properties.of(Material.METAL).noOcclusion());
    runCalculation(Block.box(0, 0, 0, 16, 32, 16));
  }

  protected static final Map<Direction, VoxelShape> SHAPES = new HashMap<Direction, VoxelShape>();

  protected static void calculateShapes(Direction to, VoxelShape shape) {
    VoxelShape[] buffer = new VoxelShape[]{shape, Shapes.empty()};

    int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
    for (int i = 0; i < times; i++) {
      buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = Shapes.or(buffer[1],
          Shapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
      buffer[0] = buffer[1];
      buffer[1] = Shapes.empty();
    }

    SHAPES.put(to, buffer[0]);
  }

  protected void runCalculation(VoxelShape shape) {
    for (Direction direction : Direction.values()) {
      calculateShapes(direction, shape);
    }
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos,
      CollisionContext context) {
    return SHAPES.get(state.getValue(HorizontalDirectionalBlock.FACING));
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
