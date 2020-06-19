package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BLOCK;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.STONE;
import static net.minecraft.world.biome.Biome.Category.NETHER;
import static net.minecraft.world.biome.Biome.Category.THEEND;
import static net.minecraft.world.biome.Biomes.MOUNTAINS;
import static net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES;
import static net.minecraft.world.gen.decorator.Decorator.COUNT_RANGE;
import static net.minecraft.world.gen.feature.Feature.ORE;
import static net.minecraft.world.gen.feature.OreFeatureConfig.Target.NATURAL_STONE;

public class LimestoneBlock extends Block {
    public LimestoneBlock() {
        super(copy(STONE));
    }

    public void genLimestone(Biome biome) {
        if ((biome.getCategory() != NETHER && biome.getCategory() != THEEND) && (biome != MOUNTAINS))
            biome.addFeature(UNDERGROUND_ORES, ORE.configure(new OreFeatureConfig(NATURAL_STONE, LIMESTONE_BLOCK.getDefaultState(), 28)).createDecoratedFeature(COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 156))));
    }
}
