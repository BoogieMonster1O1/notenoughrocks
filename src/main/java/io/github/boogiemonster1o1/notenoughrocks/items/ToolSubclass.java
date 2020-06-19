package io.github.boogiemonster1o1.notenoughrocks.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ToolSubclass {
    public static class PickaxeSubclass extends PickaxeItem {
        public PickaxeSubclass(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class AxeSubclass extends AxeItem {
        public AxeSubclass(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
    public static class HoeSubclass extends HoeItem{
        public HoeSubclass(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
}
