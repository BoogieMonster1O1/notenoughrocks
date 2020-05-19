package io.github.boogiemonster1o1.notenoughrocks;

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
        register(ITEM,neri("limestone"),LIMESTONE_BLOCK_ITEM);
        register(BLOCK,neri("limestone"),LIMESTONE_BLOCK);
        BIOME.forEach(LIMESTONE_BLOCK::handleBiome);
        log(INFO,"Initialized Limestone");

        register(BLOCK,neri("polished_limestone"),POLISHED_LIMESTONE);
        register(ITEM,neri("polished_limestone"),POLISHED_LIMESTONE_ITEM);
        log(INFO,"Initialized Polished Limestone");

        register(BLOCK,neri("limestone_stairs"),LIMESTONE_STAIRS);
        register(ITEM,neri("limestone_stairs"),LIMESTONE_STAIRS_ITEM);
        log(INFO,"Initialized Limestone Stairs");

        register(BLOCK,neri("polished_limestone_stairs"),POLISHED_LIMESTONE_STAIRS);
        register(ITEM,neri("polished_limestone_stairs"),POLISHED_LIMESTONE_STAIRS_ITEM);
        log(INFO,"Initialized Polished Limestone Stairs");

        register(BLOCK,neri("limestone_slab"),LIMESTONE_SLAB);
        register(ITEM,neri("limestone_slab"),LIMESTONE_SLAB_ITEM);
        log(INFO,"Initialized Limestone Slab");

        register(BLOCK,neri("polished_limestone_slab"),POLISHED_LIMESTONE_SLAB);
        register(ITEM,neri("polished_limestone_slab"),POLISHED_LIMESTONE_SLAB_ITEM);
        log(INFO,"Initialized Polished Limestone Slab");

        register(BLOCK,neri("limestone_wall"),LIMESTONE_WALL);
        register(ITEM,neri("limestone_wall"),LIMESTONE_WALL_ITEM);
        log(INFO,"Initialized Limestone Wall");

        register(BLOCK,neri("polished_limestone_wall"),POLISHED_LIMESTONE_WALL);
        register(ITEM,neri("polished_limestone_wall"),POLISHED_LIMESTONE_WALL_ITEM);
        log(INFO,"Initialized Polished Limestone Wall");

        register(BLOCK,neri("limestone_bricks"),LIMESTONE_BRICKS);
        register(ITEM,neri("limestone_bricks"),LIMESTONE_BRICKS_ITEM);
        log(INFO,"Initialized Limestone Bricks");

        register(BLOCK,neri("limestone_brick_stairs"),LIMESTONE_BRICK_STAIRS);
        register(ITEM,neri("limestone_brick_stairs"),LIMESTONE_BRICK_STAIRS_ITEM);
        log(INFO,"Initialized Limestone Brick Stairs");

        register(BLOCK,neri("limestone_brick_slab"),LIMESTONE_BRICK_SLAB);
        register(ITEM,neri("limestone_brick_slab"),LIMESTONE_BRICK_SLAB_ITEM);
        log(INFO,"Initialized Limestone Brick Slab");

        register(BLOCK,neri("limestone_brick_wall"),LIMESTONE_BRICK_WALL);
        register(ITEM,neri("limestone_brick_wall"),LIMESTONE_BRICK_WALL_ITEM);
        log(INFO,"Initialized Limestone Brick Wall");

        register(BLOCK,neri("polished_limestone_column"),POLISHED_LIMESTONE_COLUMN);
        register(ITEM,neri("polished_limestone_column"),POLISHED_LIMESTONE_COLUMN_ITEM);
        log(INFO,"Initialized Polished Limestone Column");

        {
            event(BIOME).register((i, identifier, biome) -> {
                LIMESTONE_BLOCK.handleBiome(biome);
            });
        }
    }

    public Identifier neri(String path){
        return new Identifier("notenoughrocks",path);
    }

    public static class InitializationError extends Error{
        InitializationError(String message){
            super(message);
        }
    }
}
