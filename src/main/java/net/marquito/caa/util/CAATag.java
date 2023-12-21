package net.marquito.caa.util;

import net.marquito.caa.ChaosAndAbyss;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CAATag {



    public static class Blocks {

        public static final TagKey<Block> NEEDS_COBALT_TOOL = tag("needs_cobalt_tool");
        public static final TagKey<Block> NEEDS_PALLADIUM_TOOL = tag("needs_palladium_tool");
        public static final TagKey<Block> NEEDS_NETHERIUM_TOOL = tag("needs_netherium_tool");

        public static final TagKey<Block> DRILL = tag("mineable_with_drill");


        /*
        public static final TagKey<Block> NEEDS_COBALT_DRILL_TOOL = tag("needs_cobaltd_tool");
        public static final TagKey<Block> NEEDS_PALLADIUM_DRILL_TOOL = tag("needs_palladiumd_tool");
        public static final TagKey<Block> NEEDS_NETHERIUM_DRILL_TOOL = tag("needs_netheriumd_tool");

         */


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ChaosAndAbyss.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ChaosAndAbyss.MODID, name));
        }
    }
}
