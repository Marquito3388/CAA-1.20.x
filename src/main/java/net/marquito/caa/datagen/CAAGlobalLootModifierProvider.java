package net.marquito.caa.datagen;


import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.block.CAABlocksClass;
import net.marquito.caa.item.CAAItemsClass;
import net.marquito.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
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

        //add("skulk_blade_from_warden", new AddItemModifier(new LootItemCondition[] {
               // LootTableIdCondition.builder(new ResourceLocation("entities/warden")).build(),
              //  LootItemRandomChanceCondition.randomChance(0.5f).build() }, CAAItemsClass.SKULK_BLADE.get()));

        //Drop from warden makes sword OP =-=-=-=-=-=-=-=-=



        add("skulk_blade_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.25f).build() }, CAAItemsClass.SKULK_BLADE.get()));







    }

}

