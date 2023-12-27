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


    public static final RegistryObject<Block> VANADIUM_ORE =
            registerBlock("vanadiumoreds", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .requiresCorrectToolForDrops()
                    .lightLevel(value -> 3)
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


    public static final RegistryObject<Block> VANADIUM_BLOCK =
            registerBlock("vanadiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> COBALT_BLOCK =
            registerBlock("cobaltblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PALLADIUM_BLOCK =
            registerBlock("palladiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> ENDERIUM_BLOCK =
            registerBlock("enderiumblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GOLD_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
    



    public static final RegistryObject<Block> VANADIUM_BRICK =
            registerBlock("vanadiumbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBALT_BRICK =
            registerBlock("cobaltbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> PALLADIUM_BRICK =
            registerBlock("palladiumbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> ENDERIUM_BRICK =
            registerBlock("enderiumbricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> BLUE_LAMP =
            registerBlock("blue_lamp_on", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.GLOWSTONE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

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


    public static final RegistryObject<Block> SWORD_SHRINE =
            registerBlock("sword_shrine", () -> new SwordShrineBlock(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .sound(SoundType.STONE)));

















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
