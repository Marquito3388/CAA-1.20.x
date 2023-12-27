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

        simpleItem(CAAItemsClass.BASILISK_SCALE);
        simpleItem(CAAItemsClass.DARK_BRICK);

        simpleItem(CAAItemsClass.DARK_MATTER);


        //ORES
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


        //EXTRA ORES

        /*
        simpleItem(CAAItemsClass.CRIMTANE_ORE);
        simpleItem(CAAItemsClass.CRIMTANE_BAR);
        simpleItem(CAAItemsClass.DEMONITE_ORE);
        simpleItem(CAAItemsClass.DEMONITE_BAR);
        simpleItem(CAAItemsClass.ZANITE_GEMSTONE);
        */


        //WEAPONS AND TOOLS

        handheldItem(CAAItemsClass.VANADIUM_SWORD);
        handheldItem(CAAItemsClass.VANADIUM_PICKAXE);
        handheldItem(CAAItemsClass.VANADIUM_AXE);
        handheldItem(CAAItemsClass.VANADIUM_HOE);
        handheldItem(CAAItemsClass.VANADIUM_SHOVEL);

        handheldItem(CAAItemsClass.COBALT_SWORD);
        handheldItem(CAAItemsClass.COBALT_PICKAXE);
        handheldItem(CAAItemsClass.COBALT_AXE);
        handheldItem(CAAItemsClass.COBALT_HOE);
        handheldItem(CAAItemsClass.COBALT_SHOVEL);
        handheldItem(CAAItemsClass.COBALT_DRILL);

        handheldItem(CAAItemsClass.PALLADIUM_SWORD);
        handheldItem(CAAItemsClass.PALLADIUM_PICKAXE);
        handheldItem(CAAItemsClass.PALLADIUM_AXE);
        handheldItem(CAAItemsClass.PALLADIUM_HOE);
        handheldItem(CAAItemsClass.PALLADIUM_SHOVEL);
        handheldItem(CAAItemsClass.PALLADIUM_DRILL);

        handheldItem(CAAItemsClass.ENDERIUM_SWORD);
        handheldItem(CAAItemsClass.ENDERIUM_PICKAXE);
        handheldItem(CAAItemsClass.ENDERIUM_AXE);
        handheldItem(CAAItemsClass.ENDERIUM_HOE);
        handheldItem(CAAItemsClass.ENDERIUM_SHOVEL);
        handheldItem(CAAItemsClass.ENDERIUM_DRILL);



        handheldItem(CAAItemsClass.SKULK_BLADE);

        handheldItem(CAAItemsClass.VANADIUM_DAGGER);
        handheldItem(CAAItemsClass.COBALT_DAGGER);
        handheldItem(CAAItemsClass.PALLADIUM_DAGGER);
        handheldItem(CAAItemsClass.ENDERIUM_DAGGER);

        handheldItem(CAAItemsClass.VANADIUM_SPEAR);
        handheldItem(CAAItemsClass.COBALT_SPEAR);
        handheldItem(CAAItemsClass.PALLADIUM_SPEAR);
        handheldItem(CAAItemsClass.ENDERIUM_SPEAR);

        handheldItem(CAAItemsClass.VANADIUM_BATTLEAXE);
        handheldItem(CAAItemsClass.COBALT_BATTLEAXE);
        handheldItem(CAAItemsClass.PALLADIUM_BATTLEAXE);
        handheldItem(CAAItemsClass.ENDERIUM_BATTLEAXE);


        handheldItem(CAAItemsClass.THE_BUTCHER);



        handheldItem(CAAItemsClass.FLAME_SPEAR);
        handheldItem(CAAItemsClass.WATER_SPEAR);
        handheldItem(CAAItemsClass.THUNDER_SPEAR);

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