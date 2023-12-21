package net.marquito.caa.item;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.mcm.item.MCMArmorMaterials;
import net.marquito.mcm.item.MCMToolTiers;
import net.minecraft.client.model.TridentModel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CAAItemsClass {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChaosAndAbyss.MODID);




    //Materials

    public static final RegistryObject<Item> BASILISK_SCALE = ITEMS.register("basilisk_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_BRICK = ITEMS.register("dark_brick",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> SHADOW_SCALE = ITEMS.register("shadow_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TISSUE_SAMPLE = ITEMS.register("tissue_sample",
            () -> new Item(new Item.Properties()));




    //------------------------------------------------------------------------------------------------------------------

    //Ores


        //RAW ================
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_NETHERIUM = ITEMS.register("raw_netherium",
            () -> new Item(new Item.Properties()));


        //CHUNK ================
    public static final RegistryObject<Item> VANADIUM_CHUNK = ITEMS.register("vanadium_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT_CHUNK = ITEMS.register("cobalt_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_CHUNK = ITEMS.register("palladium_chunk",
            () -> new Item(new Item.Properties()));

     public static final RegistryObject<Item> NETHERIUM_CHUNK = ITEMS.register("netherium_chunk",
            () -> new Item(new Item.Properties()));


        //INGOT ================
    public static final RegistryObject<Item> VANADIUM = ITEMS.register("vanadium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM = ITEMS.register("cobalt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COBALT = ITEMS.register("palladium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERIUM = ITEMS.register("netherium",
            () -> new Item(new Item.Properties()));


    // EXTRA ORES =================================================================

    /*
    public static final RegistryObject<Item> CRIMTANE_ORE = ITEMS.register("crimtane_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMONITE_ORE = ITEMS.register("demonite_ore",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CRIMTANE_BAR = ITEMS.register("crimtane_bar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMONITE_BAR = ITEMS.register("demonite_bar",
            () -> new Item(new Item.Properties()));

     */


    // EXTRA TOOLS==================================================================


    public static final RegistryObject<Item> ARKHALIS = ITEMS.register("arkhalis",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 3, 1F, new  Item.Properties()));

    /*


    public static final RegistryObject<Item> LIGHTS_BANE = ITEMS.register("lights_bane",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 3, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> BLOOD_BUTCHERER = ITEMS.register("blood_butcherer",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 3, -2.3F, new  Item.Properties()));






    public static final RegistryObject<Item> CRIMTANE_AXE = ITEMS.register("crimtane_axe",
            () -> new AxeItem(CAAToolTiers.VANADIUM,  4, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> DEMONITE_AXE = ITEMS.register("demonite_axe",
            () -> new AxeItem(CAAToolTiers.VANADIUM, 3, -2.3f, new  Item.Properties()));
 () -> new AxeItem(CAAToolTiers.VANADIUM, 3, -2.3F, new  Item.Properties()));




    public static final RegistryObject<Item> CRIMTANE_PICKAXE = ITEMS.register("crimtane_pickaxe",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  4, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> DEMONITE_PICKAXE = ITEMS.register("demonite_pickaxe",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 3, -2.3f, new  Item.Properties()));



    */



    public static final RegistryObject<Item> VANADIUM_SPEAR = ITEMS.register("vanadium_spear",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -2.3F, new  Item.Properties()));

    public static final RegistryObject<Item> COBALT_SPEAR = ITEMS.register("cobalt_spear",
            () -> new SwordItem(CAAToolTiers.COBALT, 2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_SPEAR = ITEMS.register("palladium_spear",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> NETHERIUM_SPEAR = ITEMS.register("netherium_spear",
            () -> new SwordItem(CAAToolTiers.NETHERIUM, 2, -2.8F, new  Item.Properties()));



    public static final RegistryObject<Item> VANADIUM_BATTLEAXE = ITEMS.register("vanadium_ba",
            () -> new SwordItem(CAAToolTiers.VANADIUM, 6, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> COBALT_BATTLEAXE = ITEMS.register("cobalt_ba",
            () -> new SwordItem(CAAToolTiers.COBALT, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> PALLADIUM_BATTLEAXE = ITEMS.register("palladium_ba",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 5, -3.1F, new  Item.Properties()));

    public static final RegistryObject<Item> NETHERIUM_BATTLEAXE = ITEMS.register("netherium_ba",
            () -> new SwordItem(CAAToolTiers.NETHERIUM, 5, -3.1F, new  Item.Properties()));




    public static final RegistryObject<Item> VANADIUM_SWORD = ITEMS.register("vanadium_sword",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  4, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new SwordItem(CAAToolTiers.COBALT, 3, -2.3f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_SWORD = ITEMS.register("palladium_sword",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 3, -2.3F, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_SWORD = ITEMS.register("netherium_sword",
            () -> new SwordItem(CAAToolTiers.NETHERIUM, 3, -2.3F, new  Item.Properties()));





    public static final RegistryObject<Item> VANADIUM_DAGGER = ITEMS.register("vanadium_dagger",
            () -> new SwordItem(CAAToolTiers.VANADIUM,  3, -1.9F, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_DAGGER = ITEMS.register("cobalt_dagger",
            () -> new SwordItem(CAAToolTiers.COBALT, 2, -1.9F, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_DAGGER = ITEMS.register("palladium_dagger",
            () -> new SwordItem(CAAToolTiers.PALLADIUM, 2, -1.9F, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_DAGGER = ITEMS.register("netherium_dagger",
            () -> new SwordItem(CAAToolTiers.NETHERIUM, 2, -1.9F, new  Item.Properties()));



    public static final RegistryObject<Item> COBALT_BOW = ITEMS.register("cobalt_bow",
            () -> new BowItem(new Item.Properties().durability(600)));


    public static final RegistryObject<Item> PALLADIUM_BOW = ITEMS.register("palladium_bow",
            () -> new BowItem(new Item.Properties().durability(680)));


    public static final RegistryObject<Item> NETHERIUM_BOW = ITEMS.register("netherium_bow",
            () -> new BowItem(new Item.Properties().durability(730)));












    // TOOLS==================================================================




    // PICKAXE---------------------------

    public static final RegistryObject<Item> VANADIUM_PICKAXE = ITEMS.register("vanadium_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8f, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(CAAToolTiers.COBALT, 1, -2.75f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_PICKAXE = ITEMS.register("palladium_pickaxe",
            () -> new PickaxeItem(CAAToolTiers.PALLADIUM, 1, -2.75f, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_PICKAXE = ITEMS.register("netherium_pickaxe",
            () -> new PickaxeItem(CAAToolTiers.NETHERIUM, 1, -2.75f, new  Item.Properties()));




    //AXE-------------------------

    public static final RegistryObject<Item> VANADIUM_AXE = ITEMS.register("vanadium_axe",
            () -> new AxeItem(Tiers.DIAMOND,  5.2F, -3f, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe",
            () -> new AxeItem(CAAToolTiers.COBALT,  4.9F, -2.85f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_AXE = ITEMS.register("palladium_axe",
            () -> new AxeItem(CAAToolTiers.PALLADIUM, 4.8F, -2.85F, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_AXE = ITEMS.register("netherium_axe",
            () -> new AxeItem(CAAToolTiers.NETHERIUM, 4.7F, -2.8f, new  Item.Properties()));




    //HOE-------------------------------

    public static final RegistryObject<Item> VANADIUM_HOE = ITEMS.register("vanadium_hoe",
            () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0f, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0.05f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_HOE = ITEMS.register("palladium_hoe",
            () -> new HoeItem(CAAToolTiers.CAA_HOE, 1, 0.1f, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_HOE = ITEMS.register("netherium_hoe",
            () -> new HoeItem(CAAToolTiers.CAA_HOE,  1, 0.15f, new  Item.Properties()));




    //SHOVEL-----------------------------------

    public static final RegistryObject<Item> VANADIUM_SHOVEL = ITEMS.register("vanadium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 5.2F, -3f, new  Item.Properties()));


    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL,   6.1F, -3f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_SHOVEL = ITEMS.register("palladium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL, 6.3F, -2.95f, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_SHOVEL = ITEMS.register("netherium_shovel",
            () -> new ShovelItem(CAAToolTiers.CAA_SHOVEL,6.5F, -2.85f, new  Item.Properties()));




    //DRILL-------------------------------------------

    public static final RegistryObject<Item> COBALT_DRILL = ITEMS.register("cobalt_drill",
            () -> new PickaxeItem(CAAToolTiers.COBALT, -1, -1.5f, new  Item.Properties()));


    public static final RegistryObject<Item> PALLADIUM_DRILL = ITEMS.register("palladium_drill",
            () -> new PickaxeItem(CAAToolTiers.PALLADIUM, 0, -1.5f, new  Item.Properties()));


    public static final RegistryObject<Item> NETHERIUM_DRILL = ITEMS.register("netherium_drill",
            () -> new PickaxeItem(CAAToolTiers.NETHERIUM, 0, -1.2f, new  Item.Properties()));



    //ARMOR=====================================================

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



    public static final RegistryObject<Item> NETHERIUM_HELMET = ITEMS.register("netherium_helmet",
            () -> new ArmorItem(CAAArmorMaterial.NETHERIUM, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> NETHERIUM_CHESTPLATE = ITEMS.register("netherium_chestplate",
            () -> new ArmorItem(CAAArmorMaterial.NETHERIUM, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> NETHERIUM_LEGGINGS = ITEMS.register("netherium_leggings",
            () -> new ArmorItem(CAAArmorMaterial.NETHERIUM, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> NETHERIUM_BOOTS = ITEMS.register("netherium_boots",
            () -> new ArmorItem(CAAArmorMaterial.NETHERIUM, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }


}
