package net.marquito.caa.recipe;

import net.marquito.caa.item.CAAItemsClass;
import net.marquito.caa.screen.MetalManipulatorScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Set;

public class MetalManipulatorRecipeBookComponent extends AbstractFurnaceRecipeBookComponent {
    @Override
    protected Set<Item> getFuelItems() {
        return Set.of(CAAItemsClass.NETHER_STONE.get(), CAAItemsClass.END_STONE.get());
    }
}