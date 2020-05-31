package io.github.boogiemonster1o1.notenoughrocks;

import io.github.boogiemonster1o1.notenoughrocks.blocks.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static io.github.boogiemonster1o1.notenoughrocks.NotEnoughRocks.NER;
import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copy;
import static net.minecraft.block.Blocks.*;

public class Elements {

    public static Random RANDOM = new Random();

    public static class ItemS{
        public static BlockItem LIMESTONE_BLOCK_ITEM = new BlockItem(LIMESTONE_BLOCK,new Settings().group(NER));
        public static BlockItem POLISHED_LIMESTONE_ITEM = new BlockItem(POLISHED_LIMESTONE,new Settings().group(NER));
        public static BlockItem LIMESTONE_STAIRS_ITEM = new BlockItem(LIMESTONE_STAIRS,new Settings().group(NER));
        public static BlockItem POLISHED_LIMESTONE_STAIRS_ITEM = new BlockItem(POLISHED_LIMESTONE_STAIRS,new Settings().group(NER));
        public static BlockItem LIMESTONE_SLAB_ITEM = new BlockItem(LIMESTONE_SLAB,new Settings().group(NER));
        public static BlockItem POLISHED_LIMESTONE_SLAB_ITEM = new BlockItem(POLISHED_LIMESTONE_SLAB,new Settings().group(NER));
        public static BlockItem LIMESTONE_WALL_ITEM = new BlockItem(LIMESTONE_WALL,new Settings().group(NER));
        public static BlockItem POLISHED_LIMESTONE_WALL_ITEM = new BlockItem(POLISHED_LIMESTONE_WALL,new Settings().group(NER));
        public static BlockItem LIMESTONE_BRICKS_ITEM = new BlockItem(LIMESTONE_BRICKS,new Settings().group(NER));
        public static BlockItem LIMESTONE_BRICK_STAIRS_ITEM = new BlockItem(LIMESTONE_BRICK_STAIRS,new Settings().group(NER));
        public static BlockItem LIMESTONE_BRICK_SLAB_ITEM = new BlockItem(LIMESTONE_BRICK_SLAB,new Settings().group(NER));
        public static BlockItem LIMESTONE_BRICK_WALL_ITEM = new BlockItem(LIMESTONE_BRICK_WALL,new Settings().group(NER));
        public static BlockItem POLISHED_LIMESTONE_COLUMN_ITEM = new BlockItem(POLISHED_LIMESTONE_COLUMN,new Settings().group(NER));
        public static BlockItem POLISHED_GRANITE_COLUMN_ITEM = new BlockItem(POLISHED_GRANITE_COLUMN,new Settings().group(NER));
        public static BlockItem POLISHED_ANDESITE_COLUMN_ITEM = new BlockItem(POLISHED_ANDESITE_COLUMN,new Settings().group(NER));
        public static BlockItem POLISHED_DIORITE_COLUMN_ITEM = new BlockItem(POLISHED_DIORITE_COLUMN,new Settings().group(NER));
        public static BlockItem POLISHED_LIMESTONE_TILE_ITEM = new BlockItem(POLISHED_LIMESTONE_TILE,new Settings().group(NER));
        public static BlockItem POLISHED_GRANITE_TILE_ITEM = new BlockItem(POLISHED_GRANITE_TILE,new Settings().group(NER));
        public static BlockItem POLISHED_ANDESITE_TILE_ITEM = new BlockItem(POLISHED_ANDESITE_TILE,new Settings().group(NER));
        public static BlockItem POLISHED_DIORITE_TILE_ITEM = new BlockItem(POLISHED_DIORITE_TILE,new Settings().group(NER));
        public static BlockItem SMOOTH_LIMESTONE_ITEM = new BlockItem(SMOOTH_LIMESTONE,new Settings().group(NER));
        public static BlockItem SMOOTH_LIMESTONE_STAIRS_ITEM = new BlockItem(SMOOTH_LIMESTONE_STAIRS,new Settings().group(NER));
        public static BlockItem SMOOTH_LIMESTONE_SLAB_ITEM = new BlockItem(SMOOTH_LIMESTONE_SLAB,new Settings().group(NER));
        public static BlockItem SMOOTH_LIMESTONE_COLUMN_ITEM = new BlockItem(SMOOTH_LIMESTONE_COLUMN,new Settings().group(NER));
        public static BlockItem SMOOTH_SANDSTONE_COLUMN_ITEM = new BlockItem(SMOOTH_SANDSTONE_COLUMN,new Settings().group(NER));
        public static BlockItem SMOOTH_QUARTZ_COLUMN_ITEM = new BlockItem(SMOOTH_QUARTZ_COLUMN,new Settings().group(NER));
        public static BlockItem SMOOTH_RED_SANDSTONE_COLUMN_ITEM = new BlockItem(SMOOTH_RED_SANDSTONE_COLUMN,new Settings().group(NER));
        public static BlockItem BRICK_COLUMN_ITEM = new BlockItem(BRICK_COLUMN,new Settings().group(NER));
        public static BlockItem COBBLESTONE_COLUMN_ITEM = new BlockItem(COBBLESTONE_COLUMN,new Settings().group(NER));
        public static BlockItem STONE_COLUMN_ITEM = new BlockItem(STONE_COLUMN,new Settings().group(NER));
        public static BlockItem MOSSY_COBBLESTONE_COLUMN_ITEM = new BlockItem(MOSSY_COBBLESTONE_COLUMN,new Settings().group(NER));
        public static BlockItem STONE_BRICK_COLUMN_ITEM = new BlockItem(STONE_BRICK_COLUMN,new Settings().group(NER));
        public static BlockItem MOSSY_STONE_BRICK_COLUMN_ITEM = new BlockItem(MOSSY_STONE_BRICK_COLUMN,new Settings().group(NER));
        public static BlockItem ANDESITE_COLUMN_ITEM = new BlockItem(ANDESITE_COLUMN,new Settings().group(NER));
        public static BlockItem GRANITE_COLUMN_ITEM = new BlockItem(GRANITE_COLUMN,new Settings().group(NER));
        public static BlockItem DIORITE_COLUMN_ITEM = new BlockItem(DIORITE_COLUMN,new Settings().group(NER));
        public static BlockItem SANDSTONE_COLUMN_ITEM = new BlockItem(SANDSTONE_COLUMN,new Settings().group(NER));
        public static BlockItem RED_SANDSTONE_COLUMN_ITEM = new BlockItem(RED_SANDSTONE_COLUMN,new Settings().group(NER));
        public static BlockItem PRISMARINE_COLUMN_ITEM = new BlockItem(PRISMARINE_COLUMN,new Settings().group(NER));
        public static BlockItem DARK_PRISMARINE_COLUMN_ITEM = new BlockItem(DARK_PRISMARINE_COLUMN,new Settings().group(NER));
        public static BlockItem NETHER_BRICK_COLUMN_ITEM = new BlockItem(NETHER_BRICK_COLUMN,new Settings().group(NER));
        public static BlockItem END_STONE_COLUMN_ITEM = new BlockItem(END_STONE_COLUMN,new Settings().group(NER));
    }
    public static class BlockS{
        public static Block POLISHED_LIMESTONE = new Block(copy(STONE));
        public static LimestoneBlock LIMESTONE_BLOCK = new LimestoneBlock();
        public static LimestoneStairsBlock LIMESTONE_STAIRS  = new LimestoneStairsBlock();
        public static PolishedLimestoneStairsBlock POLISHED_LIMESTONE_STAIRS = new PolishedLimestoneStairsBlock();
        public static SlabBlock LIMESTONE_SLAB = new SlabBlock(copy(STONE_SLAB));
        public static SlabBlock POLISHED_LIMESTONE_SLAB = new SlabBlock(copy(STONE_SLAB));
        public static WallBlock LIMESTONE_WALL = new WallBlock(copy(COBBLESTONE_WALL));
        public static WallBlock POLISHED_LIMESTONE_WALL = new WallBlock(copy(COBBLESTONE_WALL));
        public static Block LIMESTONE_BRICKS = new Block(copy(STONE_BRICKS));
        public static LimestoneBrickStairsBlock LIMESTONE_BRICK_STAIRS = new LimestoneBrickStairsBlock();
        public static SlabBlock LIMESTONE_BRICK_SLAB = new SlabBlock(copy(STONE_BRICK_SLAB));
        public static WallBlock LIMESTONE_BRICK_WALL = new WallBlock(copy(STONE_BRICK_WALL));
        public static BulkColumnBlock POLISHED_LIMESTONE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock POLISHED_GRANITE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock POLISHED_ANDESITE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock POLISHED_DIORITE_COLUMN = new BulkColumnBlock();
        public static TileBlock POLISHED_LIMESTONE_TILE = new TileBlock(copy(HEAVY_WEIGHTED_PRESSURE_PLATE));
        public static TileBlock POLISHED_GRANITE_TILE = new TileBlock(copy(HEAVY_WEIGHTED_PRESSURE_PLATE));
        public static TileBlock POLISHED_ANDESITE_TILE = new TileBlock(copy(HEAVY_WEIGHTED_PRESSURE_PLATE));
        public static TileBlock POLISHED_DIORITE_TILE = new TileBlock(copy(HEAVY_WEIGHTED_PRESSURE_PLATE));
        public static Block SMOOTH_LIMESTONE = new Block(copy(SMOOTH_QUARTZ));
        public static SmoothLimestoneStairsBlock SMOOTH_LIMESTONE_STAIRS = new SmoothLimestoneStairsBlock();
        public static SlabBlock SMOOTH_LIMESTONE_SLAB = new SlabBlock(copy(SMOOTH_QUARTZ_SLAB));
        public static SmoothLimestoneColumnBlock SMOOTH_LIMESTONE_COLUMN = new SmoothLimestoneColumnBlock();
        public static SmoothSandstoneColumnBlock SMOOTH_SANDSTONE_COLUMN = new SmoothSandstoneColumnBlock();
        public static SmoothQuartzColumnBlock SMOOTH_QUARTZ_COLUMN = new SmoothQuartzColumnBlock();
        public static SmoothRedSandstoneColumnBlock SMOOTH_RED_SANDSTONE_COLUMN = new SmoothRedSandstoneColumnBlock();
        public static BulkColumnBlock BRICK_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock COBBLESTONE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock STONE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock MOSSY_COBBLESTONE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock STONE_BRICK_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock MOSSY_STONE_BRICK_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock ANDESITE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock DIORITE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock GRANITE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock SANDSTONE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock RED_SANDSTONE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock PRISMARINE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock DARK_PRISMARINE_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock NETHER_BRICK_COLUMN = new BulkColumnBlock();
        public static BulkColumnBlock END_STONE_COLUMN = new BulkColumnBlock();
    }
}
