package net.marquito.caa.datagen;


import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.item.CAAItemsClass;
import net.marquito.caa.loot.AddItemModifier;
import net.marquito.mcm.item.MCMItemsClass;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
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

        // Entity Drop

        /*

        add("wardens_will_from_warden", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("entities/warden")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build() }, CAAItemsClass.WARDENS_WILL.get()));

        add("wardens_bone_from_warden", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("entities/warden")).build(),
                LootItemRandomChanceCondition.randomChance(1f).build() }, CAAItemsClass.WARDENS_BONE.get()));

        add("wardens_horn_from_warden", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("entities/warden")).build(),
                LootItemRandomChanceCondition.randomChance(0.8f).build() }, CAAItemsClass.WARDENS_HORN.get()));
        */


        //Chests

        add("skulk_blade_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build() }, CAAItemsClass.SKULK_BLADE.get()));

        add("water_spear_from_pillager_post", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/pillager_post")).build(),
                LootItemRandomChanceCondition.randomChance(0.4f).build() }, CAAItemsClass.WATER_SPEAR.get()));

        add("thunder_spear_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build() }, CAAItemsClass.THUNDER_SPEAR.get()));

        add("flame_spear_from_ruined_portal", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/ruined_portal")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build() }, CAAItemsClass.FLAME_SPEAR.get()));

        add("the_butcher_from_bastion", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/bastion")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build() }, CAAItemsClass.THE_BUTCHER.get()));

        add("frost_glave_from_pillager_post", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/bastion")).build(),
                LootItemRandomChanceCondition.randomChance(0.3f).build() }, CAAItemsClass.FROST_GLAIVE.get()));

        add("forest_bow_from_woodland_mansion", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build() }, CAAItemsClass.FOREST_BOW.get()));

        add("bone_dagger_from_woodland_mansion", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/woodland_mansion")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build() }, CAAItemsClass.BONE_DAGGER.get()));



        add("azinite_from_ancient_city", new AddItemModifier(new LootItemCondition[] {
                LootTableIdCondition.builder(new ResourceLocation("chests/ancient_city")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build() }, MCMItemsClass.AZINITE.get()));







    }

}

