package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.SMOOTH_LIMESTONE;
import static net.minecraft.block.Blocks.SMOOTH_QUARTZ_STAIRS;

public class SmoothLimestoneStairsBlock extends StairsBlock {
    public SmoothLimestoneStairsBlock() {
        super(SMOOTH_LIMESTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_QUARTZ_STAIRS));
    }
}
