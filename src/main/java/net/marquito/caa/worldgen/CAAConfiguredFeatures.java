package net.marquito.caa.worldgen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public class CAAConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("rubyoreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphireoreds");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_STONE_ORE_KEY = registerKey("nether_stoneore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_ORE_KEY = registerKey("end_stoneore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ADAMANTINA_ORE_KEY = registerKey("adamantinaoreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE_KEY = registerKey("iridiumoreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VIOLITE_STONE_ORE_KEY = registerKey("violite_stoneoreds");

    public static final ResourceKey<ConfiguredFeature<?, ?>> VANADIUM_ORE_KEY = registerKey("vanadiumoreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobaltore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALLADIUM_ORE_KEY = registerKey("palladiumore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDERIUM_ORE_KEY = registerKey("enderiumore");
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldadamantinaOres = List.of(OreConfiguration.target(deepslateReplaceables,
                CAABlocksClass.ADAMANTINA_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldiridiumOres = List.of(OreConfiguration.target(deepslateReplaceables,
                CAABlocksClass.IRIDIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldviolite_stoneOres = List.of(OreConfiguration.target(deepslateReplaceables,
                CAABlocksClass.VIOLITE_STONE_ORE.get().defaultBlockState()));


        List<OreConfiguration.TargetBlockState> overworldvanadiumOres = List.of(OreConfiguration.target(deepslateReplaceables,
                        CAABlocksClass.VANADIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldrubyOres = List.of(OreConfiguration.target(deepslateReplaceables,
                CAABlocksClass.RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldsapphireOres = List.of(OreConfiguration.target(deepslateReplaceables,
                CAABlocksClass.SAPPHIRE_ORE.get().defaultBlockState()));


        register(context, RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldrubyOres, 6));

        register(context, ADAMANTINA_ORE_KEY, Feature.ORE, new OreConfiguration(overworldadamantinaOres, 4));
        register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldiridiumOres, 3));
        register(context, VIOLITE_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldviolite_stoneOres, 2));

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldsapphireOres, 6));

        register(context, VANADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldvanadiumOres, 3));

        register(context, COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                CAABlocksClass.COBALT_ORE.get().defaultBlockState(), 9));

        register(context, PALLADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                CAABlocksClass.PALLADIUM_ORE.get().defaultBlockState(), 6));

        register(context, NETHER_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                CAABlocksClass.NETHER_STONE_ORE.get().defaultBlockState(), 11));

        register(context, ENDERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                CAABlocksClass.ENDERIUM_ORE.get().defaultBlockState(), 6));

        register(context, END_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                CAABlocksClass.END_STONE_ORE.get().defaultBlockState(), 8));

    }




    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ChaosAndAbyss.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}