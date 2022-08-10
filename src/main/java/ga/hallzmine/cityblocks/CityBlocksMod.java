package ga.hallzmine.cityblocks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import ga.hallzmine.cityblocks.data.CityBlocksRecipeProvider;
import ga.hallzmine.cityblocks.data.loot.CityBlocksLootTableProvider;
import ga.hallzmine.cityblocks.world.BlockRegistryHandler;
import ga.hallzmine.cityblocks.world.ItemRegistryHandler;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(CityBlocksMod.MOD_ID)
public class CityBlocksMod {

  public static final String MOD_ID = "cityblocks";
  public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
    @Override @NotNull
    public ItemStack makeIcon() {
      return new ItemStack(ItemRegistryHandler.ROAD_BLANK_ITEM.get());
    }
  };
  private static final Logger LOGGER = LogManager.getLogger();

  public CityBlocksMod() {
    var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    modEventBus.addListener(this::setup);
    modEventBus.addListener(this::doClientStuff);
    modEventBus.addListener(this::handleGatherData);
    ItemRegistryHandler.ITEMS.register(modEventBus);
    BlockRegistryHandler.BLOCKS.register(modEventBus);

    MinecraftForge.EVENT_BUS.register(this);
  }

  private void setup(final FMLCommonSetupEvent event) {}

  private void handleGatherData(GatherDataEvent event) {
    DataGenerator dataGenerator = event.getGenerator();
    if (event.includeServer()) {
      dataGenerator.addProvider(new CityBlocksLootTableProvider(dataGenerator));
      dataGenerator.addProvider(new CityBlocksRecipeProvider(dataGenerator));
    }
  }

  private void doClientStuff(FMLClientSetupEvent event) {
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.POLE_BARRIER.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.STREET_LIGHT_HEAD.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.CHERRY_LEAVES.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.GOLD_CHAIN.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.BASALT_LANTERN.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.COUNTER.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.COUNTER_CORNER.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.COUNTER_SINK.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.SINK.get(), RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.PLATE.get(), RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.WHITE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.BLACK_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.RED_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.BLUE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.GREEN_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.ORANGE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.MAGENTA_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.LIGHT_BLUE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.YELLOW_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.LIME_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.PINK_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.GRAY_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.LIGHT_GRAY_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.CYAN_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.PURPLE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.BROWN_CHAIR.get(),
        RenderType.translucent());
  }
}
