package net.marquito.caa.datagen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.util.CAATag;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CAABlockTagGenerator extends BlockTagsProvider {
    public CAABlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ChaosAndAbyss.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


      //  this.tag(CAATags.Blocks.METAL_DETECTOR_VALUABLES)
       //         .add(CAABlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
         .add(CAABlocksClass.VANADIUM_ORE.get(),
              CAABlocksClass.COBALT_ORE.get(),
              CAABlocksClass.PALLADIUM_ORE.get(),
              CAABlocksClass.NETHERIUM_ORE.get(),

                 CAABlocksClass.VANADIUM_BLOCK.get(),
                 CAABlocksClass.COBALT_BLOCK.get(),
                 CAABlocksClass.PALLADIUM_BLOCK.get(),
                 CAABlocksClass.NETHERIUM_BLOCK.get(),

                 CAABlocksClass.VANADIUM_BRICK.get(),
                 CAABlocksClass.COBALT_BRICK.get(),
                 CAABlocksClass.PALLADIUM_BRICK.get(),
                 CAABlocksClass.NETHERIUM_BRICK.get(),

                 CAABlocksClass.BROWN_LAMP.get(),
                 CAABlocksClass.LIME_LAMP.get(),
                 CAABlocksClass.YELLOW_LAMP.get(),
                 CAABlocksClass.RED_LAMP.get(),
                 CAABlocksClass.LIGHT_GREY_LAMP.get(),
                 CAABlocksClass.BLUE_LAMP.get(),
                 CAABlocksClass.LIGHT_BLUE_LAMP.get(),
                 CAABlocksClass.PURPLE_LAMP.get(),
                 CAABlocksClass.PINK_LAMP.get(),
                 CAABlocksClass.ORANGE_LAMP.get(),
                 CAABlocksClass.MAGENTA_LAMP.get(),
                 CAABlocksClass.GREY_LAMP.get(),
                 CAABlocksClass.GREEN_LAMP.get(),
                 CAABlocksClass.CYAN_LAMP.get(),
                 CAABlocksClass.BLACK_LAMP.get()





         );

        /*
                .add(CAABlocks.SAPPHIRE_BLOCK.get(),
                        CAABlocks.RAW_SAPPHIRE_BLOCK.get(),
                        CAABlocks.SAPPHIRE_ORE.get(),
                        CAABlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        CAABlocks.NETHER_SAPPHIRE_ORE.get(),
                        CAABlocks.END_STONE_SAPPHIRE_ORE.get(),
                        CAABlocks.SOUND_BLOCK.get());

         */

        this.tag(BlockTags.NEEDS_STONE_TOOL);


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(CAABlocksClass.VANADIUM_ORE.get())

                //.add(CAABlocksClass.ENCHANTED_GRAVITITE.get())

                .add(CAABlocksClass.VANADIUM_BLOCK.get())
                .add(CAABlocksClass.COBALT_BLOCK.get())
                .add(CAABlocksClass.PALLADIUM_BLOCK.get())
                .add(CAABlocksClass.NETHERIUM_BLOCK.get())

                .add(CAABlocksClass.VANADIUM_BRICK.get())
                .add(CAABlocksClass.COBALT_BRICK.get())
                .add(CAABlocksClass.PALLADIUM_BRICK.get())
                .add(CAABlocksClass.NETHERIUM_BRICK.get())

                .add(CAABlocksClass.BLUE_LAMP.get())
                .add(CAABlocksClass.BLACK_LAMP.get())
                .add(CAABlocksClass.CYAN_LAMP.get())
                .add(CAABlocksClass.GREEN_LAMP.get())
                .add(CAABlocksClass.GREY_LAMP.get())
                .add(CAABlocksClass.LIGHT_BLUE_LAMP.get())
                .add(CAABlocksClass.LIGHT_GREY_LAMP.get())
                .add(CAABlocksClass.LIME_LAMP.get())
                .add(CAABlocksClass.MAGENTA_LAMP.get())
                .add(CAABlocksClass.ORANGE_LAMP.get())
                .add(CAABlocksClass.PINK_LAMP.get())
                .add(CAABlocksClass.PURPLE_LAMP.get())
                .add(CAABlocksClass.RED_LAMP.get())
                .add(CAABlocksClass.YELLOW_LAMP.get())
                .add(CAABlocksClass.BROWN_LAMP.get());




        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);



        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
               .add(CAABlocksClass.COBALT_ORE.get());

        this.tag(CAATag.Blocks.NEEDS_COBALT_TOOL)
                .add(CAABlocksClass.PALLADIUM_ORE.get());

        this.tag(CAATag.Blocks.NEEDS_PALLADIUM_TOOL)
                .add(CAABlocksClass.NETHERIUM_ORE.get());







    }
}