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


        blockWithItem(CAABlocksClass.VANADIUM_ORE);
        blockWithItem(CAABlocksClass.COBALT_ORE);
        blockWithItem(CAABlocksClass.PALLADIUM_ORE);
        blockWithItem(CAABlocksClass.NETHERIUM_ORE);

        blockWithItem(CAABlocksClass.VANADIUM_BLOCK);
        blockWithItem(CAABlocksClass.COBALT_BLOCK);
        blockWithItem(CAABlocksClass.PALLADIUM_BLOCK);
        blockWithItem(CAABlocksClass.NETHERIUM_BLOCK);

        //blockWithItem(CAABlocksClass.ENCHANTED_GRAVITITE);

        blockWithItem(CAABlocksClass.VANADIUM_BRICK);
        blockWithItem(CAABlocksClass.COBALT_BRICK);
        blockWithItem(CAABlocksClass.PALLADIUM_BRICK);
        blockWithItem(CAABlocksClass.NETHERIUM_BRICK);


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

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}