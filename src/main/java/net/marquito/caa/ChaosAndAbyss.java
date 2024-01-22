package net.marquito.caa;

import com.mojang.logging.LogUtils;
import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.creativetabs.CAATabs;
import net.marquito.caa.item.CAAItemsClass;
import net.marquito.caa.util.CAAItemProperties;
import net.marquito.caa.loot.CAALootModifier;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
//import top.theillusivec4.curios.api.CuriosApi;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ChaosAndAbyss.MODID)
public class ChaosAndAbyss {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "caa";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ChaosAndAbyss() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        CAATabs.register(modEventBus);
        CAAItemsClass.register(modEventBus);
        CAABlocksClass.register(modEventBus);
        CAALootModifier.register(modEventBus);


        modEventBus.addListener(this::commonSetup);



        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }





    private void commonSetup(final FMLCommonSetupEvent event) {

        CAAItemProperties.addCustomItemProperties();




    }

    private void clientSetup( final FMLClientSetupEvent event){


    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
