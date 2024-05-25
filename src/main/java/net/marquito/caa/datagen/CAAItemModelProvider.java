package net.marquito.caa.datagen;

import net.marquito.caa.ChaosAndAbyss;
import net.marquito.caa.item.CAAItemsClass;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class CAAItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }


    public CAAItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChaosAndAbyss.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        //MATERIALS


        //simpleItem(CAAItemsClass.DARK_MATTER);

        simpleItem(CAAItemsClass.NETHERITE_ROD);
        simpleItem(CAAItemsClass.VANADIUM_ROD);



        //ORES


        simpleItem(CAAItemsClass.RUBY);
        simpleItem(CAAItemsClass.SAPPHIRE);
        simpleItem(CAAItemsClass.SAPPHIRE_MINERAL);
        simpleItem(CAAItemsClass.RUBY_MINERAL);
        simpleItem(CAAItemsClass.VANADIUM_ROD);
        simpleItem(CAAItemsClass.VIOLITE_STONE);
        simpleItem(CAAItemsClass.NETHER_STONE);
        simpleItem(CAAItemsClass.END_STONE);

        simpleItem(CAAItemsClass.RAW_GALLIUM);
        simpleItem(CAAItemsClass.GALLIUM_CHUNK);
        simpleItem(CAAItemsClass.GALLIUM);

        simpleItem(CAAItemsClass.RAW_ADAMANTINA);
        simpleItem(CAAItemsClass.ADAMANTINA_CHUNK);
        simpleItem(CAAItemsClass.ADAMANTINA);

        simpleItem(CAAItemsClass.RAW_IRIDIUM);
        simpleItem(CAAItemsClass.IRIDIUM_CHUNK);
        simpleItem(CAAItemsClass.IRIDIUM);

        simpleItem(CAAItemsClass.RAW_VANADIUM);
        simpleItem(CAAItemsClass.VANADIUM_CHUNK);
        simpleItem(CAAItemsClass.VANADIUM);

        simpleItem(CAAItemsClass.RAW_COBALT);
        simpleItem(CAAItemsClass.COBALT_CHUNK);
        simpleItem(CAAItemsClass.COBALT);

        simpleItem(CAAItemsClass.RAW_PALLADIUM);
        simpleItem(CAAItemsClass.PALLADIUM_CHUNK);
        simpleItem(CAAItemsClass.PALLADIUM);

        simpleItem(CAAItemsClass.RAW_ENDERIUM);
        simpleItem(CAAItemsClass.ENDERIUM_CHUNK);
        simpleItem(CAAItemsClass.ENDERIUM);


/*
        simpleItem(CAAItemsClass.ADAMANTINA_HELMET);
        simpleItem(CAAItemsClass.ADAMANTINA_CHESTPLATE);
        simpleItem(CAAItemsClass.ADAMANTINA_LEGGINGS);
        simpleItem(CAAItemsClass.ADAMANTINA_BOOTS);

        simpleItem(CAAItemsClass.IRIDIUM_HELMET);
        simpleItem(CAAItemsClass.IRIDIUM_CHESTPLATE);
        simpleItem(CAAItemsClass.IRIDIUM_LEGGINGS);
        simpleItem(CAAItemsClass.IRIDIUM_BOOTS);

        simpleItem(CAAItemsClass.VANADIUM_HELMET);
        simpleItem(CAAItemsClass.VANADIUM_CHESTPLATE);
        simpleItem(CAAItemsClass.VANADIUM_LEGGINGS);
        simpleItem(CAAItemsClass.VANADIUM_BOOTS);

        simpleItem(CAAItemsClass.VIOLITE_STONE_HELMET);
        simpleItem(CAAItemsClass.VIOLITE_STONE_CHESTPLATE);
        simpleItem(CAAItemsClass.VIOLITE_STONE_LEGGINGS);
        simpleItem(CAAItemsClass.VIOLITE_STONE_BOOTS);

        simpleItem(CAAItemsClass.COBALT_HELMET);
        simpleItem(CAAItemsClass.COBALT_CHESTPLATE);
        simpleItem(CAAItemsClass.COBALT_LEGGINGS);
        simpleItem(CAAItemsClass.COBALT_BOOTS);

        simpleItem(CAAItemsClass.PALLADIUM_HELMET);
        simpleItem(CAAItemsClass.PALLADIUM_CHESTPLATE);
        simpleItem(CAAItemsClass.PALLADIUM_LEGGINGS);
        simpleItem(CAAItemsClass.PALLADIUM_BOOTS);

        simpleItem(CAAItemsClass.ENDERIUM_HELMET);
        simpleItem(CAAItemsClass.ENDERIUM_CHESTPLATE);
        simpleItem(CAAItemsClass.ENDERIUM_LEGGINGS);
        simpleItem(CAAItemsClass.ENDERIUM_BOOTS);
*/

        //EXTRA ORES



        //WEAPONS AND TOOLS

        handheldItem(CAAItemsClass.ADAMANTINA_SWORD);
        handheldItem(CAAItemsClass.ADAMANTINA_PICKAXE);
        handheldItem(CAAItemsClass.ADAMANTINA_AXE);
        handheldItem(CAAItemsClass.ADAMANTINA_HOE);
        handheldItem(CAAItemsClass.ADAMANTINA_SHOVEL);
        handheldItem(CAAItemsClass.ADAMANTINA_DAGGER);
        handheldItem(CAAItemsClass.ADAMANTINA_SYTHE);
        handheldItem(CAAItemsClass.ADAMANTINA_SPEAR);

        handheldItem(CAAItemsClass.VIOLITE_STONE_SWORD);
        handheldItem(CAAItemsClass.VIOLITE_STONE_PICKAXE);
        handheldItem(CAAItemsClass.VIOLITE_STONE_AXE);
        handheldItem(CAAItemsClass.VIOLITE_STONE_HOE);
        handheldItem(CAAItemsClass.VIOLITE_STONE_SHOVEL);
        handheldItem(CAAItemsClass.VIOLITE_STONE_DAGGER);
        handheldItem(CAAItemsClass.VIOLITE_STONE_SYTHE);
        handheldItem(CAAItemsClass.VIOLITE_STONE_SPEAR);

        handheldItem(CAAItemsClass.IRIDIUM_SWORD);
        handheldItem(CAAItemsClass.IRIDIUM_PICKAXE);
        handheldItem(CAAItemsClass.IRIDIUM_AXE);
        handheldItem(CAAItemsClass.IRIDIUM_HOE);
        handheldItem(CAAItemsClass.IRIDIUM_SHOVEL);
        handheldItem(CAAItemsClass.IRIDIUM_DAGGER);
        handheldItem(CAAItemsClass.IRIDIUM_SYTHE);
        handheldItem(CAAItemsClass.IRIDIUM_SPEAR);

        handheldItem(CAAItemsClass.VANADIUM_SWORD);
        handheldItem(CAAItemsClass.VANADIUM_DAGGER);
        handheldItem(CAAItemsClass.VANADIUM_SYTHE);
        handheldItem(CAAItemsClass.VANADIUM_SPEAR);
        handheldItem(CAAItemsClass.VANADIUM_AXE);
        handheldItem(CAAItemsClass.VANADIUM_HOE);
        handheldItem(CAAItemsClass.VANADIUM_PICKAXE);
        handheldItem(CAAItemsClass.VANADIUM_SHOVEL);


        handheldItem(CAAItemsClass.COBALT_SWORD);
        handheldItem(CAAItemsClass.COBALT_DAGGER);
        handheldItem(CAAItemsClass.COBALT_SYTHE);
        handheldItem(CAAItemsClass.COBALT_SPEAR);
        handheldItem(CAAItemsClass.COBALT_PICKAXE);
        handheldItem(CAAItemsClass.COBALT_AXE);
        handheldItem(CAAItemsClass.COBALT_HOE);
        handheldItem(CAAItemsClass.COBALT_SHOVEL);
        handheldItem(CAAItemsClass.COBALT_DRILL);


        handheldItem(CAAItemsClass.PALLADIUM_SWORD);
        handheldItem(CAAItemsClass.PALLADIUM_DAGGER);
        handheldItem(CAAItemsClass.PALLADIUM_SPEAR);
        handheldItem(CAAItemsClass.PALLADIUM_SYTHE);
        handheldItem(CAAItemsClass.PALLADIUM_PICKAXE);
        handheldItem(CAAItemsClass.PALLADIUM_AXE);
        handheldItem(CAAItemsClass.PALLADIUM_HOE);
        handheldItem(CAAItemsClass.PALLADIUM_SHOVEL);
        handheldItem(CAAItemsClass.PALLADIUM_DRILL);


        handheldItem(CAAItemsClass.ENDERIUM_SWORD);
        handheldItem(CAAItemsClass.ENDERIUM_DAGGER);
        handheldItem(CAAItemsClass.ENDERIUM_SYTHE);
        handheldItem(CAAItemsClass.ENDERIUM_SPEAR);
        handheldItem(CAAItemsClass.ENDERIUM_AXE);
        handheldItem(CAAItemsClass.ENDERIUM_HOE);
        handheldItem(CAAItemsClass.ENDERIUM_SHOVEL);
        handheldItem(CAAItemsClass.ENDERIUM_DRILL);
        handheldItem(CAAItemsClass.ENDERIUM_PICKAXE);

        handheldItem(CAAItemsClass.SKULK_BLADE);

        handheldItem(CAAItemsClass.FLAME_SPEAR);
        handheldItem(CAAItemsClass.WATER_SPEAR);
        handheldItem(CAAItemsClass.THUNDER_SPEAR);
        handheldItem(CAAItemsClass.BONE_DAGGER);

        handheldItem(CAAItemsClass.OLD_DAGGER);
        handheldItem(CAAItemsClass.OLD_SPEAR);
        handheldItem(CAAItemsClass.OLD_SWORD);


        handheldItem(CAAItemsClass.DRILL);
        handheldItem(CAAItemsClass.VIOLITE_STONE_DRILL);


        /*

        handheldItem(CAAItemsClass.LIGHTS_BANE);
        handheldItem(CAAItemsClass.BLOOD_BUTCHERER);

        handheldItem(CAAItemsClass.DEMONITE_AXE);
        handheldItem(CAAItemsClass.CRIMTANE_AXE);

        handheldItem(CAAItemsClass.DEMONITE_PICKAXE);
        handheldItem(CAAItemsClass.CRIMTANE_PICKAXE);


        handheldItem(CAAItemsClass.ZANITE_SWORD);
        handheldItem(CAAItemsClass.GRAVITITE_SWORD);

        handheldItem(CAAItemsClass.GRAVITITE_SHOVEL);
        handheldItem(CAAItemsClass.ZANITE_SHOVEL);

        handheldItem(CAAItemsClass.GRAVITITE_AXE);
        handheldItem(CAAItemsClass.ZANITE_AXE);

        handheldItem(CAAItemsClass.ZANITE_PICKAXE);
        handheldItem(CAAItemsClass.GRAVITITE_PICKAXE);
        */
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MODID = ChaosAndAbyss.MODID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MODID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MODID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MODID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }


    

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ChaosAndAbyss.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChaosAndAbyss.MODID,"item/" + item.getId().getPath()));
    }
}