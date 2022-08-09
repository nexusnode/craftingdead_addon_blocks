package ga.hallzmine.cityblocks.world;

import ga.hallzmine.cityblocks.CityBlocksMod;
import ga.hallzmine.cityblocks.world.item.BlockItemBase;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistryHandler {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, CityBlocksMod.MOD_ID);

  public static final RegistryObject<Item> CHERRY_LEAVES_ITEM = ITEMS.register("cherry_leaves",
      () -> new BlockItemBase(BlockRegistryHandler.CHERRY_LEAVES.get()));
  public static final RegistryObject<Item> BASALT_BRICKS_ITEM = ITEMS.register("basalt_bricks",
      () -> new BlockItemBase(BlockRegistryHandler.BASALT_BRICKS.get()));
  public static final RegistryObject<Item> CHISELED_BASALT_ITEM = ITEMS.register("chiseled_basalt",
      () -> new BlockItemBase(BlockRegistryHandler.CHISELED_BASALT.get()));
  public static final RegistryObject<Item> CHERRY_PLANKS_ITEM = ITEMS.register("cherry_planks",
      () -> new BlockItemBase(BlockRegistryHandler.CHERRY_PLANKS.get()));
  public static final RegistryObject<Item> MOSSY_BASALT_BRICKS_ITEM =
      ITEMS.register("mossy_basalt_bricks",
          () -> new BlockItemBase(BlockRegistryHandler.MOSSY_BASALT_BRICKS.get()));
  public static final RegistryObject<Item> POLISHED_BASALT_BRICKS_ITEM =
      ITEMS.register("polished_basalt_bricks",
          () -> new BlockItemBase(BlockRegistryHandler.POLISHED_BASALT_BRICKS.get()));
  public static final RegistryObject<Item> CRACKED_POLISHED_BASALT_BRICKS_ =
      ITEMS.register("cracked_polished_basalt_bricks",
          () -> new BlockItemBase(BlockRegistryHandler.CRACKED_POLISHED_BASALT_BRICKS.get()));
  public static final RegistryObject<Item> CRACKED_BASALT_BRICKS_ITEM =
      ITEMS.register("cracked_basalt_bricks",
          () -> new BlockItemBase(BlockRegistryHandler.CRACKED_BASALT_BRICKS.get()));
  public static final RegistryObject<Item> CHERRY_LOG_ITEM =
      ITEMS.register("cherry_log", () -> new BlockItemBase(BlockRegistryHandler.CHERRY_LOG.get()));
  public static final RegistryObject<Item> STRIPPED_CHERRY_LOG_ITEM =
      ITEMS.register("stripped_cherry_log",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_CHERRY_LOG.get()));
  public static final RegistryObject<Item> COUNTER_SOLID_ITEM = ITEMS.register("counter_solid",
      () -> new BlockItemBase(BlockRegistryHandler.COUNTER_SOLID.get()));
  public static final RegistryObject<Item> KITCHEN_TILE_ITEM = ITEMS.register("kitchen_tile",
      () -> new BlockItemBase(BlockRegistryHandler.KITCHEN_TILE.get()));
  public static final RegistryObject<Item> ANDESITE_KITCHEN_TILE_ITEM =
      ITEMS.register("andesite_kitchen_tile",
          () -> new BlockItemBase(BlockRegistryHandler.ANDESITE_KITCHEN_TILE.get()));
  public static final RegistryObject<Item> GRANITE_KITCHEN_TILE_ITEM =
      ITEMS.register("granite_kitchen_tile",
          () -> new BlockItemBase(BlockRegistryHandler.GRANITE_KITCHEN_TILE.get()));
  public static final RegistryObject<Item> DIORITE_KITCHEN_TILE_ITEM =
      ITEMS.register("diorite_kitchen_tile",
          () -> new BlockItemBase(BlockRegistryHandler.DIORITE_KITCHEN_TILE.get()));
  public static final RegistryObject<Item> OBSIDIAN_KITCHEN_TILE_ITEM =
      ITEMS.register("obsidian_kitchen_tile",
          () -> new BlockItemBase(BlockRegistryHandler.OBSIDIAN_KITCHEN_TILE.get()));
  public static final RegistryObject<Item> POLISHED_BASALT_KITCHEN_BRICK_ITEM =
      ITEMS.register("polished_basalt_kitchen_tile",
          () -> new BlockItemBase(BlockRegistryHandler.POLISHED_BASALT_KITCHEN_BRICK.get()));
  public static final RegistryObject<Item> CRYING_OBSIDIAN_KITCHEN_TILE_ITEM =
      ITEMS.register("crying_obsidian_kitchen_tile",
          () -> new BlockItemBase(BlockRegistryHandler.CRYING_OBSIDIAN_KITCHEN_TILE.get()));
  public static final RegistryObject<Item> POLISHED_OBSIDIAN_ITEM = ITEMS.register(
      "polished_obsidian", () -> new BlockItemBase(BlockRegistryHandler.POLISHED_OBSIDIAN.get()));
  public static final RegistryObject<Item> POLISHED_CRYING_OBSIDIAN_ITEM =
      ITEMS.register("polished_crying_obsidian",
          () -> new BlockItemBase(BlockRegistryHandler.POLISHED_CRYING_OBSIDIAN.get()));
  public static final RegistryObject<Item> CHERRY_BOOKSHELF_ITEM = ITEMS.register(
      "cherry_bookshelf", () -> new BlockItemBase(BlockRegistryHandler.CHERRY_BOOKSHELF.get()));
  public static final RegistryObject<Item> ROAD_BLANK_ITEM =
      ITEMS.register("road_blank", () -> new BlockItemBase(BlockRegistryHandler.ROAD_BLANK.get()));
  public static final RegistryObject<Item> ROAD_SOLID_ITEM =
      ITEMS.register("road_solid", () -> new BlockItemBase(BlockRegistryHandler.ROAD_SOLID.get()));
  public static final RegistryObject<Item> ROAD_DOUBLE_ITEM = ITEMS.register("road_double",
      () -> new BlockItemBase(BlockRegistryHandler.ROAD_DOUBLE.get()));
  public static final RegistryObject<Item> ROAD_BROKEN_ITEM = ITEMS.register("road_broken",
      () -> new BlockItemBase(BlockRegistryHandler.ROAD_BROKEN.get()));
  public static final RegistryObject<Item> SANDBAG_ITEM =
      ITEMS.register("sandbag", () -> new BlockItemBase(BlockRegistryHandler.SANDBAG.get()));
  public static final RegistryObject<Item> SANDBAG_SLAB_ITEM = ITEMS.register("sandbag_slab",
      () -> new BlockItemBase(BlockRegistryHandler.SANDBAG_SLAB.get()));
  public static final RegistryObject<Item> ROAD_BLANK_SLAB_ITEM = ITEMS.register("road_blank_slab",
      () -> new BlockItemBase(BlockRegistryHandler.ROAD_BLANK_SLAB.get()));
  public static final RegistryObject<Item> ROAD_BROKEN_SLAB_ITEM = ITEMS.register(
      "road_broken_slab", () -> new BlockItemBase(BlockRegistryHandler.ROAD_BROKEN_SLAB.get()));
  public static final RegistryObject<Item> ROAD_SOLID_SLAB_ITEM = ITEMS.register("road_solid_slab",
      () -> new BlockItemBase(BlockRegistryHandler.ROAD_SOLID_SLAB.get()));
  public static final RegistryObject<Item> ROAD_DOUBLE_SLAB_ITEM = ITEMS.register(
      "road_double_slab", () -> new BlockItemBase(BlockRegistryHandler.ROAD_DOUBLE_SLAB.get()));
  public static final RegistryObject<Item> STOP_SIGN_ITEM =
      ITEMS.register("stop_sign", () -> new BlockItemBase(BlockRegistryHandler.STOP_SIGN.get()));
  public static final RegistryObject<Item> TRAFFIC_LIGHT_ITEM = ITEMS.register("traffic_light",
      () -> new BlockItemBase(BlockRegistryHandler.TRAFFIC_LIGHT.get()));
  public static final RegistryObject<Item> ROAD_BARRIER_ITEM = ITEMS.register("road_barrier",
      () -> new BlockItemBase(BlockRegistryHandler.ROAD_BARRIER.get()));
  public static final RegistryObject<Item> POLE_BARRIER_ITEM = ITEMS.register("pole_barrier",
      () -> new BlockItemBase(BlockRegistryHandler.POLE_BARRIER.get()));
  public static final RegistryObject<Item> STEEL_POLE_BARRIER_ITEM = ITEMS.register(
      "steel_pole_barrier", () -> new BlockItemBase(BlockRegistryHandler.STEEL_POLE_BARRIER.get()));
  public static final RegistryObject<Item> STEEL_POLE_BARRIER_SLAB_ITEM =
      ITEMS.register("steel_pole_barrier_slab",
          () -> new BlockItemBase(BlockRegistryHandler.STEEL_POLE_BARRIER_SLAB.get()));
  public static final RegistryObject<Item> POLE_BARRIER_UNLIT_ITEM = ITEMS.register(
      "pole_barrier_unlit", () -> new BlockItemBase(BlockRegistryHandler.POLE_BARRIER_UNLIT.get()));
  public static final RegistryObject<Item> CONCRETE_BARRIER_ITEM = ITEMS.register(
      "concrete_barrier", () -> new BlockItemBase(BlockRegistryHandler.CONCRETE_BARRIER.get()));
  public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_ITEM =
      ITEMS.register("striped_concrete_barrier",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPED_CONCRETE_BARRIER.get()));
  public static final RegistryObject<Item> CONCRETE_BARRIER_SLAB_ITEM =
      ITEMS.register("concrete_barrier_slab",
          () -> new BlockItemBase(BlockRegistryHandler.CONCRETE_BARRIER_SLAB.get()));
  public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_SLAB_ITEM =
      ITEMS.register("striped_concrete_barrier_slab",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPED_CONCRETE_BARRIER_SLAB.get()));
  public static final RegistryObject<Item> VENDING_MACHINE_ITEM = ITEMS.register("vending_machine",
      () -> new BlockItemBase(BlockRegistryHandler.VENDING_MACHINE.get()));
  public static final RegistryObject<Item> STREET_LIGHT_BASE_ITEM = ITEMS.register(
      "street_light_base", () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_BASE.get()));
  public static final RegistryObject<Item> STREET_LIGHT_CURVE_ITEM = ITEMS.register(
      "street_light_curve", () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_CURVE.get()));
  public static final RegistryObject<Item> STREET_LIGHT_DOUBLE_CURVE_ITEM =
      ITEMS.register("street_light_double_curve",
          () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_DOUBLE_CURVE.get()));
  public static final RegistryObject<Item> STREET_LIGHT_FLAT_CROSS_ITEM =
      ITEMS.register("street_light_flat_cross",
          () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_FLAT_CROSS.get()));
  public static final RegistryObject<Item> STREET_LIGHT_HEAD_ITEM = ITEMS.register(
      "street_light_head", () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_HEAD.get()));
  public static final RegistryObject<Item> STREET_LIGHT_HORIZONTAL_POLE_ITEM =
      ITEMS.register("street_light_horizontal_pole",
          () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_HORIZONTAL_POLE.get()));
  public static final RegistryObject<Item> STREET_LIGHT_VERTICAL_CROSS_ITEM =
      ITEMS.register("street_light_vertical_cross",
          () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_VERTICAL_CROSS.get()));
  public static final RegistryObject<Item> STREET_LIGHT_VERTICAL_POLE_ITEM =
      ITEMS.register("street_light_vertical_pole",
          () -> new BlockItemBase(BlockRegistryHandler.STREET_LIGHT_VERTICAL_POLE.get()));
  public static final RegistryObject<Item> GOLD_CHAIN_ITEM =
      ITEMS.register("gold_chain", () -> new BlockItemBase(BlockRegistryHandler.GOLD_CHAIN.get()));
  public static final RegistryObject<Item> BASALT_LANTERN_ITEM = ITEMS.register("basalt_lantern",
      () -> new BlockItemBase(BlockRegistryHandler.BASALT_LANTERN.get()));
  public static final RegistryObject<Item> FRIDGE_ITEM =
      ITEMS.register("fridge", () -> new BlockItemBase(BlockRegistryHandler.FRIDGE.get()));
  public static final RegistryObject<Item> COUNTER_ITEM =
      ITEMS.register("counter", () -> new BlockItemBase(BlockRegistryHandler.COUNTER.get()));
  public static final RegistryObject<Item> COUNTER_CORNER_ITEM = ITEMS.register("counter_corner",
      () -> new BlockItemBase(BlockRegistryHandler.COUNTER_CORNER.get()));
  public static final RegistryObject<Item> COUNTER_SINK_ITEM = ITEMS.register("counter_sink",
      () -> new BlockItemBase(BlockRegistryHandler.COUNTER_SINK.get()));
  public static final RegistryObject<Item> SINK_ITEM =
      ITEMS.register("sink", () -> new BlockItemBase(BlockRegistryHandler.SINK.get()));
  public static final RegistryObject<Item> PLATE_ITEM =
      ITEMS.register("plate", () -> new BlockItemBase(BlockRegistryHandler.PLATE.get()));
  public static final RegistryObject<Item> MILITARY_RADIO_ITEM = ITEMS.register("military_radio",
      () -> new BlockItemBase(BlockRegistryHandler.MILITARY_RADIO.get()));
  public static final RegistryObject<Item> RADIO_ITEM =
      ITEMS.register("radio", () -> new BlockItemBase(BlockRegistryHandler.RADIO.get()));
  public static final RegistryObject<Item> FLOWERPOT_ITEM =
      ITEMS.register("flowerpot", () -> new BlockItemBase(BlockRegistryHandler.FLOWERPOT.get()));
  public static final RegistryObject<Item> CERAMIC_POT_ITEM = ITEMS.register("ceramic_pot",
      () -> new BlockItemBase(BlockRegistryHandler.CERAMIC_POT.get()));
  public static final RegistryObject<Item> STONE_POT_ITEM =
      ITEMS.register("stone_pot", () -> new BlockItemBase(BlockRegistryHandler.STONE_POT.get()));
  public static final RegistryObject<Item> WHITE_STOOL_ITEM = ITEMS.register("white_stool",
      () -> new BlockItemBase(BlockRegistryHandler.WHITE_STOOL.get()));
  public static final RegistryObject<Item> BLACK_STOOL_ITEM = ITEMS.register("black_stool",
      () -> new BlockItemBase(BlockRegistryHandler.BLACK_STOOL.get()));
  public static final RegistryObject<Item> RED_STOOL_ITEM =
      ITEMS.register("red_stool", () -> new BlockItemBase(BlockRegistryHandler.RED_STOOL.get()));
  public static final RegistryObject<Item> BLUE_STOOL_ITEM =
      ITEMS.register("blue_stool", () -> new BlockItemBase(BlockRegistryHandler.BLUE_STOOL.get()));
  public static final RegistryObject<Item> GREEN_STOOL_ITEM = ITEMS.register("green_stool",
      () -> new BlockItemBase(BlockRegistryHandler.GREEN_STOOL.get()));
  public static final RegistryObject<Item> ORANGE_STOOL_ITEM = ITEMS.register("orange_stool",
      () -> new BlockItemBase(BlockRegistryHandler.ORANGE_STOOL.get()));
  public static final RegistryObject<Item> MAGENTA_STOOL_ITEM = ITEMS.register("magenta_stool",
      () -> new BlockItemBase(BlockRegistryHandler.MAGENTA_STOOL.get()));
  public static final RegistryObject<Item> LIGHT_BLUE_STOOL_ITEM = ITEMS.register(
      "light_blue_stool", () -> new BlockItemBase(BlockRegistryHandler.LIGHT_BLUE_STOOL.get()));
  public static final RegistryObject<Item> YELLOW_STOOL_ITEM = ITEMS.register("yellow_stool",
      () -> new BlockItemBase(BlockRegistryHandler.YELLOW_STOOL.get()));
  public static final RegistryObject<Item> LIME_STOOL_ITEM =
      ITEMS.register("lime_stool", () -> new BlockItemBase(BlockRegistryHandler.LIME_STOOL.get()));
  public static final RegistryObject<Item> PINK_STOOL_ITEM =
      ITEMS.register("pink_stool", () -> new BlockItemBase(BlockRegistryHandler.PINK_STOOL.get()));
  public static final RegistryObject<Item> GRAY_STOOL_ITEM =
      ITEMS.register("gray_stool", () -> new BlockItemBase(BlockRegistryHandler.GRAY_STOOL.get()));
  public static final RegistryObject<Item> LIGHT_GRAY_STOOL_ITEM = ITEMS.register(
      "light_gray_stool", () -> new BlockItemBase(BlockRegistryHandler.LIGHT_GRAY_STOOL.get()));
  public static final RegistryObject<Item> CYAN_STOOL_ITEM =
      ITEMS.register("cyan_stool", () -> new BlockItemBase(BlockRegistryHandler.CYAN_STOOL.get()));
  public static final RegistryObject<Item> PURPLE_STOOL_ITEM = ITEMS.register("purple_stool",
      () -> new BlockItemBase(BlockRegistryHandler.PURPLE_STOOL.get()));
  public static final RegistryObject<Item> BROWN_STOOL_ITEM = ITEMS.register("brown_stool",
      () -> new BlockItemBase(BlockRegistryHandler.BROWN_STOOL.get()));
  public static final RegistryObject<Item> WHITE_CHAIR_ITEM = ITEMS.register("white_chair",
      () -> new BlockItemBase(BlockRegistryHandler.WHITE_CHAIR.get()));
  public static final RegistryObject<Item> BLACK_CHAIR_ITEM = ITEMS.register("black_chair",
      () -> new BlockItemBase(BlockRegistryHandler.BLACK_CHAIR.get()));
  public static final RegistryObject<Item> RED_CHAIR_ITEM =
      ITEMS.register("red_chair", () -> new BlockItemBase(BlockRegistryHandler.RED_CHAIR.get()));
  public static final RegistryObject<Item> BLUE_CHAIR_ITEM =
      ITEMS.register("blue_chair", () -> new BlockItemBase(BlockRegistryHandler.BLUE_CHAIR.get()));
  public static final RegistryObject<Item> GREEN_CHAIR_ITEM = ITEMS.register("green_chair",
      () -> new BlockItemBase(BlockRegistryHandler.GREEN_CHAIR.get()));
  public static final RegistryObject<Item> ORANGE_CHAIR_ITEM = ITEMS.register("orange_chair",
      () -> new BlockItemBase(BlockRegistryHandler.ORANGE_CHAIR.get()));
  public static final RegistryObject<Item> MAGENTA_CHAIR_ITEM = ITEMS.register("magenta_chair",
      () -> new BlockItemBase(BlockRegistryHandler.MAGENTA_CHAIR.get()));
  public static final RegistryObject<Item> LIGHT_BLUE_CHAIR_ITEM = ITEMS.register(
      "light_blue_chair", () -> new BlockItemBase(BlockRegistryHandler.LIGHT_BLUE_CHAIR.get()));
  public static final RegistryObject<Item> YELLOW_CHAIR_ITEM = ITEMS.register("yellow_chair",
      () -> new BlockItemBase(BlockRegistryHandler.YELLOW_CHAIR.get()));
  public static final RegistryObject<Item> LIME_CHAIR_ITEM =
      ITEMS.register("lime_chair", () -> new BlockItemBase(BlockRegistryHandler.LIME_CHAIR.get()));
  public static final RegistryObject<Item> PINK_CHAIR_ITEM =
      ITEMS.register("pink_chair", () -> new BlockItemBase(BlockRegistryHandler.PINK_CHAIR.get()));
  public static final RegistryObject<Item> GRAY_CHAIR_ITEM =
      ITEMS.register("gray_chair", () -> new BlockItemBase(BlockRegistryHandler.GRAY_CHAIR.get()));
  public static final RegistryObject<Item> LIGHT_GRAY_CHAIR_ITEM = ITEMS.register(
      "light_gray_chair", () -> new BlockItemBase(BlockRegistryHandler.LIGHT_GRAY_CHAIR.get()));
  public static final RegistryObject<Item> CYAN_CHAIR_ITEM =
      ITEMS.register("cyan_chair", () -> new BlockItemBase(BlockRegistryHandler.CYAN_CHAIR.get()));
  public static final RegistryObject<Item> PURPLE_CHAIR_ITEM = ITEMS.register("purple_chair",
      () -> new BlockItemBase(BlockRegistryHandler.PURPLE_CHAIR.get()));
  public static final RegistryObject<Item> BROWN_CHAIR_ITEM = ITEMS.register("brown_chair",
      () -> new BlockItemBase(BlockRegistryHandler.BROWN_CHAIR.get()));
  public static final RegistryObject<Item> OAK_TABLE_ITEM =
      ITEMS.register("oak_table", () -> new BlockItemBase(BlockRegistryHandler.OAK_TABLE.get()));
  public static final RegistryObject<Item> SPRUCE_TABLE_ITEM = ITEMS.register("spruce_table",
      () -> new BlockItemBase(BlockRegistryHandler.SPRUCE_TABLE.get()));
  public static final RegistryObject<Item> JUNGLE_TABLE_ITEM = ITEMS.register("jungle_table",
      () -> new BlockItemBase(BlockRegistryHandler.JUNGLE_TABLE.get()));
  public static final RegistryObject<Item> DARK_OAK_TABLE_ITEM = ITEMS.register("dark_oak_table",
      () -> new BlockItemBase(BlockRegistryHandler.DARK_OAK_TABLE.get()));
  public static final RegistryObject<Item> BIRCH_TABLE_ITEM = ITEMS.register("birch_table",
      () -> new BlockItemBase(BlockRegistryHandler.BIRCH_TABLE.get()));
  public static final RegistryObject<Item> ACACIA_TABLE_ITEM = ITEMS.register("acacia_table",
      () -> new BlockItemBase(BlockRegistryHandler.ACACIA_TABLE.get()));
  public static final RegistryObject<Item> CRIMSON_STEM_TABLE_ITEM = ITEMS.register(
      "crimson_stem_table", () -> new BlockItemBase(BlockRegistryHandler.CRIMSON_STEM_TABLE.get()));
  public static final RegistryObject<Item> WARPED_STEM_TABLE_ITEM = ITEMS.register(
      "warped_stem_table", () -> new BlockItemBase(BlockRegistryHandler.WARPED_STEM_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_OAK_TABLE_ITEM = ITEMS.register(
      "stripped_oak_table", () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_OAK_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_SPRUCE_TABLE_ITEM =
      ITEMS.register("stripped_spruce_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_SPRUCE_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_JUNGLE_TABLE_ITEM =
      ITEMS.register("stripped_jungle_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_JUNGLE_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_DARK_OAK_TABLE_ITEM =
      ITEMS.register("stripped_dark_oak_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_DARK_OAK_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_BIRCH_TABLE_ITEM =
      ITEMS.register("stripped_birch_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_BIRCH_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_ACACIA_TABLE_ITEM =
      ITEMS.register("stripped_acacia_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_ACACIA_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_CRIMSON_STEM_TABLE_ITEM =
      ITEMS.register("stripped_crimson_stem_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_CRIMSON_STEM_TABLE.get()));
  public static final RegistryObject<Item> STRIPPED_WARPPED_STEM_TABLE_ITEM =
      ITEMS.register("stripped_warped_stem_table",
          () -> new BlockItemBase(BlockRegistryHandler.STRIPPED_WARPED_STEM_TABLE.get()));
  public static final RegistryObject<Item> OAK_TALL_CHAIR_ITEM = ITEMS.register("oak_tall_chair",
      () -> new BlockItemBase(BlockRegistryHandler.OAK_TALL_CHAIR.get()));
  public static final RegistryObject<Item> DARK_OAK_TALL_CHAIR_ITEM =
      ITEMS.register("dark_oak_tall_chair",
          () -> new BlockItemBase(BlockRegistryHandler.DARK_OAK_TALL_CHAIR.get()));
  public static final RegistryObject<Item> ACACIA_TALL_CHAIR_ITEM = ITEMS.register(
      "acacia_tall_chair", () -> new BlockItemBase(BlockRegistryHandler.ACACIA_TALL_CHAIR.get()));
  public static final RegistryObject<Item> JUNGLE_TALL_CHAIR_ITEM = ITEMS.register(
      "jungle_tall_chair", () -> new BlockItemBase(BlockRegistryHandler.JUNGLE_TALL_CHAIR.get()));
  public static final RegistryObject<Item> SPRUCE_TALL_CHAIR_ITEM = ITEMS.register(
      "spruce_tall_chair", () -> new BlockItemBase(BlockRegistryHandler.SPRUCE_TALL_CHAIR.get()));
  public static final RegistryObject<Item> BIRCH_TALL_CHAIR_ITEM = ITEMS.register(
      "birch_tall_chair", () -> new BlockItemBase(BlockRegistryHandler.BIRCH_TALL_CHAIR.get()));
  public static final RegistryObject<Item> CRIMSON_STEM_TALL_CHAIR_ITEM =
      ITEMS.register("crimson_stem_tall_chair",
          () -> new BlockItemBase(BlockRegistryHandler.CRIMSON_STEM_TALL_CHAIR.get()));
  public static final RegistryObject<Item> WARPED_STEM_TALL_CHAIR_ITEM =
      ITEMS.register("warped_stem_tall_chair",
          () -> new BlockItemBase(BlockRegistryHandler.WARPED_STEM_TALL_CHAIR.get()));
}
