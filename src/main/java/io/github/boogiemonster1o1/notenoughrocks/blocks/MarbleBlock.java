package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BLOCK;
import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.MARBLE;
import static net.minecraft.world.gen.GenerationStep.Feature.UNDERGROUND_ORES;
import static net.minecraft.world.gen.decorator.Decorator.COUNT_RANGE;
import static net.minecraft.world.gen.feature.Feature.ORE;
import static net.minecraft.world.gen.feature.OreFeatureConfig.Target.NATURAL_STONE;

public class MarbleBlock extends Block {
    public MarbleBlock(Settings settings) {
        super(settings);
    }

    public void genMarble(Biome biome) {
        if (biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NETHER) {
            biome.addFeature(UNDERGROUND_ORES, ORE.configure(new OreFeatureConfig(NATURAL_STONE, MARBLE.getDefaultState(), 28)).createDecoratedFeature(COUNT_RANGE.configure(new RangeDecoratorConfig(10, 0, 0, 156))));
        }
    }
}
