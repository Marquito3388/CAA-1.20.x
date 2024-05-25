package net.marquito.caa.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.recipe.MetalManipulatorRecipe;
import net.marquito.caa.screen.MetalManipulatorScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

public class JEICAAPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ChaosAndAbyss.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {


        registration.addRecipeCategories(new MetalManipulatorRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<MetalManipulatorRecipe> metalManipulatorRecipes = recipeManager.getAllRecipesFor(MetalManipulatorRecipe.Type.INSTANCE);
        registration.addRecipes(MetalManipulatorRecipeCategory.METAL_MANIPULATOR_TYPE, metalManipulatorRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {

        registration.addRecipeClickArea(MetalManipulatorScreen.class, 60, 30, 20, 30,
                MetalManipulatorRecipeCategory.METAL_MANIPULATOR_TYPE);
    }
}