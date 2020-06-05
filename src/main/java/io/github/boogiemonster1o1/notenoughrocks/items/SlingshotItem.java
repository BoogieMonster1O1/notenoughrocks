package io.github.boogiemonster1o1.notenoughrocks.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;

import java.util.function.Predicate;

import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.ROCK_PROJECTILES_TAG;

public class SlingshotItem extends RangedWeaponItem {

    public static final Predicate<ItemStack> ROCK_PROJECTILES = rock -> rock.getItem().isIn(ROCK_PROJECTILES_TAG);

    public SlingshotItem(Settings settings) {
        super(settings.maxDamage(32));
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return ROCK_PROJECTILES;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 72000;
    }

    @Override
    public int getEnchantability(){
        return 5;
    }
}
