package io.github.boogiemonster1o1.notenoughrocks;

import io.github.boogiemonster1o1.notenoughrocks.blocks.LimestoneBlock;
import io.github.boogiemonster1o1.notenoughrocks.blocks.LimestoneStairsBlock;
import io.github.boogiemonster1o1.notenoughrocks.blocks.PolishedLimestoneStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static net.minecraft.block.Blocks.STONE;
import static net.minecraft.block.Blocks.STONE_SLAB;
import static net.minecraft.item.ItemGroup.BUILDING_BLOCKS;

public class Elements {
    public static class ItemS{
        public static BlockItem LIMESTONE_BLOCK_ITEM = new BlockItem(LIMESTONE_BLOCK,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_ITEM = new BlockItem(POLISHED_LIMESTONE,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_STAIRS_ITEM = new BlockItem(LIMESTONE_STAIRS,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_STAIRS_ITEM = new BlockItem(POLISHED_LIMESTONE_STAIRS,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_SLAB_ITEM = new BlockItem(LIMESTONE_SLAB,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_SLAB_ITEM = new BlockItem(POLISHED_LIMESTONE_SLAB,new Item.Settings().group(BUILDING_BLOCKS));
    }
    public static class BlockS{
        public static Block POLISHED_LIMESTONE = new Block(FabricBlockSettings.copy(STONE));
        public static LimestoneBlock LIMESTONE_BLOCK = new LimestoneBlock();
        public static LimestoneStairsBlock LIMESTONE_STAIRS  = new LimestoneStairsBlock();
        public static PolishedLimestoneStairsBlock POLISHED_LIMESTONE_STAIRS = new PolishedLimestoneStairsBlock();
        public static SlabBlock LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(STONE_SLAB));
        public static SlabBlock POLISHED_LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(STONE_SLAB));
    }
}
