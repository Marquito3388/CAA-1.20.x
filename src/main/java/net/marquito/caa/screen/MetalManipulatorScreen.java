package net.marquito.caa.screen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.recipe.MetalManipulatorRecipeBookComponent;
import net.marquito.caa.screen.menu.MetalManipulatorMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class MetalManipulatorScreen extends AbstractFurnaceScreen<MetalManipulatorMenu> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(ChaosAndAbyss.MODID, "textures/gui/metalmanipulator_gui.png");

    public MetalManipulatorScreen(MetalManipulatorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new MetalManipulatorRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
