package net.marquito.caa.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.recipe.MetalManipulatorRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class MetalManipulatorRecipeCategory implements IRecipeCategory<MetalManipulatorRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(ChaosAndAbyss.MODID, "metalmanipulator");
    public static final ResourceLocation TEXTURE = new ResourceLocation(ChaosAndAbyss.MODID,
            "textures/gui/metalmanipulator_gui.png");

    public static final RecipeType<MetalManipulatorRecipe> METAL_MANIPULATOR_TYPE =
            new RecipeType<>(UID, MetalManipulatorRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public MetalManipulatorRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(CAABlocksClass.METAL_MANIPULATOR.get()));
    }

    @Override
    public RecipeType<MetalManipulatorRecipe> getRecipeType() {
        return METAL_MANIPULATOR_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Metal Manipulator");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MetalManipulatorRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 56, 17).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 35).addItemStack(recipe.getResultItem(null));
    }
}