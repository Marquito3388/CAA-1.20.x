package net.marquito.caa.item;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.item.custom.DrillItem;
import net.marquito.caa.item.custom.FuelItem;
import net.minecraft.client.gui.screens.inventory.FurnaceScreen;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.util.datafix.fixes.FurnaceRecipeFix;
import net.minecraft.world.inventory.FurnaceFuelSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.item.crafting.SmithingTrimRecipe;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CAAItemsClass {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChaosAndAbyss.MODID);







    //Materials

    /*

    public static final RegistryObject<Item> DARK_MATTER = ITEMS.register("dark_matter",
            () -> new Item(new Item.Properties().stacksTo(1)));

    //DARK MATTER CLASS IS UNDER OtherFiles > ExtraClasses
     */

    //public static final RegistryObject<Item> MAGIC_LEATHER = ITEMS.register("magic_leather",
    //        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_ROD = ITEMS.register("netherite_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_ROD = ITEMS.register("vanadium_rod",
            () -> new Item(new Item.Properties()));


/*
    public static final RegistryObject<Item> WARDENS_BONE = ITEMS.register("wardens_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WARDENS_HORN = ITEMS.register("wardens_horn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WARDENS_WILL = ITEMS.register("wardens_will",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> GUARDIANS_SKIN = ITEMS.register("guardians_skin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUARDIANS_EYE = ITEMS.register("guardians_eye",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUARDIANS_WILL = ITEMS.register("guardians_will",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> WITHERS_BONE = ITEMS.register("withers_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WITHERS_WILL = ITEMS.register("withers_will",
            () -> new Item(new Item.Properties()));

    */


    //------------------------------------------------------------------------------------------------------------------

    //Ores


        //RAW ================



    public static final RegistryObject<Item> RAW_GALLIUM = ITEMS.register("raw_gallium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ADAMANTINA = ITEMS.register("raw_adamantina",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ENDERIUM = ITEMS.register("raw_enderium",
            () -> new Item(new Item.Properties()));


        //CHUNK ================


    public static final RegistryObject<Item> GALLIUM_CHUNK = ITEMS.register("gallium_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTINA_CHUNK = ITEMS.register("adamantina_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_CHUNK = ITEMS.register("iridium_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_CHUNK = ITEMS.register("vanadium_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_CHUNK = ITEMS.register("cobalt_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_CHUNK = ITEMS.register("palladium_chunk",
            () -> new Item(new Item.Properties()));

     public static final RegistryObject<Item> ENDERIUM_CHUNK = ITEMS.register("enderium_chunk",
            () -> new Item(new Item.Properties()));


        //INGOT ================


    public static final RegistryObject<Item> GALLIUM = ITEMS.register("gallium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTINA = ITEMS.register("adamantina",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM = ITEMS.register("iridium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VANADIUM = ITEMS.register("vanadium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM = ITEMS.register("palladium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT = ITEMS.register("cobalt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM = ITEMS.register("enderium",
            () -> new Item(new Item.Properties()));



    //CRYSTALS =================

    public static final RegistryObject<Item> VIOLITE_STONE = ITEMS.register("violite_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_MINERAL = ITEMS.register("ruby_mineral",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_MINERAL = ITEMS.register("sapphire_mineral",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHER_STONE = ITEMS.register("nether_stone",
            () -> new FuelItem(new Item.Properties(), 1800));

    public static final RegistryObject<Item> END_STONE = ITEMS.register("end_stone",
            () -> new FuelItem(new Item.Properties(), 2200));


    // EXTRA ORES =================================================================



    // EXTRA TOOLS==================================================================


    public static final RegistryObject<Item> FLAME_SPEAR = ITEMS.register("flame_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  5, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> WATER_SPEAR = ITEMS.register("water_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 5, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> THUNDER_SPEAR = ITEMS.register("thunder_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 5, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> SKULK_BLADE = ITEMS.register("skulk_blade",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -0.6F, new  Item.Properties()));
    //damagew value is 4

    public static final RegistryObject<Item> THE_BUTCHER = ITEMS.register("the_butcher",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 6, -2.9F, new  Item.Properties()));

    public static final RegistryObject<Item> FOREST_BOW = ITEMS.register("forest_bow",
            () -> new BowItem(new Item.Properties().durability(730)));


    public static final RegistryObject<Item> FROST_GLAIVE = ITEMS.register("frost_glaive",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -0.4F, new  Item.Properties()));
    //damagew value is 4

    public static final RegistryObject<Item> BONE_DAGGER = ITEMS.register("bone_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 3, 0F, new  Item.Properties()));

    //=======================================================


    public static final RegistryObject<Item> OLD_SWORD = ITEMS.register("old_sword",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -2.1F, new  Item.Properties().durability(20)));

    public static final RegistryObject<Item> OLD_SPEAR = ITEMS.register("old_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -2.5F, new  Item.Properties().durability(20)));

    public static final RegistryObject<Item> OLD_GLAIVE = ITEMS.register("old_glaive",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -1.7F, new  Item.Properties().durability(20)));

    public static final RegistryObject<Item> OLD_DAGGER = ITEMS.register("old_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 1, -1.4F, new  Item.Properties().durability(20)));

    public static final RegistryObject<Item> OLD_BA = ITEMS.register("old_ba",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 8, -2.8F, new  Item.Properties().durability(20)));

    public static final RegistryObject<Item> OLD_SHIELD = ITEMS.register("old_shield",
            () -> new ShieldItem(new  Item.Properties().durability(20)));


    public static final RegistryObject<Item> OLD_BOW = ITEMS.register("old_bow",
            () -> new BowItem(new Item.Properties().durability(20)));


    public static final RegistryObject<Item> ADAMANTINA_SPEAR = ITEMS.register("adamantina_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_SPEAR = ITEMS.register("iridium_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_SPEAR = ITEMS.register("vanadium_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_SPEAR = ITEMS.register("violite_stone_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> COBALT_SPEAR = ITEMS.register("cobalt_spear",
            () -> new SwordItem(CAAToolTiers.COBALT, 2, -2.75F, new  Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_SPEAR = ITEMS.register("palladium_spear",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 2, -2.75F, new  Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_SPEAR = ITEMS.register("enderium_spear",
            () -> new SwordItem(CAAToolTiers.ENDERIUM, 2, -2.7F, new  Item.Properties()));





    public static final RegistryObject<Item> ADAMANTINA_BATTLEAXE = ITEMS.register("adamantina_ba",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_BATTLEAXE = ITEMS.register("iridium_ba",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_BATTLEAXE = ITEMS.register("vanadium_ba",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_BATTLEAXE = ITEMS.register("violite_stone_ba",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 6, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> COBALT_BATTLEAXE = ITEMS.register("cobalt_ba",
            () -> new SwordItem(CAAToolTiers.COBALT, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_BATTLEAXE = ITEMS.register("palladium_ba",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_BATTLEAXE = ITEMS.register("enderium_ba",
            () -> new SwordItem(CAAToolTiers.ENDERIUM, 5, -3.1F, new  Item.Properties()));


    public static final RegistryObject<Item> ADAMANTINA_SWORD = ITEMS.register("adamantina_sword",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_SWORD = ITEMS.register("iridium_sword",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_SWORD = ITEMS.register("violite_stone_sword",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  4, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> VANADIUM_SWORD = ITEMS.register("vanadium_sword",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(CAAToolTiers.COBALT, 3, -2.3f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_SWORD = ITEMS.register("palladium_sword",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 3, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> ENDERIUM_SWORD = ITEMS.register("enderium_sword",
            () -> new SwordItem(CAAToolTiers.ENDERIUM, 3, -2.3F, new  Item.Properties()));


    //GLAIVES


    public static final RegistryObject<Item> ADAMANTINA_GLAIVE = ITEMS.register("adamantina_glaive",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_GLAIVE = ITEMS.register("iridium_glaive",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_GLAIVE = ITEMS.register("violite_stone_glaive",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  4, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> VANADIUM_GLAIVE = ITEMS.register("vanadium_glaive",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_GLAIVE = ITEMS.register("cobalt_glaive",
            () -> new SwordItem(CAAToolTiers.COBALT, 3, -2.3f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_GLAIVE = ITEMS.register("palladium_glaive",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 3, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> ENDERIUM_GLAIVE = ITEMS.register("enderium_glaive",
            () -> new SwordItem(CAAToolTiers.ENDERIUM, 3, -2.3F, new  Item.Properties()));



    public static final RegistryObject<Item> ADAMANTINA_SYTHE = ITEMS.register("adamantina_sythe",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_SYTHE = ITEMS.register("iridium_sythe",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_SYTHE = ITEMS.register("vanadium_sythe",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 4, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_SYTHE = ITEMS.register("violite_stone_sythe",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 5, -3.1F, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_SYTHE = ITEMS.register("cobalt_sythe",
            () -> new SwordItem(CAAToolTiers.COBALT, 4, -3.1F, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_SYTHE = ITEMS.register("palladium_sythe",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 4, -3.1F, new  Item.Properties()));


    public static final RegistryObject<Item> ENDERIUM_SYTHE = ITEMS.register("enderium_sythe",
            () -> new SwordItem(CAAToolTiers.ENDERIUM, 4, -3.1F, new  Item.Properties()));



    public static final RegistryObject<Item> ADAMANTINA_DAGGER = ITEMS.register("adamantina_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  1, -1.9F, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_DAGGER = ITEMS.register("iridium_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  1, -1.9F, new  Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_DAGGER = ITEMS.register("vanadium_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  1, -1.9F, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_DAGGER = ITEMS.register("violite_stone_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  1, -1.9F, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_DAGGER = ITEMS.register("cobalt_dagger",
            () -> new SwordItem(CAAToolTiers.COBALT, 1, -1.9F, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_DAGGER = ITEMS.register("palladium_dagger",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 1, -1.9F, new  Item.Properties()));


    public static final RegistryObject<Item> ENDERIUM_DAGGER = ITEMS.register("enderium_dagger",
            () -> new SwordItem(CAAToolTiers.ENDERIUM, 1, -1.9F, new  Item.Properties()));



    public static final RegistryObject<Item> COBALT_BOW = ITEMS.register("cobalt_bow",
            () -> new BowItem(new Item.Properties().durability(590)));


    public static final RegistryObject<Item> PALLADIUM_BOW = ITEMS.register("palladium_bow",
            () -> new BowItem(new Item.Properties().durability(650)));


    public static final RegistryObject<Item> ENDERIUM_BOW = ITEMS.register("enderium_bow",
            () -> new BowItem(new Item.Properties().durability(730)));


    public static final RegistryObject<Item> ADAMANTINA_SHIELD = ITEMS.register("adamantina_shield",
            () -> new ShieldItem(new Item.Properties().durability(370)));

    public static final RegistryObject<Item> IRIDIUM_SHIELD = ITEMS.register("iridium_shield",
            () -> new ShieldItem(new Item.Properties().durability(370)));

    public static final RegistryObject<Item> VANADIUM_SHIELD = ITEMS.register("vanadium_shield",
            () -> new ShieldItem(new Item.Properties().durability(370)));


    public static final RegistryObject<Item> VIOLITE_STONE_SHIELD = ITEMS.register("violite_stone_shield",
            () -> new ShieldItem(new Item.Properties().durability(470)));


    public static final RegistryObject<Item> COBALT_SHIELD = ITEMS.register("cobalt_shield",
            () -> new ShieldItem(new Item.Properties().durability(550)));


    public static final RegistryObject<Item> PALLADIUM_SHIELD = ITEMS.register("palladium_shield",
            () -> new ShieldItem(new Item.Properties().durability(600)));


    public static final RegistryObject<Item> ENDERIUM_SHIELD = ITEMS.register("enderium_shield",
            () -> new ShieldItem(new Item.Properties().durability(650)));



    // TOOLS==================================================================




    // PICKAXE---------------------------

        public static final RegistryObject<Item> ADAMANTINA_PICKAXE = ITEMS.register("adamantina_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.VANADIUM, 1, -2.8f, new  Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register("iridium_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.VANADIUM, 1, -2.8f, new  Item.Properties()));

        public static final RegistryObject<Item> VANADIUM_PICKAXE = ITEMS.register("vanadium_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.VANADIUM, 1, -2.8f, new  Item.Properties()));

        public static final RegistryObject<Item> VIOLITE_STONE_PICKAXE = ITEMS.register("violite_stone_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.VANADIUM, 1, -2.5f, new  Item.Properties()));


        public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.COBALT, 1, -2.74f, new  Item.Properties()));


        public static final RegistryObject<Item> PALLADIUM_PICKAXE = ITEMS.register("palladium_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.PALLADIUM, 1, -2.72f, new  Item.Properties()));


        public static final RegistryObject<Item> ENDERIUM_PICKAXE = ITEMS.register("enderium_pickaxe",
                () -> new PickaxeItem(CAAToolTiers.ENDERIUM, 1, -2.70f, new  Item.Properties()));




        //AXE-------------------------

    /*
        public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
                () -> new AxeItem(Tiers.DIAMOND,  4.6F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
                () -> new AxeItem(Tiers.DIAMOND,  4.6F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
                () -> new AxeItem(Tiers.DIAMOND,  4.6F, -3f, new  Item.Properties()));

     */




        public static final RegistryObject<Item> ADAMANTINA_AXE = ITEMS.register("adamantina_axe",
                () -> new AxeItem(Tiers.DIAMOND,  5.2F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register("iridium_axe",
                () -> new AxeItem(Tiers.DIAMOND,  5.2F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> VANADIUM_AXE = ITEMS.register("vanadium_axe",
                () -> new AxeItem(Tiers.DIAMOND,  5.2F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> VIOLITE_STONE_AXE = ITEMS.register("violite_stone_axe",
                () -> new AxeItem(Tiers.DIAMOND,  5.6F, -2.9f, new  Item.Properties()));


        public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe",
                () -> new AxeItem(CAAToolTiers.COBALT,  4.9F, -2.85f, new  Item.Properties()));


        public static final RegistryObject<Item> PALLADIUM_AXE = ITEMS.register("palladium_axe",
                () -> new AxeItem(CAAToolTiers.PALLADIUM, 4.8F, -2.85F, new  Item.Properties()));


        public static final RegistryObject<Item> ENDERIUM_AXE = ITEMS.register("enderium_axe",
                () -> new AxeItem(CAAToolTiers.ENDERIUM, 4.7F, -2.8f, new  Item.Properties()));




        //HOE-------------------------------

    /*
        public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
                () -> new HoeItem(Tiers.DIAMOND , -3, 0f, new  Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
                () -> new HoeItem(Tiers.DIAMOND , -3, 0f, new  Item.Properties()));

        public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
                () -> new HoeItem(Tiers.DIAMOND , -3, 0f, new  Item.Properties()));

     */


        public static final RegistryObject<Item> ADAMANTINA_HOE = ITEMS.register("adamantina_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0f, new  Item.Properties()));

        public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register("iridium_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0f, new  Item.Properties()));

        public static final RegistryObject<Item> VANADIUM_HOE = ITEMS.register("vanadium_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0f, new  Item.Properties()));

        public static final RegistryObject<Item> VIOLITE_STONE_HOE = ITEMS.register("violite_stone_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0f, new  Item.Properties()));


        public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0.05f, new  Item.Properties()));


        public static final RegistryObject<Item> PALLADIUM_HOE = ITEMS.register("palladium_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0.1f, new  Item.Properties()));


        public static final RegistryObject<Item> ENDERIUM_HOE = ITEMS.register("enderium_hoe",
                () -> new HoeItem(CAAToolTiers.CAA_HOE,  1, 0.15f, new  Item.Properties()));




        //SHOVEL-----------------------------------

        /*
        public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
                () -> new ShovelItem(Tiers.DIAMOND, 5.2F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
                () -> new ShovelItem(Tiers.DIAMOND, 5.2F, -3f, new  Item.Properties()));

        public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
                () -> new ShovelItem(Tiers.DIAMOND, 5.2F, -3f, new  Item.Properties()));
        */

    public static final RegistryObject<Item> ADAMANTINA_SHOVEL = ITEMS.register("adamantina_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 1.3F, -3f, new  Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_SHOVEL = ITEMS.register("iridium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 1.3F, -3f, new  Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_SHOVEL = ITEMS.register("vanadium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 1.3F, -3f, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_SHOVEL = ITEMS.register("violite_stone_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 1.3F, -3f, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL,   6.1F, -3f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_SHOVEL = ITEMS.register("palladium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 6.3F, -2.95f, new  Item.Properties()));


    public static final RegistryObject<Item> ENDERIUM_SHOVEL = ITEMS.register("enderium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL,6.5F, -2.85f, new  Item.Properties()));




    //DRILL-------------------------------------------

    public static final RegistryObject<Item> DRILL = ITEMS.register("drill",
            () -> new DrillItem(CAAToolTiers.DRILL_IRON, 0, -2.1f, new  Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_DRILL = ITEMS.register("violite_stone_drill",
            () -> new DrillItem(CAAToolTiers.DRILL_VIOLITE_STONE, -1, -2.1f, new  Item.Properties()));

    public static final RegistryObject<Item> COBALT_DRILL = ITEMS.register("cobalt_drill",
            () -> new DrillItem(CAAToolTiers.DRILL_COBALT, -1, -2.1f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_DRILL = ITEMS.register("palladium_drill",
            () -> new DrillItem(CAAToolTiers.DRILL_PALLADIUM, 0, -2.1f, new  Item.Properties()));


    public static final RegistryObject<Item> ENDERIUM_DRILL = ITEMS.register("enderium_drill",
            () -> new DrillItem(CAAToolTiers.DRILL_ENDERIUM, 0, -2.1f, new  Item.Properties()));



    //ARMOR=====================================================



    public static final RegistryObject<Item> ADAMANTINA_HELMET = ITEMS.register("adamantina_helmet",
            () -> new ArmorItem(CAAArmorMaterial.ADAMANTINA, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTINA_CHESTPLATE = ITEMS.register("adamantina_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.ADAMANTINA, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTINA_LEGGINGS = ITEMS.register("adamantina_leggings",
            () -> new ArmorItem(CAAArmorMaterial.ADAMANTINA, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> ADAMANTINA_BOOTS = ITEMS.register("adamantina_boots",
            () -> new ArmorItem(CAAArmorMaterial.ADAMANTINA, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> IRIDIUM_HELMET = ITEMS.register("iridium_helmet",
            () -> new ArmorItem(CAAArmorMaterial.IRIDIUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_CHESTPLATE = ITEMS.register("iridium_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.IRIDIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_LEGGINGS = ITEMS.register("iridium_leggings",
            () -> new ArmorItem(CAAArmorMaterial.IRIDIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> IRIDIUM_BOOTS = ITEMS.register("iridium_boots",
            () -> new ArmorItem(CAAArmorMaterial.IRIDIUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));




    public static final RegistryObject<Item> VANADIUM_HELMET = ITEMS.register("vanadium_helmet",
            () -> new ArmorItem(CAAArmorMaterial.VANADIUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_CHESTPLATE = ITEMS.register("vanadium_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.VANADIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_LEGGINGS = ITEMS.register("vanadium_leggings",
            () -> new ArmorItem(CAAArmorMaterial.VANADIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> VANADIUM_BOOTS = ITEMS.register("vanadium_boots",
            () -> new ArmorItem(CAAArmorMaterial.VANADIUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));




    public static final RegistryObject<Item> VIOLITE_STONE_HELMET = ITEMS.register("violite_stone_helmet",
            () -> new ArmorItem(CAAArmorMaterial.VIOLITE_STONE, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_CHESTPLATE = ITEMS.register("violite_stone_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.VIOLITE_STONE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_LEGGINGS = ITEMS.register("violite_stone_leggings",
            () -> new ArmorItem(CAAArmorMaterial.VIOLITE_STONE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> VIOLITE_STONE_BOOTS = ITEMS.register("violite_stone_boots",
            () -> new ArmorItem(CAAArmorMaterial.VIOLITE_STONE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

/*

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(CAAArmorMaterial.RUBY, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(CAAArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(CAAArmorMaterial.RUBY, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(CAAArmorMaterial.SAPPHIRE, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.SAPPHIRE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(CAAArmorMaterial.SAPPHIRE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(CAAArmorMaterial.SAPPHIRE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(CAAArmorMaterial.EMERALD, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(CAAArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(CAAArmorMaterial.EMERALD, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

*/




    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet",
            () -> new ArmorItem(CAAArmorMaterial.COBALT, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.COBALT, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings",
            () -> new ArmorItem(CAAArmorMaterial.COBALT, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots",
            () -> new ArmorItem(CAAArmorMaterial.COBALT, ArmorItem.Type.BOOTS,
                    new Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_HELMET = ITEMS.register("palladium_helmet",
            () -> new ArmorItem(CAAArmorMaterial.PALLADIUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_CHESTPLATE = ITEMS.register("palladium_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.PALLADIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_LEGGINGS = ITEMS.register("palladium_leggings",
            () -> new ArmorItem(CAAArmorMaterial.PALLADIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_BOOTS = ITEMS.register("palladium_boots",
            () -> new ArmorItem(CAAArmorMaterial.PALLADIUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> ENDERIUM_HELMET = ITEMS.register("enderium_helmet",
            () -> new ArmorItem(CAAArmorMaterial.ENDERIUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_CHESTPLATE = ITEMS.register("enderium_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.ENDERIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_LEGGINGS = ITEMS.register("enderium_leggings",
            () -> new ArmorItem(CAAArmorMaterial.ENDERIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> ENDERIUM_BOOTS = ITEMS.register("enderium_boots",
            () -> new ArmorItem(CAAArmorMaterial.ENDERIUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }


}
