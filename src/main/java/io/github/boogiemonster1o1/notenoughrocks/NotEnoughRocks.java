package io.github.boogiemonster1o1.notenoughrocks;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;
import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.log;
import static net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback.event;
import static net.minecraft.util.registry.Registry.*;
import static org.apache.logging.log4j.Level.*;

public enum NotEnoughRocks {
    INSTANCE;

    void initialize(){

        /*Misc*/{
            event(BIOME).register((i, identifier, biome) -> {
                LIMESTONE_BLOCK.handleBiome(biome);
            });

            NER = FabricItemGroupBuilder.create(INSTANCE.neri("ner_group")).icon(()->new ItemStack(POLISHED_LIMESTONE_COLUMN_ITEM)).build();
        }

        log(WARN,"This version of NER is snapshot. Please report any bugs to the Github issue tracker.");

        register(ITEM,neri("limestone"),LIMESTONE_BLOCK_ITEM);
        register(BLOCK,neri("limestone"),LIMESTONE_BLOCK);
        BIOME.forEach(LIMESTONE_BLOCK::handleBiome);

        register(BLOCK,neri("polished_limestone"),POLISHED_LIMESTONE);
        register(ITEM,neri("polished_limestone"),POLISHED_LIMESTONE_ITEM);

        register(BLOCK,neri("limestone_stairs"),LIMESTONE_STAIRS);
        register(ITEM,neri("limestone_stairs"),LIMESTONE_STAIRS_ITEM);

        register(BLOCK,neri("polished_limestone_stairs"),POLISHED_LIMESTONE_STAIRS);
        register(ITEM,neri("polished_limestone_stairs"),POLISHED_LIMESTONE_STAIRS_ITEM);

        register(BLOCK,neri("limestone_slab"),LIMESTONE_SLAB);
        register(ITEM,neri("limestone_slab"),LIMESTONE_SLAB_ITEM);

        register(BLOCK,neri("polished_limestone_slab"),POLISHED_LIMESTONE_SLAB);
        register(ITEM,neri("polished_limestone_slab"),POLISHED_LIMESTONE_SLAB_ITEM);

        register(BLOCK,neri("limestone_wall"),LIMESTONE_WALL);
        register(ITEM,neri("limestone_wall"),LIMESTONE_WALL_ITEM);

        register(BLOCK,neri("polished_limestone_wall"),POLISHED_LIMESTONE_WALL);
        register(ITEM,neri("polished_limestone_wall"),POLISHED_LIMESTONE_WALL_ITEM);

        register(BLOCK,neri("limestone_bricks"),LIMESTONE_BRICKS);
        register(ITEM,neri("limestone_bricks"),LIMESTONE_BRICKS_ITEM);

        register(BLOCK,neri("limestone_brick_stairs"),LIMESTONE_BRICK_STAIRS);
        register(ITEM,neri("limestone_brick_stairs"),LIMESTONE_BRICK_STAIRS_ITEM);

        register(BLOCK,neri("limestone_brick_slab"),LIMESTONE_BRICK_SLAB);
        register(ITEM,neri("limestone_brick_slab"),LIMESTONE_BRICK_SLAB_ITEM);

        register(BLOCK,neri("limestone_brick_wall"),LIMESTONE_BRICK_WALL);
        register(ITEM,neri("limestone_brick_wall"),LIMESTONE_BRICK_WALL_ITEM);

        register(BLOCK,neri("polished_limestone_column"),POLISHED_LIMESTONE_COLUMN);
        register(ITEM,neri("polished_limestone_column"),POLISHED_LIMESTONE_COLUMN_ITEM);

        register(BLOCK,neri("polished_granite_column"),POLISHED_GRANITE_COLUMN);
        register(ITEM,neri("polished_granite_column"),POLISHED_GRANITE_COLUMN_ITEM);

        register(BLOCK,neri("polished_andesite_column"),POLISHED_ANDESITE_COLUMN);
        register(ITEM,neri("polished_andesite_column"),POLISHED_ANDESITE_COLUMN_ITEM);

        register(BLOCK,neri("polished_diorite_column"),POLISHED_DIORITE_COLUMN);
        register(ITEM,neri("polished_diorite_column"),POLISHED_DIORITE_COLUMN_ITEM);

        register(BLOCK,neri("polished_limestone_tile"),POLISHED_LIMESTONE_TILE);
        register(ITEM,neri("polished_limestone_tile"),POLISHED_LIMESTONE_TILE_ITEM);

        register(BLOCK,neri("polished_granite_tile"),POLISHED_GRANITE_TILE);
        register(ITEM,neri("polished_granite_tile"),POLISHED_GRANITE_TILE_ITEM);

        register(BLOCK,neri("polished_andesite_tile"),POLISHED_ANDESITE_TILE);
        register(ITEM,neri("polished_andesite_tile"),POLISHED_ANDESITE_TILE_ITEM);

        register(BLOCK,neri("polished_diorite_tile"),POLISHED_DIORITE_TILE);
        register(ITEM,neri("polished_diorite_tile"),POLISHED_DIORITE_TILE_ITEM);

        register(BLOCK,neri("smooth_limestone"),SMOOTH_LIMESTONE);
        register(ITEM,neri("smooth_limestone"),SMOOTH_LIMESTONE_ITEM);

        register(BLOCK,neri("smooth_limestone_stairs"),SMOOTH_LIMESTONE_STAIRS);
        register(ITEM,neri("smooth_limestone_stairs"),SMOOTH_LIMESTONE_STAIRS_ITEM);

        register(BLOCK,neri("smooth_limestone_slab"),SMOOTH_LIMESTONE_SLAB);
        register(ITEM,neri("smooth_limestone_slab"),SMOOTH_LIMESTONE_SLAB_ITEM);

        register(BLOCK,neri("smooth_limestone_column"),SMOOTH_LIMESTONE_COLUMN);
        register(ITEM,neri("smooth_limestone_column"),SMOOTH_LIMESTONE_COLUMN_ITEM);

        register(BLOCK,neri("smooth_sandstone_column"),SMOOTH_SANDSTONE_COLUMN);
        register(ITEM,neri("smooth_sandstone_column"),SMOOTH_SANDSTONE_COLUMN_ITEM);

        register(BLOCK,neri("smooth_quartz_column"),SMOOTH_QUARTZ_COLUMN);
        register(ITEM,neri("smooth_quartz_column"),SMOOTH_QUARTZ_COLUMN_ITEM);

        register(BLOCK,neri("smooth_red_sandstone_column"),SMOOTH_RED_SANDSTONE_COLUMN);
        register(ITEM,neri("smooth_red_sandstone_column"),SMOOTH_RED_SANDSTONE_COLUMN_ITEM);

        register(BLOCK,neri("stone_column"),STONE_COLUMN);
        register(ITEM,neri("stone_column"),STONE_COLUMN_ITEM);

        register(BLOCK,neri("cobblestone_column"),COBBLESTONE_COLUMN);
        register(ITEM,neri("cobblestone_column"),COBBLESTONE_COLUMN_ITEM);

        register(BLOCK,neri("brick_column"),BRICK_COLUMN);
        register(ITEM,neri("brick_column"),BRICK_COLUMN_ITEM);

        register(BLOCK,neri("mossy_cobblestone_column"),MOSSY_COBBLESTONE_COLUMN);
        register(ITEM,neri("mossy_cobblestone_column"),MOSSY_COBBLESTONE_COLUMN_ITEM);

        register(BLOCK,neri("stone_brick_column"),STONE_BRICK_COLUMN);
        register(ITEM,neri("stone_brick_column"),STONE_BRICK_COLUMN_ITEM);

        register(BLOCK,neri("mossy_stone_brick_column"),MOSSY_STONE_BRICK_COLUMN);
        register(ITEM,neri("mossy_stone_brick_column"),MOSSY_STONE_BRICK_COLUMN_ITEM);

        register(BLOCK,neri("granite_column"),GRANITE_COLUMN);
        register(ITEM,neri("granite_column"),GRANITE_COLUMN_ITEM);

        register(BLOCK,neri("diorite_column"),DIORITE_COLUMN);
        register(ITEM,neri("diorite_column"),DIORITE_COLUMN_ITEM);

        register(BLOCK,neri("andesite_column"),ANDESITE_COLUMN);
        register(ITEM,neri("andesite_column"),ANDESITE_COLUMN_ITEM);

        register(BLOCK,neri("red_sandstone_column"),RED_SANDSTONE_COLUMN);
        register(ITEM,neri("red_sandstone_column"),RED_SANDSTONE_COLUMN_ITEM);

        register(BLOCK,neri("sandstone_column"),SANDSTONE_COLUMN);
        register(ITEM,neri("sandstone_column"),SANDSTONE_COLUMN_ITEM);

        register(BLOCK,neri("prismarine_column"),PRISMARINE_COLUMN);
        register(ITEM,neri("prismarine_column"),PRISMARINE_COLUMN_ITEM);

        register(BLOCK,neri("dark_prismarine_column"),DARK_PRISMARINE_COLUMN);
        register(ITEM,neri("dark_prismarine_column"),DARK_PRISMARINE_COLUMN_ITEM);

        register(BLOCK,neri("nether_brick_column"),NETHER_BRICK_COLUMN);
        register(ITEM,neri("nether_brick_column"),NETHER_BRICK_COLUMN_ITEM);

        register(BLOCK,neri("end_stone_column"),END_STONE_COLUMN);
        register(ITEM,neri("end_stone_column"),END_STONE_COLUMN_ITEM);

        register(BLOCK,neri("blackstone_column"),BLACKSTONE_COLUMN);
        register(ITEM,neri("blackstone_column"),BLACKSTONE_COLUMN_ITEM);

        register(BLOCK,neri("blackstone_brick_column"),BLACKSTONE_BRICK_COLUMN);
        register(ITEM,neri("blackstone_brick_column"),BLACKSTONE_BRICK_COLUMN_ITEM);

        register(BLOCK,neri("polished_blackstone_column"),POLISHED_BLACKSTONE_COLUMN);
        register(ITEM,neri("polished_blackstone_column"),POLISHED_BLACKSTONE_COLUMN_ITEM);
    }

    static ItemGroup NER;

    public Identifier neri(String path){
        return new Identifier("notenoughrocks",path);
    }

    public static class InitializationError extends Error{
        InitializationError(String message){
            super(message);
        }
    }
}
