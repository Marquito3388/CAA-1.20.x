package net.marquito.caa.datagen.loot;

import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.item.CAAItemsClass;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class CAABlockLootTables extends BlockLootSubProvider {
    public CAABlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(CAABlocksClass.VANADIUM_BLOCK.get());
        this.dropSelf(CAABlocksClass.ADAMANTINA_BLOCK.get());
        this.dropSelf(CAABlocksClass.IRIDIUM_BLOCK.get());
        this.dropSelf(CAABlocksClass.VIOLITE_STONE_BLOCK.get());

        this.dropSelf(CAABlocksClass.RUBY_BLOCK.get());
        this.dropSelf(CAABlocksClass.SAPPHIRE_BLOCK.get());

        this.dropSelf(CAABlocksClass.COBALT_BLOCK.get());
        this.dropSelf(CAABlocksClass.PALLADIUM_BLOCK.get());
        this.dropSelf(CAABlocksClass.ENDERIUM_BLOCK.get());

        this.dropSelf(CAABlocksClass.VANADIUM_BRICKS.get());
        this.dropSelf(CAABlocksClass.COBALT_BRICKS.get());
        this.dropSelf(CAABlocksClass.PALLADIUM_BRICKS.get());
        this.dropSelf(CAABlocksClass.ENDERIUM_BRICKS.get());


        this.dropSelf(CAABlocksClass.METAL_MANIPULATOR.get());

        this.dropSelf(CAABlocksClass.BLUE_LAMP.get());
        this.dropSelf(CAABlocksClass.BROWN_LAMP.get());
        this.dropSelf(CAABlocksClass.LIME_LAMP.get());
        this.dropSelf(CAABlocksClass.YELLOW_LAMP.get());
        this.dropSelf(CAABlocksClass.LIGHT_GREY_LAMP.get());
        this.dropSelf(CAABlocksClass.LIGHT_BLUE_LAMP.get());
        this.dropSelf(CAABlocksClass.PURPLE_LAMP.get());
        this.dropSelf(CAABlocksClass.PINK_LAMP.get());
        this.dropSelf(CAABlocksClass.MAGENTA_LAMP.get());
        this.dropSelf(CAABlocksClass.ORANGE_LAMP.get());
        this.dropSelf(CAABlocksClass.GREEN_LAMP.get());
        this.dropSelf(CAABlocksClass.CYAN_LAMP.get());
        this.dropSelf(CAABlocksClass.RED_LAMP.get());
        this.dropSelf(CAABlocksClass.GREY_LAMP.get());
        this.dropSelf(CAABlocksClass.BLACK_LAMP.get());

        this.add(CAABlocksClass.RUBY_ORE.get(),
                block -> createOreDrop(CAABlocksClass.RUBY_ORE.get(), CAAItemsClass.RUBY_MINERAL.get()));

        this.add(CAABlocksClass.SAPPHIRE_ORE.get(),
                block -> createOreDrop(CAABlocksClass.SAPPHIRE_ORE.get(), CAAItemsClass.SAPPHIRE_MINERAL.get()));

        this.add(CAABlocksClass.NETHER_STONE_ORE.get(),
                block -> createOreDrop(CAABlocksClass.NETHER_STONE_ORE.get(), CAAItemsClass.NETHER_STONE.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.8F, 4.1F))));

        this.add(CAABlocksClass.END_STONE_ORE.get(),
                block -> createOreDrop(CAABlocksClass.END_STONE_ORE.get(), CAAItemsClass.END_STONE.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.8F, 4.1F))));

        this.add(CAABlocksClass.VANADIUM_ORE.get(),
                block -> createOreDrop(CAABlocksClass.VANADIUM_ORE.get(), CAAItemsClass.RAW_VANADIUM.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.8F, 4.1F))));

        this.add(CAABlocksClass.ADAMANTINA_ORE.get(),
                block -> createOreDrop(CAABlocksClass.VANADIUM_ORE.get(), CAAItemsClass.RAW_ADAMANTINA.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.8F, 4.1F))));

        this.add(CAABlocksClass.IRIDIUM_ORE.get(),
                block -> createOreDrop(CAABlocksClass.IRIDIUM_ORE.get(), CAAItemsClass.RAW_IRIDIUM.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.8F, 4.1F))));

        this.add(CAABlocksClass.VIOLITE_STONE_ORE.get(),
                block -> createOreDrop(CAABlocksClass.VIOLITE_STONE_ORE.get(), CAAItemsClass.VIOLITE_STONE.get()));

        this.add(CAABlocksClass.COBALT_ORE.get(),
                block -> createOreDrop(CAABlocksClass.COBALT_ORE.get(), CAAItemsClass.RAW_COBALT.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.3F, 3F))));

        this.add(CAABlocksClass.PALLADIUM_ORE.get(),
                block -> createOreDrop(CAABlocksClass.PALLADIUM_ORE.get(), CAAItemsClass.RAW_PALLADIUM.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.3F, 3F))));

        this.add(CAABlocksClass.ENDERIUM_ORE.get(),
                block -> createOreDrop(CAABlocksClass.ENDERIUM_ORE.get(), CAAItemsClass.RAW_ENDERIUM.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.3F, 3F))));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CAABlocksClass.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}