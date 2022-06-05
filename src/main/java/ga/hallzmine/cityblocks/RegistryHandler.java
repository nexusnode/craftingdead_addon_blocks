package ga.hallzmine.cityblocks;

import ga.hallzmine.cityblocks.baseBlocks.BlockBase;
import ga.hallzmine.cityblocks.baseBlocks.BlockItemBase;
import ga.hallzmine.cityblocks.baseBlocks.OrientableBlockBase;
import ga.hallzmine.cityblocks.baseBlocks.OrientableSlabBlockBase;
import ga.hallzmine.cityblocks.baseBlocks.SlabBlockBase;
import ga.hallzmine.cityblocks.baseBlocks.VendingMachineBlock;
import ga.hallzmine.cityblocks.blocks.ConcreteBarrierBlock;
import ga.hallzmine.cityblocks.blocks.PoleBarrierBlock;
import ga.hallzmine.cityblocks.blocks.RoadBarrierBlock;
import ga.hallzmine.cityblocks.blocks.SlabConcreteBarrierBlock;
import ga.hallzmine.cityblocks.blocks.SlabSteelPoleBarrierBlock;
import ga.hallzmine.cityblocks.blocks.SlabStripedConcreteBarrierBlock;
import ga.hallzmine.cityblocks.blocks.SteelPoleBarrierBlock;
import ga.hallzmine.cityblocks.blocks.StopSignBlock;
import ga.hallzmine.cityblocks.blocks.StreetLightCurveBlock;
import ga.hallzmine.cityblocks.blocks.StreetLightDoubleCurveBlock;
import ga.hallzmine.cityblocks.blocks.StreetLightHeadBlock;
import ga.hallzmine.cityblocks.blocks.StreetLightHorizontalBlock;
import ga.hallzmine.cityblocks.blocks.StreetLightVerticalCrossBlock;
import ga.hallzmine.cityblocks.blocks.StripedConcreteBarrierBlock;
import ga.hallzmine.cityblocks.blocks.TrafficLightBlock;
import ga.hallzmine.cityblocks.blocks.UnlitPoleBarrierBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
      ForgeRegistries.BLOCKS, CityBlocksMod.MOD_ID);
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
      CityBlocksMod.MOD_ID);

  public static void init() {
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    //registerCraftingDead(CityBlocksMod.isCraftingDeadIn);
  }

  public static final RegistryObject<Block> CHERRY_LEAVES = BLOCKS.register("cherry_leaves",
      () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).noOcclusion()));
  public static final RegistryObject<Item> CHERRY_LEAVES_ITEM = ITEMS.register("cherry_leaves",
      () -> new BlockItemBase(CHERRY_LEAVES.get()));

  public static final RegistryObject<Block> BASALT_BRICKS = BLOCKS.register("basalt_bricks",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> BASALT_BRICKS_ITEM = ITEMS.register("basalt_bricks",
      () -> new BlockItemBase(BASALT_BRICKS.get()));

  public static final RegistryObject<Block> CHISELED_BASALT = BLOCKS.register("chiseled_basalt",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CHISELED_BASALT_ITEM = ITEMS.register("chiseled_basalt",
      () -> new BlockItemBase(CHISELED_BASALT.get()));

  public static final RegistryObject<Block> CHERRY_PLANKS = BLOCKS.register("cherry_planks",
      () -> new BlockBase(Block.Properties.of(Material.WOOD),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CHERRY_PLANKS_ITEM = ITEMS.register("cherry_planks",
      () -> new BlockItemBase(CHERRY_PLANKS.get()));

  public static final RegistryObject<Block> MOSSY_BASALT_BRICKS = BLOCKS.register("mossy_basalt_bricks",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> MOSSY_BASALT_BRICKS_ITEM = ITEMS.register("mossy_basalt_bricks",
      () -> new BlockItemBase(MOSSY_BASALT_BRICKS.get()));

  public static final RegistryObject<Block> POLISHED_BASALT_BRICKS = BLOCKS.register("polished_basalt_bricks",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> POLISHED_BASALT_BRICKS_ITEM = ITEMS.register("polished_basalt_bricks",
      () -> new BlockItemBase(POLISHED_BASALT_BRICKS.get()));

  public static final RegistryObject<Block> CRACKED_POLISHED_BASALT_BRICKS = BLOCKS.register("cracked_polished_basalt_bricks",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CRACKED_POLISHED_BASALT_BRICKS_ITEM = ITEMS.register("cracked_polished_basalt_bricks",
      () -> new BlockItemBase(CRACKED_POLISHED_BASALT_BRICKS.get()));

  public static final RegistryObject<Block> CRACKED_BASALT_BRICKS = BLOCKS.register("cracked_basalt_bricks",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CRACKED_BASALT_BRICKS_ITEM = ITEMS.register("cracked_basalt_bricks",
      () -> new BlockItemBase(CRACKED_BASALT_BRICKS.get()));

  public static final RegistryObject<Block> CHERRY_LOG = BLOCKS.register("cherry_log",
      () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
  public static final RegistryObject<Item> CHERRY_LOG_ITEM = ITEMS.register("cherry_log",
      () -> new BlockItemBase(CHERRY_LOG.get()));

  public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = BLOCKS.register("stripped_cherry_log",
      () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK).strength(2.0F).sound(SoundType.WOOD)));
  public static final RegistryObject<Item> STRIPPED_CHERRY_LOG_ITEM = ITEMS.register("stripped_cherry_log",
      () -> new BlockItemBase(STRIPPED_CHERRY_LOG.get()));

  public static final RegistryObject<Block> COUNTER_SOLID = BLOCKS.register("counter_solid",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> COUNTER_SOLID_ITEM = ITEMS.register("counter_solid",
      () -> new BlockItemBase(COUNTER_SOLID.get()));

  public static final RegistryObject<Block> KITCHEN_TILE = BLOCKS.register("kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> KITCHEN_TILE_ITEM = ITEMS.register("kitchen_tile",
      () -> new BlockItemBase(KITCHEN_TILE.get()));

  public static final RegistryObject<Block> ANDESITE_KITCHEN_TILE = BLOCKS.register("andesite_kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> ANDESITE_KITCHEN_TILE_ITEM = ITEMS.register("andesite_kitchen_tile",
      () -> new BlockItemBase(ANDESITE_KITCHEN_TILE.get()));

  public static final RegistryObject<Block> GRANITE_KITCHEN_TILE = BLOCKS.register("granite_kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> GRANITE_KITCHEN_TILE_ITEM = ITEMS.register("granite_kitchen_tile",
      () -> new BlockItemBase(GRANITE_KITCHEN_TILE.get()));

  public static final RegistryObject<Block> DIORITE_KITCHEN_TILE = BLOCKS.register("diorite_kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> DIORITE_KITCHEN_TILE_ITEM = ITEMS.register("diorite_kitchen_tile",
      () -> new BlockItemBase(DIORITE_KITCHEN_TILE.get()));

  public static final RegistryObject<Block> OBSIDIAN_KITCHEN_TILE = BLOCKS.register("obsidian_kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> OBSIDIAN_KITCHEN_TILE_ITEM = ITEMS.register("obsidian_kitchen_tile",
      () -> new BlockItemBase(OBSIDIAN_KITCHEN_TILE.get()));

  public static final RegistryObject<Block> POLISHED_BASALT_KITCHEN_BRICK = BLOCKS.register("polished_basalt_kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> POLISHED_BASALT_KITCHEN_BRICK_ITEM = ITEMS.register("polished_basalt_kitchen_tile",
      () -> new BlockItemBase(POLISHED_BASALT_KITCHEN_BRICK.get()));

  public static final RegistryObject<Block> CRYING_OBSIDIAN_KITCHEN_TILE = BLOCKS.register("crying_obsidian_kitchen_tile",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CRYING_OBSIDIAN_KITCHEN_TILE_ITEM = ITEMS.register("crying_obsidian_kitchen_tile",
      () -> new BlockItemBase(CRYING_OBSIDIAN_KITCHEN_TILE.get()));

  public static final RegistryObject<Block> POLISHED_OBSIDIAN = BLOCKS.register("polished_obsidian",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> POLISHED_OBSIDIAN_ITEM = ITEMS.register("polished_obsidian",
      () -> new BlockItemBase(POLISHED_OBSIDIAN.get()));

  public static final RegistryObject<Block> POLISHED_CRYING_OBSIDIAN = BLOCKS.register("polished_crying_obsidian",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> POLISHED_CRYING_OBSIDIAN_ITEM = ITEMS.register("polished_crying_obsidian",
      () -> new BlockItemBase(POLISHED_CRYING_OBSIDIAN.get()));

  public static final RegistryObject<Block> CHERRY_BOOKSHELF = BLOCKS.register("cherry_bookshelf",
      () -> new BlockBase(Block.Properties.of(Material.WOOD),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CHERRY_BOOKSHELF_ITEM = ITEMS.register("cherry_bookshelf",
      () -> new BlockItemBase(CHERRY_BOOKSHELF.get()));

  public static final RegistryObject<Block> ROAD_BLANK = BLOCKS.register("road_blank",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> ROAD_BLANK_ITEM = ITEMS.register("road_blank",
      () -> new BlockItemBase(ROAD_BLANK.get()));

  public static final RegistryObject<Block> ROAD_SOLID = BLOCKS.register("road_solid",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_SOLID_ITEM = ITEMS.register("road_solid",
      () -> new BlockItemBase(ROAD_SOLID.get()));

  public static final RegistryObject<Block> ROAD_DOUBLE = BLOCKS.register("road_double",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_DOUBLE_ITEM = ITEMS.register("road_double",
      () -> new BlockItemBase(ROAD_DOUBLE.get()));

  public static final RegistryObject<Block> ROAD_BROKEN = BLOCKS.register("road_broken",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_BROKEN_ITEM = ITEMS.register("road_broken",
      () -> new BlockItemBase(ROAD_BROKEN.get()));

  public static final RegistryObject<Block> SANDBAG = BLOCKS.register("sandbag",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> SANDBAG_ITEM = ITEMS.register("sandbag",
      () -> new BlockItemBase(SANDBAG.get()));

  public static final RegistryObject<Block> SANDBAG_SLAB = BLOCKS.register("sandbag_slab",
      () -> new SlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> SANDBAG_SLAB_ITEM = ITEMS.register("sandbag_slab",
      () -> new BlockItemBase(SANDBAG_SLAB.get()));

  public static final RegistryObject<Block> ROAD_BLANK_SLAB = BLOCKS.register("road_blank_slab",
      () -> new SlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_BLANK_SLAB_ITEM = ITEMS.register("road_blank_slab",
      () -> new BlockItemBase(ROAD_BLANK_SLAB.get()));

  public static final RegistryObject<Block> ROAD_BROKEN_SLAB = BLOCKS.register("road_broken_slab",
      () -> new OrientableSlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_BROKEN_SLAB_ITEM = ITEMS.register(
      "road_broken_slab", () -> new BlockItemBase(ROAD_BROKEN_SLAB.get()));

  public static final RegistryObject<Block> ROAD_SOLID_SLAB = BLOCKS.register("road_solid_slab",
      () -> new OrientableSlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_SOLID_SLAB_ITEM = ITEMS.register("road_solid_slab",
      () -> new BlockItemBase(ROAD_SOLID_SLAB.get()));

  public static final RegistryObject<Block> ROAD_DOUBLE_SLAB = BLOCKS.register("road_double_slab",
      () -> new OrientableSlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Item> ROAD_DOUBLE_SLAB_ITEM = ITEMS.register(
      "road_double_slab", () -> new BlockItemBase(ROAD_DOUBLE_SLAB.get()));

  public static final RegistryObject<Block> STOP_SIGN = BLOCKS.register("stop_sign",
      () -> new StopSignBlock());
  public static final RegistryObject<Item> STOP_SIGN_ITEM = ITEMS.register("stop_sign",
      () -> new BlockItemBase(STOP_SIGN.get()));

  public static final RegistryObject<Block> TRAFFIC_LIGHT = BLOCKS.register("traffic_light",
      () -> new TrafficLightBlock());
  public static final RegistryObject<Item> TRAFFIC_LIGHT_ITEM = ITEMS.register("traffic_light",
      () -> new BlockItemBase(TRAFFIC_LIGHT.get()));

  public static final RegistryObject<Block> ROAD_BARRIER = BLOCKS.register("road_barrier",
      () -> new RoadBarrierBlock());
  public static final RegistryObject<Item> ROAD_BARRIER_ITEM = ITEMS.register("road_barrier",
      () -> new BlockItemBase(ROAD_BARRIER.get()));

  public static final RegistryObject<Block> POLE_BARRIER = BLOCKS.register("pole_barrier",
      () -> new PoleBarrierBlock());
  public static final RegistryObject<Item> POLE_BARRIER_ITEM = ITEMS.register("pole_barrier",
      () -> new BlockItemBase(POLE_BARRIER.get()));

  public static final RegistryObject<Block> STEEL_POLE_BARRIER = BLOCKS.register(
      "steel_pole_barrier", () -> new SteelPoleBarrierBlock());
  public static final RegistryObject<Item> STEEL_POLE_BARRIER_ITEM = ITEMS.register(
      "steel_pole_barrier", () -> new BlockItemBase(STEEL_POLE_BARRIER.get()));

  public static final RegistryObject<Block> STEEL_POLE_BARRIER_SLAB = BLOCKS.register(
      "steel_pole_barrier_slab", () -> new SlabSteelPoleBarrierBlock());
  public static final RegistryObject<Item> STEEL_POLE_BARRIER_SLAB_ITEM = ITEMS.register(
      "steel_pole_barrier_slab", () -> new BlockItemBase(STEEL_POLE_BARRIER_SLAB.get()));

  public static final RegistryObject<Block> POLE_BARRIER_UNLIT = BLOCKS.register(
      "pole_barrier_unlit", () -> new UnlitPoleBarrierBlock());
  public static final RegistryObject<Item> POLE_BARRIER_UNLIT_ITEM = ITEMS.register(
      "pole_barrier_unlit", () -> new BlockItemBase(POLE_BARRIER_UNLIT.get()));

  public static final RegistryObject<Block> CONCRETE_BARRIER = BLOCKS.register("concrete_barrier",
      () -> new ConcreteBarrierBlock());
  public static final RegistryObject<Item> CONCRETE_BARRIER_ITEM = ITEMS.register(
      "concrete_barrier", () -> new BlockItemBase(CONCRETE_BARRIER.get()));

  public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER = BLOCKS.register(
      "striped_concrete_barrier", () -> new StripedConcreteBarrierBlock());
  public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_ITEM = ITEMS.register(
      "striped_concrete_barrier", () -> new BlockItemBase(STRIPED_CONCRETE_BARRIER.get()));

  public static final RegistryObject<Block> CONCRETE_BARRIER_SLAB = BLOCKS.register(
      "concrete_barrier_slab", () -> new SlabConcreteBarrierBlock());
  public static final RegistryObject<Item> CONCRETE_BARRIER_SLAB_ITEM = ITEMS.register(
      "concrete_barrier_slab", () -> new BlockItemBase(CONCRETE_BARRIER_SLAB.get()));

  public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER_SLAB = BLOCKS.register(
      "striped_concrete_barrier_slab", () -> new SlabStripedConcreteBarrierBlock());
  public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_SLAB_ITEM = ITEMS.register(
      "striped_concrete_barrier_slab",
      () -> new BlockItemBase(STRIPED_CONCRETE_BARRIER_SLAB.get()));


  public static final RegistryObject<Block> VENDING_MACHINE = BLOCKS.register("vending_machine",
      () -> new VendingMachineBlock());
  public static final RegistryObject<Item> VENDING_MACHINE_ITEM = ITEMS.register("vending_machine",
      () -> new BlockItemBase(VENDING_MACHINE.get()));

  //public static void registerCraftingDead(boolean CDIn) {
  //if(CDIn == true){

  //}
  //}

  public static final RegistryObject<Block> STREET_LIGHT_BASE = BLOCKS.register("street_light_base",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
          Shapes.join(Block.box(6.5, 0, 6.5, 9.5, 8, 9.5), Block.box(7, 0, 7, 9, 16, 9),
              BooleanOp.OR)));
  public static final RegistryObject<Item> STREET_LIGHT_BASE_ITEM = ITEMS.register(
      "street_light_base", () -> new BlockItemBase(STREET_LIGHT_BASE.get()));

  public static final RegistryObject<Block> STREET_LIGHT_CURVE = BLOCKS.register(
      "street_light_curve", () -> new StreetLightCurveBlock());
  public static final RegistryObject<Item> STREET_LIGHT_CURVE_ITEM = ITEMS.register(
      "street_light_curve", () -> new BlockItemBase(STREET_LIGHT_CURVE.get()));

  public static final RegistryObject<Block> STREET_LIGHT_DOUBLE_CURVE = BLOCKS.register(
      "street_light_double_curve", () -> new StreetLightDoubleCurveBlock());
  public static final RegistryObject<Item> STREET_LIGHT_DOUBLE_CURVE_ITEM = ITEMS.register(
      "street_light_double_curve", () -> new BlockItemBase(STREET_LIGHT_DOUBLE_CURVE.get()));

  public static final RegistryObject<Block> STREET_LIGHT_FLAT_CROSS = BLOCKS.register(
      "street_light_flat_cross",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
          Shapes.join(Block.box(0, 7, 7, 16, 9, 9), Block.box(7, 7, 0, 9, 9, 16), BooleanOp.OR)));
  public static final RegistryObject<Item> STREET_LIGHT_FLAT_CROSS_ITEM = ITEMS.register(
      "street_light_flat_cross", () -> new BlockItemBase(STREET_LIGHT_FLAT_CROSS.get()));

  public static final RegistryObject<Block> STREET_LIGHT_HEAD = BLOCKS.register("street_light_head",
      () -> new StreetLightHeadBlock());
  public static final RegistryObject<Item> STREET_LIGHT_HEAD_ITEM = ITEMS.register(
      "street_light_head", () -> new BlockItemBase(STREET_LIGHT_HEAD.get()));

  public static final RegistryObject<Block> STREET_LIGHT_HORIZONTAL_POLE = BLOCKS.register(
      "street_light_horizontal_pole", () -> new StreetLightHorizontalBlock());
  public static final RegistryObject<Item> STREET_LIGHT_HORIZONTAL_POLE_ITEM = ITEMS.register(
      "street_light_horizontal_pole", () -> new BlockItemBase(STREET_LIGHT_HORIZONTAL_POLE.get()));

  public static final RegistryObject<Block> STREET_LIGHT_VERTICAL_CROSS = BLOCKS.register(
      "street_light_vertical_cross", () -> new StreetLightVerticalCrossBlock());
  public static final RegistryObject<Item> STREET_LIGHT_VERTICAL_CROSS_ITEM = ITEMS.register(
      "street_light_vertical_cross", () -> new BlockItemBase(STREET_LIGHT_VERTICAL_CROSS.get()));

  public static final RegistryObject<Block> STREET_LIGHT_VERTICAL_POLE = BLOCKS.register(
      "street_light_vertical_pole",
      () -> new BlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
          Block.box(7, 0, 7, 9, 16, 9)));
  public static final RegistryObject<Item> STREET_LIGHT_VERTICAL_POLE_ITEM = ITEMS.register(
      "street_light_vertical_pole", () -> new BlockItemBase(STREET_LIGHT_VERTICAL_POLE.get()));

  public static final RegistryObject<Block> GOLD_CHAIN = BLOCKS.register("gold_chain",
      () -> new ChainBlock(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Item> GOLD_CHAIN_ITEM = ITEMS.register("gold_chain",
      () -> new BlockItemBase(GOLD_CHAIN.get()));

  public static final RegistryObject<Block> BASALT_LANTERN = BLOCKS.register("basalt_lantern",
      () -> new LanternBlock(
          BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(
              SoundType.LANTERN).lightLevel((state) -> 15).noOcclusion()));
  public static final RegistryObject<Item> BASALT_LANTERN_ITEM = ITEMS.register("basalt_lantern",
      () -> new BlockItemBase(BASALT_LANTERN.get()));

  public static final RegistryObject<Block> FRIDGE = BLOCKS.register("fridge",
      VendingMachineBlock::new); // TODO: Make a separate block
  public static final RegistryObject<Item> FRIDGE_ITEM = ITEMS.register("fridge",
      () -> new BlockItemBase(FRIDGE.get()));

  public static final RegistryObject<Block> COUNTER = BLOCKS.register("counter",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> COUNTER_ITEM = ITEMS.register("counter",
      () -> new BlockItemBase(COUNTER.get()));

  public static final RegistryObject<Block> COUNTER_CORNER = BLOCKS.register("counter_corner",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> COUNTER_CORNER_ITEM = ITEMS.register("counter_corner",
      () -> new BlockItemBase(COUNTER_CORNER.get()));

  public static final RegistryObject<Block> COUNTER_SINK = BLOCKS.register("counter_sink",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> COUNTER_SINK_ITEM = ITEMS.register("counter_sink",
      () -> new BlockItemBase(COUNTER_SINK.get()));

  public static final RegistryObject<Block> SINK = BLOCKS.register("sink",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> SINK_ITEM = ITEMS.register("sink",
      () -> new BlockItemBase(SINK.get()));

  public static final RegistryObject<Block> PLATE = BLOCKS.register("plate",
      () -> new BlockBase(Block.Properties.of(Material.STONE).noOcclusion(),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> PLATE_ITEM = ITEMS.register("plate",
      () -> new BlockItemBase(PLATE.get()));

  public static final RegistryObject<Block> MILITARY_RADIO = BLOCKS.register("military_radio",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> MILITARY_RADIO_ITEM = ITEMS.register("military_radio",
      () -> new BlockItemBase(MILITARY_RADIO.get()));

  public static final RegistryObject<Block> RADIO = BLOCKS.register("radio",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> RADIO_ITEM = ITEMS.register("radio",
      () -> new BlockItemBase(RADIO.get()));

  public static final RegistryObject<Block> FLOWERPOT = BLOCKS.register("flowerpot",
      () -> new BlockBase(Block.Properties.of(Material.STONE).noOcclusion(),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> FLOWERPOT_ITEM = ITEMS.register("flowerpot",
      () -> new BlockItemBase(FLOWERPOT.get()));

  public static final RegistryObject<Block> CERAMIC_POT = BLOCKS.register("ceramic_pot",
      () -> new BlockBase(Block.Properties.of(Material.STONE).noOcclusion(),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> CERAMIC_POT_ITEM = ITEMS.register("ceramic_pot",
      () -> new BlockItemBase(CERAMIC_POT.get()));

  public static final RegistryObject<Block> STONE_POT = BLOCKS.register("stone_pot",
      () -> new BlockBase(Block.Properties.of(Material.STONE).noOcclusion(),
          Block.box(0, 0, 0, 16, 16, 16)));
  public static final RegistryObject<Item> STONE_POT_ITEM = ITEMS.register("stone_pot",
      () -> new BlockItemBase(STONE_POT.get()));

  public static final RegistryObject<Block> WHITE_STOOL = BLOCKS.register("white_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> WHITE_STOOL_ITEM = ITEMS.register("white_stool",
      () -> new BlockItemBase(WHITE_STOOL.get()));

  public static final RegistryObject<Block> BLACK_STOOL = BLOCKS.register("black_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> BLACK_STOOL_ITEM = ITEMS.register("black_stool",
      () -> new BlockItemBase(BLACK_STOOL.get()));

  public static final RegistryObject<Block> RED_STOOL = BLOCKS.register("red_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> RED_STOOL_ITEM = ITEMS.register("red_stool",
      () -> new BlockItemBase(RED_STOOL.get()));

  public static final RegistryObject<Block> BLUE_STOOL = BLOCKS.register("blue_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> BLUE_STOOL_ITEM = ITEMS.register("blue_stool",
      () -> new BlockItemBase(BLUE_STOOL.get()));

  public static final RegistryObject<Block> GREEN_STOOL = BLOCKS.register("green_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> GREEN_STOOL_ITEM = ITEMS.register("green_stool",
      () -> new BlockItemBase(GREEN_STOOL.get()));

  public static final RegistryObject<Block> ORANGE_STOOL = BLOCKS.register("orange_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> ORANGE_STOOL_ITEM = ITEMS.register("orange_stool",
      () -> new BlockItemBase(ORANGE_STOOL.get()));

  public static final RegistryObject<Block> MAGENTA_STOOL = BLOCKS.register("magenta_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> MAGENTA_STOOL_ITEM = ITEMS.register("magenta_stool",
      () -> new BlockItemBase(MAGENTA_STOOL.get()));

  public static final RegistryObject<Block> LIGHT_BLUE_STOOL = BLOCKS.register("light_blue_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> LIGHT_BLUE_STOOL_ITEM = ITEMS.register("light_blue_stool",
      () -> new BlockItemBase(LIGHT_BLUE_STOOL.get()));

  public static final RegistryObject<Block> YELLOW_STOOL = BLOCKS.register("yellow_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> YELLOW_STOOL_ITEM = ITEMS.register("yellow_stool",
      () -> new BlockItemBase(YELLOW_STOOL.get()));

  public static final RegistryObject<Block> LIME_STOOL = BLOCKS.register("lime_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> LIME_STOOL_ITEM = ITEMS.register("lime_stool",
      () -> new BlockItemBase(LIME_STOOL.get()));

  public static final RegistryObject<Block> PINK_STOOL = BLOCKS.register("pink_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> PINK_STOOL_ITEM = ITEMS.register("pink_stool",
      () -> new BlockItemBase(PINK_STOOL.get()));

  public static final RegistryObject<Block> GRAY_STOOL = BLOCKS.register("gray_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> GRAY_STOOL_ITEM = ITEMS.register("gray_stool",
      () -> new BlockItemBase(GRAY_STOOL.get()));

  public static final RegistryObject<Block> LIGHT_GRAY_STOOL = BLOCKS.register("light_gray_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> LIGHT_GRAY_STOOL_ITEM = ITEMS.register("light_gray_stool",
      () -> new BlockItemBase(LIGHT_GRAY_STOOL.get()));

  public static final RegistryObject<Block> CYAN_STOOL = BLOCKS.register("cyan_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> CYAN_STOOL_ITEM = ITEMS.register("cyan_stool",
      () -> new BlockItemBase(CYAN_STOOL.get()));

  public static final RegistryObject<Block> PURPLE_STOOL = BLOCKS.register("purple_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> PURPLE_STOOL_ITEM = ITEMS.register("purple_stool",
      () -> new BlockItemBase(PURPLE_STOOL.get()));

  public static final RegistryObject<Block> BROWN_STOOL = BLOCKS.register("brown_stool",
      () -> new Block(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> BROWN_STOOL_ITEM = ITEMS.register("brown_stool",
      () -> new BlockItemBase(BROWN_STOOL.get()));

  public static final RegistryObject<Block> WHITE_CHAIR = BLOCKS.register("white_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> WHITE_CHAIR_ITEM = ITEMS.register("white_chair",
      () -> new BlockItemBase(WHITE_CHAIR.get()));

  public static final RegistryObject<Block> BLACK_CHAIR = BLOCKS.register("black_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> BLACK_CHAIR_ITEM = ITEMS.register("black_chair",
      () -> new BlockItemBase(BLACK_CHAIR.get()));

  public static final RegistryObject<Block> RED_CHAIR = BLOCKS.register("red_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> RED_CHAIR_ITEM = ITEMS.register("red_chair",
      () -> new BlockItemBase(RED_CHAIR.get()));

  public static final RegistryObject<Block> BLUE_CHAIR = BLOCKS.register("blue_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> BLUE_CHAIR_ITEM = ITEMS.register("blue_chair",
      () -> new BlockItemBase(BLUE_CHAIR.get()));

  public static final RegistryObject<Block> GREEN_CHAIR = BLOCKS.register("green_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> GREEN_CHAIR_ITEM = ITEMS.register("green_chair",
      () -> new BlockItemBase(GREEN_CHAIR.get()));

  public static final RegistryObject<Block> ORANGE_CHAIR = BLOCKS.register("orange_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> ORANGE_CHAIR_ITEM = ITEMS.register("orange_chair",
      () -> new BlockItemBase(ORANGE_CHAIR.get()));

  public static final RegistryObject<Block> MAGENTA_CHAIR = BLOCKS.register("magenta_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> MAGENTA_CHAIR_ITEM = ITEMS.register("magenta_chair",
      () -> new BlockItemBase(MAGENTA_CHAIR.get()));

  public static final RegistryObject<Block> LIGHT_BLUE_CHAIR = BLOCKS.register("light_blue_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> LIGHT_BLUE_CHAIR_ITEM = ITEMS.register("light_blue_chair",
      () -> new BlockItemBase(LIGHT_BLUE_CHAIR.get()));

  public static final RegistryObject<Block> YELLOW_CHAIR = BLOCKS.register("yellow_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> YELLOW_CHAIR_ITEM = ITEMS.register("yellow_chair",
      () -> new BlockItemBase(YELLOW_CHAIR.get()));

  public static final RegistryObject<Block> LIME_CHAIR = BLOCKS.register("lime_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> LIME_CHAIR_ITEM = ITEMS.register("lime_chair",
      () -> new BlockItemBase(LIME_CHAIR.get()));

  public static final RegistryObject<Block> PINK_CHAIR = BLOCKS.register("pink_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> PINK_CHAIR_ITEM = ITEMS.register("pink_chair",
      () -> new BlockItemBase(PINK_CHAIR.get()));

  public static final RegistryObject<Block> GRAY_CHAIR = BLOCKS.register("gray_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> GRAY_CHAIR_ITEM = ITEMS.register("gray_chair",
      () -> new BlockItemBase(GRAY_CHAIR.get()));

  public static final RegistryObject<Block> LIGHT_GRAY_CHAIR = BLOCKS.register("light_gray_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> LIGHT_GRAY_CHAIR_ITEM = ITEMS.register("light_gray_chair",
      () -> new BlockItemBase(LIGHT_GRAY_CHAIR.get()));

  public static final RegistryObject<Block> CYAN_CHAIR = BLOCKS.register("cyan_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> CYAN_CHAIR_ITEM = ITEMS.register("cyan_chair",
      () -> new BlockItemBase(CYAN_CHAIR.get()));

  public static final RegistryObject<Block> PURPLE_CHAIR = BLOCKS.register("purple_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> PURPLE_CHAIR_ITEM = ITEMS.register("purple_chair",
      () -> new BlockItemBase(PURPLE_CHAIR.get()));

  public static final RegistryObject<Block> BROWN_CHAIR = BLOCKS.register("brown_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.STONE).noOcclusion()));
  public static final RegistryObject<Item> BROWN_CHAIR_ITEM = ITEMS.register("brown_chair",
      () -> new BlockItemBase(BROWN_CHAIR.get()));

  public static final RegistryObject<Block> OAK_TABLE = BLOCKS.register("oak_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> OAK_TABLE_ITEM = ITEMS.register("oak_table",
      () -> new BlockItemBase(OAK_TABLE.get()));

  public static final RegistryObject<Block> SPRUCE_TABLE = BLOCKS.register("spruce_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> SPRUCE_TABLE_ITEM = ITEMS.register("spruce_table",
      () -> new BlockItemBase(SPRUCE_TABLE.get()));

  public static final RegistryObject<Block> JUNGLE_TABLE = BLOCKS.register("jungle_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> JUNGLE_TABLE_ITEM = ITEMS.register("jungle_table",
      () -> new BlockItemBase(JUNGLE_TABLE.get()));

  public static final RegistryObject<Block> DARK_OAK_TABLE = BLOCKS.register("dark_oak_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> DARK_OAK_TABLE_ITEM = ITEMS.register("dark_oak_table",
      () -> new BlockItemBase(DARK_OAK_TABLE.get()));

  public static final RegistryObject<Block> BIRCH_TABLE = BLOCKS.register("birch_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> BIRCH_TABLE_ITEM = ITEMS.register("birch_table",
      () -> new BlockItemBase(BIRCH_TABLE.get()));

  public static final RegistryObject<Block> ACACIA_TABLE = BLOCKS.register("acacia_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> ACACIA_TABLE_ITEM = ITEMS.register("acacia_table",
      () -> new BlockItemBase(ACACIA_TABLE.get()));

  public static final RegistryObject<Block> CRIMSON_STEM_TABLE = BLOCKS.register("crimson_stem_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item>CRIMSON_STEM_TABLE_ITEM = ITEMS.register("crimson_stem_table",
      () -> new BlockItemBase(CRIMSON_STEM_TABLE.get()));

  public static final RegistryObject<Block> WARPED_STEM_TABLE = BLOCKS.register("warped_stem_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> WARPED_STEM_TABLE_ITEM = ITEMS.register("warped_stem_table",
      () -> new BlockItemBase(WARPED_STEM_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_OAK_TABLE = BLOCKS.register("stripped_oak_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_OAK_TABLE_ITEM = ITEMS.register("stripped_oak_table",
      () -> new BlockItemBase(STRIPPED_OAK_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_SPRUCE_TABLE = BLOCKS.register("stripped_spruce_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_SPRUCE_TABLE_ITEM = ITEMS.register("stripped_spruce_table",
      () -> new BlockItemBase(STRIPPED_SPRUCE_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_JUNGLE_TABLE = BLOCKS.register("stripped_jungle_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_JUNGLE_TABLE_ITEM = ITEMS.register("stripped_jungle_table",
      () -> new BlockItemBase(STRIPPED_JUNGLE_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_DARK_OAK_TABLE = BLOCKS.register("stripped_dark_oak_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_DARK_OAK_TABLE_ITEM = ITEMS.register("stripped_dark_oak_table",
      () -> new BlockItemBase(STRIPPED_DARK_OAK_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_BIRCH_TABLE = BLOCKS.register("stripped_birch_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_BIRCH_TABLE_ITEM = ITEMS.register("stripped_birch_table",
      () -> new BlockItemBase(STRIPPED_BIRCH_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_ACACIA_TABLE = BLOCKS.register("stripped_acacia_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_ACACIA_TABLE_ITEM = ITEMS.register("stripped_acacia_table",
      () -> new BlockItemBase(STRIPPED_ACACIA_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_TABLE = BLOCKS.register("stripped_crimson_stem_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_TABLE_ITEM = ITEMS.register("stripped_crimson_stem_table",
      () -> new BlockItemBase(STRIPPED_CRIMSON_STEM_TABLE.get()));

  public static final RegistryObject<Block> STRIPPED_WARPED_STEM_TABLE = BLOCKS.register("stripped_warped_stem_table",
      () -> new Block(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> STRIPPED_WARPPED_STEM_TABLE_ITEM = ITEMS.register("stripped_warped_stem_table",
      () -> new BlockItemBase(STRIPPED_WARPED_STEM_TABLE.get()));

  public static final RegistryObject<Block> OAK_TALL_CHAIR = BLOCKS.register("oak_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> OAK_TALL_CHAIR_ITEM = ITEMS.register("oak_tall_chair",
      () -> new BlockItemBase(OAK_TALL_CHAIR.get()));

  public static final RegistryObject<Block> DARK_OAK_TALL_CHAIR = BLOCKS.register("dark_oak_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> DARK_OAK_TALL_CHAIR_ITEM = ITEMS.register("dark_oak_tall_chair",
      () -> new BlockItemBase(DARK_OAK_TALL_CHAIR.get()));

  public static final RegistryObject<Block> ACACIA_TALL_CHAIR = BLOCKS.register("acacia_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> ACACIA_TALL_CHAIR_ITEM = ITEMS.register("acacia_tall_chair",
      () -> new BlockItemBase(ACACIA_TALL_CHAIR.get()));

  public static final RegistryObject<Block> JUNGLE_TALL_CHAIR = BLOCKS.register("jungle_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> JUNGLE_TALL_CHAIR_ITEM = ITEMS.register("jungle_tall_chair",
      () -> new BlockItemBase(JUNGLE_TALL_CHAIR.get()));

  public static final RegistryObject<Block> SPRUCE_TALL_CHAIR = BLOCKS.register("spruce_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> SPRUCE_TALL_CHAIR_ITEM = ITEMS.register("spruce_tall_chair",
      () -> new BlockItemBase(SPRUCE_TALL_CHAIR.get()));

  public static final RegistryObject<Block> BIRCH_TALL_CHAIR = BLOCKS.register("birch_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> BIRCH_TALL_CHAIR_ITEM = ITEMS.register("birch_tall_chair",
      () -> new BlockItemBase(BIRCH_TALL_CHAIR.get()));

  public static final RegistryObject<Block> CRIMSON_STEM_TALL_CHAIR = BLOCKS.register("crimson_stem_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> CRIMSON_STEM_TALL_CHAIR_ITEM = ITEMS.register("crimson_stem_tall_chair",
      () -> new BlockItemBase(CRIMSON_STEM_TALL_CHAIR.get()));

  public static final RegistryObject<Block> WARPED_STEM_TALL_CHAIR = BLOCKS.register("warped_stem_tall_chair",
      () -> new OrientableBlockBase(Block.Properties.of(Material.WOOD).noOcclusion()));
  public static final RegistryObject<Item> WARPED_STEM_TALL_CHAIR_ITEM = ITEMS.register("warped_stem_tall_chair",
      () -> new BlockItemBase(WARPED_STEM_TALL_CHAIR.get()));
}
