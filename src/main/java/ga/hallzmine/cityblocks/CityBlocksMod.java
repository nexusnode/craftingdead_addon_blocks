package ga.hallzmine.cityblocks;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("cityblocks")
public class CityBlocksMod {

  private static final Logger LOGGER = LogManager.getLogger();
  public static final String MOD_ID = "cityblocks";

  public CityBlocksMod() {
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

    RegistryHandler.init();

    MinecraftForge.EVENT_BUS.register(this);
  }

  private void setup(final FMLCommonSetupEvent event) {
  }

  private void doClientStuff(final FMLClientSetupEvent event) {
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.POLE_BARRIER.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.STREET_LIGHT_HEAD.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.CHERRY_LEAVES.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GOLD_CHAIN.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BASALT_LANTERN.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.COUNTER.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.COUNTER_CORNER.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.COUNTER_SINK.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.SINK.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PLATE.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.WHITE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLACK_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.RED_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BLUE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GREEN_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.ORANGE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.MAGENTA_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_BLUE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.YELLOW_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIME_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PINK_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.GRAY_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.LIGHT_GRAY_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.CYAN_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.PURPLE_CHAIR.get(),
        RenderType.translucent());
    ItemBlockRenderTypes.setRenderLayer(RegistryHandler.BROWN_CHAIR.get(),
        RenderType.translucent());
  }

  // You can use SubscribeEvent and let the Event Bus discover methods to call
  @SubscribeEvent
  public void onServerStarting(ServerStartingEvent event) {
    LOGGER.info("This server is running Hallzmine's City Blocks!");
  }

  public static final CreativeModeTab TAB = new CreativeModeTab("cityblocksTab") {
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(RegistryHandler.ROAD_BLANK_ITEM.get());
    }
  };

}
