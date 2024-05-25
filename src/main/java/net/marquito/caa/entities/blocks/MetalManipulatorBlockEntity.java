package net.marquito.caa.entities.blocks;

import net.marquito.caa.item.CAAItemsClass;
import net.marquito.caa.recipe.MetalManipulatorRecipe;
import net.marquito.caa.screen.menu.MetalManipulatorMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public class MetalManipulatorBlockEntity extends AbstractFurnaceBlockEntity {
    private Map<Item, Integer> BURN_DURATION_MAP =
            Map.of(CAAItemsClass.NETHER_STONE.get(), 900, CAAItemsClass.END_STONE.get(), 1300);

    public MetalManipulatorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(CAABlockEntities.METAL_MANIPULATOR_BLOCK_ENTITY.get(), pPos, pBlockState, MetalManipulatorRecipe.Type.INSTANCE);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.caa.metalmanipulator");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new MetalManipulatorMenu(pContainerId, pInventory, this, dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack pFuel) {
        return BURN_DURATION_MAP.getOrDefault(pFuel.getItem(), 0);
    }
}