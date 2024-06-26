package net.marquito.caa.worldgen;

import net.marquito.caa.ChaosAndAbyss;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class CAAPlacedFeatures {

    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("rubyoreds_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphireoreds_placed");

    public static final ResourceKey<PlacedFeature> NETHER_STONE_ORE_PLACED_KEY = registerKey("nether_stoneore_placed");
    public static final ResourceKey<PlacedFeature> END_STONE_ORE_PLACED_KEY = registerKey("end_stoneore_placed");

    public static final ResourceKey<PlacedFeature> ADAMANTINA_ORE_PLACED_KEY = registerKey("adamantinaoreds_placed");
    public static final ResourceKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridiumoreds_placed");
    public static final ResourceKey<PlacedFeature> VIOLITE_STONE_ORE_PLACED_KEY = registerKey("violite_stoneoreds_placed");

    public static final ResourceKey<PlacedFeature> VANADIUM_ORE_PLACED_KEY = registerKey("vanadiumore_placed");
    public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobaltore_placed");
    public static final ResourceKey<PlacedFeature> PALLADIUM_ORE_PLACED_KEY = registerKey("palladiumore_placed");
    public static final ResourceKey<PlacedFeature> ENDERIUM_ORE_PLACED_KEY = registerKey("enderiumore_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.RUBY_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));

        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.SAPPHIRE_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));


        register(context, ADAMANTINA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.ADAMANTINA_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));
        register(context, IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.IRIDIUM_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));
        register(context, VIOLITE_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.VIOLITE_STONE_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(60))));


        register(context, VANADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.VANADIUM_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));

        register(context, COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.COBALT_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(60))));

        register(context, PALLADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.PALLADIUM_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(55))));

        register(context, NETHER_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.NETHER_STONE_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(13,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));


        register(context, END_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.END_STONE_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))));

        register(context, ENDERIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(CAAConfiguredFeatures.ENDERIUM_ORE_KEY),
                CAAOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ChaosAndAbyss.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}