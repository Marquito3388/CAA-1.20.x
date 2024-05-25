package net.marquito.caa.recipe;

import net.marquito.caa.ChaosAndAbyss;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CAARecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ChaosAndAbyss.MODID);

    public static final RegistryObject<RecipeSerializer<MetalManipulatorRecipe>> METAL_MANIPULATOR_SERIALIZER =
            SERIALIZERS.register("metalmanipulator", () -> MetalManipulatorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}