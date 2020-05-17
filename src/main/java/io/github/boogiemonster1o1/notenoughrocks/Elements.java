package io.github.boogiemonster1o1.notenoughrocks;

import io.github.boogiemonster1o1.notenoughrocks.blocks.LimestoneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;

public class Elements {
    public static class ItemS{
        public static BlockItem LIMESTONE_BLOCK_ITEM = new BlockItem(LIMESTONE_BLOCK,new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    }
    public static class BlockS{
        public static LimestoneBlock LIMESTONE_BLOCK = new LimestoneBlock();
    }
}
