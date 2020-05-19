package io.github.boogiemonster1o1.notenoughrocks;

import io.github.boogiemonster1o1.notenoughrocks.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.item.ItemGroup.BUILDING_BLOCKS;
import static net.minecraft.item.ItemGroup.DECORATIONS;

public class Elements {
    public static class ItemS{
        public static BlockItem LIMESTONE_BLOCK_ITEM = new BlockItem(LIMESTONE_BLOCK,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_ITEM = new BlockItem(POLISHED_LIMESTONE,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_STAIRS_ITEM = new BlockItem(LIMESTONE_STAIRS,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_STAIRS_ITEM = new BlockItem(POLISHED_LIMESTONE_STAIRS,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_SLAB_ITEM = new BlockItem(LIMESTONE_SLAB,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_SLAB_ITEM = new BlockItem(POLISHED_LIMESTONE_SLAB,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_WALL_ITEM = new BlockItem(LIMESTONE_WALL,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_WALL_ITEM = new BlockItem(POLISHED_LIMESTONE_WALL,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_BRICKS_ITEM = new BlockItem(LIMESTONE_BRICKS,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_BRICK_STAIRS_ITEM = new BlockItem(LIMESTONE_BRICK_STAIRS,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_BRICK_SLAB_ITEM = new BlockItem(LIMESTONE_BRICK_SLAB,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem LIMESTONE_BRICK_WALL_ITEM = new BlockItem(LIMESTONE_BRICK_WALL,new Item.Settings().group(BUILDING_BLOCKS));
        public static BlockItem POLISHED_LIMESTONE_COLUMN_ITEM = new BlockItem(POLISHED_LIMESTONE_COLUMN,new Item.Settings().group(DECORATIONS));
        public static BlockItem POLISHED_GRANITE_COLUMN_ITEM = new BlockItem(POLISHED_GRANITE_COLUMN,new Item.Settings().group(DECORATIONS));
    }
    public static class BlockS{
        public static Block POLISHED_LIMESTONE = new Block(FabricBlockSettings.copy(STONE));
        public static LimestoneBlock LIMESTONE_BLOCK = new LimestoneBlock();
        public static LimestoneStairsBlock LIMESTONE_STAIRS  = new LimestoneStairsBlock();
        public static PolishedLimestoneStairsBlock POLISHED_LIMESTONE_STAIRS = new PolishedLimestoneStairsBlock();
        public static SlabBlock LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(STONE_SLAB));
        public static SlabBlock POLISHED_LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.copy(STONE_SLAB));
        public static WallBlock LIMESTONE_WALL = new WallBlock(FabricBlockSettings.copy(COBBLESTONE_WALL));
        public static WallBlock POLISHED_LIMESTONE_WALL = new WallBlock(FabricBlockSettings.copy(COBBLESTONE_WALL));
        public static Block LIMESTONE_BRICKS = new Block(FabricBlockSettings.copy(STONE_BRICKS));
        public static LimestoneBrickStairsBlock LIMESTONE_BRICK_STAIRS = new LimestoneBrickStairsBlock();
        public static SlabBlock LIMESTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copy(STONE_BRICK_SLAB));
        public static WallBlock LIMESTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.copy(STONE_BRICK_WALL));
        public static PolishedLimestoneColumnBlock POLISHED_LIMESTONE_COLUMN = new PolishedLimestoneColumnBlock();
        public static PolishedGraniteColumnBlock POLISHED_GRANITE_COLUMN = new PolishedGraniteColumnBlock();
    }
}
