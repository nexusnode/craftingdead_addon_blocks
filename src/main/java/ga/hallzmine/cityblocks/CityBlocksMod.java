package ga.hallzmine.cityblocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("cityblocks")
public class CityBlocksMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cityblocks";

    public CityBlocksMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegistryHandler.POLE_BARRIER.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.STREET_LIGHT_HEAD.get(), RenderType.getTranslucent());
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("This server is running Hallzmine's City Blocks!");
    }

    public static final ItemGroup TAB = new ItemGroup("cityblocksTab") {
        @Override
        public ItemStack createIcon() {return new ItemStack(RegistryHandler.ROAD_BLANK_ITEM.get());}
    };

}
