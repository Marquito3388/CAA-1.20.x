package net.marquito.caa.datagen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.item.CAAItemsClass;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CAAItemTagGenerator extends ItemTagsProvider {
    public CAAItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ChaosAndAbyss.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        CAAItemsClass.VANADIUM_HELMET.get(),
                        CAAItemsClass.ADAMANTINA_HELMET.get(),
                        CAAItemsClass.VIOLITE_STONE_HELMET.get(),
                        CAAItemsClass.IRIDIUM_HELMET.get(),
                        CAAItemsClass.COBALT_HELMET.get(),
                        CAAItemsClass.PALLADIUM_HELMET.get(),
                        CAAItemsClass.ENDERIUM_HELMET.get(),

                        CAAItemsClass.VANADIUM_CHESTPLATE.get(),
                        CAAItemsClass.ADAMANTINA_CHESTPLATE.get(),
                        CAAItemsClass.VIOLITE_STONE_CHESTPLATE.get(),
                        CAAItemsClass.IRIDIUM_CHESTPLATE.get(),
                        CAAItemsClass.COBALT_CHESTPLATE.get(),
                        CAAItemsClass.PALLADIUM_CHESTPLATE.get(),
                        CAAItemsClass.ENDERIUM_CHESTPLATE.get(),

                        CAAItemsClass.VANADIUM_LEGGINGS.get(),
                        CAAItemsClass.ADAMANTINA_LEGGINGS.get(),
                        CAAItemsClass.VIOLITE_STONE_LEGGINGS.get(),
                        CAAItemsClass.IRIDIUM_LEGGINGS.get(),
                        CAAItemsClass.COBALT_LEGGINGS.get(),
                        CAAItemsClass.PALLADIUM_LEGGINGS.get(),
                        CAAItemsClass.ENDERIUM_LEGGINGS.get(),

                        CAAItemsClass.VANADIUM_BOOTS.get(),
                        CAAItemsClass.ADAMANTINA_BOOTS.get(),
                        CAAItemsClass.VIOLITE_STONE_BOOTS.get(),
                        CAAItemsClass.IRIDIUM_BOOTS.get(),
                        CAAItemsClass.COBALT_BOOTS.get(),
                        CAAItemsClass.PALLADIUM_BOOTS.get(),
                        CAAItemsClass.ENDERIUM_BOOTS.get()
                        );

    }

    @Override
    public String getName(){
        return "Item Tags";
    }
}