package cn.dovelin.railcraftneo;

import cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks;
import cn.dovelin.railcraftneo.world.items.RailcraftNeoItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import static cn.dovelin.railcraftneo.tabs.RailcraftneoTabs.CREATIVE_MODE_TABS;
import static cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks.BLOCKS;
import static cn.dovelin.railcraftneo.world.items.RailcraftNeoItems.ITEMS;

@Mod(RailcraftNeo.MODID)
public class RailcraftNeo
{
    public static final String MODID = "railcraftneo";
    public static final boolean BETA = true;

    private static final Logger LOGGER = LogUtils.getLogger();



    public RailcraftNeo(IEventBus modEventBus)
    {
        modEventBus.addListener(this::commonSetup);

        RailcraftNeoItems.registerFun().register(modEventBus);
        RailcraftNeoBlocks.registerFun().register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }




    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
