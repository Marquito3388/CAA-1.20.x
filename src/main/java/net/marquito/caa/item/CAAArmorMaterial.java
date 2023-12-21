package net.marquito.caa.item;


import net.marquito.caa.ChaosAndAbyss;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum CAAArmorMaterial implements ArmorMaterial {

    COBALT("cobalt", 30, new int[]{3, 9, 6, 3}, 11, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.3F, 0.1F, () -> Ingredient.of(CAAItemsClass.COBALT.get())),

    PALLADIUM("palladium", 33, new int[]{3, 10, 6, 3}, 12, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.12F, () -> Ingredient.of(CAAItemsClass.PALLADIUM.get())),

    NETHERIUM("netherium", 36, new int[]{3, 10, 7, 2}, 13, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.7F, 0.17F, () -> Ingredient.of(CAAItemsClass.NETHERIUM.get()));



    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};

    CAAArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return ChaosAndAbyss.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
