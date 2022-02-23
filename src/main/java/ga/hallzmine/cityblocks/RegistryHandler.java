package ga.hallzmine.cityblocks;

import ga.hallzmine.cityblocks.baseBlocks.*;
import ga.hallzmine.cityblocks.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CityBlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CityBlocksMod.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //registerCraftingDead(CityBlocksMod.isCraftingDeadIn);
    }

    public static final RegistryObject<Block> ROAD_BLANK = BLOCKS.register("road_blank", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), (VoxelShape) Block.makeCuboidShape(0,0,0,16,16,16)));
    public static final RegistryObject<Item> ROAD_BLANK_ITEM = ITEMS.register("road_blank", () -> new BlockItemBase(ROAD_BLANK.get()));

    public static final RegistryObject<Block> ROAD_SOLID = BLOCKS.register("road_solid", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_SOLID_ITEM = ITEMS.register("road_solid", () -> new BlockItemBase(ROAD_SOLID.get()));

    public static final RegistryObject<Block> ROAD_DOUBLE = BLOCKS.register("road_double", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_DOUBLE_ITEM = ITEMS.register("road_double", () -> new BlockItemBase(ROAD_DOUBLE.get()));

    public static final RegistryObject<Block> ROAD_BROKEN = BLOCKS.register("road_broken", () -> new OrientableBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BROKEN_ITEM = ITEMS.register("road_broken", () -> new BlockItemBase(ROAD_BROKEN.get()));

    public static final RegistryObject<Block> SANDBAG = BLOCKS.register("sandbag", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), (VoxelShape) Block.makeCuboidShape(0,0,0,16,16,16)));
    public static final RegistryObject<Item> SANDBAG_ITEM = ITEMS.register("sandbag", () -> new BlockItemBase(SANDBAG.get()));

    public static final RegistryObject<Block> SANDBAG_SLAB = BLOCKS.register("sandbag_slab", () -> new SlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> SANDBAG_SLAB_ITEM = ITEMS.register("sandbag_slab", () -> new BlockItemBase(SANDBAG_SLAB.get()));

    public static final RegistryObject<Block> ROAD_BLANK_SLAB = BLOCKS.register("road_blank_slab", () -> new SlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BLANK_SLAB_ITEM = ITEMS.register("road_blank_slab", () -> new BlockItemBase(ROAD_BLANK_SLAB.get()));

    public static final RegistryObject<Block> ROAD_BROKEN_SLAB = BLOCKS.register("road_broken_slab", () -> new OrientableSlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_BROKEN_SLAB_ITEM = ITEMS.register("road_broken_slab", () -> new BlockItemBase(ROAD_BROKEN_SLAB.get()));

    public static final RegistryObject<Block> ROAD_SOLID_SLAB = BLOCKS.register("road_solid_slab", () -> new OrientableSlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_SOLID_SLAB_ITEM = ITEMS.register("road_solid_slab", () -> new BlockItemBase(ROAD_SOLID_SLAB.get()));

    public static final RegistryObject<Block> ROAD_DOUBLE_SLAB = BLOCKS.register("road_double_slab", () -> new OrientableSlabBlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f)));
    public static final RegistryObject<Item> ROAD_DOUBLE_SLAB_ITEM = ITEMS.register("road_double_slab", () -> new BlockItemBase(ROAD_DOUBLE_SLAB.get()));

    public static final RegistryObject<Block> STOP_SIGN = BLOCKS.register("stop_sign", () -> new StopSignBlock());
    public static final RegistryObject<Item> STOP_SIGN_ITEM = ITEMS.register("stop_sign", () -> new BlockItemBase(STOP_SIGN.get()));

    public static final RegistryObject<Block> TRAFFIC_LIGHT = BLOCKS.register("traffic_light", () -> new TrafficLightBlock());
    public static final RegistryObject<Item> TRAFFIC_LIGHT_ITEM = ITEMS.register("traffic_light", () -> new BlockItemBase(TRAFFIC_LIGHT.get()));

    public static final RegistryObject<Block> ROAD_BARRIER = BLOCKS.register("road_barrier", () -> new RoadBarrierBlock());
    public static final RegistryObject<Item> ROAD_BARRIER_ITEM = ITEMS.register("road_barrier", () -> new BlockItemBase(ROAD_BARRIER.get()));

    public static final RegistryObject<Block> POLE_BARRIER = BLOCKS.register("pole_barrier", () -> new PoleBarrierBlock());
    public static final RegistryObject<Item> POLE_BARRIER_ITEM = ITEMS.register("pole_barrier", () -> new BlockItemBase(POLE_BARRIER.get()));

    public static final RegistryObject<Block> STEEL_POLE_BARRIER = BLOCKS.register("steel_pole_barrier", () -> new SteelPoleBarrierBlock());
    public static final RegistryObject<Item> STEEL_POLE_BARRIER_ITEM = ITEMS.register("steel_pole_barrier", () -> new BlockItemBase(STEEL_POLE_BARRIER.get()));

    public static final RegistryObject<Block> STEEL_POLE_BARRIER_SLAB = BLOCKS.register("steel_pole_barrier_slab", () -> new SlabSteelPoleBarrierBlock());
    public static final RegistryObject<Item> STEEL_POLE_BARRIER_SLAB_ITEM = ITEMS.register("steel_pole_barrier_slab", () -> new BlockItemBase(STEEL_POLE_BARRIER_SLAB.get()));

    public static final RegistryObject<Block> POLE_BARRIER_UNLIT = BLOCKS.register("pole_barrier_unlit", () -> new UnlitPoleBarrierBlock());
    public static final RegistryObject<Item> POLE_BARRIER_UNLIT_ITEM = ITEMS.register("pole_barrier_unlit", () -> new BlockItemBase(POLE_BARRIER_UNLIT.get()));

    public static final RegistryObject<Block> CONCRETE_BARRIER = BLOCKS.register("concrete_barrier", () -> new ConcreteBarrierBlock());
    public static final RegistryObject<Item> CONCRETE_BARRIER_ITEM = ITEMS.register("concrete_barrier", () -> new BlockItemBase(CONCRETE_BARRIER.get()));

    public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER = BLOCKS.register("striped_concrete_barrier", () -> new StripedConcreteBarrierBlock());
    public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_ITEM = ITEMS.register("striped_concrete_barrier", () -> new BlockItemBase(STRIPED_CONCRETE_BARRIER.get()));

    public static final RegistryObject<Block> CONCRETE_BARRIER_SLAB = BLOCKS.register("concrete_barrier_slab", () -> new SlabConcreteBarrierBlock());
    public static final RegistryObject<Item> CONCRETE_BARRIER_SLAB_ITEM = ITEMS.register("concrete_barrier_slab", () -> new BlockItemBase(CONCRETE_BARRIER_SLAB.get()));

    public static final RegistryObject<Block> STRIPED_CONCRETE_BARRIER_SLAB = BLOCKS.register("striped_concrete_barrier_slab", () -> new SlabStripedConcreteBarrierBlock());
    public static final RegistryObject<Item> STRIPED_CONCRETE_BARRIER_SLAB_ITEM = ITEMS.register("striped_concrete_barrier_slab", () -> new BlockItemBase(STRIPED_CONCRETE_BARRIER_SLAB.get()));


    public static final RegistryObject<Block> VENDING_MACHINE = BLOCKS.register("vending_machine", () -> new VendingMachineBlock());
    public static final RegistryObject<Item> VENDING_MACHINE_ITEM = ITEMS.register("vending_machine", () -> new BlockItemBase(VENDING_MACHINE.get()));


    //public static void registerCraftingDead(boolean CDIn) {
        //if(CDIn == true){



        //}
    //}

    public static final RegistryObject<Block> STREET_LIGHT_BASE = BLOCKS.register("street_light_base", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid(), VoxelShapes.combineAndSimplify(Block.makeCuboidShape(6.5, 0, 6.5, 9.5, 8, 9.5), Block.makeCuboidShape(7, 0, 7, 9, 16, 9), IBooleanFunction.OR)));
    public static final RegistryObject<Item> STREET_LIGHT_BASE_ITEM = ITEMS.register("street_light_base", () -> new BlockItemBase(STREET_LIGHT_BASE.get()));

    public static final RegistryObject<Block> STREET_LIGHT_CURVE = BLOCKS.register("street_light_curve", () -> new StreetLightCurveBlock());
    public static final RegistryObject<Item> STREET_LIGHT_CURVE_ITEM = ITEMS.register("street_light_curve", () -> new BlockItemBase(STREET_LIGHT_CURVE.get()));

    public static final RegistryObject<Block> STREET_LIGHT_DOUBLE_CURVE = BLOCKS.register("street_light_double_curve", () -> new StreetLightDoubleCurveBlock());
    public static final RegistryObject<Item> STREET_LIGHT_DOUBLE_CURVE_ITEM = ITEMS.register("street_light_double_curve", () -> new BlockItemBase(STREET_LIGHT_DOUBLE_CURVE.get()));

    public static final RegistryObject<Block> STREET_LIGHT_FLAT_CROSS = BLOCKS.register("street_light_flat_cross", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid(), VoxelShapes.combineAndSimplify(Block.makeCuboidShape(0, 7, 7, 16, 9, 9), Block.makeCuboidShape(7, 7, 0, 9, 9, 16), IBooleanFunction.OR)));
    public static final RegistryObject<Item> STREET_LIGHT_FLAT_CROSS_ITEM = ITEMS.register("street_light_flat_cross", () -> new BlockItemBase(STREET_LIGHT_FLAT_CROSS.get()));

    public static final RegistryObject<Block> STREET_LIGHT_HEAD = BLOCKS.register("street_light_head", () -> new StreetLightHeadBlock());
    public static final RegistryObject<Item> STREET_LIGHT_HEAD_ITEM = ITEMS.register("street_light_head", () -> new BlockItemBase(STREET_LIGHT_HEAD.get()));

    public static final RegistryObject<Block> STREET_LIGHT_HORIZONTAL_POLE = BLOCKS.register("street_light_horizontal_pole", () -> new StreetLightHorizontalBlock());
    public static final RegistryObject<Item> STREET_LIGHT_HORIZONTAL_POLE_ITEM = ITEMS.register("street_light_horizontal_pole", () -> new BlockItemBase(STREET_LIGHT_HORIZONTAL_POLE.get()));

    public static final RegistryObject<Block> STREET_LIGHT_VERTICAL_CROSS = BLOCKS.register("street_light_vertical_cross", () -> new StreetLightVerticalCrossBlock());
    public static final RegistryObject<Item> STREET_LIGHT_VERTICAL_CROSS_ITEM = ITEMS.register("street_light_vertical_cross", () -> new BlockItemBase(STREET_LIGHT_VERTICAL_CROSS.get()));

    public static final RegistryObject<Block> STREET_LIGHT_VERTICAL_POLE = BLOCKS.register("street_light_vertical_pole", () -> new BlockBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f).notSolid(), Block.makeCuboidShape(7, 0, 7, 9, 16, 9)));
    public static final RegistryObject<Item> STREET_LIGHT_VERTICAL_POLE_ITEM = ITEMS.register("street_light_vertical_pole", () -> new BlockItemBase(STREET_LIGHT_VERTICAL_POLE.get()));

}
