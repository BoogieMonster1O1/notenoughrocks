package io.github.boogiemonster1o1.notenoughrocks.mixin;

import io.github.boogiemonster1o1.notenoughrocks.access.UpdateHeavyRockArmor;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements UpdateHeavyRockArmor {
    public PlayerEntityMixin(EntityType<? extends LivingEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void updateHeavyRockArmor() {
        ItemStack headArmor = this.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestArmor = this.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack legsArmor = this.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack feetArmor = this.getEquippedStack(EquipmentSlot.FEET);
        if (headArmor.getItem() == HEAVY_ROCK_HELMET || chestArmor.getItem() == HEAVY_ROCK_CHESTPLATE || legsArmor.getItem() == HEAVY_ROCK_LEGGINGS || feetArmor.getItem() == HEAVY_ROCK_BOOTS) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1, 2, false, false, true));
        }
    }

    @Inject(method = "tick", at = @At(value = "RETURN"))
    public void tickTheHeavyRockArmorToo(CallbackInfo ci) {
        ((UpdateHeavyRockArmor)this).updateHeavyRockArmor();
    }
}
