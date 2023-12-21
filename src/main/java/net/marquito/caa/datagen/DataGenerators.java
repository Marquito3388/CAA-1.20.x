package net.marquito.caa.datagen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.mcm.datagen.MCMWorldGenProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ChaosAndAbyss.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();



        //generator.addProvider(event.includeServer(), CAALootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new CAABlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CAAItemModelProvider(packOutput, existingFileHelper));

        CAABlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new CAABlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new CAAItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeServer(), new CAAWorldProvider(packOutput, lookupProvider));


    }
}