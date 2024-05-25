package net.marquito.caa.entities.blocks;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CAABlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChaosAndAbyss.MODID);

    public static final RegistryObject<BlockEntityType<MetalManipulatorBlockEntity>> METAL_MANIPULATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("metalmanipulator_block_entity", () ->
                    BlockEntityType.Builder.of(MetalManipulatorBlockEntity::new,
                            CAABlocksClass.METAL_MANIPULATOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}