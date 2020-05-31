package io.github.boogiemonster1o1.notenoughrocks.items;

import net.minecraft.item.*;

public class ToolSubclass {
    public static class PickaxeSubclass extends PickaxeItem{
        public PickaxeSubclass(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
    public static class AxeSubclass extends AxeItem {
        public AxeSubclass(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
}
