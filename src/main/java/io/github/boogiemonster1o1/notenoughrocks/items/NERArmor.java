package io.github.boogiemonster1o1.notenoughrocks.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.LIMESTONE_BLOCK_ITEM;
import static net.minecraft.item.Items.STONE;
import static net.minecraft.recipe.Ingredient.ofItems;
import static net.minecraft.sound.SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;

public enum NERArmor implements ArmorMaterial {
    HEAVY_ROCK("heavy_rock", 10, new int[]{3, 5, 7, 2}, 5, ITEM_ARMOR_EQUIP_CHAIN, 1.0F, () -> ofItems(LIMESTONE_BLOCK_ITEM, STONE),0.0f);

    public static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredient;
    private final float knockbackResistance;

    NERArmor(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, Supplier<Ingredient> repairIngredient,float knockbackResistance) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.repairIngredient = new Lazy<>(repairIngredient);
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
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
        return this.name;
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
