package net.marquito.caa.block;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.item.CAAItemsClass;
import net.minecraft.client.animation.definitions.WardenAnimation;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CAABlocksClass {

    public static final DeferredRegister<Block> BLOCKS=
            DeferredRegister.create(ForgeRegistries.BLOCKS, ChaosAndAbyss.MODID);



    public static final RegistryObject<Block> METAL_MANIPULATOR =
            registerBlock("metalmanipulator", () -> new MetalManipulator(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .requiresCorrectToolForDrops()
                    .lightLevel(value -> 3)
                    .sound(SoundType.DEEPSLATE)));




    public static final RegistryObject<Block> RUBY_ORE =
            registerBlock("rubyoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .requiresCorrectToolForDrops()
                    .lightLevel(value -> 3)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> SAPPHIRE_ORE =
            registerBlock("sapphireoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .requiresCorrectToolForDrops()
                    .lightLevel(value -> 3)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> NETHER_STONE_ORE =
            registerBlock("nether_stoneore", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> END_STONE_ORE =
            registerBlock("end_stoneore", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));


    public static final RegistryObject<Block> ADAMANTINA_ORE =
            registerBlock("adamantinaoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> IRIDIUM_ORE =
            registerBlock("iridiumoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> VIOLITE_STONE_ORE =
            registerBlock("violite_stoneoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                    .requiresCorrectToolForDrops()
                    .lightLevel(value -> 3)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> VANADIUM_ORE =
            registerBlock("vanadiumoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> COBALT_ORE =
            registerBlock("cobaltore", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PALLADIUM_ORE =
            registerBlock("palladiumore", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.ANCIENT_DEBRIS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> ENDERIUM_ORE =
            registerBlock("enderiumore", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.END_STONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    // METAL BLOCKS ==========================================


    public static final RegistryObject<Block> RUBY_BLOCK =
            registerBlock("rubyblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DIAMOND_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK =
            registerBlock("sapphireblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DIAMOND_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ADAMANTINA_BLOCK =
            registerBlock("adamantinablock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> IRIDIUM_BLOCK =
            registerBlock("iridiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VIOLITE_STONE_BLOCK =
            registerBlock("violite_stoneblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DIAMOND_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> VANADIUM_BLOCK =
            registerBlock("vanadiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBALT_BLOCK =
            registerBlock("cobaltblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> PALLADIUM_BLOCK =
            registerBlock("palladiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> ENDERIUM_BLOCK =
            registerBlock("enderiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANCIENT_DEBRIS)));
    



    public static final RegistryObject<Block> VANADIUM_BRICKS =
            registerBlock("vanadiumbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBALT_BRICKS =
            registerBlock("cobaltbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> PALLADIUM_BRICKS =
            registerBlock("palladiumbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ENDERIUM_BRICKS =
            registerBlock("enderiumbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> BLUE_LAMP =
            registerBlock("blue_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    //SAND BRICKS

    /*
    public static final RegistryObject<Block> C_SANDSTONE_BRICKS =
            registerBlock("c_sandstone_bricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_BRICKS =
            registerBlock("sandstone_bricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_PILLAR =
            registerBlock("sandstone_pillar", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> C_SANDSTONE_PILLAR =
            registerBlock("c_sandstone_pillar", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> C_DT_BRICKS =
            registerBlock("cracked_dt_bricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> DT_BRICKS =
            registerBlock("dt_bricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> PHAROAS_BLOCK =
            registerBlock("pharoahs_block", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
        */


    //WardenAnimation

    //Warden


    public static final RegistryObject<Block> BLACK_LAMP =
            registerBlock("black_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> BROWN_LAMP =
            registerBlock("brown_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> CYAN_LAMP =
            registerBlock("cyan_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_LAMP =
            registerBlock("green_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREY_LAMP =
            registerBlock("grey_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIGHT_BLUE_LAMP =
            registerBlock("lightblue_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIGHT_GREY_LAMP =
            registerBlock("lightgrey_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIME_LAMP =
            registerBlock("lime_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> MAGENTA_LAMP =
            registerBlock("magenta_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ORANGE_LAMP =
            registerBlock("orange_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_LAMP =
            registerBlock("pink_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> PURPLE_LAMP =
            registerBlock("purple_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_LAMP =
            registerBlock("red_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> YELLOW_LAMP =
            registerBlock("yellow_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    /*

    public static final RegistryObject<Block> SWORD_SHRINE =
            registerBlock("sword_shrine", () -> new SwordShrineBlock(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.STONE)));



    public static final RegistryObject<Block> BA_STATUE =
            registerBlock("ba_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> DAGGER_STATUE =
            registerBlock("dagger_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> BOW_STATUE =
            registerBlock("bow_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> GLAIVE_STATUE =
            registerBlock("glaive_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> SHIELD_STATUE =
            registerBlock("shield_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> SWORD_STATUE =
            registerBlock("sword_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

    public static final RegistryObject<Block> SPEAR_STATUE =
            registerBlock("spear_statue", () -> new StatueBlock(BlockBehaviour.Properties
                    .copy(Blocks.SANDSTONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.SAND)));

     */





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;

    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){

        return CAAItemsClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }

}
