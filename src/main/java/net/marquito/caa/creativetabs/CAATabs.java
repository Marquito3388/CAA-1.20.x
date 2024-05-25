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


                        //pOutput.accept(CAAItemsClass.DARK_MATTER.get());


                        pOutput.accept(CAAItemsClass.VANADIUM_ROD.get());
                        pOutput.accept(CAAItemsClass.NETHERITE_ROD.get());

                        /*
                        pOutput.accept(CAAItemsClass.WARDENS_HORN.get());
                        pOutput.accept(CAAItemsClass.WARDENS_BONE.get());
                        pOutput.accept(CAAItemsClass.WARDENS_WILL.get());

                        pOutput.accept(CAAItemsClass.GUARDIANS_SKIN.get());
                        pOutput.accept(CAAItemsClass.GUARDIANS_EYE.get());
                        pOutput.accept(CAAItemsClass.GUARDIANS_WILL.get());

                        pOutput.accept(CAAItemsClass.WITHERS_BONE.get());
                        pOutput.accept(CAAItemsClass.WITHERS_WILL.get());

                         */


                        pOutput.accept(CAAItemsClass.RUBY.get());
                        pOutput.accept(CAAItemsClass.SAPPHIRE.get());
                        pOutput.accept(CAAItemsClass.RUBY_MINERAL.get());
                        pOutput.accept(CAAItemsClass.SAPPHIRE_MINERAL.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE.get());
                        pOutput.accept(CAAItemsClass.NETHER_STONE.get());
                        pOutput.accept(CAAItemsClass.END_STONE.get());

                        pOutput.accept(CAAItemsClass.RAW_GALLIUM.get());
                        pOutput.accept(CAAItemsClass.GALLIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.GALLIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_ADAMANTINA.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_CHUNK.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA.get());

                        pOutput.accept(CAAItemsClass.RAW_IRIDIUM.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_VANADIUM.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.VANADIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_COBALT.get());
                        pOutput.accept(CAAItemsClass.COBALT_CHUNK.get());
                        pOutput.accept(CAAItemsClass.COBALT.get());

                        pOutput.accept(CAAItemsClass.RAW_PALLADIUM.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_ENDERIUM.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_GALLIUM.get());
                        pOutput.accept(CAAItemsClass.GALLIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.GALLIUM.get());

                        pOutput.accept(CAAItemsClass.RAW_ADAMANTINA.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_CHUNK.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA.get());

                        pOutput.accept(CAAItemsClass.RAW_IRIDIUM.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_CHUNK.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM.get());







                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB = CREATIVE_MODE_TABS.register("caaweapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.ENDERIUM_SWORD.get()))
                    .title(Component.translatable("creativetab.caaweapons_tab"))
                    .displayItems((pParameters, pOutput) -> {



                       // pOutput.accept(CAAItemsClass.GALLIUM_SWORD.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_SWORD.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_SWORD.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_SWORD.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_SWORD.get());
                        pOutput.accept(CAAItemsClass.COBALT_SWORD.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SWORD.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_SWORD.get());

                       // pOutput.accept(CAAItemsClass.GALLIUM_SPEAR.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_SPEAR.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_SPEAR.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_SPEAR.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_SPEAR.get());
                        pOutput.accept(CAAItemsClass.COBALT_SPEAR.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SPEAR.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_SPEAR.get());

                        //pOutput.accept(CAAItemsClass.GALLIUM_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.COBALT_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_BATTLEAXE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_BATTLEAXE.get());

                        //pOutput.accept(CAAItemsClass.GALLIUM_DAGGER.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_DAGGER.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_DAGGER.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_DAGGER.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_DAGGER.get());
                        pOutput.accept(CAAItemsClass.COBALT_DAGGER.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_DAGGER.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_DAGGER.get());

                       // pOutput.accept(CAAItemsClass.GALLIUM_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.COBALT_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_GLAIVE.get());

                        pOutput.accept(CAAItemsClass.COBALT_BOW.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_BOW.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_BOW.get());

                        //pOutput.accept(CAAItemsClass.GALLIUM_SHIELD.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_SHIELD.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_SHIELD.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_SHIELD.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_SHIELD.get());
                        pOutput.accept(CAAItemsClass.COBALT_SHIELD.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SHIELD.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_SHIELD.get());

                       // pOutput.accept(CAAItemsClass.GALLIUM_SYTHE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_SYTHE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_SYTHE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_SYTHE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_SYTHE.get());
                        pOutput.accept(CAAItemsClass.COBALT_SYTHE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SYTHE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_SYTHE.get());


                        pOutput.accept(CAAItemsClass.FOREST_BOW.get());
                        pOutput.accept(CAAItemsClass.FLAME_SPEAR.get());
                        pOutput.accept(CAAItemsClass.WATER_SPEAR.get());
                        pOutput.accept(CAAItemsClass.THUNDER_SPEAR.get());
                        pOutput.accept(CAAItemsClass.SKULK_BLADE.get());
                        pOutput.accept(CAAItemsClass.THE_BUTCHER.get());
                        pOutput.accept(CAAItemsClass.BONE_DAGGER.get());
                        pOutput.accept(CAAItemsClass.FROST_GLAIVE.get());


                        pOutput.accept(CAAItemsClass.OLD_GLAIVE.get());
                        pOutput.accept(CAAItemsClass.OLD_BOW.get());
                        pOutput.accept(CAAItemsClass.OLD_SPEAR.get());
                        pOutput.accept(CAAItemsClass.OLD_BA.get());
                        pOutput.accept(CAAItemsClass.OLD_SHIELD.get());
                        pOutput.accept(CAAItemsClass.OLD_SWORD.get());









                    })
                    .withSearchBar()
                    .build());



    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("caatools_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.COBALT_PICKAXE.get()))
                    .title(Component.translatable("creativetab.caatools_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(CAAItemsClass.DRILL.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_DRILL.get());
                        pOutput.accept(CAAItemsClass.COBALT_DRILL.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_DRILL.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_DRILL.get());

                        pOutput.accept(CAAItemsClass.ADAMANTINA_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_AXE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_HOE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.IRIDIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_AXE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_HOE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.VANADIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.COBALT_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.COBALT_AXE.get());
                        pOutput.accept(CAAItemsClass.COBALT_HOE.get());
                        pOutput.accept(CAAItemsClass.COBALT_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.PALLADIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_SHOVEL.get());

                        pOutput.accept(CAAItemsClass.ENDERIUM_PICKAXE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_AXE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_HOE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_SHOVEL.get());




                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("caablocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAABlocksClass.METAL_MANIPULATOR.get()))
                    .title(Component.translatable("creativetab.caablocks_tab"))
                    .displayItems((pParameters, pOutput) -> {




                        pOutput.accept(CAABlocksClass.METAL_MANIPULATOR.get());

                        pOutput.accept(CAABlocksClass.RUBY_ORE.get());
                        pOutput.accept(CAABlocksClass.SAPPHIRE_ORE.get());
                        pOutput.accept(CAABlocksClass.NETHER_STONE_ORE.get());
                        pOutput.accept(CAABlocksClass.END_STONE_ORE.get());
                        pOutput.accept(CAABlocksClass.ADAMANTINA_ORE.get());
                        pOutput.accept(CAABlocksClass.IRIDIUM_ORE.get());
                        pOutput.accept(CAABlocksClass.VIOLITE_STONE_ORE.get());
                        pOutput.accept(CAABlocksClass.VANADIUM_ORE.get());
                        pOutput.accept(CAABlocksClass.COBALT_ORE.get());
                        pOutput.accept(CAABlocksClass.PALLADIUM_ORE.get());
                        pOutput.accept(CAABlocksClass.ENDERIUM_ORE.get());

                        pOutput.accept(CAABlocksClass.RUBY_BLOCK.get());
                        pOutput.accept(CAABlocksClass.SAPPHIRE_BLOCK.get());
                        pOutput.accept(CAABlocksClass.VANADIUM_BLOCK.get());
                        pOutput.accept(CAABlocksClass.ADAMANTINA_BLOCK.get());
                        pOutput.accept(CAABlocksClass.IRIDIUM_BLOCK.get());
                        pOutput.accept(CAABlocksClass.VIOLITE_STONE_BLOCK.get());
                        pOutput.accept(CAABlocksClass.COBALT_BLOCK.get());
                        pOutput.accept(CAABlocksClass.PALLADIUM_BLOCK.get());
                        pOutput.accept(CAABlocksClass.ENDERIUM_BLOCK.get());

                        pOutput.accept(CAABlocksClass.VANADIUM_BRICKS.get());
                        pOutput.accept(CAABlocksClass.COBALT_BRICKS.get());
                        pOutput.accept(CAABlocksClass.PALLADIUM_BRICKS.get());
                        pOutput.accept(CAABlocksClass.ENDERIUM_BRICKS.get());





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

                        /*
                        pOutput.accept(CAABlocksClass.SWORD_SHRINE.get());
                        pOutput.accept(CAABlocksClass.C_SANDSTONE_BRICKS.get());
                        pOutput.accept(CAABlocksClass.C_SANDSTONE_PILLAR.get());
                        pOutput.accept(CAABlocksClass.C_DT_BRICKS.get());
                        pOutput.accept(CAABlocksClass.DT_BRICKS.get());
                        pOutput.accept(CAABlocksClass.SANDSTONE_BRICKS.get());
                        pOutput.accept(CAABlocksClass.SANDSTONE_PILLAR.get());
                        pOutput.accept(CAABlocksClass.PHAROAS_BLOCK.get());
                        pOutput.accept(CAABlocksClass.SWORD_STATUE.get());
                        pOutput.accept(CAABlocksClass.SHIELD_STATUE.get());
                        pOutput.accept(CAABlocksClass.BA_STATUE.get());
                        pOutput.accept(CAABlocksClass.SPEAR_STATUE.get());
                        pOutput.accept(CAABlocksClass.GLAIVE_STATUE.get());
                        pOutput.accept(CAABlocksClass.BOW_STATUE.get());
                        pOutput.accept(CAABlocksClass.DAGGER_STATUE.get());

                         */





                    }).withSearchBar().withLabelColor(2)
                    .build());


    public static final RegistryObject<CreativeModeTab> ARMORS_TAB = CREATIVE_MODE_TABS.register("caaarmor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CAAItemsClass.COBALT_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.caaarmor_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        /*
                        pOutput.accept(CAAItemsClass.RUBY_HELMET.get());
                        pOutput.accept(CAAItemsClass.RUBY_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.RUBY_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.RUBY_BOOTS.get());

                        pOutput.accept(CAAItemsClass.SAPPHIRE_HELMET.get());
                        pOutput.accept(CAAItemsClass.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.SAPPHIRE_BOOTS.get());

                        pOutput.accept(CAAItemsClass.EMERALD_HELMET.get());
                        pOutput.accept(CAAItemsClass.EMERALD_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.EMERALD_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.EMERALD_BOOTS.get());
                        */
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_HELMET.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.VIOLITE_STONE_BOOTS.get());

                        pOutput.accept(CAAItemsClass.ADAMANTINA_HELMET.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.ADAMANTINA_BOOTS.get());

                        pOutput.accept(CAAItemsClass.IRIDIUM_HELMET.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.IRIDIUM_BOOTS.get());

                        pOutput.accept(CAAItemsClass.VANADIUM_HELMET.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.VANADIUM_BOOTS.get());



                        pOutput.accept(CAAItemsClass.COBALT_HELMET.get());
                        pOutput.accept(CAAItemsClass.COBALT_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.COBALT_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.COBALT_BOOTS.get());

                        pOutput.accept(CAAItemsClass.PALLADIUM_HELMET.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.PALLADIUM_BOOTS.get());

                        pOutput.accept(CAAItemsClass.ENDERIUM_HELMET.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_CHESTPLATE.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_LEGGINGS.get());
                        pOutput.accept(CAAItemsClass.ENDERIUM_BOOTS.get());



                    })
                    .build());









    public static void register (IEventBus eventBus){

        CREATIVE_MODE_TABS.register(eventBus);
    }


}
