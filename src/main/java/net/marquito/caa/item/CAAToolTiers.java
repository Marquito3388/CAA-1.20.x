package net.marquito.caa.item;

import net.marquito.caa.util.CAATag;
import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.item.MCMItemsClass;
import net.marquito.mcm.util.MCMTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class CAAToolTiers {
;

    public static final ForgeTier CAA_HOE = new ForgeTier(3, 900, 8.0F, -1F, 10,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(CAAItemsClass.VANADIUM.get()));

    public static final ForgeTier CAA_SHOVEL = new ForgeTier(3, 900, 8.0F, -0.5F, 10,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(CAAItemsClass.VANADIUM.get()));


    public static final Tier DRILL_IRON = TierSortingRegistry.registerTier(
            new ForgeTier(3, 250, 6.5F, 3.3F, 12,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(MarquitosCoreMod.MODID, "iron_ingot"), List.of(Tiers.STONE), List.of());

    public static final Tier DRILL_VIOLITE_STONE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 500, 9.5F, 3.3F, 12,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(CAAItemsClass.VIOLITE_STONE.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "violet_stone"), List.of(Tiers.IRON), List.of());


    public static final Tier DRILL_COBALT = TierSortingRegistry.registerTier(
            new ForgeTier(5, 900, 10.1F, 4.3F, 15,
                    CAATag.Blocks.NEEDS_COBALT_TOOL, () -> Ingredient.of(CAAItemsClass.COBALT.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "cobalt_drill"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier DRILL_PALLADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(6, 900, 10.1F, 4.7F, 15,
                    CAATag.Blocks.NEEDS_PALLADIUM_TOOL, () -> Ingredient.of(CAAItemsClass.PALLADIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "palladium_drill"), List.of(CAAToolTiers.DRILL_COBALT), List.of());

    public static final Tier DRILL_ENDERIUM = TierSortingRegistry.registerTier(
            new ForgeTier(7, 900, 11.1F, 5.0F, 15,
                    CAATag.Blocks.NEEDS_ENDERIUM_TOOL, () -> Ingredient.of(CAAItemsClass.ENDERIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "enderium_drill"), List.of(CAAToolTiers.DRILL_PALLADIUM), List.of());



    public static final Tier VANADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 900, 8.0F, 3.3F, 12,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(CAAItemsClass.VANADIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "vanadium"), List.of(Tiers.IRON), List.of());



    public static final Tier COBALT = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2300, 9.1F, 4.3F, 15,
                    CAATag.Blocks.NEEDS_COBALT_TOOL, () -> Ingredient.of(CAAItemsClass.COBALT.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "cobalt"), List.of(Tiers.NETHERITE), List.of());



    public static final Tier PALLADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2450, 9.1F, 4.7F, 15,
                    CAATag.Blocks.NEEDS_PALLADIUM_TOOL, () -> Ingredient.of(CAAItemsClass.PALLADIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "palladium"), List.of(CAAToolTiers.COBALT), List.of());



    public static final Tier ENDERIUM = TierSortingRegistry.registerTier(
            new ForgeTier(7, 2523, 9.2F, 5.0F, 15,
                    CAATag.Blocks.NEEDS_ENDERIUM_TOOL, () -> Ingredient.of(CAAItemsClass.ENDERIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "enderium"), List.of(CAAToolTiers.PALLADIUM), List.of());



    /*

    public static final Tier COBALT_DRILL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2300, 9.7F, 3.4F, 15,
                    CAATag.Blocks.NEEDS_COBALT_TOOL, () -> Ingredient.of(CAAItemsClass.COBALT.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "cobaltd"), List.of(Tiers.NETHERITE), List.of());



    public static final Tier PALLADIUM_DRILL = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2450, 9.8F, 3.55F, 15,
                    CAATag.Blocks.NEEDS_PALLADIUM_TOOL, () -> Ingredient.of(CAAItemsClass.PALLADIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "palladiumd"), List.of(CAAToolTiers.COBALT), List.of());



    public static final Tier ENDERIUM_DRILL = TierSortingRegistry.registerTier(
            new ForgeTier(7, 2523, 10F, 3.6F, 15,
                    CAATag.Blocks.NEEDS_ENDERIUM_TOOL, () -> Ingredient.of(CAAItemsClass.ENDERIUM.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "enderiumd"), List.of(CAAToolTiers.PALLADIUM), List.of());


     */

}