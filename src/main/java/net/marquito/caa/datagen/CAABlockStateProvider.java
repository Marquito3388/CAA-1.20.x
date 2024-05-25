package net.marquito.caa.datagen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CAABlockStateProvider extends BlockStateProvider {
    public CAABlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChaosAndAbyss.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {



        //blockWithItem(CAABlocksClass.REINFORCED_SMITHING_TABLE);

        blockWithItem(CAABlocksClass.RUBY_ORE);
        blockWithItem(CAABlocksClass.SAPPHIRE_ORE);
        blockWithItem(CAABlocksClass.NETHER_STONE_ORE);
        blockWithItem(CAABlocksClass.END_STONE_ORE);
        blockWithItem(CAABlocksClass.ADAMANTINA_ORE);
        blockWithItem(CAABlocksClass.IRIDIUM_ORE);
        blockWithItem(CAABlocksClass.VIOLITE_STONE_ORE);
        blockWithItem(CAABlocksClass.VANADIUM_ORE);
        blockWithItem(CAABlocksClass.COBALT_ORE);
        blockWithItem(CAABlocksClass.PALLADIUM_ORE);
        blockWithItem(CAABlocksClass.ENDERIUM_ORE);

        blockWithItem(CAABlocksClass.ADAMANTINA_BLOCK);
        blockWithItem(CAABlocksClass.IRIDIUM_BLOCK);
        blockWithItem(CAABlocksClass.VIOLITE_STONE_BLOCK);

        blockWithItem(CAABlocksClass.RUBY_BLOCK);
        blockWithItem(CAABlocksClass.SAPPHIRE_BLOCK);
        blockWithItem(CAABlocksClass.VANADIUM_BLOCK);
        blockWithItem(CAABlocksClass.COBALT_BLOCK);
        blockWithItem(CAABlocksClass.PALLADIUM_BLOCK);
        blockWithItem(CAABlocksClass.ENDERIUM_BLOCK);

        blockWithItem(CAABlocksClass.VANADIUM_BRICKS);
        blockWithItem(CAABlocksClass.COBALT_BRICKS);
        blockWithItem(CAABlocksClass.PALLADIUM_BRICKS);
        blockWithItem(CAABlocksClass.ENDERIUM_BRICKS);


        blockWithItem(CAABlocksClass.BLUE_LAMP);
        blockWithItem(CAABlocksClass.BLACK_LAMP);
        blockWithItem(CAABlocksClass.BROWN_LAMP);
        blockWithItem(CAABlocksClass.CYAN_LAMP);
        blockWithItem(CAABlocksClass.GREEN_LAMP);
        blockWithItem(CAABlocksClass.LIGHT_BLUE_LAMP);
        blockWithItem(CAABlocksClass.LIGHT_GREY_LAMP);
        blockWithItem(CAABlocksClass.GREY_LAMP);
        blockWithItem(CAABlocksClass.LIME_LAMP);
        blockWithItem(CAABlocksClass.MAGENTA_LAMP);
        blockWithItem(CAABlocksClass.PURPLE_LAMP);
        blockWithItem(CAABlocksClass.YELLOW_LAMP);
        blockWithItem(CAABlocksClass.RED_LAMP);
        blockWithItem(CAABlocksClass.PINK_LAMP);
        blockWithItem(CAABlocksClass.ORANGE_LAMP);

        /*
        blockWithItem(CAABlocksClass.C_SANDSTONE_BRICKS);
        blockWithItem(CAABlocksClass.C_SANDSTONE_PILLAR);
        blockWithItem(CAABlocksClass.C_DT_BRICKS);
        blockWithItem(CAABlocksClass.DT_BRICKS);
        blockWithItem(CAABlocksClass.SANDSTONE_BRICKS);
        blockWithItem(CAABlocksClass.SANDSTONE_PILLAR);
        blockWithItem(CAABlocksClass.PHAROAS_BLOCK);
        */

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}