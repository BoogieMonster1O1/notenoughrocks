package io.github.boogiemonster1o1.notenoughrocks.items;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.PLAY_DUST_PARTICLE;
import static io.netty.buffer.Unpooled.buffer;
import static net.fabricmc.fabric.api.network.ServerSidePacketRegistry.INSTANCE;
import static net.fabricmc.fabric.api.server.PlayerStream.watching;
import static net.minecraft.entity.EquipmentSlot.*;
import static net.minecraft.entity.effect.StatusEffects.BLINDNESS;
import static net.minecraft.sound.SoundEvents.BLOCK_FIRE_EXTINGUISH;
import static net.minecraft.util.Rarity.RARE;

public class FineRockDustItem extends Item {
    public FineRockDustItem(Settings settings) {
        super(settings.maxDamage(1).rarity(RARE));
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
        if (headArmor == HEAVY_ROCK_HELMET || chestArmor == HEAVY_ROCK_CHESTPLATE || legsArmor == HEAVY_ROCK_LEGGINGS || feetArmor == HEAVY_ROCK_BOOTS) {
            if (!entity.hasStatusEffect(BLINDNESS)) {
                entity.addStatusEffect(new StatusEffectInstance(BLINDNESS, 10));
                stack.decrement(1);
                user.playSound(BLOCK_FIRE_EXTINGUISH, 1.0f, new Random().nextFloat());
                Stream<PlayerEntity> allPlayers = watching(entity);
                double entityPosX = entity.getX();
                double entityPosY = entity.getY();
                double entityPosZ = entity.getZ();
                PacketByteBuf clientData = new PacketByteBuf(buffer());
                clientData.writeBlockPos(new BlockPos(entityPosX, entityPosY, entityPosZ));
                allPlayers.forEach(player -> INSTANCE.sendToPlayer(player, PLAY_DUST_PARTICLE, clientData));
            }
        }
        return true;
    }

    @Override
    public boolean hasEnchantmentGlint(ItemStack stack) {
        return true;
    }
}
