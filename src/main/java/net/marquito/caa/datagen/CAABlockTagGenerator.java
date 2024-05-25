package net.marquito.caa.datagen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.util.CAATag;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
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



        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
         .add(

                 CAABlocksClass.RUBY_ORE.get(),
                 CAABlocksClass.SAPPHIRE_ORE.get(),
                 CAABlocksClass.NETHER_STONE_ORE.get(),
                 CAABlocksClass.END_STONE_ORE.get(),
                 CAABlocksClass.ADAMANTINA_ORE.get(),
                 CAABlocksClass.IRIDIUM_ORE.get(),
                 CAABlocksClass.VIOLITE_STONE_ORE.get(),
                 CAABlocksClass.VANADIUM_ORE.get(),
                 CAABlocksClass.COBALT_ORE.get(),
                 CAABlocksClass.PALLADIUM_ORE.get(),
                 CAABlocksClass.ENDERIUM_ORE.get(),

                 CAABlocksClass.RUBY_BLOCK.get(),
                 CAABlocksClass.SAPPHIRE_BLOCK.get(),
                 CAABlocksClass.VANADIUM_BLOCK.get(),
                 CAABlocksClass.ADAMANTINA_BLOCK.get(),
                 CAABlocksClass.VIOLITE_STONE_BLOCK.get(),
                 CAABlocksClass.IRIDIUM_BLOCK.get(),
                 CAABlocksClass.COBALT_BLOCK.get(),
                 CAABlocksClass.PALLADIUM_BLOCK.get(),
                 CAABlocksClass.ENDERIUM_BLOCK.get(),

                 CAABlocksClass.VANADIUM_BRICKS.get(),
                 CAABlocksClass.COBALT_BRICKS.get(),
                 CAABlocksClass.PALLADIUM_BRICKS.get(),
                 CAABlocksClass.ENDERIUM_BRICKS.get(),

                 CAABlocksClass.METAL_MANIPULATOR.get(),

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

                 //CAABlocksClass.SWORD_SHRINE.get()

                    /*
                 CAABlocksClass.PHAROAS_BLOCK.get(),
                 CAABlocksClass.C_SANDSTONE_BRICKS.get(),
                 CAABlocksClass.C_SANDSTONE_PILLAR.get(),
                 CAABlocksClass.C_DT_BRICKS.get(),
                 CAABlocksClass.DT_BRICKS.get(),
                 CAABlocksClass.SANDSTONE_BRICKS.get(),
                 CAABlocksClass.SANDSTONE_PILLAR.get(),

                 CAABlocksClass.DAGGER_STATUE.get(),
                 CAABlocksClass.BOW_STATUE.get(),
                 CAABlocksClass.GLAIVE_STATUE.get(),
                 CAABlocksClass.BA_STATUE.get(),
                 CAABlocksClass.SPEAR_STATUE.get(),
                 CAABlocksClass.SHIELD_STATUE.get(),
                 CAABlocksClass.SWORD_STATUE.get()

                     */





         );

        this.tag(BlockTags.NEEDS_STONE_TOOL);

                /*
                .add(CAABlocksClass.C_SANDSTONE_BRICKS.get())
                .add(CAABlocksClass.C_SANDSTONE_PILLAR.get())
                .add(CAABlocksClass.C_DT_BRICKS.get())
                .add(CAABlocksClass.DT_BRICKS.get())
                .add(CAABlocksClass.SANDSTONE_BRICKS.get())
                .add(CAABlocksClass.SANDSTONE_PILLAR.get())

                .add(CAABlocksClass.SHIELD_STATUE.get())
                .add(CAABlocksClass.SPEAR_STATUE.get())
                .add(CAABlocksClass.SWORD_STATUE.get())
                .add(CAABlocksClass.BA_STATUE.get())
                .add(CAABlocksClass.GLAIVE_STATUE.get())
                .add(CAABlocksClass.BOW_STATUE.get())
                .add(CAABlocksClass.DAGGER_STATUE.get());

                 */




        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(CAABlocksClass.VANADIUM_ORE.get())

                //.add(CAABlocksClass.ENCHANTED_GRAVITITE.get())

                .add(CAABlocksClass.RUBY_ORE.get())
                .add(CAABlocksClass.SAPPHIRE_ORE.get())
                .add(CAABlocksClass.ADAMANTINA_ORE.get())
                .add(CAABlocksClass.IRIDIUM_ORE.get())
                .add(CAABlocksClass.VIOLITE_STONE_ORE.get())

                .add(CAABlocksClass.RUBY_BLOCK.get())
                .add(CAABlocksClass.SAPPHIRE_BLOCK.get())
                .add(CAABlocksClass.VANADIUM_BLOCK.get())
                .add(CAABlocksClass.COBALT_BLOCK.get())
                .add(CAABlocksClass.PALLADIUM_BLOCK.get())
                .add(CAABlocksClass.ENDERIUM_BLOCK.get())

                .add(CAABlocksClass.ADAMANTINA_BLOCK.get())
                .add(CAABlocksClass.IRIDIUM_BLOCK.get())
                .add(CAABlocksClass.VIOLITE_STONE_BLOCK.get())
                .add(CAABlocksClass.VANADIUM_BRICKS.get())
                .add(CAABlocksClass.COBALT_BRICKS.get())
                .add(CAABlocksClass.PALLADIUM_BRICKS.get())
                .add(CAABlocksClass.ENDERIUM_BRICKS.get())


                .add(CAABlocksClass.METAL_MANIPULATOR.get())

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
               // .add(CAABlocksClass.PHAROAS_BLOCK.get())
                //.add(CAABlocksClass.SWORD_SHRINE.get())

        //noinspection unchecked
        this.tag(CAATag.Blocks.DRILL_MINABLE)
                .addTags(BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.MINEABLE_WITH_SHOVEL);



        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(CAABlocksClass.NETHER_STONE_ORE.get());



        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
               .add(CAABlocksClass.COBALT_ORE.get());

        this.tag(CAATag.Blocks.NEEDS_COBALT_TOOL)
                .add(CAABlocksClass.PALLADIUM_ORE.get());

        this.tag(CAATag.Blocks.NEEDS_PALLADIUM_TOOL)
                .add(CAABlocksClass.ENDERIUM_ORE.get())
                .add(CAABlocksClass.END_STONE_ORE.get());







    }
}