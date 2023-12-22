package net.marquito.caa.datagen;


import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.item.CAAItemsClass;
import net.marquito.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class CAAGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public CAAGlobalLootModifierProvider(PackOutput output) {
        super(output, ChaosAndAbyss.MODID);
    }


    @Override
    protected void start() {
       // add("pine_cone_from_grass", new AddItemModifier(new LootItemCondition[]{

                /*
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, CAAItemsClass..get()));





        add("pine_cone_from_creeper", new AddItemModifier(new LootItemCondition[] {
               new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() }, CAAItemsClass.PINE_CONE.get()));

                 */

        add("arkhalis_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
               new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build() },
                CAAItemsClass.ARKHALIS.get()));

        add("thunder_spear_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build() },
                CAAItemsClass.THUNDER_SPEAR.get()));

        add("water_spear_from_underwater_ruin_big", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/water_spear_from_underwater_ruin_big")).build() },
                CAAItemsClass.WATER_SPEAR.get()));






    }
    


}

