package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.MARBLE;

public class MarbleBlock extends Block {
    public MarbleBlock(Settings settings) {
        super(settings);
    }

    public void genMarble(Biome biome) {
        if (biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NETHER) {
            RangeDecoratorConfig config = new RangeDecoratorConfig(6, 0, 0, 156);
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(
                    new OreFeatureConfig(
                            OreFeatureConfig.Target.NATURAL_STONE,
                            MARBLE.getDefaultState(),
                            18))
                    .createDecoratedFeature(Decorator.COUNT_RANGE.configure(config)));
        }
    }
}
