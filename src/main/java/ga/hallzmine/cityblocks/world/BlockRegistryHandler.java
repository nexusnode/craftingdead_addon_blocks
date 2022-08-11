package ga.hallzmine.cityblocks.world;

import ga.hallzmine.cityblocks.CityBlocksMod;
import ga.hallzmine.cityblocks.world.block.BlockShapes;
import ga.hallzmine.cityblocks.world.block.OrientableBlock;
import ga.hallzmine.cityblocks.world.block.OrientableShapedBlock;
import ga.hallzmine.cityblocks.world.block.OrientableSlabBlockBase;
import ga.hallzmine.cityblocks.world.block.OrientableTallBlock;
import ga.hallzmine.cityblocks.world.block.ShapedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistryHandler {

  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, CityBlocksMod.MOD_ID);

  public static final RegistryObject<Block> CHERRY_LEAVES = BLOCKS.register("cherry_leaves",
      () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).noOcclusion()));
  public static final RegistryObject<Block> BASALT_BRICKS = BLOCKS.register("basalt_bricks",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CHISELED_BASALT = BLOCKS.register("chiseled_basalt",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CHERRY_PLANKS =
      BLOCKS.register("cherry_planks", () -> new Block(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> MOSSY_BASALT_BRICKS =
      BLOCKS.register("mossy_basalt_bricks",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> POLISHED_BASALT_BRICKS =
      BLOCKS.register("polished_basalt_bricks",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CRACKED_POLISHED_BASALT_BRICKS =
      BLOCKS.register("cracked_polished_basalt_bricks",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CRACKED_BASALT_BRICKS =
      BLOCKS.register("cracked_basalt_bricks",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CHERRY_LOG =
      BLOCKS.register("cherry_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties
          .of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> STRIPPED_CHERRY_LOG =
      BLOCKS.register("stripped_cherry_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties
          .of(Material.WOOD, MaterialColor.COLOR_PINK).strength(2.0F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> COUNTER_SOLID = BLOCKS.register("counter_solid",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> KITCHEN_TILE = BLOCKS.register("kitchen_tile",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ANDESITE_KITCHEN_TILE =
      BLOCKS.register("andesite_kitchen_tile",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> GRANITE_KITCHEN_TILE =
      BLOCKS.register("granite_kitchen_tile",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> DIORITE_KITCHEN_TILE =
      BLOCKS.register("diorite_kitchen_tile",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> OBSIDIAN_KITCHEN_TILE =
      BLOCKS.register("obsidian_kitchen_tile",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> POLISHED_BASALT_KITCHEN_BRICK =
      BLOCKS.register("polished_basalt_kitchen_tile",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CRYING_OBSIDIAN_KITCHEN_TILE =
      BLOCKS.register("crying_obsidian_kitchen_tile",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> POLISHED_OBSIDIAN = BLOCKS.register("polished_obsidian",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> POLISHED_CRYING_OBSIDIAN =
      BLOCKS.register("polished_crying_obsidian",
          () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> CHERRY_BOOKSHELF =
      BLOCKS.register("cherry_bookshelf", () -> new Block(Block.Properties.of(Material.WOOD)));
  public static final RegistryObject<Block> ROAD_BLANK = BLOCKS.register("road_blank",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_SOLID = BLOCKS.register("road_solid",
      () -> new OrientableBlock(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_DOUBLE = BLOCKS.register("road_double",
      () -> new OrientableBlock(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_BROKEN = BLOCKS.register("road_broken",
      () -> new OrientableBlock(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> SANDBAG = BLOCKS.register("sandbag",
      () -> new Block(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> SANDBAG_SLAB = BLOCKS.register("sandbag_slab",
      () -> new SlabBlock(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_BLANK_SLAB = BLOCKS.register("road_blank_slab",
      () -> new SlabBlock(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_BROKEN_SLAB = BLOCKS.register("road_broken_slab",
      () -> new OrientableSlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_SOLID_SLAB = BLOCKS.register("road_solid_slab",
      () -> new OrientableSlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> ROAD_DOUBLE_SLAB = BLOCKS.register("road_double_slab",
      () -> new OrientableSlabBlockBase(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f)));
  public static final RegistryObject<Block> STOP_SIGN =
      BLOCKS.register("stop_sign",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STOP_SIGN));
  public static final RegistryObject<Block> TRAFFIC_LIGHT =
      BLOCKS.register("traffic_light",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.TRAFFIC_LIGHT));
  public static final RegistryObject<Block> ROAD_BARRIER =
      BLOCKS.register("road_barrier",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.ROAD_BARRIER));
  public static final RegistryObject<Block> POLE_BARRIER =
      BLOCKS.register("pole_barrier",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.POLE_BARRIER));
  public static final RegistryObject<Block> STEEL_POLE_BARRIER =
      BLOCKS.register("steel_pole_barrier",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STEEL_POLE_BARRIER));
  public static final RegistryObject<Block> STEEL_POLE_BARRIER_SLAB =
      BLOCKS.register("steel_pole_barrier_slab",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.SLAB_STEEL_POLE_BARRIER));
  public static final RegistryObject<Block> POLE_BARRIER_UNLIT =
      BLOCKS.register("pole_barrier_unlit",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.UNLIT_POLE_BARRIER));
  public static final RegistryObject<Block> CONCRETE_BARRIER =
      BLOCKS.register("concrete_barrier",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.CONCRETE_BARRIER));
  public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER =
      BLOCKS.register("striped_concrete_barrier",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STRIPED_CONCRETE_BARRIER));
  public static final RegistryObject<Block> CONCRETE_BARRIER_SLAB =
      BLOCKS.register("concrete_barrier_slab",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.SLAB_CONCRETE_BARRIER));
  public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER_SLAB =
      BLOCKS.register("striped_concrete_barrier_slab",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.SLAB_STRIPED_CONCRETE_BARRIER));
  public static final RegistryObject<Block> VENDING_MACHINE =
      BLOCKS.register("vending_machine", OrientableTallBlock::new);
  public static final RegistryObject<Block> STREET_LIGHT_BASE = BLOCKS.register("street_light_base",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
          BlockShapes.STREET_LIGHT));
  public static final RegistryObject<Block> STREET_LIGHT_CURVE =
      BLOCKS.register("street_light_curve",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STREET_LIGHT_CURVE));
  public static final RegistryObject<Block> STREET_LIGHT_DOUBLE_CURVE =
      BLOCKS.register("street_light_double_curve",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STREET_LIGHT_DOUBLE_CURVE));
  public static final RegistryObject<Block> STREET_LIGHT_FLAT_CROSS =
      BLOCKS.register("street_light_flat_cross",
          () -> new ShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STREET_LIGHT_CROSS));
  public static final RegistryObject<Block> STREET_LIGHT_HEAD =
      BLOCKS
          .register("street_light_head",
              () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE)
                  .strength(5.0f, 5.0f).noOcclusion().lightLevel((state) -> 15),
                  BlockShapes.STREET_LIGHT_HEAD));
  public static final RegistryObject<Block> STREET_LIGHT_HORIZONTAL_POLE =
      BLOCKS.register("street_light_horizontal_pole",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STREET_LIGHT_HORIZONTAL));
  public static final RegistryObject<Block> STREET_LIGHT_VERTICAL_CROSS =
      BLOCKS.register("street_light_vertical_cross",
          () -> new OrientableShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STREET_LIGHT_VERTICAL_CROSS));
  public static final RegistryObject<Block> STREET_LIGHT_VERTICAL_POLE =
      BLOCKS.register("street_light_vertical_pole",
          () -> new ShapedBlock(
              Block.Properties.of(Material.STONE).strength(5.0f, 5.0f).noOcclusion(),
              BlockShapes.STREET_LIGHT_POLE));
  public static final RegistryObject<Block> GOLD_CHAIN =
      BLOCKS.register("gold_chain", () -> new ChainBlock(Block.Properties.of(Material.METAL)));
  public static final RegistryObject<Block> BASALT_LANTERN =
      BLOCKS.register("basalt_lantern",
          () -> new LanternBlock(BlockBehaviour.Properties.of(Material.METAL)
              .requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN)
              .lightLevel((state) -> 15).noOcclusion()));
  public static final RegistryObject<Block> FRIDGE =
      BLOCKS.register("fridge",
          () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
              BlockShapes.FRIDGE));
  public static final RegistryObject<Block> COUNTER = BLOCKS.register("counter",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.COUNTER));
  public static final RegistryObject<Block> COUNTER_CORNER = BLOCKS.register("counter_corner",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.COUNTER_CORNER));
  public static final RegistryObject<Block> COUNTER_SINK = BLOCKS.register("counter_sink",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.COUNTER_SINK));
  public static final RegistryObject<Block> SINK = BLOCKS.register("sink",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.SINK));
  public static final RegistryObject<Block> PLATE =
      BLOCKS.register("plate",
          () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
              BlockShapes.PLATE));
  public static final RegistryObject<Block> MILITARY_RADIO = BLOCKS.register("military_radio",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.MILITARY_RADIO));
  public static final RegistryObject<Block> RADIO = BLOCKS.register("radio",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.RADIO));
  public static final RegistryObject<Block> FLOWERPOT = BLOCKS.register("flowerpot",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.FLOWER_POT));
  public static final RegistryObject<Block> CERAMIC_POT = BLOCKS.register("ceramic_pot",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.FLOWER_POT));
  public static final RegistryObject<Block> STONE_POT = BLOCKS.register("stone_pot",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.FLOWER_POT));
  public static final RegistryObject<Block> WHITE_STOOL = BLOCKS.register("white_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> BLACK_STOOL = BLOCKS.register("black_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> RED_STOOL = BLOCKS.register("red_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> BLUE_STOOL = BLOCKS.register("blue_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> GREEN_STOOL = BLOCKS.register("green_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> ORANGE_STOOL = BLOCKS.register("orange_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> MAGENTA_STOOL = BLOCKS.register("magenta_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> LIGHT_BLUE_STOOL = BLOCKS.register("light_blue_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> YELLOW_STOOL = BLOCKS.register("yellow_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> LIME_STOOL = BLOCKS.register("lime_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> PINK_STOOL = BLOCKS.register("pink_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> GRAY_STOOL = BLOCKS.register("gray_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> LIGHT_GRAY_STOOL = BLOCKS.register("light_gray_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> CYAN_STOOL = BLOCKS.register("cyan_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> PURPLE_STOOL = BLOCKS.register("purple_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> BROWN_STOOL = BLOCKS.register("brown_stool",
      () -> new ShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(), BlockShapes.STOOL));
  public static final RegistryObject<Block> WHITE_CHAIR = BLOCKS.register("white_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> BLACK_CHAIR = BLOCKS.register("black_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> RED_CHAIR = BLOCKS.register("red_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> BLUE_CHAIR = BLOCKS.register("blue_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> GREEN_CHAIR = BLOCKS.register("green_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> ORANGE_CHAIR = BLOCKS.register("orange_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> MAGENTA_CHAIR = BLOCKS.register("magenta_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> LIGHT_BLUE_CHAIR = BLOCKS.register("light_blue_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> YELLOW_CHAIR = BLOCKS.register("yellow_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> LIME_CHAIR = BLOCKS.register("lime_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> PINK_CHAIR = BLOCKS.register("pink_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> GRAY_CHAIR = BLOCKS.register("gray_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> LIGHT_GRAY_CHAIR = BLOCKS.register("light_gray_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> CYAN_CHAIR = BLOCKS.register("cyan_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> PURPLE_CHAIR = BLOCKS.register("purple_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> BROWN_CHAIR = BLOCKS.register("brown_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.STONE).noOcclusion(),
          BlockShapes.CHAIR));
  public static final RegistryObject<Block> OAK_TABLE = BLOCKS.register("oak_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> SPRUCE_TABLE = BLOCKS.register("spruce_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> JUNGLE_TABLE = BLOCKS.register("jungle_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> DARK_OAK_TABLE = BLOCKS.register("dark_oak_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> BIRCH_TABLE = BLOCKS.register("birch_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> ACACIA_TABLE = BLOCKS.register("acacia_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> CRIMSON_STEM_TABLE = BLOCKS.register(
      "crimson_stem_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> WARPED_STEM_TABLE = BLOCKS.register("warped_stem_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_OAK_TABLE = BLOCKS.register(
      "stripped_oak_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_SPRUCE_TABLE = BLOCKS.register(
      "stripped_spruce_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_JUNGLE_TABLE = BLOCKS.register(
      "stripped_jungle_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_DARK_OAK_TABLE = BLOCKS.register(
      "stripped_dark_oak_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_BIRCH_TABLE = BLOCKS.register(
      "stripped_birch_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_ACACIA_TABLE = BLOCKS.register(
      "stripped_acacia_table",
      () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(), BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_TABLE =
      BLOCKS.register("stripped_crimson_stem_table",
          () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
              BlockShapes.TABLE));
  public static final RegistryObject<Block> STRIPPED_WARPED_STEM_TABLE =
      BLOCKS.register("stripped_warped_stem_table",
          () -> new ShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
              BlockShapes.TABLE));
  public static final RegistryObject<Block> OAK_TALL_CHAIR = BLOCKS.register("oak_tall_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
          BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> DARK_OAK_TALL_CHAIR =
      BLOCKS.register("dark_oak_tall_chair",
          () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
              BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> ACACIA_TALL_CHAIR = BLOCKS.register("acacia_tall_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
          BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> JUNGLE_TALL_CHAIR = BLOCKS.register("jungle_tall_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
          BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> SPRUCE_TALL_CHAIR = BLOCKS.register("spruce_tall_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
          BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> BIRCH_TALL_CHAIR = BLOCKS.register("birch_tall_chair",
      () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
          BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> CRIMSON_STEM_TALL_CHAIR =
      BLOCKS.register("crimson_stem_tall_chair",
          () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
              BlockShapes.TALL_CHAIR));
  public static final RegistryObject<Block> WARPED_STEM_TALL_CHAIR =
      BLOCKS.register("warped_stem_tall_chair",
          () -> new OrientableShapedBlock(Block.Properties.of(Material.WOOD).noOcclusion(),
              BlockShapes.TALL_CHAIR));
}
