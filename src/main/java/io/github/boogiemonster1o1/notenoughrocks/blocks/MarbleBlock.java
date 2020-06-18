package io.github.boogiemonster1o1.notenoughrocks.blocks;

import io.github.boogiemonster1o1.notenoughrocks.world.CustomOreFeature;
import io.github.boogiemonster1o1.notenoughrocks.world.CustomOreFeatureConfig;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.MARBLE;

public class MarbleBlock extends Block {
    public MarbleBlock(Settings settings) {
        super(settings);
    }

    public void genMarble(Biome biome) {
        if (biome.getCategory() != Biome.Category.THEEND && biome.getCategory() != Biome.Category.NETHER) {
            RangeDecoratorConfig config = new RangeDecoratorConfig(6, 0, 0, 156);
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                    new ConfiguredFeature<OreFeatureConfig, OreFeature>(
                            new CustomOreFeature(CustomOreFeatureConfig::deserialize),
                            new CustomOreFeatureConfig(
                                    null,
                                    MARBLE.getDefaultState(),
                                    12)));
        }
    }
}
