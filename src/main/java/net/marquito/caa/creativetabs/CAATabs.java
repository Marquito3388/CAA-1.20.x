package net.marquito.caa.creativetabs;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.item.CAAItemsClass;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CAATabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaosAndAbyss.MODID);



    public static final RegistryObject<CreativeModeTab> MATERIALS_TAB = CREATIVE_MODE_TABS.register("caamtrl_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.PALLADIUM.get()))
                    .title(Component.translatable("creativetab.caamtrl_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(CAAItemsClass.DARK_MATTER.get());

                       // pOutput.accept(CAAItemsClass.SHADOW_SCALE.get());
                      //  pOutput.accept(CAAItemsClass.TISSUE_SAMPLE.get());
                        pOutput.accept(CAAItemsClass.RAW_VANADIUM.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.VANADIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_COBALT.get());
                        pOutput.accept(CAAItemsClass.COBALT_CHUNK.get());
                        pOutput.accept(CAAItemsClass.COBALT.get());

                        pOutput.accept(CAAItemsClass.RAW_PALLADIUM.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_NETHERIUM.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM.get());



                        /*
                        pOutput.accept(CAAItemsClass.ZANITE_GEMSTONE.get());
                        pOutput.accept(CAABlocksClass.ENCHANTED_GRAVITITE.get());
                        pOutput.accept(CAAItemsClass.CRIMTANE_ORE.get());
                        pOutput.accept(CAAItemsClass.DEMONITE_ORE.get());

                        pOutput.accept(CAAItemsClass.CRIMTANE_BAR.get());
                        pOutput.accept(CAAItemsClass.DEMONITE_BAR.get());

                         */




                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB = CREATIVE_MODE_TABS.register("caaweapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.NETHERIUM_SWORD.get()))
                    .title(Component.translatable("creativetab.caaweapons_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CAAItemsClass.VANADIUM_SWORD.get());
                        pOutput.accept(CAAItemsClass.COBALT_SWORD.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SWORD.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_SWORD.get());

                        pOutput.accept(CAAItemsClass.VANADIUM_SPEAR.get());
                        pOutput.accept(CAAItemsClass.COBALT_SPEAR.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SPEAR.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_SPEAR.get());

                        pOutput.accept(CAAItemsClass.VANADIUM_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.COBALT_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_BATTLEAXE.get());

                        pOutput.accept(CAAItemsClass.VANADIUM_DAGGER.get());
                        pOutput.accept(CAAItemsClass.COBALT_DAGGER.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_DAGGER.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_DAGGER.get());


                        pOutput.accept(CAAItemsClass.COBALT_BOW.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_BOW.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_BOW.get());


                        pOutput.accept(CAAItemsClass.FLAME_SPEAR.get());
                        pOutput.accept(CAAItemsClass.WATER_SPEAR.get());
                        pOutput.accept(CAAItemsClass.THUNDER_SPEAR.get());

                        pOutput.accept(CAAItemsClass.ARKHALIS.get());

                        /*
                        pOutput.accept(CAAItemsClass.ZANITE_SWORD.get());
                        pOutput.accept(CAAItemsClass.GRAVITITE_SWORD.get());

                        pOutput.accept(CAAItemsClass.LIGHTS_BANE.get());
                        pOutput.accept(CAAItemsClass.BLOOD_BUTCHERER.get());

                         */




                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("caatools_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.COBALT_PICKAXE.get()))
                    .title(Component.translatable("creativetab.caatools_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CAAItemsClass.VANADIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.COBALT_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.COBALT_AXE.get());
                        pOutput.accept(CAAItemsClass.COBALT_HOE.get());
                        pOutput.accept(CAAItemsClass.COBALT_SHOVEL.get());
                        pOutput.accept(CAAItemsClass.COBALT_DRILL.get());

                        pOutput.accept(CAAItemsClass.PALLADIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SHOVEL.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_DRILL.get());

                        pOutput.accept(CAAItemsClass.NETHERIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_SHOVEL.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_DRILL.get());

                        /*
                        pOutput.accept(CAAItemsClass.DEMONITE_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.DEMONITE_AXE.get());

                        pOutput.accept(CAAItemsClass.CRIMTANE_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.CRIMTANE_AXE.get());

                        pOutput.accept(CAAItemsClass.ZANITE_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.ZANITE_AXE.get());
                        pOutput.accept(CAAItemsClass.ZANITE_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.GRAVITITE_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.GRAVITITE_AXE.get());
                        pOutput.accept(CAAItemsClass.GRAVITITE_SHOVEL.get());

                         */



                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("caablocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAABlocksClass.NETHERIUM_ORE.get()))
                    .title(Component.translatable("creativetab.caablocks_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CAABlocksClass.VANADIUM_ORE.get());
                        pOutput.accept(CAABlocksClass.COBALT_ORE.get());
                        pOutput.accept(CAABlocksClass.PALLADIUM_ORE.get());
                        pOutput.accept(CAABlocksClass.NETHERIUM_ORE.get());

                        pOutput.accept(CAABlocksClass.VANADIUM_BLOCK.get());
                        pOutput.accept(CAABlocksClass.COBALT_BLOCK.get());
                        pOutput.accept(CAABlocksClass.PALLADIUM_BLOCK.get());
                        pOutput.accept(CAABlocksClass.NETHERIUM_BLOCK.get());

                        pOutput.accept(CAABlocksClass.VANADIUM_BRICK.get());
                        pOutput.accept(CAABlocksClass.COBALT_BRICK.get());
                        pOutput.accept(CAABlocksClass.PALLADIUM_BRICK.get());
                        pOutput.accept(CAABlocksClass.NETHERIUM_BRICK.get());

                        pOutput.accept(CAABlocksClass.BLUE_LAMP.get());
                        pOutput.accept(CAABlocksClass.BLACK_LAMP.get());
                        pOutput.accept(CAABlocksClass.LIGHT_BLUE_LAMP.get());
                        pOutput.accept(CAABlocksClass.GREY_LAMP.get());
                        pOutput.accept(CAABlocksClass.RED_LAMP.get());
                        pOutput.accept(CAABlocksClass.YELLOW_LAMP.get());
                        pOutput.accept(CAABlocksClass.ORANGE_LAMP.get());
                        pOutput.accept(CAABlocksClass.BROWN_LAMP.get());
                        pOutput.accept(CAABlocksClass.CYAN_LAMP.get());
                        pOutput.accept(CAABlocksClass.GREEN_LAMP.get());
                        pOutput.accept(CAABlocksClass.MAGENTA_LAMP.get());
                        pOutput.accept(CAABlocksClass.PINK_LAMP.get());
                        pOutput.accept(CAABlocksClass.PURPLE_LAMP.get());
                        pOutput.accept(CAABlocksClass.LIME_LAMP.get());
                        pOutput.accept(CAABlocksClass.LIGHT_GREY_LAMP.get());






                    }).withSearchBar().withLabelColor(2)
                    .build());


    public static final RegistryObject<CreativeModeTab> ARMORS_TAB = CREATIVE_MODE_TABS.register("caaarmor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.COBALT_HELMET.get()))
                    .title(Component.translatable("creativetab.caaarmor_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CAAItemsClass.COBALT_HELMET.get());
                        pOutput.accept(CAAItemsClass.COBALT_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.COBALT_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.COBALT_BOOTS.get());

                        pOutput.accept(CAAItemsClass.PALLADIUM_HELMET.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_BOOTS.get());

                        pOutput.accept(CAAItemsClass.NETHERIUM_HELMET.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.NETHERIUM_BOOTS.get());



                    })
                    .withSearchBar().build());









    public static void register (IEventBus eventBus){

        CREATIVE_MODE_TABS.register(eventBus);
    }


}
