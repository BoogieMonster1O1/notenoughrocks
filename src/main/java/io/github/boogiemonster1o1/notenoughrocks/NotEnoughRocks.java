package io.github.boogiemonster1o1.notenoughrocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.*;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.*;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.ItemS.*;
import static net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder.create;
import static net.minecraft.item.Item.Settings;
import static org.apache.logging.log4j.Level.WARN;
import static org.apache.logging.log4j.LogManager.getLogger;

public class NotEnoughRocks implements ModInitializer {

    public static final String MOD_ID = "notenoughrocks";
    public static final String MOD_NAME = "NotEnoughRocks";
    public static final Logger LOGGER = getLogger(NotEnoughRocks.class);
    public static final ItemGroup NER = create(identifier("ner_group")).icon(() -> new ItemStack(POLISHED_LIMESTONE_COLUMN_ITEM)).build();
    public static final Settings NER_DEFAULT = new Settings().group(NER);
    public static final Identifier PLAY_DUST_PARTICLE = identifier("play_dust_particle");
    public static final Identifier PLAY_GLASS_BREAK_PARTICLE = identifier("play_glass_break_particle");
    public static final Identifier PLAY_DUST_APPEARS_PARTICLE = identifier("play_dust_appears_particle");
    public static final ArrayList<Pair<Block,String>> REINFORCED_GLASS_BLOCKS;

    public static Identifier identifier(String path) {
        return new Identifier(MOD_ID, path);
    }

    public void onInitialize() {
        LOGGER.log(WARN, "This version of NER is a pre-release. Please report any bugs to the Github issue tracker.");

        Registry.register(Registry.ITEM, identifier("limestone"), LIMESTONE_BLOCK_ITEM);
        Registry.register(Registry.BLOCK, identifier("limestone"), LIMESTONE_BLOCK);

        Registry.register(Registry.BLOCK, identifier("polished_limestone"), POLISHED_LIMESTONE);
        Registry.register(Registry.ITEM, identifier("polished_limestone"), POLISHED_LIMESTONE_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_stairs"), LIMESTONE_STAIRS);
        Registry.register(Registry.ITEM, identifier("limestone_stairs"), LIMESTONE_STAIRS_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_limestone_stairs"), POLISHED_LIMESTONE_STAIRS);
        Registry.register(Registry.ITEM, identifier("polished_limestone_stairs"), POLISHED_LIMESTONE_STAIRS_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_slab"), LIMESTONE_SLAB);
        Registry.register(Registry.ITEM, identifier("limestone_slab"), LIMESTONE_SLAB_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_limestone_slab"), POLISHED_LIMESTONE_SLAB);
        Registry.register(Registry.ITEM, identifier("polished_limestone_slab"), POLISHED_LIMESTONE_SLAB_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_wall"), LIMESTONE_WALL);
        Registry.register(Registry.ITEM, identifier("limestone_wall"), LIMESTONE_WALL_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_limestone_wall"), POLISHED_LIMESTONE_WALL);
        Registry.register(Registry.ITEM, identifier("polished_limestone_wall"), POLISHED_LIMESTONE_WALL_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_bricks"), LIMESTONE_BRICKS);
        Registry.register(Registry.ITEM, identifier("limestone_bricks"), LIMESTONE_BRICKS_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_brick_stairs"), LIMESTONE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, identifier("limestone_brick_stairs"), LIMESTONE_BRICK_STAIRS_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_brick_slab"), LIMESTONE_BRICK_SLAB);
        Registry.register(Registry.ITEM, identifier("limestone_brick_slab"), LIMESTONE_BRICK_SLAB_ITEM);

        Registry.register(Registry.BLOCK, identifier("limestone_brick_wall"), LIMESTONE_BRICK_WALL);
        Registry.register(Registry.ITEM, identifier("limestone_brick_wall"), LIMESTONE_BRICK_WALL_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_limestone_column"), POLISHED_LIMESTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("polished_limestone_column"), POLISHED_LIMESTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_granite_column"), POLISHED_GRANITE_COLUMN);
        Registry.register(Registry.ITEM, identifier("polished_granite_column"), POLISHED_GRANITE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_andesite_column"), POLISHED_ANDESITE_COLUMN);
        Registry.register(Registry.ITEM, identifier("polished_andesite_column"), POLISHED_ANDESITE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_diorite_column"), POLISHED_DIORITE_COLUMN);
        Registry.register(Registry.ITEM, identifier("polished_diorite_column"), POLISHED_DIORITE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_limestone_tile"), POLISHED_LIMESTONE_TILE);
        Registry.register(Registry.ITEM, identifier("polished_limestone_tile"), POLISHED_LIMESTONE_TILE_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_granite_tile"), POLISHED_GRANITE_TILE);
        Registry.register(Registry.ITEM, identifier("polished_granite_tile"), POLISHED_GRANITE_TILE_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_andesite_tile"), POLISHED_ANDESITE_TILE);
        Registry.register(Registry.ITEM, identifier("polished_andesite_tile"), POLISHED_ANDESITE_TILE_ITEM);

        Registry.register(Registry.BLOCK, identifier("polished_diorite_tile"), POLISHED_DIORITE_TILE);
        Registry.register(Registry.ITEM, identifier("polished_diorite_tile"), POLISHED_DIORITE_TILE_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_limestone"), SMOOTH_LIMESTONE);
        Registry.register(Registry.ITEM, identifier("smooth_limestone"), SMOOTH_LIMESTONE_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_limestone_stairs"), SMOOTH_LIMESTONE_STAIRS);
        Registry.register(Registry.ITEM, identifier("smooth_limestone_stairs"), SMOOTH_LIMESTONE_STAIRS_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_limestone_slab"), SMOOTH_LIMESTONE_SLAB);
        Registry.register(Registry.ITEM, identifier("smooth_limestone_slab"), SMOOTH_LIMESTONE_SLAB_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_limestone_column"), SMOOTH_LIMESTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("smooth_limestone_column"), SMOOTH_LIMESTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_sandstone_column"), SMOOTH_SANDSTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("smooth_sandstone_column"), SMOOTH_SANDSTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_quartz_column"), SMOOTH_QUARTZ_COLUMN);
        Registry.register(Registry.ITEM, identifier("smooth_quartz_column"), SMOOTH_QUARTZ_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("smooth_red_sandstone_column"), SMOOTH_RED_SANDSTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("smooth_red_sandstone_column"), SMOOTH_RED_SANDSTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("stone_column"), STONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("stone_column"), STONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("cobblestone_column"), COBBLESTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("cobblestone_column"), COBBLESTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("brick_column"), BRICK_COLUMN);
        Registry.register(Registry.ITEM, identifier("brick_column"), BRICK_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("mossy_cobblestone_column"), MOSSY_COBBLESTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("mossy_cobblestone_column"), MOSSY_COBBLESTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("stone_brick_column"), STONE_BRICK_COLUMN);
        Registry.register(Registry.ITEM, identifier("stone_brick_column"), STONE_BRICK_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("mossy_stone_brick_column"), MOSSY_STONE_BRICK_COLUMN);
        Registry.register(Registry.ITEM, identifier("mossy_stone_brick_column"), MOSSY_STONE_BRICK_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("granite_column"), GRANITE_COLUMN);
        Registry.register(Registry.ITEM, identifier("granite_column"), GRANITE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("diorite_column"), DIORITE_COLUMN);
        Registry.register(Registry.ITEM, identifier("diorite_column"), DIORITE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("andesite_column"), ANDESITE_COLUMN);
        Registry.register(Registry.ITEM, identifier("andesite_column"), ANDESITE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("red_sandstone_column"), RED_SANDSTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("red_sandstone_column"), RED_SANDSTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("sandstone_column"), SANDSTONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("sandstone_column"), SANDSTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("prismarine_column"), PRISMARINE_COLUMN);
        Registry.register(Registry.ITEM, identifier("prismarine_column"), PRISMARINE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("dark_prismarine_column"), DARK_PRISMARINE_COLUMN);
        Registry.register(Registry.ITEM, identifier("dark_prismarine_column"), DARK_PRISMARINE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("nether_brick_column"), NETHER_BRICK_COLUMN);
        Registry.register(Registry.ITEM, identifier("nether_brick_column"), NETHER_BRICK_COLUMN_ITEM);

        Registry.register(Registry.BLOCK, identifier("end_stone_column"), END_STONE_COLUMN);
        Registry.register(Registry.ITEM, identifier("end_stone_column"), END_STONE_COLUMN_ITEM);

        Registry.register(Registry.ITEM, identifier("limestone_pickaxe"), LIMESTONE_PICKAXE);

        Registry.register(Registry.ITEM, identifier("limestone_axe"), LIMESTONE_AXE);

        Registry.register(Registry.ITEM, identifier("limestone_sword"), LIMESTONE_SWORD);

        Registry.register(Registry.ITEM, identifier("limestone_shovel"), LIMESTONE_SHOVEL);

        Registry.register(Registry.ITEM, identifier("limestone_hoe"), LIMESTONE_HOE);

        Registry.register(Registry.BLOCK, identifier("marble"), MARBLE);
        Registry.register(Registry.ITEM, identifier("marble"), MARBLE_ITEM);

        Registry.register(Registry.BLOCK, identifier("marble_stairs"), MARBLE_STAIRS);
        Registry.register(Registry.ITEM, identifier("marble_stairs"), MARBLE_STAIRS_ITEM);

        Registry.register(Registry.BLOCK, identifier("marble_slab"), MARBLE_SLAB);
        Registry.register(Registry.ITEM, identifier("marble_slab"), MARBLE_SLAB_ITEM);

        Registry.register(Registry.BLOCK, identifier("marble_column"), MARBLE_COLUMN);
        Registry.register(Registry.ITEM, identifier("marble_column"), MARBLE_COLUMN_ITEM);

        Registry.register(Registry.ITEM, identifier("heavy_rock_helmet"), HEAVY_ROCK_HELMET);
        Registry.register(Registry.ITEM, identifier("heavy_rock_chestplate"), HEAVY_ROCK_CHESTPLATE);
        Registry.register(Registry.ITEM, identifier("heavy_rock_leggings"), HEAVY_ROCK_LEGGINGS);
        Registry.register(Registry.ITEM, identifier("heavy_rock_boots"), HEAVY_ROCK_BOOTS);

        Registry.register(Registry.ITEM, identifier("fine_dust"), FINE_DUST);

        Registry.register(Registry.BLOCK,identifier("crushed_limestone"),CRUSHED_LIMESTONE);
        Registry.register(Registry.ITEM,identifier("crushed_limestone"),CRUSHED_LIMESTONE_ITEM);

        Registry.register(Registry.BLOCK,identifier("blackstone_column"),BLACKSTONE_COLUMN);
        Registry.register(Registry.ITEM,identifier("blackstone_column"),BLACKSTONE_COLUMN_ITEM);

        Registry.register(Registry.BLOCK,identifier("blackstone_brick_column"),BLACKSTONE_BRICK_COLUMN);
        Registry.register(Registry.ITEM,identifier("blackstone_brick_column"),BLACKSTONE_BRICK_COLUMN_ITEM);

        Registry.register(Registry.BLOCK,identifier("polished_blackstone_column"),POLISHED_BLACKSTONE_COLUMN);
        Registry.register(Registry.ITEM,identifier("polished_blackstone_column"),POLISHED_BLACKSTONE_COLUMN_ITEM);

        OverworldBiomes.addContinentalBiome(LIMESTONE_RIFTS, OverworldClimate.DRY,0.06);
        OverworldBiomes.addEdgeBiome(LIMESTONE_RIFTS,LIMESTONE_RIFTS_EDGE,0.03);
        OverworldBiomes.addContinentalBiome(CRUSHED_LIMESTONE_DESERT,OverworldClimate.DRY,0.04);
        OverworldBiomes.addHillsBiome(LIMESTONE_RIFTS,WOODY_LIMESTONE_RIFTS,0.02);

        this.registerReinforcedGlass(REINFORCED_GLASS_BLOCKS);

        Registry.BIOME.forEach((biome)->{
            LIMESTONE_BLOCK.genLimestone(biome);
            MARBLE.genMarble(biome);
        });
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> {
            LIMESTONE_BLOCK.genLimestone(biome);
            MARBLE.genMarble(biome);
        });
    }

    public void registerReinforcedGlass(List<Pair<Block,String>> dataPair){
        dataPair.forEach((pair)->{
            Registry.register(Registry.BLOCK,identifier(pair.getRight()),pair.getLeft());
            Registry.register(Registry.ITEM,identifier(pair.getRight()),new BlockItem(pair.getLeft(),NER_DEFAULT));
        });
    }

    static{
        REINFORCED_GLASS_BLOCKS = new ArrayList<>();
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(REINFORCED_GLASS,"reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(BLACK_REINFORCED_GLASS,"black_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(BLUE_REINFORCED_GLASS,"blue_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(BROWN_REINFORCED_GLASS,"brown_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(CYAN_REINFORCED_GLASS,"cyan_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(GRAY_REINFORCED_GLASS,"gray_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(GREEN_REINFORCED_GLASS,"green_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(LIGHT_BLUE_REINFORCED_GLASS,"light_blue_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(LIGHT_GRAY_REINFORCED_GLASS,"light_gray_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(LIME_REINFORCED_GLASS,"lime_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(MAGENTA_REINFORCED_GLASS,"magenta_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(ORANGE_REINFORCED_GLASS,"orange_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(PINK_REINFORCED_GLASS,"pink_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(PURPLE_REINFORCED_GLASS,"purple_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(RED_REINFORCED_GLASS,"red_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(WHITE_REINFORCED_GLASS,"white_reinforced_glass"));
        REINFORCED_GLASS_BLOCKS.add(new Pair<>(YELLOW_REINFORCED_GLASS,"yellow_reinforced_glass"));
    }
}
