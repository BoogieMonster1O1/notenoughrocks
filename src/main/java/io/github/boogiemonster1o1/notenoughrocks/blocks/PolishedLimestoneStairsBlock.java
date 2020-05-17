package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.POLISHED_LIMESTONE;

public class PolishedLimestoneStairsBlock extends StairsBlock {
    public PolishedLimestoneStairsBlock() {
        super(POLISHED_LIMESTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_STAIRS));
    }
}
