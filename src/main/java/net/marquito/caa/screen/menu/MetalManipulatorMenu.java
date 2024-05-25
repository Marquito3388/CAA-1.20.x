package net.marquito.caa.screen.menu;

import net.marquito.caa.recipe.MetalManipulatorRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;

public class MetalManipulatorMenu extends AbstractFurnaceMenu {
    protected MetalManipulatorMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public MetalManipulatorMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(CAAMenuTypes.METAL_MANIPULATOR_MENU.get(), MetalManipulatorRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public MetalManipulatorMenu(int pContainerId, Inventory pPlayerInventory) {
        super(CAAMenuTypes.METAL_MANIPULATOR_MENU.get(), MetalManipulatorRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }

    @Override
    protected boolean isFuel(ItemStack pStack) {
        return true;
    }
}