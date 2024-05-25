package net.marquito.caa.datagen;

import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.item.CAAItemsClass;
import net.marquito.mcm.item.MCMItemsClass;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class CAARecipesProvider extends RecipeProvider implements IConditionBuilder {


    private static final List<ItemLike> FURNACE_VANADIUM = List.of(CAAItemsClass.VANADIUM_CHUNK.get());
    private static final List<ItemLike> FURNACE_ADAMANTINA = List.of(CAAItemsClass.ADAMANTINA_CHUNK.get());
    private static final List<ItemLike> FURNACE_IRIDIUM = List.of(CAAItemsClass.IRIDIUM_CHUNK.get());
    private static final List<ItemLike> FURNACE_GALLIUM = List.of(CAAItemsClass.GALLIUM_CHUNK.get());



    public CAARecipesProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ALEXANDRITE_BLOCK.get()).build()))
                .save(pWriter);

                nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, CAAItemsClass.RAW_ALEXANDRITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                    "mccourse:raw_alexandrite", "alexandrite", "mccourse:raw_alexandrite_block", "alexandrite");



         */

        //   ============================================================================================================
        //   ============================================================================================================
        //                                             /*Materials*/
        //   ============================================================================================================
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_ROD.get())
                .pattern("   ")
                .pattern(" V ")
                .pattern(" V ")
                .define('V', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.NETHERITE_ROD.get())
                .pattern("   ")
                .pattern(" N ")
                .pattern(" N ")
                .define('N', Items.NETHERITE_SCRAP)
                .unlockedBy("has_netherite_scrap", inventoryTrigger(ItemPredicate.Builder.item().of(Items.NETHERITE_SCRAP).build()))
                .save(pWriter);


        //   ============================================================================================================
        //   ============================================================================================================
        //                                             /*RAW->CHUNK*/
        //   ============================================================================================================
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_CHUNK.get())
                .pattern(" R ")
                .pattern("RCR")
                .pattern(" R ")
                .define('C', Items.COAL)
                .define('R', CAAItemsClass.RAW_VANADIUM.get())
                .unlockedBy("has_raw_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_CHUNK.get())
                .pattern(" R ")
                .pattern("RCR")
                .pattern(" R ")
                .define('C', Items.COAL)
                .define('R', CAAItemsClass.RAW_ADAMANTINA.get())
                .unlockedBy("has_raw_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_CHUNK.get())
                .pattern(" R ")
                .pattern("RCR")
                .pattern(" R ")
                .define('C', Items.COAL)
                .define('R', CAAItemsClass.RAW_IRIDIUM.get())
                .unlockedBy("has_raw_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_IRIDIUM.get()).build()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_CHUNK.get())
                .pattern(" R ")
                .pattern("RCR")
                .pattern(" R ")
                .define('C', CAAItemsClass.NETHER_STONE.get())
                .define('R', CAAItemsClass.RAW_COBALT.get())
                .unlockedBy("has_raw_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_CHUNK.get())
                .pattern(" R ")
                .pattern("RCR")
                .pattern(" R ")
                .define('C', CAAItemsClass.NETHER_STONE.get())
                .define('R', CAAItemsClass.RAW_PALLADIUM.get())
                .unlockedBy("has_raw_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_CHUNK.get())
                .pattern(" R ")
                .pattern("RCR")
                .pattern(" R ")
                .define('C', CAAItemsClass.END_STONE.get())
                .define('R', CAAItemsClass.RAW_ENDERIUM.get())
                .unlockedBy("has_raw_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_ENDERIUM.get()).build()))
                .save(pWriter);



        //   ============================================================================================================
        //   ============================================================================================================
        //                                         /*GENERAL TOOLS/WEAPONS*/
        //   ============================================================================================================
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.DRILL.get())
                .pattern(" S ")
                .pattern("SRS")
                .pattern("ICI")
                .define('S', Items.IRON_INGOT)
                .define('I', MCMItemsClass.SILVER_INGOT.get())
                .define('R', Items.REDSTONE)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_silver", inventoryTrigger(ItemPredicate.Builder.item().of(MCMItemsClass.SILVER_INGOT.get()).build()))
                .save(pWriter);




        //   ============================================================================================================
        //                                             Adamantina
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', Blocks.OAK_PLANKS)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);



        //TOOLS -------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        //ARMOR------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ADAMANTINA_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);


        //   ============================================================================================================
        //                                             Iridium
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', Blocks.OAK_PLANKS)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);



        //TOOLS -------------------------------------------



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        //ARMOR------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.IRIDIUM_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);


        //   ============================================================================================================
        //                                             Violite Stone
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', Blocks.OAK_PLANKS)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);



        //TOOLS -------------------------------------------


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_DRILL.get())
                .pattern(" S ")
                .pattern("SDS")
                .pattern("   ")
                .define('S', CAAItemsClass.VIOLITE_STONE.get())
                .define('D', CAAItemsClass.DRILL.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        //ARMOR------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VIOLITE_STONE_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);


        //   ============================================================================================================
        //                                             Vanadium
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', Blocks.OAK_PLANKS)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        //TOOLS ---------------------------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', Items.STICK)
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);


        //ARMOR------------------------------------------------------------------------------------------------

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.VANADIUM_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);




         //   ============================================================================================================
         //                                             COBALT
         //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', CAAItemsClass.VANADIUM.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_BOW.get())
                .pattern(" MR")
                .pattern("M R")
                .pattern(" MR")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);



        //TOOLS -------------------------------------------


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_DRILL.get())
                .pattern(" S ")
                .pattern("SDS")
                .pattern("   ")
                .define('S', CAAItemsClass.COBALT.get())
                .define('D', CAAItemsClass.DRILL.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        //ARMOR------------------------------------------------------------------------------------------------



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.COBALT_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);



        //   ============================================================================================================
        //                                                PALLADIUM
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', CAAItemsClass.COBALT.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_BOW.get())
                .pattern(" MR")
                .pattern("M R")
                .pattern(" MR")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);


        //TOOLS-------------------------------------------------------------


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_DRILL.get())
                .pattern(" S ")
                .pattern("SDS")
                .pattern("   ")
                .define('S', CAAItemsClass.PALLADIUM.get())
                .define('D', CAAItemsClass.DRILL.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.VANADIUM_ROD.get())
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        //ARMOR------------------------------------------------------------------------------------------------



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.PALLADIUM_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);








        //   ============================================================================================================
        //                                                 ENDERIUM
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_SYTHE.get())
                .pattern("MMM")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_SHIELD.get())
                .pattern("WMW")
                .pattern("WWW")
                .pattern(" W ")
                .define('W', CAAItemsClass.PALLADIUM.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_GLAIVE.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("M  ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_SPEAR.get())
                .pattern("  M")
                .pattern(" R ")
                .pattern("R  ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_DAGGER.get())
                .pattern("   ")
                .pattern(" M ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_BATTLEAXE.get())
                .pattern("MMM")
                .pattern("MRM")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_BOW.get())
                .pattern(" MR")
                .pattern("M R")
                .pattern(" MR")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        //TOOLS-------------------------------------------------------------


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_DRILL.get())
                .pattern(" S ")
                .pattern("SDS")
                .pattern("   ")
                .define('S', CAAItemsClass.ENDERIUM.get())
                .define('D', CAAItemsClass.DRILL.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_PICKAXE.get())
                .pattern("MMM")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_HOE.get())
                .pattern("MM ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_AXE.get())
                .pattern("MM ")
                .pattern("MR ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_SHOVEL.get())
                .pattern(" M ")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', CAAItemsClass.NETHERITE_ROD.get())
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        //ARMOR------------------------------------------------------------------------------------------------



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_HELMET.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAAItemsClass.ENDERIUM_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);





        //   ============================================================================================================
        //   ============================================================================================================
        //                                               /*BLOCKS*/
        //   ============================================================================================================
        //   ============================================================================================================


        //   ============================================================================================================
        //                                               BRICKS
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.VANADIUM_BRICKS.get())
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .define('M', CAAItemsClass.RAW_VANADIUM.get())
                .unlockedBy("has_raw_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.COBALT_BRICKS.get())
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .define('M', CAAItemsClass.RAW_COBALT.get())
                .unlockedBy("has_raw_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.PALLADIUM_BRICKS.get())
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .define('M', CAAItemsClass.RAW_PALLADIUM.get())
                .unlockedBy("has_raw_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.ENDERIUM_BRICKS.get())
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .define('M', CAAItemsClass.RAW_ENDERIUM.get())
                .unlockedBy("has_raw_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.RAW_ENDERIUM.get()).build()))
                .save(pWriter);



        //   ============================================================================================================
        //                                            METAL BLOCKS
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.ADAMANTINA_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.ADAMANTINA.get())
                .unlockedBy("has_adamantina", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ADAMANTINA.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.IRIDIUM_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.IRIDIUM.get())
                .unlockedBy("has_iridium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.IRIDIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.VIOLITE_STONE_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.VIOLITE_STONE.get())
                .unlockedBy("has_violite_stone", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VIOLITE_STONE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.VANADIUM_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.VANADIUM.get())
                .unlockedBy("has_vanadium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.VANADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.COBALT_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.COBALT.get())
                .unlockedBy("has_cobalt", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.COBALT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.PALLADIUM_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.PALLADIUM.get())
                .unlockedBy("has_palladium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.PALLADIUM.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.ENDERIUM_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', CAAItemsClass.ENDERIUM.get())
                .unlockedBy("has_enderium", inventoryTrigger(ItemPredicate.Builder.item().of(CAAItemsClass.ENDERIUM.get()).build()))
                .save(pWriter);


        //   ============================================================================================================
        //                                               LAMPS
        //   ============================================================================================================

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.RED_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.RED_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.BLACK_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.BLACK_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.CYAN_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.CYAN_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.LIGHT_BLUE_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.LIME_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.LIME_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.GREEN_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.GREEN_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.LIGHT_GREY_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.GREY_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.GRAY_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.ORANGE_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.ORANGE_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.MAGENTA_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.MAGENTA_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.PINK_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.PINK_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.PURPLE_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.PURPLE_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.YELLOW_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.YELLOW_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.BROWN_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.BROWN_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAABlocksClass.BLUE_LAMP.get())
                .pattern("SGS")
                .pattern("GDG")
                .pattern("SGS")
                .define('S', Items.GLOWSTONE_DUST)
                .define('G', Blocks.GLASS)
                .define('D', Items.BLUE_DYE)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(pWriter);





        //   ____________________________________________________________________________________________________________
        //   ============================================================================================================
        //   ============================================================================================================
        //                                               /*SMELTING*/
        //   ============================================================================================================
        //   ============================================================================================================
        //   ____________________________________________________________________________________________________________




        oreSmelting(pWriter, FURNACE_GALLIUM, RecipeCategory.MISC, CAAItemsClass.GALLIUM.get(), 0.25f, 200, "gallium");
        oreSmelting(pWriter, FURNACE_VANADIUM, RecipeCategory.MISC, CAAItemsClass.VANADIUM.get(), 0.25f, 200, "vanadium");
        oreSmelting(pWriter, FURNACE_ADAMANTINA, RecipeCategory.MISC, CAAItemsClass.ADAMANTINA.get(), 0.25f, 200, "adamantina");
        oreSmelting(pWriter, FURNACE_IRIDIUM, RecipeCategory.MISC, CAAItemsClass.IRIDIUM.get(), 0.25f, 200, "iridium");

        oreBlasting(pWriter, FURNACE_GALLIUM, RecipeCategory.MISC, CAAItemsClass.IRIDIUM.get(), 0.25f, 200, "gallium");
        oreBlasting(pWriter, FURNACE_VANADIUM, RecipeCategory.MISC, CAAItemsClass.VANADIUM.get(), 0.25f, 100, "vanadium");
        oreBlasting(pWriter, FURNACE_ADAMANTINA, RecipeCategory.MISC, CAAItemsClass.ADAMANTINA.get(), 0.25f, 100, "adamantina");
        oreBlasting(pWriter, FURNACE_IRIDIUM, RecipeCategory.MISC, CAAItemsClass.IRIDIUM.get(), 0.25f, 100, "iridium");


    }
}