package io.github.boogiemonster1o1.notenoughrocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;
import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.MOD_ID;
import static io.github.boogiemonster1o1.notenoughrocks.NERInitialize.log;
import static net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder.create;
import static net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback.event;
import static net.minecraft.tag.ItemTags.getContainer;
import static net.minecraft.util.registry.Registry.*;
import static org.apache.logging.log4j.Level.WARN;
import static net.minecraft.item.Item.Settings;

public enum NotEnoughRocks {
    INSTANCE;

    void initialize() {
        /*Misc*/
        {
            event(BIOME).register((i, identifier, biome) -> {
                LIMESTONE_BLOCK.handleBiome(biome);
                MARBLE.genMarble(biome);
            });
        }

        log(WARN, "This version of NER is a pre-release. Please report any bugs to the Github issue tracker.");

        register(ITEM, identifier("limestone"), LIMESTONE_BLOCK_ITEM);
        register(BLOCK, identifier("limestone"), LIMESTONE_BLOCK);
        BIOME.forEach(LIMESTONE_BLOCK::handleBiome);

        register(BLOCK, identifier("polished_limestone"), POLISHED_LIMESTONE);
        register(ITEM, identifier("polished_limestone"), POLISHED_LIMESTONE_ITEM);

        register(BLOCK, identifier("limestone_stairs"), LIMESTONE_STAIRS);
        register(ITEM, identifier("limestone_stairs"), LIMESTONE_STAIRS_ITEM);

        register(BLOCK, identifier("polished_limestone_stairs"), POLISHED_LIMESTONE_STAIRS);
        register(ITEM, identifier("polished_limestone_stairs"), POLISHED_LIMESTONE_STAIRS_ITEM);

        register(BLOCK, identifier("limestone_slab"), LIMESTONE_SLAB);
        register(ITEM, identifier("limestone_slab"), LIMESTONE_SLAB_ITEM);

        register(BLOCK, identifier("polished_limestone_slab"), POLISHED_LIMESTONE_SLAB);
        register(ITEM, identifier("polished_limestone_slab"), POLISHED_LIMESTONE_SLAB_ITEM);

        register(BLOCK, identifier("limestone_wall"), LIMESTONE_WALL);
        register(ITEM, identifier("limestone_wall"), LIMESTONE_WALL_ITEM);

        register(BLOCK, identifier("polished_limestone_wall"), POLISHED_LIMESTONE_WALL);
        register(ITEM, identifier("polished_limestone_wall"), POLISHED_LIMESTONE_WALL_ITEM);

        register(BLOCK, identifier("limestone_bricks"), LIMESTONE_BRICKS);
        register(ITEM, identifier("limestone_bricks"), LIMESTONE_BRICKS_ITEM);

        register(BLOCK, identifier("limestone_brick_stairs"), LIMESTONE_BRICK_STAIRS);
        register(ITEM, identifier("limestone_brick_stairs"), LIMESTONE_BRICK_STAIRS_ITEM);

        register(BLOCK, identifier("limestone_brick_slab"), LIMESTONE_BRICK_SLAB);
        register(ITEM, identifier("limestone_brick_slab"), LIMESTONE_BRICK_SLAB_ITEM);

        register(BLOCK, identifier("limestone_brick_wall"), LIMESTONE_BRICK_WALL);
        register(ITEM, identifier("limestone_brick_wall"), LIMESTONE_BRICK_WALL_ITEM);

        register(BLOCK, identifier("polished_limestone_column"), POLISHED_LIMESTONE_COLUMN);
        register(ITEM, identifier("polished_limestone_column"), POLISHED_LIMESTONE_COLUMN_ITEM);

        register(BLOCK, identifier("polished_granite_column"), POLISHED_GRANITE_COLUMN);
        register(ITEM, identifier("polished_granite_column"), POLISHED_GRANITE_COLUMN_ITEM);

        register(BLOCK, identifier("polished_andesite_column"), POLISHED_ANDESITE_COLUMN);
        register(ITEM, identifier("polished_andesite_column"), POLISHED_ANDESITE_COLUMN_ITEM);

        register(BLOCK, identifier("polished_diorite_column"), POLISHED_DIORITE_COLUMN);
        register(ITEM, identifier("polished_diorite_column"), POLISHED_DIORITE_COLUMN_ITEM);

        register(BLOCK, identifier("polished_limestone_tile"), POLISHED_LIMESTONE_TILE);
        register(ITEM, identifier("polished_limestone_tile"), POLISHED_LIMESTONE_TILE_ITEM);

        register(BLOCK, identifier("polished_granite_tile"), POLISHED_GRANITE_TILE);
        register(ITEM, identifier("polished_granite_tile"), POLISHED_GRANITE_TILE_ITEM);

        register(BLOCK, identifier("polished_andesite_tile"), POLISHED_ANDESITE_TILE);
        register(ITEM, identifier("polished_andesite_tile"), POLISHED_ANDESITE_TILE_ITEM);

        register(BLOCK, identifier("polished_diorite_tile"), POLISHED_DIORITE_TILE);
        register(ITEM, identifier("polished_diorite_tile"), POLISHED_DIORITE_TILE_ITEM);

        register(BLOCK, identifier("smooth_limestone"), SMOOTH_LIMESTONE);
        register(ITEM, identifier("smooth_limestone"), SMOOTH_LIMESTONE_ITEM);

        register(BLOCK, identifier("smooth_limestone_stairs"), SMOOTH_LIMESTONE_STAIRS);
        register(ITEM, identifier("smooth_limestone_stairs"), SMOOTH_LIMESTONE_STAIRS_ITEM);

        register(BLOCK, identifier("smooth_limestone_slab"), SMOOTH_LIMESTONE_SLAB);
        register(ITEM, identifier("smooth_limestone_slab"), SMOOTH_LIMESTONE_SLAB_ITEM);

        register(BLOCK, identifier("smooth_limestone_column"), SMOOTH_LIMESTONE_COLUMN);
        register(ITEM, identifier("smooth_limestone_column"), SMOOTH_LIMESTONE_COLUMN_ITEM);

        register(BLOCK, identifier("smooth_sandstone_column"), SMOOTH_SANDSTONE_COLUMN);
        register(ITEM, identifier("smooth_sandstone_column"), SMOOTH_SANDSTONE_COLUMN_ITEM);

        register(BLOCK, identifier("smooth_quartz_column"), SMOOTH_QUARTZ_COLUMN);
        register(ITEM, identifier("smooth_quartz_column"), SMOOTH_QUARTZ_COLUMN_ITEM);

        register(BLOCK, identifier("smooth_red_sandstone_column"), SMOOTH_RED_SANDSTONE_COLUMN);
        register(ITEM, identifier("smooth_red_sandstone_column"), SMOOTH_RED_SANDSTONE_COLUMN_ITEM);

        register(BLOCK, identifier("stone_column"), STONE_COLUMN);
        register(ITEM, identifier("stone_column"), STONE_COLUMN_ITEM);

        register(BLOCK, identifier("cobblestone_column"), COBBLESTONE_COLUMN);
        register(ITEM, identifier("cobblestone_column"), COBBLESTONE_COLUMN_ITEM);

        register(BLOCK, identifier("brick_column"), BRICK_COLUMN);
        register(ITEM, identifier("brick_column"), BRICK_COLUMN_ITEM);

        register(BLOCK, identifier("mossy_cobblestone_column"), MOSSY_COBBLESTONE_COLUMN);
        register(ITEM, identifier("mossy_cobblestone_column"), MOSSY_COBBLESTONE_COLUMN_ITEM);

        register(BLOCK, identifier("stone_brick_column"), STONE_BRICK_COLUMN);
        register(ITEM, identifier("stone_brick_column"), STONE_BRICK_COLUMN_ITEM);

        register(BLOCK, identifier("mossy_stone_brick_column"), MOSSY_STONE_BRICK_COLUMN);
        register(ITEM, identifier("mossy_stone_brick_column"), MOSSY_STONE_BRICK_COLUMN_ITEM);

        register(BLOCK, identifier("granite_column"), GRANITE_COLUMN);
        register(ITEM, identifier("granite_column"), GRANITE_COLUMN_ITEM);

        register(BLOCK, identifier("diorite_column"), DIORITE_COLUMN);
        register(ITEM, identifier("diorite_column"), DIORITE_COLUMN_ITEM);

        register(BLOCK, identifier("andesite_column"), ANDESITE_COLUMN);
        register(ITEM, identifier("andesite_column"), ANDESITE_COLUMN_ITEM);

        register(BLOCK, identifier("red_sandstone_column"), RED_SANDSTONE_COLUMN);
        register(ITEM, identifier("red_sandstone_column"), RED_SANDSTONE_COLUMN_ITEM);

        register(BLOCK, identifier("sandstone_column"), SANDSTONE_COLUMN);
        register(ITEM, identifier("sandstone_column"), SANDSTONE_COLUMN_ITEM);

        register(BLOCK, identifier("prismarine_column"), PRISMARINE_COLUMN);
        register(ITEM, identifier("prismarine_column"), PRISMARINE_COLUMN_ITEM);

        register(BLOCK, identifier("dark_prismarine_column"), DARK_PRISMARINE_COLUMN);
        register(ITEM, identifier("dark_prismarine_column"), DARK_PRISMARINE_COLUMN_ITEM);

        register(BLOCK, identifier("nether_brick_column"), NETHER_BRICK_COLUMN);
        register(ITEM, identifier("nether_brick_column"), NETHER_BRICK_COLUMN_ITEM);

        register(BLOCK, identifier("end_stone_column"), END_STONE_COLUMN);
        register(ITEM, identifier("end_stone_column"), END_STONE_COLUMN_ITEM);

        register(ITEM, identifier("limestone_pickaxe"), LIMESTONE_PICKAXE);

        register(ITEM, identifier("limestone_axe"), LIMESTONE_AXE);

        register(ITEM, identifier("limestone_sword"), LIMESTONE_SWORD);

        register(ITEM, identifier("limestone_shovel"), LIMESTONE_SHOVEL);

        register(ITEM, identifier("limestone_hoe"), LIMESTONE_HOE);

        register(BLOCK, identifier("marble"), MARBLE);
        register(ITEM, identifier("marble"), MARBLE_ITEM);
        BIOME.forEach(MARBLE::genMarble);

        register(BLOCK, identifier("marble_stairs"), MARBLE_STAIRS);
        register(ITEM, identifier("marble_stairs"), MARBLE_STAIRS_ITEM);

        register(BLOCK, identifier("marble_slab"), MARBLE_SLAB);
        register(ITEM, identifier("marble_slab"), MARBLE_SLAB_ITEM);

        register(BLOCK, identifier("marble_column"), MARBLE_COLUMN);
        register(ITEM, identifier("marble_column"), MARBLE_COLUMN_ITEM);

        register(ITEM, identifier("heavy_rock_helmet"), HEAVY_ROCK_HELMET);
        register(ITEM, identifier("heavy_rock_chestplate"), HEAVY_ROCK_CHESTPLATE);
        register(ITEM, identifier("heavy_rock_leggings"), HEAVY_ROCK_LEGGINGS);
        register(ITEM, identifier("heavy_rock_boots"), HEAVY_ROCK_BOOTS);

        register(ITEM, identifier("fine_dust"),FINE_DUST);
    }

    public static ItemGroup NER = create(identifier("ner_group")).icon(() -> new ItemStack(POLISHED_LIMESTONE_COLUMN_ITEM)).build();;
    public static Settings NER_DEFAULT = new Settings().group(NER);
    public static Tag<Item> ROCK_PROJECTILES_TAG =  getContainer().getOrCreate(new Identifier("notenoughrocks","rock_projectiles"));

    public static Identifier identifier(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static class InitializationError extends Error {
        InitializationError(String message) {
            super(message);
        }
    }
}
