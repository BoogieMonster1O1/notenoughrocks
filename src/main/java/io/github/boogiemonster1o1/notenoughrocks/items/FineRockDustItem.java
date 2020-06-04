package io.github.boogiemonster1o1.notenoughrocks.items;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;
import static net.minecraft.entity.EquipmentSlot.*;

public class FineRockDustItem extends Item {
    public FineRockDustItem(Settings settings) {
        super(settings.maxDamage(1));
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
       tooltip.add(new TranslatableText("item.notenoughrocks.fine_dust.use_dust_tooltip"));
    }

    @Override
    public boolean useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        Item headArmor = user.getEquippedStack(HEAD).getItem();
        Item chestArmor = user.getEquippedStack(CHEST).getItem();
        Item legsArmor = user.getEquippedStack(LEGS).getItem();
        Item feetArmor = user.getEquippedStack(FEET).getItem();
        if(headArmor == HEAVY_ROCK_HELMET || chestArmor == HEAVY_ROCK_CHESTPLATE || legsArmor == HEAVY_ROCK_LEGGINGS || feetArmor == HEAVY_ROCK_BOOTS){
            if(!entity.hasStatusEffect(StatusEffects.BLINDNESS)) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 4));
                stack.decrement(1);
                user.playSound(SoundEvents.BLOCK_FIRE_EXTINGUISH, 1.0f, new Random().nextFloat());
            }
        }
        return true;
    }

    @Override
    public boolean hasEnchantmentGlint(ItemStack stack) {
        return true;
    }
}
